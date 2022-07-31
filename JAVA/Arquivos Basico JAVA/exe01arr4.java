package Lista04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exe01arr4 {

	private static int arr01[] = new int[10];
	private static int arr02[] = new int[10];
	static int[]arr03 = concatenar(arr01, arr02);
	private static Scanner entrada = new Scanner(System.in);
	static Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		ColetarDados1();
		ColetarDados2();
		exibirDadosA();
		exibirDadosB();
		concatenar(arr01, arr02);
		result();

	}

	private static void result() {
		for(int a: arr03) {
		    set.add(a);
		}
		System.out.println("Vetor C = " + set);
	}

	private static int[] concatenar(int[] arr01, int[] arr02) {
		arr03 = new int[arr01.length + arr02.length];
		int k = 0;
		for (int i = 0; i < arr01.length; i++) {
			arr03[k++] = arr01[i];
		}
		for (int i = 0; i < arr02.length; i++) {
			arr03[k++] = arr02[i];
		}
		return arr03;
	}

	private static void exibirDadosB() {
		System.out.println("Vetor B ");
		for (int i = 0; i < arr02.length; i++) {
			System.out.println(arr02[i]);
		}
	}

	private static void exibirDadosA() {
		System.out.println("vetor A ");
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}

	}

	private static void ColetarDados1() {
		for (int i = 0; i < arr01.length; i++) {
			System.out.println("Informe o valor para a " + (i + 1) + "* posição do vetor A");
			arr01[i] = entrada.nextInt();

		}
	}

	private static void ColetarDados2() {
		for (int i = 0; i < arr02.length; i++) {
			System.out.println("Informe o valor para a " + (i + 1) + "* posição do vetor B");
			arr02[i] = entrada.nextInt();
		}
	}

}
