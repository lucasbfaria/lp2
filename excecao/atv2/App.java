package excecao.atv2;

public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        try{
            usuario.setNome("");
            usuario.setIdade(17);
        }catch(NomeInvalidoException e){
            System.out.println(e.getMessage());
        }catch(IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}