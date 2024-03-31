import java.util.Scanner;

public class Questao4{
    public static void main(String[] args){
        double temperatura;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua temperatura em graus?");
        temperatura = teclado.nextDouble();

        if (temperatura > 37){
            System.out.println("Você está com febre, tome um remédio");
        }else{
            System.out.println("Você não está com febre");
        }

        teclado.close();
    }
}