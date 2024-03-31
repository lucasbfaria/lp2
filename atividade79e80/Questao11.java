import java.util.Scanner;

public class Questao11{
    public static void main(String[] args){
        int numero1, numero2, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o primeiro número?");
        numero1 = teclado.nextInt();
        System.out.println("Qual o segundo número?");
        numero2 = teclado.nextInt();

        soma = numero1 + numero2;

        if (soma >= 10){
            soma = soma + 5;
            System.out.println("O resultado é " + soma);
        }else{
            soma = 7 - soma;
            System.out.println("O resultado é " + soma);
        }
        

        teclado.close();
    }
}