package lacos;

import java.util.Scanner;

public class exe5 {
	
	private static int num, contPar, contImpar;
	
	public static void main(String[] args) {
		contPar = 0;
		contImpar = 0;
		calcular();	
	}

	private static void calcular() {
		for(int i = 1; i <= 10; i++){
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o " + i + "º número");
			num = entrada.nextInt();
		
			if(num % 2 == 0){
                contPar++;
            } else if (num % 2 == 1){
                contImpar++;
            }
			
		}
		System.out.println("Foram digitados " + contPar + " números pares \n");
		System.out.println("E " + contImpar + " números ímpares");
	}
	
            
}
