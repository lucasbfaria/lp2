package fixacao.atv1.Q3;

public class Loja {
    private String nome;
    private String ramo;
    private int ano;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, int ano, Vendedor vendedor){
        this.nome = nome;
        this.ramo = ramo;
        this.ano = ano;
        this.vendedor = vendedor;
    }
    public void admitirVendedor(Vendedor vendedor){
        if (this.vendedor != null){
            System.out.println("Essa loja já possui um vendedor");
        } else {
            this.vendedor = vendedor;
        }
    }
    public void demitirVendedor(){
      vendedor = null;  
    }
    public String getNome(){
        return nome;
    }
    public String getRamo(){
        return ramo;
    }
    public int getAno(){
        return ano;
    }
    public Vendedor getVendedor(){
        return vendedor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
