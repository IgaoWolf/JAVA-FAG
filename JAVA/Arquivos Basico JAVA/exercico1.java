package br.fag.lista01;

import java.util.Scanner;

public class exercico1 {
	
	private static double valor1;
	
	public static void main(String[] args) {
		pedirInformacao();
	}

	private static void pedirInformacao() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		valor1 = entrada.nextInt();
		if(valor1 > 10) {
			System.out.println("maior que 10");
		} else if(valor1 == 10) {
			System.out.println("igual a 10");
		} else {
			System.out.println("menor que 10");
		}
		
	}
}


