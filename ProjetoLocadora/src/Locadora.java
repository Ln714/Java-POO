import java.util.ArrayList;

class Locadora {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado com sucesso!");
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        System.out.println("\n===== VEÍCULOS DISPONÍVEIS =====");

        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo v = veiculos.get(i);
            System.out.println("[" + (i + 1) + "] " + v.exibirDados());
            System.out.println("Diária: R$ " + v.calcularDiaria());
            System.out.println("----------------------");
        }
    }

    public int qtdVeiculos() {
        return veiculos.size();
    }

    public void aluguelVeiculo(int dias, int indice) {

        if (indice < 0 || indice >= veiculos.size()) {
            System.out.println("Veículo inválido.");
            return;
        }

        Veiculo v = veiculos.get(indice);
        double total = v.calcularDiaria() * dias;

        System.out.println("\n===== RESUMO DO ALUGUEL =====");
        System.out.println("Veículo: " + v.exibirDados());
        System.out.println("Diária: R$ " + v.calcularDiaria());
        System.out.println("Dias: " + dias);
        System.out.println("Total: R$ " + total);
    }
}