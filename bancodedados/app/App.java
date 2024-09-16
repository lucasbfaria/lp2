package bancodedados.app;

public class App{
    public static void main(String[] args) {
		LivroDAO livroDAO = new LivroDAO();
		
		Livro livro = new Livro();
		
		livro.setNome("O passado perfeito");
        livro.setAutor("Julio César");
		
		livroDAO.incluir(livro);
		livro.setId(1);
		
		livroDAO.excluir(livro);
	}
}
