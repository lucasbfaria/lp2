public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leão", "01/01/2010", "Simba", 123, "Savana");
        animal1.imprimir();

        Animal animal2 = new Animal("Peixe", "02/02/2015", "Nemo", 456, "Atlântico");
        animal2.imprimir();

        animal2.cadastrarAlterar("Peixe", "02/02/2015", "Dory", 456, "Atlântico");
        animal2.imprimir();
    }
}