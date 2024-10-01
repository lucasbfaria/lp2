package excecao.atv2;
public class Usuario {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome) throws NomeInvalidoException{
        if (nome == null || nome.isEmpty()){
            throw new NomeInvalidoException();
        }
        this.nome = nome;
    }
    public void setIdade(int idade) throws IdadeInvalidaException{
        if (idade < 18 || idade > 100){
            throw new IdadeInvalidaException();
        }
        this.idade = idade;
    }
}