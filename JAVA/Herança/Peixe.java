package com.heranca2.fag;

public class Peixe extends Animal {
	
	protected String tipoHabitat;

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}

	@Override
	public String toString() {
		return "Peixe [tipoHabitat=" + tipoHabitat + "]";
	}
	

}
