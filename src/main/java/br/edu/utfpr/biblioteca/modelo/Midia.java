package br.edu.utfpr.biblioteca.modelo;

public abstract class Midia {

    protected Midia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String nome;

    public abstract void mostrar();
}