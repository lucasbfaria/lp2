package excecao.atv1;
public class Interdisciplinar extends Avaliacao{
    public Interdisciplinar(double peso, double nota1, double nota2, double nota3, double nota4){
        super(peso, ((nota1 + nota2 + nota3 + nota4)/5));
    }
}
