package br.com.biblioteca.servico;

import java.util.List;

import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.repositorio.AutorRepositorio;

public class AutorServico extends BaseServico<Autor> {

    public AutorServico() {

        this.repositorio = new AutorRepositorio();
    }

    @Override
    public Autor Criar(Autor obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Autor Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Autor> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Autor Atualizar(Autor obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Autor Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}
