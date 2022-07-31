package br.fag.lista01;

import java.util.Scanner;

public class exercicio5 {
	
	private static double valor1, valor2;
	
	public static void main(String[] args) {
		pedirInformacao();
	}

	private static void pedirInformacao() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		valor1 = entrada.nextInt();
		System.out.println("Digite outro valor");
		valor2 = entrada.nextInt();
		
		if(valor1 > valor2) {
			System.out.println(valor1 + " maior");
		} else if(valor2 > valor1) {
			System.out.println(valor2 + " maior");
		} else if(valor1 == valor2) {
			System.out.println(valor1 + " e "+ valor2 + " são iguais");
		}
	}
}
