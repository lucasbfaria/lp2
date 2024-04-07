public class ProgramaContaPoupanca {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("Lucas", "123456789", "40028922", 1000, 123, "Banco 1");
        conta1.imprimirSaldo();

        ContaPoupanca conta2 = new ContaPoupanca("Pedro", "987654321", "22892004", 2000, 456, "Banco 2");
        conta2.imprimirSaldo();

        conta1.cadastrarAlterar("Lucas", "123456789", "40028922", 100, 123, "Banco 1");
        conta1.imprimirSaldo();
    }
}