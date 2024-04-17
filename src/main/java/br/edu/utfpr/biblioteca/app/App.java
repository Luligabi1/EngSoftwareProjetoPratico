package br.edu.utfpr.biblioteca.app;

import br.edu.utfpr.biblioteca.modelo.Exemplar;
import br.edu.utfpr.biblioteca.modelo.Livro;
import br.edu.utfpr.biblioteca.modelo.Midia;

public class App {

    public static void main(String[] args) {
        Midia domQuixote = new Livro("Dom Quixote", "1234-5678");
        domQuixote.mostrar();

        Exemplar exemplar1 = new Exemplar(1);
        Exemplar exemplar2 = new Exemplar(2);
        Exemplar exemplar3 = new Exemplar(3);
        domQuixote.add(exemplar1, exemplar2, exemplar3);
        domQuixote.mostrarExemplares();
    }
}
