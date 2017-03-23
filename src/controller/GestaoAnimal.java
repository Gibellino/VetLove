package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Cliente;
import model.Ficha;

public class GestaoAnimal {

	Scanner read = new Scanner(System.in);
	
	public void addAnimal(ArrayList<Animal> a, ArrayList<Cliente> c){
		
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
		
		a.add(new Animal((a.size()+1), especie, raca, data));
		
		c.get(cli).setAnimal(a);
	}
	
}
