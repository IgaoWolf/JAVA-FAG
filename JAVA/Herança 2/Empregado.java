package com.elenilton.fag;

public class Empregado extends Pessoa {
	
	protected double salario;
	protected String matricula;	
	
	public void calculaINSS() {
		salario = salario - (salario*89/100);
		System.out.println("Valor do INSS é de: " + salario );
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "-------------------------"
				+ "\n       Empregado \n"
				+ "Nome: " + nome
				+ "Salario: " + salario  
				+ "\nMatricula: " + matricula 
				+ "\n-------------------------";
	}

}
