package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Cliente;

public class GestaoAnimal {

	Scanner read = new Scanner(System.in);
	
	public void addAnimal(ArrayList<Animal> a, ArrayList<Cliente> c){
		
		int cli, fich;
		String especie, raca, dataNas;
		
		System.out.printf("\nInsira a especie do animal: ");
		especie = read.nextLine();
		
		System.out.print("Insira a raça do animal: ");
		raca = read.nextLine();
		
		new GestaoCliente().listarCli(c);
		System.out.printf("\nInsira o id do cliente: ");
		cli = read.nextInt();
		
		new GestaoFicha().listarFich();
		
	}
	
}
