public class Funcionario {
    public String nome;
    public String data;
    public String rg;
    public String cpf;
    public String endereco;
    public String naturalidade;
    public double salario;
    public String profissao;
    public String grau;
    public int matricula;

    public Funcionario(String nome, String data, String rg, String cpf, String endereco, String naturalidade, 
    double salario, String profissao, String grau, int matricula) {
        cadastrarAlterar(nome, data, rg, cpf, endereco, naturalidade, salario, profissao, grau, matricula);
    }

    public void cadastrarAlterar(String nome, String data, String rg, String cpf, String endereco,String naturalidade, 
    double salario, String profissao, String grau,int matricula) {
        this.nome = nome;
        this.data = data;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grau = grau;
        this.matricula = matricula;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.data);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Salário: " + this.salario);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Grau de Instrução: " + this.grau);
        System.out.println("Matrícula: " + this.matricula);
    }
}
