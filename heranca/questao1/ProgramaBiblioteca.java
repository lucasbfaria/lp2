public class ProgramaBiblioteca{
    public static void main(String [] args){
        Livro livro = new Livro("Surfando na internet", "Souza", 2022, "Ficção", "IFBA", 4202, 1, "253-452");
        Filme filme = new Filme("A Maior Guerra", "Jéssica", 2012, "História", "Panini", 498, "Pedro", "João", "Filme sobre a Segunda Guerra Mundial", 120);
        Publicacao[] publicacao = new Publicacao[2];
        publicacao[0] = livro;
        publicacao[1] = filme;

        for (Publicacao value : publicacao){
            value.imprimirDados();
        }
    }
} 

// V) Foi possível criar um array de publicacao com o livro e o filme porque os dois herdaram as caracteristicas de Publicacao
// VI) o foreach está acessando o imrpimir dados de classe livro, e da classe filme, essas funções imprimir dados estão acessando o imprimir dados da classe Publicacao