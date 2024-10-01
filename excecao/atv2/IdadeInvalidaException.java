package excecao.atv2;
public class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException(){
        super("A idade precisa estar entre 18 anos e 100 anos");
    }
}