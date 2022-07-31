package TrabalhoElenilton;

import java.util.Scanner;

public class CadastroProdutos {

   
    public String nomeprod;
    public String modelo;
    public String tamanho;
    public double preco;

    public String getnomeprod() {
        return nomeprod;
    }

    public void setnomeprod(String nomeprod) {
    	
        this.nomeprod = nomeprod;
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