package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.servico.ColecaoServico;

public class ColecaoTeste extends BaseTeste<Colecao> {

    public ColecaoTeste() {
        this.servico = new ColecaoServico();
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
        Colecao subc = new Colecao(0, "teste coca", null, "Nova LV");
        Colecao novo1 = this.servico.Criar(subc);
        System.out.println(novo1.toString());
        return novo1.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando ler algo específico:");
        Colecao subc = this.servico.Ler(chave);
        System.out.println(subc.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        System.out.println("Agora testando ler varios:");
        List<Colecao> Lista = this.servico.Ler();
        for (Colecao subc : Lista) {
            System.out.println(subc.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando alteração:");
        Colecao antigo = this.servico.Ler(chave);
        antigo.setDescricao("Teste Atividade 2");
        Colecao alterado = this.servico.Atualizar(antigo);
        System.out.println(alterado.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando excluindo:");
        Colecao alvo = this.servico.Ler(chave);
        Colecao excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
