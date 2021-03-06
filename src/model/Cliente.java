package model;

import java.util.ArrayList;

public class Cliente {
	
	private int id;
	private String nome, morada, email, tlm;
	private ArrayList<Animal> animal = new ArrayList<Animal>();
	
	public Cliente(){}

	public Cliente(int id, String nome, String morada, String email, String tlm) {
		super();
		this.id = id;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.tlm = tlm;
	}



	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTlm() {
		return tlm;
	}

	public void setTlm(String tlm) {
		this.tlm = tlm;
	}
	
	public ArrayList<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(ArrayList<Animal> animal) {
		this.animal = animal;
	}

	public String toString(){
		return "\nCliente " + (getId()+1)
				+ ":\n Nome: " + getNome() 
				+ ";\n Morada: " + getMorada()
				+ ";\n E-mail: " + getEmail() 
				+ ";\n Telemovel: " + getTlm();
	}

}


