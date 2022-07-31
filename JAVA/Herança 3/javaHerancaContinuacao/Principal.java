package javaHerancaContinuacao;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
	static Scanner meuScanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		/*
		// Pessoa p1 = new Pessoa();

		p1.setNome("Teste");
		p1.setIdade(15);
		p1.setSexo("Teste");
		
		//EMPREGADO
		
		p2.setNome("Teste");
		p2.setIdade(15);
		p2.setSexo("Teste");
		p2.setSalario(1000);
		
		System.out.println("=======================================================");
		System.out.println("Vendedor");
		System.out.println(p5.toString());
		System.out.println(p5.toString5());
		System.out.println(p5.toString2());
		System.out.println(p5.toString3());
		System.out.println("=======================================================");
		*/
		Aluno A = new Aluno();
		A.setNome("Elenilton");
		A.setRA(781452312);
		A.setCurso("Engenharia de Software");
		
		Atendente A2 = new Atendente();
		A2.setNome("Maria");
		A2.setCodAtend(124889);
		
		Jornais J = new Jornais();
		J.setTitulo("Bom Dia Paraná ");
		J.setExemplar(1001);
		J.setCategoria("Jornais");
		J.setCidade("Curitiba,PR");
		
		Livros L = new Livros();
		L.setTitulo("Viagem ao centro da terra");
		L.setExemplar(1002);
		L.setCategoria("Livros ");
		L.setAutor("Autor : Dom Pedro");
		
		Revista R = new Revista();
		R.setTitulo("Malhacao");
		R.setExemplar(1003);
		R.setCategoria("Revista");
		R.setMarca("Marca ()()()");
		
		/*
		System.out.println(R.toString());
		
		System.out.println(R.getMarca());
		*/
		
		System.out.println(" -----------------------");
		System.out.println(" Acervo Biblio");
		System.out.println(" -----------------------");
		System.out.println(" |"+ " '1' " + "-" + "               |"+ J.toString());
		System.out.println(" -----------------------");
		System.out.println(" |"+ " '2' " + "-" + "               |"+ L.toString());
		System.out.println(" -----------------------");
		System.out.println(" |"+ " '3' " + "-" + "               |"+ R.toString());
		System.out.println(" -----------------------");
		System.out.println(" Escolha uma obra :");
		System.out.println(" -----------------------");
    	int desejo = meuScanner.nextInt();


    	if (desejo == 1 || desejo == 2 || desejo == 3 || desejo == 4) {
    		if (desejo == 1) {
    			//Jornal
    			Recibo1(args);
    			System.out.println("-");
    			System.out.println(" Nome : " + A.getNome());
    			System.out.println(A.toString());
    			DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
    	        System.out.println(" Emprestimo : "+dtf5.format(LocalDateTime.now()));
    	        System.out.println(" Atendente : " + A2.getNome());
    			System.out.println(J.toString2());
    			Recibo2(args);
    			
    		}
    		else if (desejo == 2) {
    			//Livro
    			Recibo1(args);
    			System.out.println("-");
    			System.out.println(" Nome : " + A.getNome());
    			System.out.println(A.toString());
    			DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
    	        System.out.println(" Emprestimo : "+dtf5.format(LocalDateTime.now()));
    	        System.out.println(" Atendente : " + A2.getNome());
    			System.out.println(L.toString2());
    			Recibo2(args);
			}
    		else if (desejo == 3) {
    			//Revista
    			Recibo1(args);
    			System.out.println("-");
    			System.out.println(" Nome : " + A.getNome());
    			System.out.println(A.toString());
    			DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
    	        System.out.println(" Emprestimo : "+dtf5.format(LocalDateTime.now()));
    	        System.out.println(" Atendente : " + A2.getNome());
    			System.out.println(R.toString2());
    			Recibo2(args);
			}
    	}
	}
	public static void Recibo1(String[] args) {
		System.out.println(" ------------------------------------");
		System.out.println(" Recibo de Emprestimo");
		System.out.println("-");
		System.out.println(" Valor Multa : R$2,00");
		System.out.println(" Acervo Biblio");
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(" Data : "+dtf5.format(LocalDateTime.now()));

	}
	public static void Recibo2(String[] args) {
		System.out.println(" ------------------------------------");
		System.out.println(" Devolucao : 7 Dias após recebimento");
		System.out.println("\n");
		System.out.println(" ______________________________");
		System.out.println("     Assinatura do Leitor      ");
		System.out.println(" ------------------------------------");
		System.out.println(" Em caso de extravio do(s) titulo(s) emprestado(s), estara o leitor obrigado a restituir \n a instituicao o valor correspondente ao(s) exemplar(es) e,, em caso de atraso na devolucao,\n pagamento da multa por diaria atrasada.");
	}
	
}