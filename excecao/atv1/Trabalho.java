package excecao.atv1;
public class Trabalho extends Avaliacao{
    public Trabalho(double peso, double nota1, double nota2, double nota3){
        super(peso, ((nota1 + nota2 + nota3)/3));
    }
}
