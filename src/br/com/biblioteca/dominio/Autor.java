package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Autor extends BaseBiblioteca {
    private String nome;
    private String sobreNome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Autor() {
    }

    public Autor(int codigo, String descricao, LocalDate dataCadastro, String nome, String sobreNome) {
        super(codigo, descricao, dataCadastro);
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    @Override
    public String toString() {
        return "Autor [nome=" + nome + ", sobreNome=" + sobreNome + "]";
    }
}
