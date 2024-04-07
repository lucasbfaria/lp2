public class Professor {
    public String nome;
    public String titulacao;
    public String formacao;
    public int carga;
    public double salario;
    public String disciplinas;

    public Professor(String nome, String titulacao, String formacao, int carga, double salario, String disciplinas) {
        cadastrarAlterar(nome, titulacao, formacao, carga, salario, disciplinas);
    }

    public void cadastrarAlterar(String nome, String titulacao, String formacao, int carga, double salario, String disciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.carga = carga;
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public void alterarDescricaoDisciplina(String descricao) {
        this.disciplinas = descricao;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Formação: " + this.formacao);
        System.out.println("Carga Horária: " + this.carga);
        System.out.println("Salário: " + this.salario);
        System.out.println("Disciplinas: " + this.disciplinas);
    }
}
