package javaHerancaContinuacao;

public class Aluno extends Pessoa{
	private int RA;
	private String curso;
	
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

	public String toString() {
		return " RA : " + RA + "\n Curso : " + curso ;
	}
	
}
