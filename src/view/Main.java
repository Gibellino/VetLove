package view;

import java.util.ArrayList;

import controller.GestaoAnimal;
import controller.GestaoCliente;
import model.Animal;
import model.Cliente;
import model.Consulta;
import model.Ficha;
import model.Vacina;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id=0;
		
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		ArrayList<Animal> animal = new ArrayList<Animal>();
		ArrayList<Ficha> ficha = new ArrayList<Ficha>(); 
		ArrayList<Vacina> vacina = new ArrayList<Vacina>();
		ArrayList<Consulta> consulta = new ArrayList<Consulta>();
		
		new GestaoCliente().addCli(cliente, id);
		
		new GestaoAnimal().addAnimal(animal, cliente);
	}

}
