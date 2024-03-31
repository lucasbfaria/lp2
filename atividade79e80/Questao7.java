import java.util.Scanner;

public class Questao7{
    public static void main(String[] args){
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o seu peso?");
        peso = teclado.nextDouble();

        System.out.println("Qual sua altura?");
        altura = teclado.nextDouble();

        imc = peso/(altura * altura);

        if (imc > 30){
            System.out.println("Seu imc é " + imc + ", logo você está obeso");
        }else{
            System.out.println("Seu imc é " + imc + ", logo você não está obeso");
        }

        teclado.close();
    }
}