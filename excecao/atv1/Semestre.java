package excecao.atv1;

public class Semestre{
    private Avaliacao avaliacao1;
    private Avaliacao avaliacao2;
    private Avaliacao avaliacao3;
    private Avaliacao avaliacao4;
    
    public Semestre(Avaliacao avaliacao1, Avaliacao avaliacao2, Avaliacao avaliacao3, Avaliacao avaliacao4){
        this.avaliacao1 = avaliacao1;
        this.avaliacao1 = avaliacao2;
        this.avaliacao1 = avaliacao3;
        this.avaliacao1 = avaliacao4;
    }

    public void imprimirMedia() throws Excecao{
        double pesoTotal = avaliacao1.getPeso() + avaliacao2.getPeso() + avaliacao3.getPeso() + avaliacao4.getPeso();
        if (pesoTotal != 7) {
            Excecao e = new Excecao("A soma dos pesos das avaliações precisa ser 7.");
            throw e;
        }
        double notaFinal = avaliacao1.getNota() + avaliacao2.getNota() + avaliacao3.getNota() + avaliacao4.getNota();
        if (notaFinal >= 5){
            System.out.println("Você foi aprovado! Média: " + notaFinal);
        } else {
            System.out.println("Você foi reprovado! Média: " + notaFinal);
        }
    }
}