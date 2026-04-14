 class Carro extends Veiculo {

    private int qtdPortas;

    public Carro(String marca, String modelo, int ano, String placa, double precoBase, int qtdPortas) {
        super(marca, modelo, ano, placa, precoBase);
        this.qtdPortas = qtdPortas;
    }
    public int getQtdPortas(){
        return qtdPortas;
    }
     public void setQtdPortas (int quantidadePortas) {
        if (qtdPortas <= 0) {
            System.out.println("Erro: quantidade de portas inválida");
            return;
        }
        this.qtdPortas = qtdPortas;
    }

    @Override
    public double calcularDiaria() {
        if (qtdPortas >= 4) {
            return getPrecoBase() * 1.2; // acréscimo de 20%
        }
        return getPrecoBase();
    }
}


