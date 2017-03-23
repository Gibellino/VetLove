package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Cliente;
import model.Ficha;

public class GestaoAnimal {

	Scanner read = new Scanner(System.in);
	
	public void addAnimal(ArrayList<Cliente> c){
		
		int cli;
		String especie, raca, data;
		
		System.out.printf("\nInsira a especie do animal: ");
		especie = read.nextLine();
		
		System.out.print("Insira a raça do animal: ");
		raca = read.nextLine();
		
		System.out.print("Insira a data de nascimento do animal: ");
		data = read.nextLine();
		
		new GestaoCliente().listarCli(c);
		System.out.printf("\nInsira o id do cliente: ");
		cli = read.nextInt();
		
		cli--;
		
		c.get(cli).getAnimal().add(new Animal((c.get(cli).getAnimal().size()+1), especie, raca, data));
	}
	
	public void listarAnimal(ArrayList<Cliente> c){
		
		for(int i=0; i<c.size(); i++){
			System.out.println("Cliente " + c.get(i).getNome() + "\n");
			for(int j=0; j< c.get(i).getAnimal().size(); j++){
				System.out.println(c.get(i).getAnimal().get(j).toString());
				System.out.println();
			}
		}
	}
	
	public void listarCliAnimal(ArrayList<Cliente> c, int id){
		
		for(int i=0; i<c.get(id).getAnimal().size(); i++){
			System.out.println(c.get(id).getAnimal().get(i).getId() + " - " + c.get(i).getAnimal().get(i).getEspecie() + " " + c.get(i).getAnimal().get(i).getRaca());
		}
	}
	
}
