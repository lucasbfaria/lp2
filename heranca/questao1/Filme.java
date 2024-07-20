
public class Filme extends Publicacao{
    public String diretor;
    public String ator;
    public String sinopse;
    public int duracao;

    public Filme(String titulo, String autor, int ano, String genero, String editora, 
    int quantidade, String diretor, String ator, String sinopse, int duracao){
        super(titulo, autor, ano, genero, editora, quantidade);
        this.diretor = diretor;
        this.ator = ator;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Diretor: " + diretor + "\n Ator: " + ator + "\n Sinopse: " + sinopse
        + "\n Duração: " + duracao);
    }
}