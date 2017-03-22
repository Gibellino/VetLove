package model;

public class Animal {

	private int id;
	private String especie, raca, dataNas;
	private Cliente cliente;
	private Ficha ficha;
	
	public Animal(int id, String especie, String raca, String dataNas, Cliente cliente) {

		this.id = id;
		this.especie = especie;
		this.raca = raca;
		this.dataNas = dataNas;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	
}
