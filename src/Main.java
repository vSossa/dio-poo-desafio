import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.ligar("+5585912345678");

        System.out.println();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        System.out.println();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println();

        iphone.iniciarCorreioDeVoz();
    }
}