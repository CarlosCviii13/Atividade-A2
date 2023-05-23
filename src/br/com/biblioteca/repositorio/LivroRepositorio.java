package br.com.biblioteca.repositorio;

import br.com.biblioteca.FakeDB.LivroFakeDB;
import br.com.biblioteca.dominio.Livro;

public class LivroRepositorio extends BaseRepositorio<Livro> {

    public LivroRepositorio() {
        super();
        this.Tabela = new LivroFakeDB().getTabela();
    }

    @Override
    public Livro Create(Livro obj) {
        int chave = 0;
        if (this.Tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.Tabela.size();
            chave = this.Tabela.get(tamanho - 1).getCodigo() + 1;
        }
        obj.setCodigo(chave);
        this.Tabela.add(obj);
        return obj;
    }

    @Override
    public Livro Read(int chave) {
        Livro res = new Livro();
        for (Livro tupla : this.Tabela) {
            if (tupla.getCodigo() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }
        }
        return res;
    }

    @Override
    public Livro Update(Livro obj) {
        Livro alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
