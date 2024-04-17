package br.edu.utfpr.biblioteca.app;

import br.edu.utfpr.biblioteca.modelo.Livro;
import br.edu.utfpr.biblioteca.modelo.Midia;

public class App {

    public static void main(String[] args) {
        Midia domQuixote = new Livro("Dom Quixote", "1234-5678");
        domQuixote.mostrar();
    }
}
