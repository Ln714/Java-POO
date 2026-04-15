class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano, String placa, double precoBase) {
        super(marca, modelo, ano, placa, precoBase);
    }

    @Override
    public double calcularDiaria() {
        return getPrecoBase() * 0.9;
    }
}