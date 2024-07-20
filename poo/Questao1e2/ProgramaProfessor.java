public class ProgramaProfessor {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Chico", "Doutor", "Matematica", 40, 5000, "Matematica, Geometria");
        professor1.imprimirDados();

        Professor professor2 = new Professor("Gustavo", "Doutor", "Letras", 30, 4000, "Portugues");
        professor2.imprimirDados();

        professor1.cadastrarAlterar("Pedro", "Doutor", "Matematica", 40, 5000, "Matematica, Geometria");
        professor1.imprimirDados();
    }
}