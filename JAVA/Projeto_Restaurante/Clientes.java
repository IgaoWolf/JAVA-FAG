import java.util.ArrayList;

public class Clientes {
	
	String nome;
	
	String chocolate;
	
	ArrayList<Integer> comanda = new ArrayList<Integer>();
	
	public Clientes(String nome) {
		this.nome = nome;
	}
	
	public void pedirItem(int id) {
		this.comanda.add(id);
	}
	
	public ArrayList<Integer> getComanda() {
		return this.comanda;
	}
	
	public void ganharChocolate(String nomeChocolate) {
		this.chocolate = nomeChocolate;
	}
}