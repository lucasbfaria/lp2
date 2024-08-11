package fixacao.atv1.Q1;

public class App {
    public static void main(String [] args){
        Caminhao brinquedo1 = new Caminhao(50,50);
        Helicoptero brinquedo2 = new Helicoptero(200,200);
        Navio brinquedo3 = new Navio(30,30);

        Controle controle1 = new Controle(brinquedo1);
        Controle controle2 = new Controle(brinquedo2);
        Controle controle3 = new Controle(brinquedo3);

        controle1.MoverBrinquedo();
        controle2.MoverBrinquedo();
        controle3.MoverBrinquedo();
    }
}
