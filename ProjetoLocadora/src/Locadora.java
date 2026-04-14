import java.util.ArrayList;

class Locadora {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    // cadastrar veículo
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado com sucesso!");
    }

    // listar veículos
    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        for (Veiculo v : veiculos) {
            System.out.println(v.exibirDados());
            System.out.println("Diária: " + v.calcularDiaria());
            System.out.println("----------------------");
        }
    }
}