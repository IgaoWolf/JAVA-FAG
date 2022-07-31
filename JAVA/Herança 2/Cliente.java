package com.elenilton.fag;

public class Cliente extends Pessoa{
	
	protected double valorDivida;
	protected int anoNascimento;
	
	
	@Override
	public String toString() {
		return "-------------------------"
				+"\n       Cliente \n"				
				+ "Nome: " + nome 
				+ "Idade: " + idade
				+ "\nAno de Nascimento: " + anoNascimento 
				+ "\nSexo: " + sexo 
				+ "Valor da Divida: " + valorDivida 
				+ "\n-------------------------" ;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
