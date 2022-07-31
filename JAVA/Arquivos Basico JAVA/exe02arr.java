package Lista04;

import java.util.Scanner;

public class exe02arr {

	private static int arr01[] = new int[8];
	private static int x, y, soma, usoIx, usoIy;
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		coletaArr();
		coletaX();
		coletaY();
		somar();
	}

	private static void somar() {
		soma = x + y;
		System.out.println("Esse e o resultado da soma = " + soma);
	}

	@SuppressWarnings("unused")
	private static void coletaY() {
		System.out.println("Insira o index de Y");
		usoIy = entrada.nextInt();
		for (int i = usoIy; i < arr01.length; i++) {
			y = arr01[i];
			System.out.println("O valor de Y referente ao index escolhido no Array será: " + y);
			break;
		}
	}

	@SuppressWarnings("unused")
	private static void coletaX() {
		System.out.println("Insira o index de X");
		usoIx = entrada.nextInt();
		for (int i = usoIx; i < arr01.length; i++) {
			x = arr01[i];
			System.out.println("O valor de X referente ao index escolhido no Array será: " + x);
			break;
		}
	}

	private static void coletaArr() {
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
