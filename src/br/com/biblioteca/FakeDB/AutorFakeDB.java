package br.com.biblioteca.FakeDB;

import br.com.biblioteca.dominio.Autor;

public class AutorFakeDB extends BaseFakeDB<Autor> {

    @Override
    public void AutoFill() {
            this.tabela.add(new Autor(1, "Autor A", null, "Lucas", "Ferro"));
            this.tabela.add(new Autor(2, "Autor B", null, "Carlos Edurado", "Coca"));
            this.tabela.add(new Autor(3, "Autor C", null, "Kelle", "Hilgert"));
    }

}
