package model;

import java.util.ArrayList;

public class Ficha {

	private ArrayList<Vacina> vacina = new ArrayList<Vacina>();
	private ArrayList<Consulta> consulta = new ArrayList<Consulta>();
	
	public Ficha(ArrayList<Vacina> vacina, ArrayList<Consulta> consulta) {
		super();
		this.vacina = vacina;
		this.consulta = consulta;
	}
	
	public Ficha(){}

	public ArrayList<Vacina> getVacina() {
		return vacina;
	}

	public void setVacina(ArrayList<Vacina> vacina) {
		this.vacina = vacina;
	}

	public ArrayList<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(ArrayList<Consulta> consulta) {
		this.consulta = consulta;
	}

}
