package javaHerancaContinuacao;

public class Obras {
	private String titulo;
	private long exemplar;
	private String categoria;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public long getExemplar() {
		return exemplar;
	}
	public void setExemplar(long exemplar) {
		this.exemplar = exemplar;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "\n | Categoria : " + categoria + " |" +"\n | Titulo : " + titulo + "   |" +"\n | Exemplar : " + exemplar + "     |";
	}
	
	public String toString2() {
		return "\n Categoria : " + categoria +"\n Titulo : " + titulo +"\n Exemplar : " + exemplar ;
	}
	
}
