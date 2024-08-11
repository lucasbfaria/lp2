package fixacao.atv1.Q1;

public class Helicoptero extends Brinquedo{
    public Helicoptero(double velocidade, double aceleracao){
        super(velocidade,aceleracao);
    }
    public void mover(){
        System.out.println("Velocidade do Helicoptero: " + velocidade);
    }
}
