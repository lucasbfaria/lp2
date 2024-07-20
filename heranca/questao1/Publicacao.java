public class Publicacao{
    protected String titulo;
    protected String autor;
    protected int ano;
    protected String genero;
    protected String editora;
    protected int quantidade;

    public Publicacao(String titulo, String autor, int ano, String genero, 
    String editora, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.editora = editora;
        this.quantidade = quantidade;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAno(){
        return this.ano;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getEditora(){
        return this.editora;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void imprimirDados(){
        System.out.println("Título: " + titulo + "\n Autor: " + autor + "\n Ano: " + ano +
        "\n Gênero: " + genero + "\n Editora: " + editora + "\n Quantidade: " + quantidade);
    }
}