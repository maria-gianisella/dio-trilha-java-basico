public class Iphone {

    private String modelo;
    private String cor;
    private String tamanho;
    private String versaoSistemaOperacional;
    private int armazenamento;
    private String processador;
    private double preco;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    private ReprodutorMusical reprodutorMusical;

    public Iphone(String modelo, String cor, String tamanho, String versaoSistemaOperacional, int armazenamento, String processador, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.versaoSistemaOperacional = versaoSistemaOperacional;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.preco = preco;
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
        this.reprodutorMusical = new ReprodutorMusical();
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getVersaoSistemaOperacional() {
        return versaoSistemaOperacional;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public double getPreco() {
        return preco;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setVersaoSistemaOperacional(String versaoSistemaOperacional) {
        this.versaoSistemaOperacional = versaoSistemaOperacional;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    

}