package model;

public class Animal {

	private int id;
	private String especie, raca, dataNas;
	private Ficha ficha;
	
	public Animal(int id, String especie, String raca, String dataNas) {

		this.id = id;
		this.especie = especie;
		this.raca = raca;
		this.dataNas = dataNas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDataNas() {
		return dataNas;
	}

	public void setDataNas(String dataNas) {
		this.dataNas = dataNas;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	
}
