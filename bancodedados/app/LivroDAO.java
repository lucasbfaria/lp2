package bancodedados.app;
import bancodedados.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
  
    public void incluir(Livro livro) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO LIVROS (nome,autor) VALUES (?,?)");
           
            stmt.setString(1, livro.getNome());

            stmt.executeUpdate();
            
            System.out.println("Livro " + livro.getNome() + " inserido com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();

              throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    public void alterar(Livro livro) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE LIVROS SET nome = ?, autor = ? where id = ? ");
           
            stmt.setString(1, livro.getNome());

            stmt.setInt(2, livro.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Curso " + livro.getNome() + " alterado com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
    
    public void excluir(Livro livro) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from LIVROS WHERE id = ?");
           
            stmt.setInt(1, livro.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Curso " + livro.getNome() + " excluído com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
    
   public List<Livro> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       
       List<Livro> livros = new ArrayList<Livro>();
       
       
       try{
           
           stmt = con.prepareStatement("select id, nome from LIVROS");
           rs = stmt.executeQuery();
           
           while (rs.next()){
               Livro livro =  new Livro();
              
               livro.setId(rs.getInt("id"));
               livro.setNome(rs.getString("nome"));
              
               
               livros.add(livro);
               
           }
           
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
       
        finally {
            Conexao.fecharConexao(con, stmt);

        }
       
      return livros;

       
   }
    
}
