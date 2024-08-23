package excecao.atv1;

public class App {
    public static void main(String[] args) {
        Avaliacao prova1 = new Prova(2, 2);
        Avaliacao prova2 = new Prova(2, 2);
        Avaliacao trabalho = new Trabalho(1, 1, 1 ,1);
        Avaliacao interdisciplinar = new Interdisciplinar(2, 2, 2, 2, 4);

        Semestre semestre = new Semestre(prova1, prova2, interdisciplinar, trabalho);
        try {
            semestre.imprimirMedia();
        } catch (Excecao e) {
            System.out.println(e.getMessage());
        }
    }
}