package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.servico.LivroServico;

public class LivroTeste extends BaseTeste<Livro> {

    public LivroTeste() {
        this.servico = new LivroServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarExclusao(valorChave);
        this.TestarLeitura(1); // escrever valor da chave //
        this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando criação:");
        Livro prt = new Livro(0, "Coca", null, "D", 1, "Testando A2");
        Livro novo = this.servico.Criar(prt);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando ler algo específico:");
        Livro prt = this.servico.Ler(chave);
        System.out.println(prt.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        System.out.println("Agora testando ler varios:");
        List<Livro> Lista = this.servico.Ler();
        for (Livro prt : Lista) {
            System.out.println(prt.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando alteração:");
        Livro antigo = this.servico.Ler(chave);
        antigo.setDescricao(null);
        Livro alterado = this.servico.Atualizar(antigo);
        System.out.println(alterado.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando excluindo:");
        Livro alvo = this.servico.Ler(chave);
        Livro excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }

}
