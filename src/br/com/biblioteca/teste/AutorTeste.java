package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.servico.AutorServico;

public class AutorTeste extends BaseTeste<Autor> {

    public AutorTeste() {
        this.servico = new AutorServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarExclusao(valorChave);
        this.TestarLeitura(2); // escrever valor da chave //
        this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando criação:");
        Autor cat = new Autor(0, "DUDU", null, "Carlos TESTE", "Coca 2023");
        Autor novo = this.servico.Criar(cat);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando ler algo específico:");
        Autor cat = this.servico.Ler(chave);
        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        System.out.println("Agora testando ler varios:");
        List<Autor> Lista = this.servico.Ler();
        for (Autor cat : Lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando alteração:");
        Autor antigo = this.servico.Ler(chave);
        antigo.setDescricao("Testando Atividade 2");
        Autor alterado = this.servico.Atualizar(antigo);
        System.out.println(alterado.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando excluindo:");
        Autor alvo = this.servico.Ler(chave);
        Autor excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
