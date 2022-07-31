package br.fag.lista01;

import java.util.Scanner;

public class exercicio2 {
	
	private static double valor1;
	
	public static void main(String[] args) {
		pedirInformacao();
	}
	private static void pedirInformacao() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		valor1 = entrada.nextInt();
		if(valor1 >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
	}
}
