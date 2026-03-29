public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int anoDeFabricacao;

    public Veiculo (){

    }

    public Veiculo (String marca, String modelo, String cor, int anoDeFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }


    public void buzinar(){
        System.out.println("Bi bi!");
    }

    public void motor(){
        System.out.println("Vruumm!");
    }

    public String toString(){
        return "\nMarca: " + marca
                +"\nModelo: " + modelo
                +"\nCor: " + cor
                +"\nAno de Fabricação: " + anoDeFabricacao;
    }
}