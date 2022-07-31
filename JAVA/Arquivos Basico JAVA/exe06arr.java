package Lista04;

import java.util.Random;

public class exe06arr {

	private static int matriz[][] = new int[3][3];
	private static Random random = new Random();
	private static int i, j, somaElem = 0;

	public static void main(String[] args) {
		obterDadosMatriz();
		exibirDadosMatriz();
		calc();
		result();
	}

	private static void result() {
		System.out.println("A soma dos elementos acima da diagonal da matriz é: " + somaElem);
		
	}

	private static void calc() {
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				if (j > i)
					somaElem = somaElem + matriz[i][j];
	}

	private static void exibirDadosMatriz() {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
	}

	private static void obterDadosMatriz() {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = random.nextInt(800);
			}
		}
	}
}
