public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new Reprodutor();
        AparelhoTelefonico telefone = new Telefone();
        NavegadorInternet navegador = new Navegador();

        iPhone meuIPhone = new iPhone(reprodutor, telefone, navegador);

        meuIPhone.ligar();
        meuIPhone.carregarBateria();

        System.out.println(meuIPhone.selecionarMusica("Pitty - Admirável Chip Novo"));
        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();

        System.out.println(meuIPhone.ligarNumero("55 (85) 91234-4567"));
        meuIPhone.atenderChamada();
        meuIPhone.iniciarCorreioVoz();

        System.out.println(meuIPhone.exibirPaginaNaWeb("https://github.com/Felipe-Kunst"));
        meuIPhone.adicionarAba();
        meuIPhone.atualizarPagina();

        meuIPhone.desligar();
    }
}
