// SISTEMA DE VEICULOS - 4 pilares da POO em Java
// Uma locadora de veiculos precisa calcular o valor da diaria
// de diferentes tipos de veiculos (Carro e Moto).
// Cada tipo tem seu proprio calculo.
//
// PILAR 1 - ABSTRACAO
// Modelar apenas o que importa: marca, modelo, ano, placa, preco base.
// Metodo calcularDiaria()
// Abstrato pois cada veiculo tera sua propria diaria (calculo)
abstract class Veiculo {

    // PILAR 2 - ENCAPSULAMENTO: atributos privados com getters/setters
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

    // Metodo abstrato - cada subtipo define o calculo
    public abstract double calcularDiaria();

//modificadoção de GET e SET, (SET nao permite valores negativos)
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

// herança
// Carro e Moto herdam tudo de Veiculo, mas cada um adiciona
// seus próprios atributos e implementa calcularDiaria() do seu jeito.

//CARRO -> qtdPortas (atributo)
// método calcularDiaria -> se qtdPortas >= 4 então acréscimo de 20%
