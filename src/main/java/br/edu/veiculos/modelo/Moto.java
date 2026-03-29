public class Moto extends Veiculo {
    private int numeroDeCilindros;
    private boolean temBau;
    private boolean eletrica;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, String cor, int anoDeFabricacao, int numeroDeCilindros, boolean temBau, boolean eletrica) {
        super(marca, modelo, cor, anoDeFabricacao);
        this.numeroDeCilindros = numeroDeCilindros;
        this.temBau = temBau;
        this.eletrica = eletrica;
    }

    public int getNumeroDeCilindros() {
        return numeroDeCilindros;
    }

    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }

    public void acelerar() {
    System.out.println("Acelerando...");
}

    public void reduziraceleracao() {
    System.out.println("Reduzindo aceleração...");
}

    public boolean isTemBau(){
        return temBau;

    }

    public boolean isEletrica(){
        return eletrica;
    }

    public void abirBau() {
    System.out.println("Abrindo o Baú");
}

    public void fecharBau() {
    System.out.println("Fechando Baú");
}
    public void contarCilindros(int cilindro) {
    System.out.println("Tem " + cilindro + "disponíveis");
}

    @Override
    public void motor() {
    super.motor();
    System.out.println("Motor da moto ligado suavemente...");
}

    @Override
    public void buzinar() {
        System.out.println("Beeep Beeep!");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCilindros: " + numeroDeCilindros
                + "\nPossui Bau: " + (temBau ? "Sim" : "Não")
                + "\nÉ elétrica: " + (eletrica ? "Sim" : "Não");
    }

}