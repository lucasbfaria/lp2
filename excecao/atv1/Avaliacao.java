package excecao.atv1;
public abstract class Avaliacao {
    private double peso;
    private double nota;
    private double pontos;

    public Avaliacao(double peso, double nota){
        this.peso = peso;
        this.nota = nota;
        pontos = peso * nota;
    }
    public double getPeso(){
        return peso;
    }
    public double getNota(){
        return nota;
    }
    public double getPontos(){
        return pontos;
    }
}
