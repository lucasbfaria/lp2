public class Carro{
    public String modelo;
    public double velocidade;
    public double aceleracao;
    public int marcha;
    public boolean ligado;

    public Carro(String modelo){
        this.modelo = modelo;
        this.velocidade = 0;
        this.aceleracao = 0;
        this.marcha = 0;
        this.ligado = false;
    }

    public void ligar(boolean ligado){
        // Ligar = true
        // Desligar = false
        this.ligado = ligado;
        if (ligado){
            System.out.println("O carro foi ligado");
        }else{
            System.out.println("O carro foi desligado");
        }
        
       
    }

    public void acelerar(double aceleracao){
        if (this.ligado){
            this.aceleracao += aceleracao;
            this.velocidade += aceleracao;
            System.out.println("O carro acelerou em " + aceleracao + "km/h");
        }else{
            System.out.println("O carro está desligado");
        }
    }

    public void desacelerar(double desaceleracao){
        if (this.ligado){
            this.aceleracao -= desaceleracao;
            this.velocidade -= desaceleracao;
            if (this.velocidade <= 0){
                this.velocidade = 0;
                this.aceleracao = 0;
                this.ligado = false;
            }
            System.out.println("O carro deslacelerou em " + desaceleracao + "km/h");
        }else{
            System.out.println("O carro está desligado");
        }
    }

    public void virar(int lado){
        // Direita = 0
        // Esquerda = 1
        if (lado == 0){
            System.out.println("O carro virou para direita");
        }else{
            System.out.println("O carro virou para esquerda");
        }
    }

    public void mudarMarcha(int direcao){
        // Cima = 0
        // Baixo = 1
        if (direcao == 0){
            this.marcha++;
            System.out.println("O carro subiu uma marcha")
        } else if(direcao == 1){
            this.marcha--;
            System.out.println("O carro desceu uma marcha")
        }
        System.out.println("Marcha atual: " + this.marcha);
    }
}