import java.util.Scanner;

public class Questao5{
    public static void main(String[] args){
        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        numero1 = teclado.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = teclado.nextInt();

        if (numero1 > numero2){
            System.out.println("O primeiro número é maior");
        } else if (numero2 > numero1){
            System.out.println("O segundo número é maior");
        }else{
            System.out.println("Os dois números são iguais");
        }

        teclado.close();

    }
}