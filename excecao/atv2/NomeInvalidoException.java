package excecao.atv2;
public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
        super("Nome inválido");
    }
}