package br.com.biblioteca.repositorio;

import br.com.biblioteca.FakeDB.AutorFakeDB;
import br.com.biblioteca.dominio.Autor;

public class AutorRepositorio extends BaseRepositorio<Autor> {

    public AutorRepositorio() {
        this.Tabela = new AutorFakeDB().getTabela();
    }

    @Override
    public Autor Create(Autor obj) {
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
    public Autor Read(int chave) { // "Metodo não ideal" //
        Autor res = new Autor();
        for (Autor tupla : this.Tabela) {
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
    public Autor Update(Autor obj) {
        Autor alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }

}
