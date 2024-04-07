public class Animal {
    public String especie;
    public String nascimento;
    public String nome;
    public int registro;
    public String local;

    public Animal(String especie, String nascimento, String nome, int registro, String local) {
        cadastrarAlterar(especie, nascimento, nome, registro, local);
    }

    public void cadastrarAlterar(String especie, String nascimento, String nome, int registro, String local) {
        this.especie = especie;
        this.nascimento = nascimento;
        this.nome = nome;
        this.registro = registro;
        this.local = local;
    }

    public void imprimir() {
        System.out.println("Espécie: " + this.especie);
        System.out.println("Data de Nascimento: " + this.nascimento);
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de Registro: " + this.registro);
        System.out.println("Local de Nascimento: " + this.local);
    }
}