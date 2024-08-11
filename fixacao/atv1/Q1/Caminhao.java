package fixacao.atv1.Q1;

public class Caminhao extends Brinquedo{
    public Caminhao(double velocidade, double aceleracao){
        super(velocidade,aceleracao);
    }
    @Override
    public void mover(){
        System.out.println("Velocidade do Caminhão: " + velocidade);
    }
}
