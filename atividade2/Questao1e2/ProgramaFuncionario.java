public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Lucas", "27/04/2005", "12345678", "40028922", "Rua das Flores, 123", 
        "Divinópolis", 3000.00,"Analista de Sistemas", "Superior Incompleto", 1);
        funcionario1.imprimirDados();

        Funcionario funcionario2 = new Funcionario("Pedro", "15/05/1992", "87654321", "22892004", "Av. Fraga Maia, 456", 
        "Feira de Santana", 3500.00, "Gerente de Vendas", "Superior Completo", 2);
        funcionario2.imprimirDados();

        funcionario1.cadastrarAlterar("Lucas", "27/04/2005", "12345678", "40028922", "Rua das Flores, 123", 
        "Divinópolis", 3000.00, "Desenvolvedor de software", "Superior Incompleto", 1);
        funcionario1.imprimirDados();
    }
}