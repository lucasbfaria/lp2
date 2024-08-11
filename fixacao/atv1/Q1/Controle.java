package fixacao.atv1.Q1;

public class Controle {
    Brinquedo brinquedo;

    public Controle(Brinquedo brinquedo){
        this.brinquedo = brinquedo;
    }
    public void MoverBrinquedo(){
        brinquedo.mover();
    }
}
