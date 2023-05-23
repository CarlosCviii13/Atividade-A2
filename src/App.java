import br.com.biblioteca.teste.AutorTeste;
import br.com.biblioteca.teste.ColecaoTeste;
import br.com.biblioteca.teste.LivroTeste;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----------TESTE 01-------------");
        AutorTeste teste1 = new AutorTeste();
        teste1.Executar();
        System.out.println("----------TESTE 02-------------");
        ColecaoTeste teste2 = new ColecaoTeste();
        teste2.Executar();
        System.out.println("----------TESTE 03-------------");
        LivroTeste teste3 = new LivroTeste();
        teste3.Executar();
        System.out.println("--------------FIM----------------");
    }
}