package lista03;

import java.util.Scanner;

public class habitantes {

	private static int idade, menorIdade, maiorIdade;

	static double media;

	private static String genero;

	private static double salario;

	public static void main(String[] args) {
		pedirInformação();
	}

	private static void pedirInformação() {
		for (int i = 0; i < 1; i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Qual a sua idade?");
			idade = entrada.nextInt();
			
			System.out.println("Seu genero é M ou F (masculino || feminino)");
			genero = entrada.next();

			System.out.println("Qual é o seu sálario?");
			salario = entrada.nextDouble();
			
			media = salario / 2;
			
			
			System.out.println(media);

		}

	}
}
