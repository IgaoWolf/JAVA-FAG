package lacos;

import java.util.Scanner;

public class Exe3 {
	
private static int tabuada; 
	
	public static void main(String[] args) {
		pedirInforma��es();
		calcularInforma��es();
		
	}
	private static void calcularInforma��es() {
		for(int x = 0; x <= 10; x++) {
			   System.out.println("Tabuada do: " + tabuada);
			   System.out.println(x + " x " + tabuada + " = ");
			   System.out.println(x * tabuada);
			}
		
	}
	private static void pedirInforma��es() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		tabuada = entrada.nextInt();
		
	}
}
