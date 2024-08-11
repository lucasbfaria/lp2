package fixacao.atv2;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;
    
    public Turma(){
        this.alunos = new ArrayList<>();
    }

    public void novoAluno(Aluno aluno) throws MatriculaException{
        for (Aluno value : alunos){
            if (value.matricula == aluno.matricula){
                MatriculaException e = new MatriculaException(aluno.matricula);
                throw e;
            }
        }
        alunos.add(aluno);
    }
}
