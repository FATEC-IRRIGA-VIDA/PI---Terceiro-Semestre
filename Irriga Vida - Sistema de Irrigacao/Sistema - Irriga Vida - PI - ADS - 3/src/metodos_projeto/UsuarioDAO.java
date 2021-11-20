package metodos_projeto;

import java.sql.SQLException;

import metodos.AcessoBD;

public class UsuarioDAO {

	private AcessoBD bd;
	private String men, sql;
	
	// Esatabelecendo o Construtor para a Classe BookDAO
	public UsuarioDAO() {
		bd = new AcessoBD(); // instancia um objeto da Classe BD.
	}
	
	/**
	 * Armazena um livro no banco de dados
	 * @param livro - o livro a ser gravado
	 * @return - uma mensagem informando o resultado de uma opera��o
	 */
	public String incluir(Usuario usuario) {
		
		System.out.println(usuario.getId() + usuario.getNome() + usuario.getSenha() + usuario.getEmail() + usuario.getStatus() +
				usuario.getPerfil());
		
		sql = "insert into TB_USUARIO values (?,?,?,?,?,?)";
		//sql = "insert into TB_USUARIO values (?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, usuario.getId());
			bd.st.setString(2, usuario.getNome());
			bd.st.setString(3, usuario.getSenha());
			bd.st.setString(4, usuario.getEmail());
			bd.st.setString(5, usuario.getStatus());
			bd.st.setString(6, usuario.getPerfil());
			bd.st.executeUpdate();
			men = "Livro inserido com sucesso!";
		}
		
		catch(SQLException erro) {

				men = "Falha: " + erro;
			}
			
		finally {
			bd.close();
		}
		
		return men;
	}
}