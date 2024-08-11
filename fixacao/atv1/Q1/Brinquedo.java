package fixacao.atv1.Q1;

public abstract class Brinquedo {
    protected double velocidade;
    protected double aceleracao;
    
    public Brinquedo(double velocidade, double aceleracao){
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }
    public abstract void mover();
    public void velocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public void velocidade(double velocidade){
        this.velocidade = velocidade;
    }
    public void velocidade(double velocidade, double aceleracao){
        this.velocidade = velocidade;
    }
}

