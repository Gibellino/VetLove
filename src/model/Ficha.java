package model;

public class Ficha {

	private Vacina vacina;
	private Consulta consulta;
	
	public Ficha(Vacina vacina, Consulta consulta) {
		this.vacina = vacina;
		this.consulta = consulta;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	

}
