package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoAnimal;
import controller.GestaoCliente;
import controller.GestaoFichaConsultaVacina;
import model.Cliente;


public class Main {

	static Scanner read = new Scanner(System.in);
	static ArrayList<Cliente> c = new ArrayList<Cliente>();
	
	public static void main(String[] args) {

		
		
		int op=0;
		
		do{
			
			System.out.println("\tMenu:\n"
					+ " 1- Inserir;"
					+ "\n 2- Listar;"
					+ "\n 3- Consulta;"
					+ "\n 0- Sair;");
			System.out.printf("\nInsira a opção que deseja: ");
			
			try{
			op= read.nextInt();
			}
			catch(Exception e){
				op=10;
				read.next();
			}
			
			System.out.println();
			
			switch(op){
			
			case 1: menuI(); break;
			case 2: menuL(); break;
			case 3: new GestaoFichaConsultaVacina().edFich(c);
			case 0: System.out.println("\nVai Sair!\n"); break;
			
			default: System.out.println("\nOpção Inválida!\n");
			}
			
			System.out.println();
			
		}while(op != 0);
	}
	
	public static void menuI(){
		
		int op=0;
		
		do{
			
			System.out.println("\tMenu:\n"
					+ " 1- Inserir Cliente;\n"
					+ " 2- Inserir Animal;\n"
					+ " 0- Sair;\n");
			System.out.println("Insira a opção que deseja: ");
			
			try{
				op= read.nextInt();
			}
			catch(Exception e){
				op=10;
				read.next();
			}
			
			System.out.println();
			
			switch(op){
			
			case 1: new GestaoCliente().addCli(c); break;
			case 2: new GestaoAnimal().addAnimal(c); break;
			case 0: System.out.println("\nVai Sair!\n"); break;
			
			default: System.out.println("\nOpção Inválida!\n");
			
			}
			
			System.out.println();
			
		}while(op != 0);
		
	}
	
	public static void menuL(){
		
		int op=0;
		
		do{
			
			System.out.println("\tMenu:"
					+ "\n 1- Listar Clientes;"
					+ "\n 2- Listar Animais;"
					+ "\n 3- Listar Consultas;"
					+ "\n 0- Sair");
			System.out.print("Insira a opção que deseja: ");
			
			try{
				op = read.nextInt();
			}catch(Exception e){
				op = 10;
				read.next();
			}
			
			System.out.println();
			
			switch(op){
			
			case 1: new GestaoCliente().listarCli(c); break;
			case 2: new GestaoAnimal().listarAnimal(c); break;
			case 3: new GestaoFichaConsultaVacina().listarFich(c);
			
			}
			
			
		}while(op != 0);
		
	}

}
