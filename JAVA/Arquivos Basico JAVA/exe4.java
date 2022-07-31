package lacos;

import java.util.Scanner;

public class exe4 {
	
	private static double v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, somando, media;
	
	public static void main(String[] args) {
		pedirInformacao();
		calcule();
	}

	private static void calcule() {
		somando = v1+ v2+ v3+ v4+ v5+ v6+ v7+ v8+ v9+ v10;
		System.out.println("Todas as idades juntas tem o total de: " + somando + " anos.");
		media = somando / 10;
		System.out.println("A média de idades é: " + media);
		
	}

	private static void pedirInformacao() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma idade");
		v1 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v2 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v3 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v4 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v5 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v6 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v7 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v8 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v9 = entrada.nextInt();
		System.out.println("Digite uma idade");
		v10 = entrada.nextInt();
	}
}
