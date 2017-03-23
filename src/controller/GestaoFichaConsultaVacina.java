package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Consulta;
import model.Vacina;
import model.Ficha;


public class GestaoFichaConsultaVacina {
	
	Scanner read = new Scanner(System.in);
	
	public void listarFich(ArrayList<Cliente> c){
		
		for(int i=0; i<c.size(); i++){
			for(int j=0; j<c.get(i).getAnimal().size(); j++){
				System.out.println(c.get(i).getAnimal().get(j).getRaca());
				System.out.println(" Ficha:");
				System.out.println("  Consultas: \n");
				for(int f=0; f<c.get(i).getAnimal().get(i).getFicha().getConsulta().size(); f++){
					System.out.println("   Consulta " + (j+1) + ":\n" 
							+ "    Descrição: " + c.get(i).getAnimal().get(j).getFicha().getConsulta().get(f).getDescricao() 
							+ "\n    Data: " + c.get(i).getAnimal().get(j).getFicha().getConsulta().get(f).getData());
					System.out.println();
				}
				System.out.println();
				System.out.println("  Vacinas:");
				for(int f=0; f<c.get(i).getAnimal().get(j).getFicha().getVacina().size(); f++){
					System.out.println("   Vacina " + (j+1) + ":\n" 
							+ "    Nome: " + c.get(i).getAnimal().get(j).getFicha().getVacina().get(f).getNome()
							+ "\n    Preço: " + c.get(i).getAnimal().get(j).getFicha().getVacina().get(f).getPreco()
							+ "\n    Data: " + c.get(i).getAnimal().get(j).getFicha().getVacina().get(f).getData());
				}
			}
		}
	}

	public Vacina addVacina(ArrayList<Cliente> c, int idC, int idA){
		
		String nome, data;
		float preco;
		
		read.nextLine();
		
		System.out.printf("Insira o nome da vacina: ");
		nome = read.nextLine();
		
		System.out.print("Insira o preço da vacina: ");
		preco = read.nextFloat();
		
		read.nextLine();
		
		System.out.print("Insira a data da vacina: ");
		data = read.nextLine();
		
		Vacina v = new Vacina(nome,data,preco);
		return v;
	}
	
	public Consulta addConsulta(ArrayList<Cliente> c, int idC, int idA){
		
		System.out.printf("Insira a descricao da consulta: ");
		String consulta = read.nextLine();
		
		System.out.printf("Insira a data da consulta: ");
		String data = read.nextLine();
		
		Consulta con = new Consulta(consulta,data);
		return con;
	}
	
	public void edFich(ArrayList<Cliente> c){
		
		
		new GestaoCliente().listarCli(c);
		System.out.printf("Insira o id do dono do animal: ");
		int idC = read.nextInt();
		
		idC--;
		
		System.out.println();
		
		new GestaoAnimal().listarCliAnimal(c, idC);
		System.out.printf("Insira o id do animal: ");
		int idA = read.nextInt();
	
		idA--;
		
		Vacina v = addVacina(c, idC, idA);
		Consulta con = addConsulta(c, idC, idA);
		
		if(c.get(idC).getAnimal().get(idA).getBol() == false){
		
			Ficha f = new Ficha();
			
			c.get(idC).getAnimal().get(idA).setFicha(f);
			
			c.get(idC).getAnimal().get(idA).getFicha().getVacina().add(v);
			c.get(idC).getAnimal().get(idA).getFicha().getConsulta().add(con);

			c.get(idC).getAnimal().get(idA).setBol();
		}
		else{
			
			c.get(idC).getAnimal().get(idA).getFicha().getVacina().add(v);
			c.get(idC).getAnimal().get(idA).getFicha().getConsulta().add(con);
			
		}	
	}
}
