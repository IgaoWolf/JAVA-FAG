package TrabalhoElenilton;

import java.util.Scanner;

public class Principal {
	static Scanner meuScanner = new Scanner (System.in); 
	public static void main(String[] args) {
		
	Scanner info = new Scanner(System.in);
		
	System.out.println("Opçoes\n 1-Cadastrar produto\n");
	        System.out.print("nº: ");

	        int escolhas = meuScanner.nextInt();

	        
	        if (escolhas == 1 || escolhas == 2 || escolhas == 3) {
	            if (escolhas== 1) {
	            	System.out.println("Nome do produto: ");
	                String nomeprod = info.nextLine();
	                
	               
	                System.out.println("Modelo do produto: ");
	               

	                System.out.println("Tamanho do produto: ");
	                
	               
	                System.out.println("Preço do produto: ");
	                System.out.println("Nome do Produto: " + nomeprod);
	            	}
	            }
	
	            
	            
	 
	}
}

