import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locadora locadora = new Locadora();

        Carro c1 = new Carro("Toyota", "Corolla", 2020, "ABC1234", 100, 4);
        Carro c2 = new Carro("Honda", "Civic", 2019, "DEF5678", 120, 4);
        Moto m1 = new Moto("Honda", "CG 160", 2022, "XYZ9876", 80);

        locadora.adicionarVeiculo(c1);
        locadora.adicionarVeiculo(c2);
        locadora.adicionarVeiculo(m1);

        locadora.listarVeiculos();

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEscolha o veículo (número): ");
        int indice = sc.nextInt() - 1;

        if (indice < locadora.qtdVeiculos()) {
            System.out.print("Quantidade de dias: ");
            int dias = sc.nextInt();

            locadora.aluguelVeiculo(dias, indice);
        } else {
            System.out.println("Veículo não existe.");
        }

        sc.close();
    }
}