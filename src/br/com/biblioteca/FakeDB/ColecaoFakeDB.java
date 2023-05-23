package br.com.biblioteca.FakeDB;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {
            this.tabela.add(new Colecao(1, "Teste coleção A", null, "EDITORA-COCA.A"));
            this.tabela.add(new Colecao(2, "Teste coleção B", null, "EDITORA-COCA.B"));
            this.tabela.add(new Colecao(3, "Teste coleção C", null, "EDITORA-COCA.C"));
    }

}
