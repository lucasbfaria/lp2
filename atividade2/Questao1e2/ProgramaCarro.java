public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1, "Peugeot", "Prata", "208", 2023, 4, "Gasolina", 10, 80000, true);
        carro1.listar();

        Carro carro2 = new Carro(2, "Ferrari", "Vermelha", "458 Spider", 2022, 2, "Gasolina", 12, 500000, true);
        carro2.listar();

        // Alterar características do carro
        carro1 = new Carro(1, "Peugeot", "Preto", "208", 2023, 4, "Gasolina", 10, 80000, true);
        carro1.listar();
    }
}