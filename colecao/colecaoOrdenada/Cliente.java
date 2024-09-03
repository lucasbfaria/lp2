package colecao.colecaoOrdenada;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Cliente {
    public static void main(String [] args){
        List<Conta> contas = new ArrayList<Conta>();
        Conta conta1 = new Conta(1, "Lucas", 1000, 1000);
        Conta conta2 = new Conta(2, "Gabriel", 1000, 500);
        Conta conta3 = new Conta(3, "Jessica", 2000, 100);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        Collections.sort(contas);
        System.out.println("Ordenado por número:");
        for (Conta value : contas) {
            System.out.println("Número: " + value.getNumero() + ", Titular: " + value.getTitular());
        }
        
        Collections.sort(contas, new ContaComparator());
        System.out.println("Ordenado por titular:");
        for (Conta value : contas) {
            System.out.println("Número: " + value.getNumero() + ", Titular: " + value.getTitular());
        }
    }
}
