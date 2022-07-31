package br.fag.lista01;

import java.util.Scanner;

public class exercicio4 {
	private static double ProvaUm, ProvaDois, media, mediafinal;
	
	public static void main(String[] args) {
		pedirInformacao();
	}

	private static void pedirInformacao() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("De 0 a 10, Digite a nota da primeira avaliação do aluno");
		ProvaUm = entrada.nextInt();
		System.out.println("De 0 a 10, Digite a nota da segunda avaliação do aluno");
		ProvaDois = entrada.nextInt();
		
		media = ProvaUm + ProvaDois;
		
		mediafinal = media / 2;
		System.out.println("A media final do aluno e:" + mediafinal);
		
		if(mediafinal >= 7) {
			System.out.println("Aluno aprovado");
		} else if(mediafinal < 7){
			System.out.println("Aluno reprovado");
		} else if(mediafinal > 11) {
			System.out.println("ERRO");
		}
	}
}
