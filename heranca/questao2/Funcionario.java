package heranca.questao2;
import java.time.LocalDate;

public class Funcionario{
    public String nome;
    public String cpf;
    public String rg;
    private int matricula;
    private double salario;
    public LocalDate data;
    private double salarioBase;
    private int horas;

    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, int horas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horas = horas;
        this.data = LocalDate.now();
        this.matricula = ++geraMatricula;
    }
    
    public void calculaSalario(){
        Calculo calculo = new Calculo();
        calculo.calculaSalario(this.salarioBase, this.horas);
        this.salario = calculo.getTotalSalario();
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getRg(){
        return this.rg;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public double getSalario(){
        return this.salario;
    }

    public LocalDate getData(){
        return this.data;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getHoras(){
        return this.horas;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome + "\n CPF: " + this.cpf + "\n RG: " + this.rg + "\n Matrícula: " + this.matricula + "\n Salario: " + 
        this.salario + "\n Data de Contratação: " + data + "\n Salário Base: " + salarioBase + "\n Horas Trabalhadas: " + horas);
    }

    // a) Na linha 5, um novo objeto Funcionaria com os parametros ("Zé",25,44), para nome, salarioBase, horasTrabalhadas
    // b) Isso é permitido porque os atributos rg e cpf estão publicos, portanto podem ser acessados em outra classe
    // c) Isso não é permitido, porque os atributos salario e matricula são 'private', portanto não podem ser acessados por outra classe
}
