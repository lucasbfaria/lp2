import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        int idade;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        idade = teclado.nextInt();

        if (idade >= 18){
            System.out.println("Você está apto a tirar a carteira de motorista");
        }else{
            System.out.println("Você não está apto a tirar a carteira de motorista");
        }

        teclado.close();
    }
}
