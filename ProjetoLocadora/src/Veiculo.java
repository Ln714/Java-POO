//Sistema de veiculos alugados
//Uma locadora de veiculos precisa calcular o valor da diaria
//De diferente tipos de veiculos carro e moto
//Cada tipo tem seu priorio calculo.


//Abstraçao 1
//Modelar apenas o que importa: marca, modelo ano placa preco bae
// metodo calcularDiaria()
//Abstrato pois cada veiculo tera sua prioria diaria (calculo)

abstract class Veiculo {

    //Atributos -> seguros
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;

    //Construtor da classe
    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;
    }

    public abstract double caluclarDIaria();

    //Encapsulamento

    //Modificadore via get e set
    //O set de precobase tem validaçao nao aceita valores negativos

    public String getMarca() {
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getPlaca () {
        return placa;
    }
    public int ano(){
        return ano;
    }
    public double getPrecoBase(){
        return precoBase;
    }
    public void setPrecoBase (double precoBase){
        if (precoBase < 0){
            System.out.println("Erro: Preço nao pode ser negativo");
            return;
        }
        this.precoBase = precoBase;
    }
    public String toString(){
        return marca + " " + modelo + " (" + ano + ")";
    }
// PILAR 3 - HERANÇA
// Carro e Moto herdam tudo de Veiculo, mas cada um adiciona
// seus próprios atributos e implementa calcularDiaria() do seu jeito.

//CARRO -> qtdPortas (atributo)
// método calcularDiaria -> se qtdPortas >= 4 então acréscimo de 20%


    abstract class Carro extends Veiculo {
        private int quantidadePortas;

        public Carro(String marca, String modelo, int ano, String placa, double precoBase, int quantidadePortas) {
            super(marca, modelo, ano, placa, precoBase);
            this.quantidadePortas = quantidadePortas;
        }
    }

}
