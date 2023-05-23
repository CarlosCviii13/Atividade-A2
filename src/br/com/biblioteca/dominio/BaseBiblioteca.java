package br.com.biblioteca.dominio;

import java.time.LocalDate;

public abstract class BaseBiblioteca {
    protected int codigo;
    protected String descricao;
    protected LocalDate dataCadastro;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public BaseBiblioteca() {
    }

    public BaseBiblioteca(int codigo, String descricao, LocalDate dataCadastro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "BaseBiblioteca [codigo=" + codigo + ", descricao=" + descricao + ", dataCadastro=" + dataCadastro + "]";
    }

}
