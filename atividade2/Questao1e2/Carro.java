public class Carro{
    public int codigo;
    public String marca;
    public String cor;
    public String modelo;
    public int ano;
    public int portas;
    public String combustivel;
    public int quantidade;
    public double preco;
    public boolean completo;
    // 0 = completo
    // 1 = basico

    public Carro(int codigo, String marca, String cor, String modelo, int ano, int portas, 
    String combustivel, int quantidade, double preco, boolean completo){
        cadastrarEditar(codigo, marca, cor, modelo, ano, portas, combustivel, quantidade, preco, completo);
    }

    public void cadastrarEditar(int codigo, String marca, String cor, String modelo, int ano, int portas,
    String combustivel, int quantidade, double preco, boolean completo){
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.portas = portas;
        this.combustivel = combustivel;
        this.quantidade = quantidade;
        this.preco = preco;
        this.completo = completo;
    }

    public void listar(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.ano);
        System.out.println("Número de Portas: " + this.portas);
        System.out.println("Tipo de Combustível: " + this.combustivel);
        System.out.println("Quantidade Disponível: " + this.quantidade);
        System.out.println("Preço: " + this.preco);
        if (this.completo){
            System.out.println("Completo: sim");
        } else {
            System.out.println("Completo: não");
        }
    }
}