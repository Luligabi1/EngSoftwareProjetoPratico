package br.edu.utfpr.biblioteca.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Midia {

    private String nome;
    public List<Exemplar> exemplares;

    protected Midia(String nome) {
        this.nome = nome;
        exemplares = new ArrayList<>();
    }


    public void add(Exemplar... exemplar) {
        exemplares.addAll(Arrays.asList(exemplar));
    }

    public void mostrarExemplares() {
        for(Exemplar examplar : exemplares) {
            examplar.mostrar();
        }
    }

    public abstract void mostrar();

    public String getNome() {
        return nome;
    }
}