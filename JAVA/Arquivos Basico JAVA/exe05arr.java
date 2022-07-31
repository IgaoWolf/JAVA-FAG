package Lista04;

import java.util.Random;

public class exe05arr {

	private static int matriz[][] = new int[4][4];
	private static Random random = new Random();

	public static void main(String[] args) {
		obterDadosMatriz();
		exibirDadosMatriz();
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
