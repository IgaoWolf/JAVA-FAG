package br.fag.lista01;

import java.util.Scanner;

public class exemplo {

	private static double valor1, valor2, media, subtracao, multiplicacao, divisao;

	private static boolean valorZerado = false;

	public static void main(String[] args) {
		double soma;
		pedirInformacoes();
		soma = calcularSomaValores();
		calcularSubtracao();
		calcularMultiplicacao();
		calcularDivisao();
		calcularMedia(soma);
		exibirResultado(soma);
	}

	private static void calcularDivisao() {
		divisao = valor1 / valor2;
	}

	private static void calcularMultiplicacao() {
		multiplicacao = valor1 * valor2;
	}

	private static void calcularSubtracao() {
		subtracao = valor1 - valor2;

	}

	private static void calcularMedia(double resultado) {
		media = resultado / 2;
	}

	private static void exibirResultado(double resultado) {
		System.out.println("A soma do valores é " + resultado);
		System.out.println("A subtração dos valores é "+ subtracao);
		System.out.println("A multiplicação dos valores é "+ multiplicacao);
		if (valorZerado) {
			System.out.println("Não é possível dividir por zero");
		} else {
			System.out.println("A divisão dos valores é "+ divisao);
		}
		System.out.println("A média dos valores é " + media);
	}

	protected static double calcularSomaValores() {
		return valor1 + valor2;
	}

	private static void pedirInformacoes() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		valor1 = entrada.nextInt();
		System.out.println("Digite outro valor");
		valor2 = entrada.nextInt();
		if (valor2 == 0) {
			valorZerado = true;
		}

	}

}


