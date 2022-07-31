import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Restaurante {

	static Scanner meuScanner = new Scanner(System.in);

	static ArrayList<ItensCardapio> cardapioPrincipal = gerarCardapio();

	static Queue<Clientes> filaPrincipal = new LinkedList<Clientes>();

	static Stack<String> pilhaDeChocolates = criarPilhaDeChocolates();

	public static void main(String[] args) {

		Clientes pedro = new Clientes("pedro");

		pedro.pedirItem(1);
		pedro.pedirItem(1);
		pedro.pedirItem(1);
		pedro.pedirItem(1);
		pedro.pedirItem(1);

		Clientes fabricio = new Clientes("fabricio");

		fabricio.pedirItem(0);
		fabricio.pedirItem(0);
		fabricio.pedirItem(0);

		Clientes junior = new Clientes("junior");
		
		junior.pedirItem(1);

		filaPrincipal.add(pedro);
		filaPrincipal.add(fabricio);
		filaPrincipal.add(junior);

		

		pedirSeQuer();

	}

	private static void mostrarPilha(Stack<String> pilha) {
		if (pilha.peek() == null) {
			System.out.println("Nao tem chocolates na pilha");
			pilhaDeChocolates = criarPilhaDeChocolates();
		} else {
			int contador = 1;
			Iterator iterator = pilha.iterator();
			while (iterator.hasNext()) {
				Object valores = iterator.next();
				System.out.println(contador + " :" + valores);
				contador++;
			}
		}
	}

	private static void pedirSeQuer() {
		System.out.println("-------------------------------------");
		System.out.println("Qual a função que voce precisa?");
		System.out.println(" '0': Sair do programa");
		System.out.println(" '1': Fila de pessoas");
		System.out.println(" '2': Mostrar a pilha de chocolates");
		System.out.println(" '3': Mostrar o cardapio");
		System.out.println(" '4': Atender os clientes");
		System.out.println("-------------------------------------");
		int desejo = meuScanner.nextInt();

		if (desejo == 0 || desejo == 1 || desejo == 2 || desejo == 3 || desejo == 4) {
			if (desejo == 0) {
				System.out.println("fim do programa");
			} else if (desejo == 1) {
				mostrarFila(filaPrincipal);
				pedirSeQuer();
			} else if (desejo == 2) {
				mostrarPilha(pilhaDeChocolates);
				pedirSeQuer();
			} else if (desejo == 3) {
				printarCardapio(cardapioPrincipal);
				pedirSeQuer();
			} else if (desejo == 4) {
				atenderClientes(filaPrincipal, pilhaDeChocolates, cardapioPrincipal);
				pedirSeQuer();
			}
		} else {
			System.out.println("Erro, codigo incorreto, tente novamente");
			pedirSeQuer();
		}
	}

	private static void mostrarFila(Queue<Clientes> fila) {
		if (fila.peek() == null) {
			System.out.println("Ninguem na fila");
		} else {
			int contador = 1;

			for (Clientes clienteAtual : fila) {
				System.out.println("Em " + contador + " lugar: " + clienteAtual.nome);
				contador++;
			}
		}
	}

	private static void atenderClientes(Queue<Clientes> fila, Stack<String> chocolates,
			ArrayList<ItensCardapio> cardapio) {

		for (int i = fila.size(); i > 0; i--) {

			fila.peek().ganharChocolate(chocolates.peek());

			System.out.println(fila.element().nome + " gastou R$" + somarValorPedido(fila.element(), cardapio)
					+ " e recebeu um chocolate " + fila.element().chocolate);

			chocolates.pop();
			fila.remove();
		}
	}

	private static Stack<String> criarPilhaDeChocolates() {

		Stack<String> chocolates = new Stack();

		chocolates.push("Milka");
		chocolates.push("Kit Kat");
		chocolates.push("Bis");
		chocolates.push("Baton");
		chocolates.push("Charge");
		chocolates.push("Ouro Branco");
		chocolates.push("Alpino");
		chocolates.push("Laka");
		chocolates.push("Prestigio");
		chocolates.push("Diamante Negro");
		chocolates.push("Sonho de Valsa");
		chocolates.push("Suflair");
		chocolates.push("Lolo");
		chocolates.push("Galak");

		return chocolates;
	}

	private static double somarValorPedido(Clientes ClienteAtual, ArrayList<ItensCardapio> cardapio) {
		ArrayList<Integer> comanda = ClienteAtual.getComanda();

		double somaDoPedido = 0;

		for (int i = 0; i < comanda.size(); i++) {
			int pedidoID = comanda.get(i);
			somaDoPedido += cardapio.get(pedidoID).valor;
		}
		return somaDoPedido;
	}

	private static void printarCardapio(ArrayList<ItensCardapio> cardapio) {
		System.out.println("--------");
		System.out.println("Mostrar Cardapio?");
		for (int i = 0; i < cardapio.size(); i++) {
			ItensCardapio itemAtual = cardapio.get(i);

			System.out.println(itemAtual.id + ": Descricao " + itemAtual.descricao + " R$"
					+ String.format("%.2f", itemAtual.valor));
		}
		System.out.println("--------");
	}

	private static ArrayList<ItensCardapio> gerarCardapio() {
		ItensCardapio arrozFrito = new ItensCardapio(0, "Um Prato de Arroz com ovo Frito", 25.50);
		ItensCardapio feijaoFrito = new ItensCardapio(1, "Um Prato de Feijao com ovo Frito", 30.00);
		ItensCardapio guarana = new ItensCardapio(2, "Refrigerente de guarana", 5.00);
		ItensCardapio camarao = new ItensCardapio(3, "Um Prato de Camar�o sem Casca e Frito", 100.00);
		ItensCardapio macarronada = new ItensCardapio(4, "Um Prato de Macarronada", 35.00);
		ItensCardapio frangoFrito = new ItensCardapio(5, "Um Prato de Arroz com Frango Frito", 20.00);
		ItensCardapio feijoada = new ItensCardapio(6, "Um Prato de Feijoada", 18.00);
		ItensCardapio picadinhoDeCarne = new ItensCardapio(7, "Um Prato de Picadinho de Carne", 37.50);
		ItensCardapio moquecadepeixe = new ItensCardapio(8, "Um Prato de Moqueca De Peixe", 25.50);
		ItensCardapio peixefrito = new ItensCardapio(9, "Uma Peixe frito", 35.50);
		ItensCardapio batatafrita = new ItensCardapio(10, "Uma porçao de batata frita", 30.00);
		
		
		ArrayList<ItensCardapio> cardapioPrincipal = new ArrayList<ItensCardapio>();

		cardapioPrincipal.add(arrozFrito);
		cardapioPrincipal.add(feijaoFrito);
		cardapioPrincipal.add(guarana);
		cardapioPrincipal.add(camarao);
		cardapioPrincipal.add(macarronada);
		cardapioPrincipal.add(frangoFrito);
		cardapioPrincipal.add(feijoada);
		cardapioPrincipal.add(picadinhoDeCarne);
		cardapioPrincipal.add(moquecadepeixe);
		cardapioPrincipal.add(peixefrito);
		cardapioPrincipal.add(batatafrita);		
		
		return cardapioPrincipal;

	}

}