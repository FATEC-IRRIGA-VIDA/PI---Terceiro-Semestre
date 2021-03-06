package consultas_bd_arquivos_apoio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import consultas_bd_arquivos_apoio.BookDAO;
import metodos.AcessoBD;

public class BookDAO {

	private AcessoBD bd;
	private String men, sql;
	
	// Esatabelecendo o Construtor para a Classe BookDAO
	public BookDAO() {
		bd = new AcessoBD(); // instancia um objeto da Classe BD.
	}
	
	/**
	 * Armazena um livro no banco de dados
	 * Caso o livro exista, realiza uma inclus?o (insert)
	 * Caso o livro exista, realiza uma atualiza??o (update)
	 * @param livro - o livro a ser gravado
	 * @return - uma mensagem informando o resultado de uma opera??o
	 */
	public String gravar(Book livro) {
		
		sql = "insert into livros values (?,?,?)";
		//sql = "insert into livros (titulo,preco) values (?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, livro.getIsbn());
			bd.st.setString(2, livro.getTitulo());
			bd.st.setDouble(3, livro.getPreco());
			bd.st.executeUpdate();
			men = "Livro inserido com sucesso!";
			
		}
		catch(SQLException erro) {
			// iniciar a altera??o (O ISBN j? existe)
			sql = "update livros set titulo = ?, preco = ? where isbn = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, livro.getTitulo());
				bd.st.setDouble(2, livro.getPreco());
				bd.st.setString(3, livro.getIsbn());
				bd.st.executeUpdate();
				men = "Altera??o realizada com sucesso!";
				
			}
			catch(SQLException e) {
				men = "Falha: " + e;
			}
		}
		finally {
			bd.close();
		}
		
		return men;
	}
	
	/**
	 * Armazena um livro no banco de dados
	 * @param livro - o livro a ser gravado
	 * @return - uma mensagem informando o resultado de uma opera??o
	 */
	public String incluir(Book livro) {
		
		sql = "insert into livros values (?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, livro.getIsbn());
			bd.st.setString(2, livro.getTitulo());
			bd.st.setDouble(3, livro.getPreco());
			bd.st.executeUpdate();
			men = "Livro inserido com sucesso!";
		}
		
		catch(SQLException erro) {
			
			if(erro.toString().indexOf("KEY")>=0) {
				men = "Erro de chave prim?ria";
			}
			else {
				men = "Erro de nulo";
			}
			
		}
		finally {
			bd.close();
		}
		
		return men;
	}
	
	
	/**
	 * Exclui um livro a partir de seu ISBN
	 * @param isbn - o ISBN do livro
	 * @return - uma mensagem informando o resultado da opera??o
	 */
	public String excluir(String isbn) {
		
		sql = "delete from livros where isbn = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, isbn);
			int n = bd.st.executeUpdate();
			
			if (n==1) {
				men = "Livro excluido com sucesso!";
			}
			else {
				men = "Livro n?o encontrado";
			}
			
			men = "Livro excluido com sucesso!";
		}
		catch(SQLException erro) {
			men = "Erro: " + erro;
			}
		finally {
			bd.close();
		}
		return men;
	}
	
	/**
	 * Retorna uma lista contendo os livros
	 * @param sql - a instru??o em SQL para selecionar os livros
	 * @return - retorna a lista com os valores armazenados nela
	 */
	public List<Book> get(String sql){
		List<Book> lista = new ArrayList<Book>();
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) { // enquanto existir a pr?xima linha
				Book b = new Book(); // instancio o livro
				b.setIsbn(bd.rs.getString("isbn"));
				b.setTitulo(bd.rs.getString("titulo"));
				b.setPreco(bd.rs.getDouble("preco"));
				lista.add(b);
			}
		}
		catch(SQLException erro) {
			lista = null;
			}
		finally {
			bd.close();
		}
		
		return lista;
		
	}
	
	/***
	 * M?todo que insere valores no banco de dados de 1 a 1000 linhas
	 */
	public void preencherDados() {
		
		sql = "insert into livros values (?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			
			for(int i=1; i<=1000; i++) {
			bd.st.setString(1, ""+i);
			bd.st.setString(2, "Titulo " + i);
			bd.st.setDouble(3, Math.random()*100);
			bd.st.executeUpdate();
			}
		}
		catch(SQLException erro) {
		}
		finally {
			bd.close();
		}
		System.out.println("Linhas inseridas no banco de dados");
	}
}
