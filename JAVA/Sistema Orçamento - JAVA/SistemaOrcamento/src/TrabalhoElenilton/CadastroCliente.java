package TrabalhoElenilton;

import java.util.Scanner;

public class CadastroCliente {

   
    public String nome;
    public String modelo;
    public String tamanho;
    public double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    	
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
    	
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
      
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }
}