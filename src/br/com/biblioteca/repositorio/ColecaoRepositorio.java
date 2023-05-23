package br.com.biblioteca.repositorio;

import br.com.biblioteca.FakeDB.ColecaoFakeDB;
import br.com.biblioteca.dominio.Colecao;

public class ColecaoRepositorio extends BaseRepositorio<Colecao> {

    public ColecaoRepositorio() {
        super();
        this.Tabela = new ColecaoFakeDB().getTabela();
    }

    @Override
    public Colecao Create(Colecao obj) {
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
    public Colecao Read(int chave) {
        Colecao res = new Colecao();
        for (Colecao tupla : this.Tabela) {
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
    public Colecao Update(Colecao obj) {
        Colecao alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
