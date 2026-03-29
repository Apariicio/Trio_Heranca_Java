public class Moto extends Veiculo {
    private int numeroDeCilindros;
    private boolean temBau;
    private boolean eletrica;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, String cor, int anoDeFabricacao) {
        super(marca, modelo, cor, anoDeFabricacao);
    }

    public void acelerar() {
    System.out.println("Acelerando...");
}

    public void reduziraceleracao() {
    System.out.println("Reduzindo aceleração...");
}

    public void abirBau() {
    System.out.println("Abrindo o Baú");
}

    public void fecharBau() {
    System.out.println("Fechando Baú");
}
    public void contarCilindros(int cilindro) {
    System.out.println("Tem " + cilindro "disponíveis");
}

    @Override
    public void motor() {
    super.motor();
    System.out.println("Motor da moto ligado suavemente...");
}

    @Override
    public void buzinar() {
        System.out.println("Biiiii!");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCilindros: " + numeroDeCilindros;
                + "\nBau: " + (temBau ? "Sim" : "Não");
    }

}