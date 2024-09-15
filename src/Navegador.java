public class Navegador implements NavegadorInternet {
    private String urlAtual;
    private int numeroAbas;
    @Override
    public String exibirPagina(String url) {
        this.urlAtual = url;
        return "Página exibida: " + url;
    }
    @Override
    public void adicionarNovaAba() {
        numeroAbas++;
        System.out.println("Nova aba adicionada. Total de abas: " + numeroAbas);
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada: " + urlAtual);
    }
}
