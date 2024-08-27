package colecao;
public class Livro{
    private int isbn;
    private String autor;
    private String editora;
    private String nome;
    
    public Livro(int isbn, String autor, String editora, String nome){
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.nome = nome;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getNome() {
        return nome;
    }

}