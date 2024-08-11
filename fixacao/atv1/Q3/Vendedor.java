package fixacao.atv1.Q3;

public class Vendedor {
    private int idade;
    private String nome;
    public Vendedor(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }
    public void vender(){
        System.out.println(nome + " vendeu um produto");
    }
    public int getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
