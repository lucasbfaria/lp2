package fixacao.atv2;

public class MatriculaException extends Exception{
    public MatriculaException(int matricula){
        super("Ja tem um aluno com a matricula " + matricula);
    }
}
