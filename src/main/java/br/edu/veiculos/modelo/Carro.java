public class Carro extends Veiculo {
    private int numeroDePortas;
    private boolean temArCondicionado;
    private boolean automatico;

    public Carro() {
        super();
    }

    public Carro(String marca, String modelo, String cor, int anoDeFabricacao) {
        super(marca, modelo, cor, anoDeFabricacao);
    }

    public void abrirPorta() {
    System.out.println("Abrindo a porta...");
}

    public void fecharPorta() {
    System.out.println("Fechando a porta...");
}

    public void ligarArCondicionado() {
    System.out.println("Ar-condicionado ligado");
}

    public void desligarArCondicionado() {
    System.out.println("Ar-condicionado desligado");
}
    public void trocarMarcha(int marcha) {
    System.out.println("Trocando para marcha " + marcha);
}

    @Override
    public void motor() {
    super.motor();
    System.out.println("Motor do carro ligado suavemente...");
}

    @Override
    public void buzinar() {
        System.out.println("Biiiii!");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPortas: " + numeroDePortas
                + "\nAr-condicionado: " + (temArCondicionado ? "Sim" : "Não");
    }

}