package krill.dominio;

public class Produto {
    public String nome;
    public String categoria;
    public double preco;
    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
    public Produto(){

    }
}
