public class Main {
    public static void main(String[] args) {

        Locadora locadora = new Locadora();

        Carro carro = new Carro("Toyota", "Corolla", 2020, "ABC1234", 100, 4);
        Moto moto = new Moto("Honda", "CG 160", 2022, "XYZ9876", 80);

        locadora.adicionarVeiculo(carro);
        locadora.adicionarVeiculo(moto);

        locadora.listarVeiculos();
    }
}