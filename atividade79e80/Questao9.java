import java.util.Scanner;

public class Questao9{
    public static void main(String[] args){
        double valor_hora, inss, bruto, liquido;
        int horas;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora?");
        valor_hora = teclado.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?");
        horas = teclado.nextInt();
        System.out.println("Quanto é descontado do INSS? (em %)");
        inss = teclado.nextDouble();

        bruto = valor_hora * horas;
        liquido = bruto * (1 - (inss/100));

        System.out.println("O seu salário bruto é: " + bruto);
        System.out.println("O seu salário líquido é: " + liquido);

        teclado.close();
    }
}