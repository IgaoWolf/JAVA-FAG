package lista03;

import java.util.Scanner;

public class caixaEletronico {
	
	@SuppressWarnings("unused")
	private static int saldo, saque, deposito, sair, caixa, depositei, SALDOcliente, voltarMenu, efetuaSAQUE, sacando, sacando2021;
	 static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		menu();
		
	}

	private static void menu() {
		for(int i = 0; i <= 0; i++) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Caixa Eltronico do DUDU" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
	    System.out.println("*OPÇÃO 1* - Consulta Saldo");
		System.out.println("*OPÇÃO 2* - Saque");
		System.out.println("*OPÇÃO 3* - Depósito");
		System.out.println("*OPÇÂO 4* - Sair");
		caixa = entrada.nextInt();
		}
		
		if(caixa == 1) {
			System.out.println("saldo");
			saldo = caixa;
			verSaldo();
		} else if(caixa == 2) {
			System.out.println("saque");
			saque = caixa;
			sacar();
		} else if(caixa == 3) {
			System.out.println("deposito");
			depositar();
		} else if(caixa == 4) {
			System.out.println("sair");
			sair = caixa;
			sair();
		} else {
			System.out.println("erro");
			sair();
		}
	}

	private static void depositar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual valor o senhor gostaria de depositar?" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
		depositei = entrada.nextInt();
		System.out.println("Você depositou " + depositei + " Reais."); System.out.println("Para voltar para o menu digite 1"  + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
		voltarMenu = entrada.nextInt();
		SALDOcliente = depositei;
		if(voltarMenu == 1) {
			menu();
		} else {
			depositar();
		}
	}

	private static void sair() {
		System.out.println("caixa fechado"); System.out.println("Gostaria de voltar para o menu? Se sim digite 1" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		voltarMenu = entrada.nextInt();
		if(voltarMenu == 1) {
			menu();
		} else {
			sair();
		}
	}

	private static void sacar() {
		System.out.println("Seu saldo é de " + SALDOcliente + " Reais."); System.out.println("Gostaria de efetuar um saque? Se sim digite 1" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
		Scanner entrada = new Scanner(System.in);
		efetuaSAQUE = entrada.nextInt();
		if(efetuaSAQUE == 1) {
			System.out.println("Qual o valor que você gosta ria de sacar?" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
			sacando = entrada.nextInt();
			sacando2021 = sacando;
			if(sacando <= SALDOcliente) {
				SALDOcliente = SALDOcliente - sacando2021;
				System.out.println("Você sacou " + sacando + " Reais."); System.out.println("Restou " + SALDOcliente + " Reais em sua conta"); System.out.println("Gostaria de voltar para o menu? Se sim digite 1" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
				voltarMenu = entrada.nextInt();
				if(voltarMenu == 1) {
					menu();
				} 
			} else if(sacando > SALDOcliente) {
				System.out.println("ERRO" + " Valor incompativel com o seu saldo!" + " Seu saldo é de " + SALDOcliente); System.out.println("Gostaria de voltar para o menu? Se sim digite 1" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
				voltarMenu = entrada.nextInt();
				if(voltarMenu == 1) {
					menu();
				} else {
					sacar();
				}
			}
		}
	}


	private static void verSaldo() {
		System.out.println("Seu saldo é de " + SALDOcliente + " Reais."); System.out.println("Gostaria de voltar para o menu? Se sim digite 1" + "(PARA CONFIRMAR USE DOIS CLIQUES NO ENTER)");
		Scanner entrada = new Scanner(System.in);
		voltarMenu = entrada.nextInt();
		if(voltarMenu == 1) {
			menu(); 
		} else {
			verSaldo();
		}
	}


}