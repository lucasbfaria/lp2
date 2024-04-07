public class Televisao{
    public int tela;
    public int volume;
    public String marca;
    public int voltagem;
    public int canal;
    public boolean ligada;

    public Televisao(int tela, String marca, int voltagem){
        this.tela = tela;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = 1;
        this.ligada = false;
    }

    public void ligar(){
        if (this.ligada){
            System.out.println("A televisão já se encontra ligada");
        }else{
            this.ligada = true;
            int consumo = this.voltagem * this.tela;
            System.out.println("A televisão foi ligada, o consumo atual é: " + consumo);
        }
    }

    public void desligar(){
        if (this.ligada){
            this.ligada = false;
            System.out.println("A televisão foi desligada");
        }else{
            System.out.println("A televisão já se encontra desligada");
        }
    }

    public void aumentar(){
        if (this.ligada){
            if(this.volume < 10){
                this.volume++;
                System.out.println("Volume: " + this.volume);
            } else {
                System.out.println("Volume: " + this.volume);
            }
        }else{
            System.out.println("A televisão se encontra desligada");
        }
    }

    public void diminuir(){
        if (this.ligada){
            if(this.volume > 1){
                this.volume--;
            }
            System.out.println("Volume: " + this.volume);
        }else{
            System.out.println("A televisão se encontra desligada");
        }
    }

    public void subirCanal(){
        if (this.ligada){
            this.canal++;
            System.out.println("Canal: " + this.canal);
        }else{
            System.out.println("A televisão se encontra desligada");
        }
    }

        public void descerCanal(){
        if (this.ligada){
            this.canal--;
            System.out.println("Canal: " + this.canal);
        }else{
            System.out.println("A televisão se encontra desligada");
        }
    }
}