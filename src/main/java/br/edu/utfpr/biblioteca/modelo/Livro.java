package br.edu.utfpr.biblioteca.modelo;

public class Livro extends Midia {

    private String isbn;

    public Livro(String nome, String isbn) {
        super(nome);
        this.isbn = isbn;
    }

    @Override
    public void mostrar() {
        System.out.printf("Livro '%s' (ISBN: %s)\n", getNome(), isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}