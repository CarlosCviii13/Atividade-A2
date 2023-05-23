package br.com.biblioteca.servico;

import br.com.biblioteca.repositorio.BaseRepositorio;

public abstract class BaseServico<TServico> implements IBaseServico<TServico> {

    protected BaseRepositorio<TServico> repositorio;

    public BaseServico() {

    }
}
