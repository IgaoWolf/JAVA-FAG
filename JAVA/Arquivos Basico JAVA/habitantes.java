package lista03;

import java.util.Scanner;

public class habitantes {

	private static int idade, menorIdade, maiorIdade;

	static double media;

	private static String genero;

	private static double salario;

	public static void main(String[] args) {
		pedirInforma��o();
	}

	private static void pedirInforma��o() {
		for (int i = 0; i < 1; i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Qual a sua idade?");
			idade = entrada.nextInt();
			
			System.out.println("Seu genero � M ou F (masculino || feminino)");
			genero = entrada.next();

			System.out.println("Qual � o seu s�lario?");
			salario = entrada.nextDouble();
			
			media = salario / 2;
			
			
			System.out.println(media);

		}

	}
}
