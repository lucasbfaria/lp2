import java.util.Scanner;

public class Questao8{
    public static void main(String[] args){
        int raio;
        double area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o raio do circunferência?");
        raio = teclado.nextInt();

        area = 3.14 * (raio * raio);
        System.out.println("A área da circunferência é: " + area);

        teclado.close();
    }
}