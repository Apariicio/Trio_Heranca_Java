public class Carro extends Veiculo {
    private int numeroDePortas;
    private boolean temArCondicionado;
    private boolean automatico;

    public Carro() {
        super();
    }

    public Carro(String marca, String modelo, String cor, int anoDeFabricacao, int numeroDePortas, boolean automatico, boolean temArCondicionado) {
        super(marca, modelo, cor, anoDeFabricacao); 
        this.numeroDePortas = numeroDePortas; 
        this.automatico = automatico;
        this.temArCondicionado = temArCondicionado;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public void abrirPorta() {
    System.out.println("Abrindo a porta...");
}

    public void fecharPorta() {
    System.out.println("Fechando a porta...");
}

    public void ligarArCondicionado() {
        this.temArCondicionado = true;
    System.out.println("Ar-condicionado ligado");
}

    public void desligarArCondicionado() {
        this.temArCondicionado = false;
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
                + "\nAutomático: " + (automatico ? "Sim": "Não")
                + "\nAr-condicionado: " + (temArCondicionado ? "Sim" : "Não");
    }

}