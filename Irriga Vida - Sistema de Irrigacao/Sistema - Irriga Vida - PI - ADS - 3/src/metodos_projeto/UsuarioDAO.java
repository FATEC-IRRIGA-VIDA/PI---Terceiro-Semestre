package metodos_projeto;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import metodos.AcessoBD;

public class UsuarioDAO {

	private AcessoBD bd;
	private String men, sql;
	
	// Esatabelecendo o Construtor para a Classe UsuarioDAO
	public UsuarioDAO() {
		bd = new AcessoBD(); // instancia um objeto da Classe BD.
	}
	
	/**
	 * Armazena um Usuario no banco de dados.
	 * @param Usuario - o usuario a ser gravado.
	 * @return - uma mensagem informando o resultado de uma opera??o.
	 */
	public String incluir(Usuario usuario) {
		
		// Verifica??o em console do recebimento das informa??es.
		/*System.out.println(usuario.getId() + usuario.getNome() + usuario.getSenha() + usuario.getEmail() + usuario.getStatus() +
				usuario.getPerfil());*/
		System.out.println(usuario.getId() + usuario.getNome() + usuario.getSenha() + usuario.getDtCadastro() + usuario.getEmail() + 
				usuario.getDtAlteracao() + usuario.getStatus() + usuario.getPerfil());
		
		
		//Instru??o a ser executada no Banco de Dados.
		//sql = "insert into TB_USUARIO (NOME_USUARIO, SENHA_USU, EMAIL_USU, STATUS_USUARIO, PERFIL_USUARIO) values (?,?,?,?,?)";
		sql = "insert into TB_USUARIO (NOME_USUARIO, SENHA_USU, DT_CADASTRO_USU, EMAIL_USU, DT_ALTERACAO_USU, "
				+ "STATUS_USUARIO, PERFIL_USUARIO) values (?,?,?,?,?,?,?)";
		
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, usuario.getNome());
			bd.st.setString(2, usuario.getSenha());
			bd.st.setString(3, usuario.getDtCadastro());
			bd.st.setString(4, usuario.getEmail());
			bd.st.setString(5, usuario.getDtAlteracao());
			bd.st.setString(6, usuario.getStatus());
			bd.st.setString(7, usuario.getPerfil());
			bd.st.executeUpdate();
			men = "Usu?rio inserido com sucesso!"; // Armazena uma informa??o p?s execu??o.
		}
		
		catch(SQLException erro) {


			/*men = "Falha: " + erro;
			JOptionPane.showMessageDialog(null, men); // Imprimi o erro encontrado.*/

			if(erro.toString().indexOf("CHECK")>=0) {
				men = "Erro de cla?sula CHECK, Favor selecionar uma op??o no STATUS e/ou PERFIL";
			}

			else {
				men = "Falha: " + erro;
			}

		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op??o.
		return men;
	}
	
	/**
	 * Altera um Usuario no banco de dados.
	 * @param Usuario - o usuario a ser gravado.
	 * @return - uma mensagem informando o resultado de uma opera??o.
	 */
	public String alterar(Usuario usuario) {
		
		// Verifica??o em console do recebimento das informa??es.
		/*System.out.println(usuario.getId() + usuario.getNome() + usuario.getSenha() + usuario.getEmail() + usuario.getStatus() +
				usuario.getPerfil());*/
		/*System.out.println(usuario.getId() + usuario.getNome() + usuario.getSenha() + usuario.getDtCadastro() + usuario.getEmail() + 
				usuario.getDtAlteracao() + usuario.getStatus() + usuario.getPerfil());*/

		System.out.println(usuario.getDtCadastro());
		System.out.println(usuario.getDtAlteracao());
		
		//Instru??o a ser executada no Banco de Dados.
		/*sql = "update TB_USUARIO set NOME_USUARIO = ?, SENHA_USU = ?, EMAIL_USU = ?, STATUS_USUARIO = ?, "
				+ "PERFIL_USUARIO = ? where ID_USUARIO = ?";*/
		sql = "update TB_USUARIO set NOME_USUARIO = ?, SENHA_USU = ?, DT_CADASTRO_USU = ?, EMAIL_USU = ?, DT_ALTERACAO_USU = ?, "
				+ "STATUS_USUARIO = ?, PERFIL_USUARIO = ? where ID_USUARIO = ?";
				
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, usuario.getNome());
			bd.st.setString(2, usuario.getSenha());
			bd.st.setString(3, usuario.getDtCadastro());
			bd.st.setString(4, usuario.getEmail());
			bd.st.setString(5, usuario.getDtAlteracao());
			bd.st.setString(6, usuario.getStatus());
			bd.st.setString(7, usuario.getPerfil());
			bd.st.setString(8, usuario.getId());
			bd.st.executeUpdate();
			men = "Usu?rio alterado com sucesso!"; // Armazena uma informa??o p?s execu??o.
		}
		
		catch(SQLException erro) {

				/*men = "Falha: " + erro;
				JOptionPane.showMessageDialog(null, men); // Imprimi o erro encontrado.*/
			
			if(erro.toString().indexOf("CHECK")>=0) {
				men = "Erro de cla?sula CHECK, Favor selecionar uma op??o no STATUS e/ou PERFIL";
			}

			else {
				men = "Falha: " + erro;
			}
			
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op??o.
		return men;
	}
	
	/**
	 * Exclui um Usuario a partir de seu ID.
	 * @param Usuario - o ID do Usuario.
	 * @return - uma mensagem informando o resultado da opera??o.
	 */
	public String excluir(Usuario usuario) {
		
		// Verifica??o em console do recebimento das informa??es.
		System.out.println(usuario.getId());
		
		//Instru??o a ser executada no Banco de Dados.
		sql = "delete from TB_USUARIO where ID_USUARIO = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, usuario.getId());
			int n = bd.st.executeUpdate();
			
			if (n==1) {
				men = "Usuario exclu?do com sucesso!"; // Armazena uma informa??o p?s execu??o.
			}
			else {
				men = "Usuario n?o encontrado"; // Armazena uma informa??o p?s execu??o.
			}
			
			men = "Usuario exclu?do com sucesso!"; // Armazena uma informa??o p?s execu??o.
		}
		
		catch(SQLException erro) {
			
			men = "Erro: " + erro; // Imprimi o erro encontrado.
			
			}
		
		finally {
			bd.close();  // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op??o.
		return men;
	}
}
