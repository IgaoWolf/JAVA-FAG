package lacos;

import java.util.Scanner;

public class exe6 {
	
	private static int valor1;
	
	public static void main(String[] args) {
		pedirInforma��o();
		
	}

	private static void pedirInforma��o() {
		for(int x = 0; x <= 9; x++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um valor");
			valor1 = entrada.nextInt();
			if(valor1 >= 10 && valor1 <=20) {
				System.out.println(valor1 + " Est� entre 10 e 20");
			}else {
				System.out.println(valor1+" N�o est� entre 10 e 20");
			}
		}
	}
}
