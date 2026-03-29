import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int opcao = 0;

        while (opcao !=3){
            System.out.println("------------------------------");
            System.out.println("|  CADASTRO DE VEICULOS      |");
            System.out.println("|  1 Cadastrar carro         |");
            System.out.println("|  2 Cadastrar moto          |");
            System.out.println("|  3 Sair                    |");            
            System.out.println("------------------------------\n");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao ==1){
                System.out.println("Cadastro de carro");
                System.out.print("Marca: ");
                String marca = sc.nextLine();
                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Cor: ");
                String cor = sc.nextLine();
                System.out.print("Ano de fabricação: ");
                int ano = sc.nextInt();
                System.out.print("Quantas portas?: ");
                int portas = sc.nextInt();
                System.out.print("É automático? (S/N): ");
                char autoChar = sc.next().toUpperCase().charAt(0);
                boolean isAutomatico = (autoChar == 'S');
                sc.nextLine();

                Carro c1 = new Carro(marca, modelo, cor, ano, portas, isAutomatico);

                System.out.print("\nDados do Cadastro");
                System.out.print(c1.toString());
                
                System.out.println();
                System.out.println("\nTestando Funçoes do Carro");
                c1.motor();
                c1.buzinar();
                c1.abrirPorta();
                c1.fecharPorta();
                c1.ligarArCondicionado();

            }
            else if (opcao == 2){
                System.out.println("Cadastro de moto");
                System.out.println("esperando conteudo do Samuel para classe moto");
            }
            else if (opcao == 3){
                System.out.println("Saindo do programa. Volte sempre!");
            }
            else{
                System.out.println("Opção Inválida. Tente 1, 2 ou 3.");
            }

        }
        


        sc.close();

    }
}