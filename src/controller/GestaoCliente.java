package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class GestaoCliente {

	Scanner read = new Scanner(System.in);
	
	public void addCli(ArrayList<Cliente> c){
		
		String nome, morada, mail, tlm;
		
		System.out.printf("\nInsira o nome do cliente: ");
		nome = read.nextLine();
		
		System.out.print("Insira a morada do cliente: ");
		morada = read.nextLine();
		
		System.out.print("Insira o e-mail do cliente: ");
		mail = read.nextLine();
		
		System.out.printf("Insira o numero de telemovel do cliente: ");
		tlm = read.nextLine();
		
		c.add(new Cliente((c.size()),nome, morada, mail, tlm));

	}
	
	public void listarCli(ArrayList<Cliente> c){
		
		for(Cliente cli : c){
			System.out.println(cli.toString());
		}
		
	}
	
}
