public class Telefone implements AparelhoTelefonico {
    private String numeroDiscado;

    @Override
    public String ligar(String numero) {
        this.numeroDiscado = numero;
        return "Ligando para: " + numero;
    }
    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
