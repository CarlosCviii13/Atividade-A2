package br.com.biblioteca.servico;

import java.util.List;

import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.repositorio.LivroRepositorio;

public class LivroServico extends BaseServico<Livro> {

    public LivroServico() {

        this.repositorio = new LivroRepositorio();
    }

    @Override
    public Livro Criar(Livro obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Livro Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Livro> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Livro Atualizar(Livro obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Livro Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}

