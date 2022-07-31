package com.elenilton.fag;

import com.heranca2.fag.Animal;

public class Principal {
	public static void main(String[] args) {

		Empregado e1 = new Empregado();
		e1.setNome("Josiane \n");
		e1.setIdade(22);
		e1.setSalario(2100);
		e1.setMatricula("231");
		e1.calculaINSS();
		Cliente c1 = new Cliente();
		c1.setNome("Marcos\n");
		c1.setAnoNascimento(1992);
		c1.setIdade(30);
		c1.setSexo("M \n");
		c1.setValorDivida(340);
		Vendedor v1 = new Vendedor();
		v1.setNome("Josiane");
		v1.setValorComissao(2);
		v1.setMatricula("231");
		v1.setIdade(22);
		v1.setSexo("F");
		Gerente g1 = new Gerente();
		g1.setNome("Marcelo");
		g1.setMatricula("233");
		g1.setIdade(41);
		g1.setSexo("M");
		g1.setDepartamento("Vendas");

		System.out.println(e1.toString());
		System.out.println(c1.toString());
		System.out.println(v1.toString());
		System.out.println(g1.toString());

	}

}
