public class Reprodutor implements ReprodutorMusical {
    private String musicaAtual;

    @Override
    public void tocar() {
        System.out.println("Tocando a música: " + musicaAtual);
    }
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    @Override
    public String selecionarMusica(String musica) {
        this.musicaAtual = musica;
        return "Música selecionada: " + musica;
    }
}
