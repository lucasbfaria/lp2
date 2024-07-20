import java.util.Scanner;

public class Questao10{
    public static void main(String[] args){
        int numero1, numero2, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o primeiro número");
        numero1 = teclado.nextInt();
        System.out.println("Qual o segundo número?");
        numero2 = teclado.nextInt();

        soma = numero1 + numero2;

        if (soma > 10){
            System.out.println("A soma é " + soma);
        }
        

        teclado.close();
    }
}