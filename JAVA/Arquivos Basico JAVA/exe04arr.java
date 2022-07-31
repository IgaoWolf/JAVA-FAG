package Lista04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exe04arr {

	private static double arr01[] = new double[5];
	private static int valor;
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		obterInf();
		obterInf02();
		condição01();
		
	}

	private static void condição01() {
		if (valor == 1) {
			mostreVetorOrdemCerta();
		} else if (valor == 2) {
			mostreVetorOrdemErrada(arr01);
		} else if (valor == 0) {
			encerrado();
		} else {
			System.out.println("código é inválido");
		}
		
	}

	private static void encerrado() {
		System.out.println("sistema encerrado");
	}

	private static void mostreVetorOrdemErrada(double[] arr01) {
		int i, f;
		i = 0;   f = arr01.length - 1;
		
		while (i < f) {
			trocar(arr01, i, f);
			i++; f--;
		}
	}

	private static void trocar(double[] arr01, int i, int f) {
		double aux = arr01[i];
		arr01[i] = arr01[f];
		arr01[f] = aux;
		mostrar(arr01);
	}

	private static void mostrar(double[] arr01) {
		for(double x: arr01) {
			System.out.print(x + " ");
		}
		
	}

	private static void mostreVetorOrdemCerta() {
		System.out.println("vetor A ");
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
	}

	private static void obterInf02() {
		System.out.println("Informe um valor inteiro");
		valor = entrada.nextInt();
	}

	private static void obterInf() {
		for (int i = 0; i < arr01.length; i++) {
			System.out.println("Informe o valor real para a " + (i + 1) + "* posição do vetor A (numeros com virgula)");
			arr01[i] = entrada.nextDouble();
		}
		
	}
}
