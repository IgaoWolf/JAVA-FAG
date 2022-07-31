package br.fag.lista01;

import java.util.Scanner;

public class exercicio3 {
	
	private static double maca, duzia, um;
	
	public static void main(String[] args) {
		pedirInformacao();
	}
	
	private static void pedirInformacao() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		maca = entrada.nextInt();
		if (maca < 12) {
			System.out.println("menos que uma duzia de maças");
			um = maca * 1.30;
			System.out.println("A quantidade de"+ maca + "vai custar:" + um);
		} else {
			System.out.println("mais que uma duzia de maças");
			duzia = maca * 1;
			System.out.println("A quantidade de"+ maca + "vai custar:" + duzia);
		}
	}
	
	
}
