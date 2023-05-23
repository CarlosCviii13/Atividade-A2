package br.com.biblioteca.servico;

import java.util.List;

import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.repositorio.ColecaoRepositorio;

public class ColecaoServico extends BaseServico<Colecao> {

    public ColecaoServico() {

        this.repositorio = new ColecaoRepositorio();
    }

    @Override
    public Colecao Criar(Colecao obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Colecao Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Colecao> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Colecao Atualizar(Colecao obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Colecao Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}
