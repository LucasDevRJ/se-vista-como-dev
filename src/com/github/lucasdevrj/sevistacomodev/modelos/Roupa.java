package com.github.lucasdevrj.sevistacomodev.modelos;

public class Roupa implements Comparable<Roupa> {
    protected String nome;
    protected double preco;
    protected String cor;
    protected String tamanho;
    protected String marca;
    protected String descricao;
    public Roupa(String nome, double preco, String cor,
                 String tamanho, String marca, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getCor() {
        return cor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public String getMarca() {
        return marca;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public int compareTo(Roupa outraRoupa) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outraRoupa.preco));
    }
}
