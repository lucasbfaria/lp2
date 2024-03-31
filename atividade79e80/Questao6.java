import java.util.Scanner;

public class Questao6{
    public static void main(String[] args){
        double nota1, nota2, nota3, media;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual foi a nota da primeira prova?");
        nota1 = teclado.nextDouble();
        System.out.println("Qual foi a nota da segunda prova?");
        nota2 = teclado.nextDouble();
        System.out.println("Qual foi a nota do trabalho?");
        nota3 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if (media >= 7){
            System.out.println("Aprovado! Media: " + media);
        }else{
            System.out.println("Reprovado! Media: " + media);
        }

        teclado.close();
    }
}