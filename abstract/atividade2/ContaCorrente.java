public class ContaCorrente{
    public double valor;

    public ContaCorrente(){
        valor = 0;
    }
    public void executarOperacao(Operacao opr){
        valor += opr.operar();
    }
    public double getSaldo(){
        return valor;
    }
}