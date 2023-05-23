package br.com.biblioteca.FakeDB;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    public void AutoFill() {
            this.tabela.add(new Livro(1, "Teste A", null, "A", 1, "Livro de Jogos"));
            this.tabela.add(new Livro(2, "Teste B", null, "B", 2, "Livro de Arts"));
            this.tabela.add(new Livro(3, "Teste C", null, "C", 3, "Livro de SQL"));
    }
}
