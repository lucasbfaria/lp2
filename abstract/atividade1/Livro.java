
public class Livro extends Publicacao{
    protected int edicao;
    protected String isbn;
    
    public Livro(String titulo, String autor, int ano, String genero, 
    String editora, int quantidade, int edicao, String isbn){
        super(titulo, autor, ano, genero, editora, quantidade);
        this.edicao = edicao;
        this.isbn = isbn;
    }
    @Override
    public void imprimirDados(){
        System.out.println("Título: " + titulo + "\n Autor: " + autor + "\n Ano: " + ano +
        "\n Gênero: " + genero + "\n Editora: " + editora + "\n Quantidade: " + quantidade +
         "\n Edição: " + edicao + "\n ISBN: " + isbn);
    }
}