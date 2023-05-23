package br.com.biblioteca.repositorio;

import java.util.List;

public abstract class BaseRepositorio<TRepositorio> implements IBaseRepositorio<TRepositorio> {
    // CRUD //
    protected List<TRepositorio> Tabela;

    @Override
    public List<TRepositorio> Read() {
        return this.Tabela;
    }

    @Override
    public TRepositorio Delete(int chave) {
        TRepositorio original = this.Read(chave);
        if (original != null) {
            this.Tabela.remove(original);
        }
        return original;
    }

}
