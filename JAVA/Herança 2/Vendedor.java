package com.elenilton.fag;

public final class Vendedor extends Empregado {
	
	protected double valorComissao;

	public double getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}

	@Override
	public String toString() {
			return "-------------------------"
					+"\n       Vendedor(A) \n"				
					+ "Nome: " + nome 
					+ "Idade: " + idade
					+ "\nSexo: " + sexo
					+ "\nMatricula: " + matricula
					+ "\nPorcentagem Comissao: " + valorComissao
					+ "\n-------------------------" ;
		}
}
