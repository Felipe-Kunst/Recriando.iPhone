public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutorMusical = reprodutor;
        this.aparelhoTelefonico = telefone;
        this.navegadorInternet = navegador;
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    public void carregarBateria() {
        System.out.println("Carregando bateria...");
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public String selecionarMusica(String musica) {
        return reprodutorMusical.selecionarMusica(musica);
    }

    public String ligarNumero(String numero) {
        return aparelhoTelefonico.ligar(numero);
    }

    public void atenderChamada() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public String exibirPaginaNaWeb(String url) {
        return navegadorInternet.exibirPagina(url);
    }

    public void adicionarAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
