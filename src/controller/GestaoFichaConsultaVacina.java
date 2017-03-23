package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Cliente;
import model.Consulta;
import model.Ficha;
import model.Vacina;

public class GestaoFichaConsultaVacina {
	
	Scanner read = new Scanner(System.in);
	
	public void listarFich(ArrayList<Cliente> c){
		
		for(int i=0; i<c.size(); i++){
			for(int j=0; j<c.get(i).getAnimal().size(); i++){
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

	public void addVacina(ArrayList<Cliente> c){
		
		String nome, data;
		float preco;
		
		System.out.printf("Insira o nome da vacina: ");
		nome = read.nextLine();
		
		System.out.print("Insira o preço da vacina: ");
		preco = read.nextFloat();
		
		System.out.print("Insira a data da vacina: ");
		data = read.nextLine();
		
		
	}
	
	public void addConsulta(){
		
	}
	
	public void edFich(ArrayList<Ficha> f, ArrayList<Animal> a, ArrayList<Vacina> v, ArrayList<Consulta> c){
		
		int idA;
			
	}
}
