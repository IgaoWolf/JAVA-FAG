package com.elenilton.fag;

public final class  Gerente extends Empregado{
	
	protected String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "-------------------------"
				+"\n       Gerente \n"				
				+ "Nome: " + nome 
				+ "Idade: " + idade
				+ "\nSexo: " + sexo
				+ "\nMatricula: " + matricula
				+"\nDepartamento: " + departamento
				+ "\n-------------------------" ;
	}

}
