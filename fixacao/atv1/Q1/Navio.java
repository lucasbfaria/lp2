package fixacao.atv1.Q1;

public class Navio extends Brinquedo{
    public Navio(double velocidade, double aceleracao){
        super(velocidade,aceleracao);
    }
    public void mover(){
        System.out.println("Velocidade do Navio: " + velocidade);
    }
}
