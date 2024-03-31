import java.util.Scanner;

public class Questao1{
    public static void main(String[] args){
        int horas, salario;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas horas voce trabalha por mês?");
        horas = teclado.nextInt();

        salario = horas * 20;

        System.out.println("Seu salário mensal é R$" + salario + ",00");

        teclado.close();
    }
}