import java.util.Scanner;

public class Questao2{
    public static void main(String[] args){
        double preco, gasolina, total, distancia;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a distancia percorrida?");
        distancia = teclado.nextInt();

        System.out.println("Quanto está o preço da gasolina?");
        preco = teclado.nextDouble();

        gasolina = distancia/12;
        total = gasolina * preco;

        System.out.println("A gasolina gasta será " + gasolina + " litros e o valor gasto será " + total);

        teclado.close();
    }
}