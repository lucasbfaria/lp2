import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar os números
        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();

        // Solicitar a operação
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = teclado.nextInt();

        double resultado = 0;

        switch (opcao){
            case 1:
                resultado = Calculadora.somar(num1, num2);
                break;
            case 2:
                resultado = Calculadora.subtrair(num1, num2);
                break;
            case 3:
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case 4:
                resultado = Calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}