public class ContaPoupanca {
    public String nome;
    public String rg;
    public String cpf;
    public double saldo;
    public int numero;
    public String agencia;

    public ContaPoupanca(String nome, String rg, String cpf, double saldo, int numero, String agencia) {
        cadastrarAlterar(nome, rg, cpf, saldo, numero, agencia);
    }

    public void cadastrarAlterar(String nome, String rg, String cpf, double saldo, int numero, String agencia) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo do correntista " + nome + ": R$ " + saldo);
    }
}