package br.com.biblioteca.servico;

import java.util.List;

public interface IBaseServico<TServico> {

    // Assinaturas //
    TServico Criar(TServico obj);

    TServico Ler(int chave);

    List<TServico> Ler();

    TServico Atualizar(TServico obj);

    TServico Deletar(int chave);
}