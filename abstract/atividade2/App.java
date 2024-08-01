public class App {
    public static void main(String[] args){
        Banco banco1 = new Banco ("Lucas", new ContaCorrente(), "Gabriel", new ContaCorrente(), "Jessica", new ContaCorrente());

        banco1.creditar("Lucas", 100);
        banco1.debitar("Gabriel", 10);
        banco1.transferir("Lucas", "Jessica", 50);

        System.out.println("Saldo de Lucas: " + banco1.getSaldo("Lucas") + "\nSaldo de Gabriel: " + banco1.getSaldo("Gabriel") +
         "\nSaldo de Jessica: " + banco1.getSaldo("Jessica"));
    }
}
