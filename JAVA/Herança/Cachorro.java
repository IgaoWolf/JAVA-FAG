package com.heranca2.fag;

public class Cachorro extends Animal {
	protected String raca;
	protected String corDoPelo;
	
	
	public void abanar() {
		System.out.println("Seu cachorro está abanando" );
	}
	
	public void latir() {
		System.out.println("Seu cachorro está latindo" );
	}


	@Override
	public String toString() {
		return "Cachorro [raca=" + raca + ", corDoPelo=" + corDoPelo + "]";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

}
