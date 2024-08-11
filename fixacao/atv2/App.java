package fixacao.atv2;

public class App {
    public static void main(String [] args){
        Turma turma1 = new Turma();

        try{
            Aluno aluno1 = new Aluno("Lucas", "casa1", 1);
            Aluno aluno2 = new Aluno("Gabriel", "casa2", 2);

            turma1.novoAluno(aluno1);
            turma1.novoAluno(aluno2);
        } catch (MatriculaException e){
            System.out.println(e.getMessage());
        }
    }
}
