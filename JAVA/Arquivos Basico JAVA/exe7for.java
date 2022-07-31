package lacos;

import java.util.Scanner;

public class exe7for {
private static int valor1;
	
	public static void main(String[] args) {
	pedirInformações();
	}

	private static void pedirInformações() {
		for(int x = 0; x <= 1; x++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um valor");
			valor1 = entrada.nextInt();
			if(valor1 <=12 && valor1 >=20) {
				System.out.println("Entrada valida");
				System.out.println(""+valor1);
			} else {
				System.out.println("Entrada inválida");
			} 
		}
		
	}
}
