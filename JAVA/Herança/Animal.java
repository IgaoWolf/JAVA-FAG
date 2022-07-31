package com.heranca2.fag;

public class Animal {

	protected String nome;
	protected double peso;

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", peso=" + peso + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
