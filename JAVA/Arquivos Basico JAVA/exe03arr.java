package Lista04;

import java.util.Scanner;

public class exe03arr {

	private static int arr01[] = new int[10];
	private static Scanner entrada = new Scanner(System.in);
	static int maior = Integer.MIN_VALUE;
	static int indiceMaior = -1;

	public static void main(String[] args) {
		ColetaArr();
		calc();
		result();
	}

	private static void result() {
		System.out.printf("Maior número é %d, no índice %d", maior, indiceMaior);
		
	}

	private static void calc() {
		for (int i = 0; i < arr01.length; i++) {
			if (arr01[i] > maior) {
				maior = arr01[i];
				indiceMaior = i;
			}
		}
	}

	private static void ColetaArr() {
		for (int i = 0; i < arr01.length; i++) {
			System.out.println("Informe o valor para a " + (i + 1) + "* posição do vetor A");
			arr01[i] = entrada.nextInt();
		}
		System.out.println("Vetor inserido = ");
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
	}
}
