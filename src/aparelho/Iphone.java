package aparelho;

import aparelho.funcao.AparelhoTelefonico;
import aparelho.funcao.NavegadorDeInternet;
import aparelho.funcao.ReprodutorMusical;

public class Iphone implements 
    AparelhoTelefonico, 
    NavegadorDeInternet, 
    ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música!");
    }

    public void pausar() {
        System.out.println("Pausando música!");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música!");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página!");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página!");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }

    public void ligar(String numero) {
        System.out.printf("Ligando para %s!%n", numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada!");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz!");
    }
}
