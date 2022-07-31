package Aula06;

import java.util.Random;
import java.util.Scanner;

public class Homogenea {
	
	private static int vetor [];
	private static int matriz [][] = new int [4][4] ;
	private static Scanner entrada = new Scanner(System.in);
	private static Random random = new Random();
	
	public static void main(String[] args) {
	//	System.out.println("Informe o tamanho do vetor");
	//	int valor = entrada.nextInt();
	//	vetor = new int[valor];
	//	obterDados();
	//	exibirDadosVetor();
		obterDadosMatriz();
		exibirDadosMatriz();
		
	}
	
	

	private static void obterDados() {
		for (int i = 0; i < vetor.length; i ++) {
			System.out.println("Informe o valor para a " + (i+1) + "* posição do vetor");
			vetor[i] = entrada.nextInt();
		}
		
	}
	private static void exibirDadosVetor() {
		for (int i = 0; i < vetor.length; i ++) {
			System.out.println(vetor[i]);
		}
		
		
	}
	private static void obterDadosMatriz() {
		for (int linha = 0; linha < matriz.length; linha ++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				matriz[linha][coluna] = random.nextInt(100);//linha*coluna;
				
			}
		}
		
	}
	
	private static void exibirDadosMatriz() {
		for (int linha = 0; linha < matriz.length; linha ++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
		
	}

	
}
