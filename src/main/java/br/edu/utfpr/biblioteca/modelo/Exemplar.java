package br.edu.utfpr.biblioteca.modelo;

public class Exemplar {

    public int codigo;

    public Exemplar(int codigo) {
        this.codigo = codigo;
    }

    public void mostrar() {
        System.out.printf("Exemplar #%d\n", codigo);
    }
}