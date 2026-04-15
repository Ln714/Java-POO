abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;

    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;
    }

    public abstract double calcularDiaria();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 0) {
            System.out.println("Erro: preco nao pode ser negativo");
            return;
        }
        this.precoBase = precoBase;
    }

    public String exibirDados() {
        return getMarca() + " " + getModelo() + " (" + getAno() + ")";
    }
}