package br.fag.lista01;

import java.util.Scanner;

public class la�os {
	
	private static int valor;
	private static String resposta = "Sim";
	private static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		while(resposta.equals("Sim")) { 
			obterInforma��es();
			processaInforma�oesUsandoFor();
			processaInforma�oesUsandoWhile();
			System.out.println("Deseja continuar(sim/nao)");
			resposta = entrada.next();
		}
		
	}
	
	private static void processaInforma�oesUsandoWhile() {
		int i = 0;
		while(i < valor){
			System.out.println(i);
			i=i+5;
		}
		System.out.println("terminou" + i);
		
	}

	

	private static void processaInforma�oesUsandoFor() {
		for (int i = 0; i < valor; i++)/*ou (int i = 0; i < valor; i=i+5)*/ {
			//System.out.println(i);
			if( i % 5 ==0) {
				System.out.println(i);
			}
		}
		
	}

	private static void obterInforma��es() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor:");
		valor = entrada.nextInt();
	}
}
