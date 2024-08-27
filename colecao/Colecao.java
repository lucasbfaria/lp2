package colecao;
import java.util.ArrayList;
import java.util.List;

public class Colecao{
    private List<Livro> colecao;
    
    public Colecao() {
        colecao = new ArrayList<Livro>();
    }
    public void adicionarLivro(Livro livro) {
        colecao.add(livro);
    }
    public void removerLivro(Livro livro) {
        colecao.remove(livro);
    }
    public void imprimirColecao(){
        for (Livro livro : colecao){
            System.out.println(livro);
        }
    }
    public boolean verificarColecao(Livro livro){
        return colecao.contains(livro);
    }
    public Livro obterLivro(Livro livro){
        if (colecao.contains(livro)){
            return livro;
        } else {
            return null;
        }
    }
    public boolean listaVazia() {
        return colecao.isEmpty();
    }
}