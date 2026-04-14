public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2020, "ABC1234", 100, 4);

        System.out.println(carro.exibirDados());
        System.out.println("Diária: " + carro.calcularDiaria());
    }
}