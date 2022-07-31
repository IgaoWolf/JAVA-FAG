package com.heranca2.fag;

public class Principal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setNome("Rex");
		a1.setPeso(22);
		System.out.println(a1.toString());

		System.out.println("-------------------");
		Cachorro c1 = new Cachorro();
		c1.setCorDoPelo("Preto");
		c1.setRaca("Labrador");
		c1.abanar(); // c1.latir();
		System.out.println(c1.toString());
		
		System.out.println("-------------------");
		Peixe p1 = new Peixe();
		p1.setTipoHabitat("Aguatico");
		System.out.println(p1.toString());

	}
}
