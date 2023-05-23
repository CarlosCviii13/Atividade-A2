package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Livro extends BaseBiblioteca {
    private String codigoISBN;
    private int codigoAutor;
    private String titulo;

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Livro() {
    }

    public Livro(int codigo, String descricao, LocalDate dataCadastro, String codigoISBN, int codigoAutor,
            String titulo) {
        super(codigo, descricao, dataCadastro);
        this.codigoISBN = codigoISBN;
        this.codigoAutor = codigoAutor;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro [codigoISBN=" + codigoISBN + ", codigoAutor=" + codigoAutor + ", titulo=" + titulo + "]";
    }

}
