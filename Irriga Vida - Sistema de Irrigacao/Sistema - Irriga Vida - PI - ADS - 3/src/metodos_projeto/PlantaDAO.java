package metodos_projeto;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import metodos.AcessoBD;

public class PlantaDAO {

	private AcessoBD bd;
	private String men, sql;
	
	// Esatabelecendo o Construtor para a Classe PlantaDAO
	public PlantaDAO() {
		bd = new AcessoBD(); // instancia um objeto da Classe BD.
	}
	
	/**
	 * Armazena uma Planta no banco de dados.
	 * @param Planta - a planta a ser gravada.
	 * @return - uma mensagem informando o resultado de uma opera��o.
	 */
	public String incluir(Planta planta) {
		
		// Verifica��o em console do recebimento das informa��es.
		System.out.println(planta.getId() + planta.getNomePop() + planta.getDtCadastro() + planta.getObservacao() + planta.getTipo()
		+ planta.getOrigem() + planta.getNomeCient() + planta.getFamilia() + planta.getClima());
		
		
		//Instru��o a ser executada no Banco de Dados.
		sql = "insert into TB_PLANTA (NOME_POPULAR, DT_CADASTRO, OBSERVACOES, TIPO_PLANTA,"
				+ "ORIGEM, NOME_CIENT, FAMILIA, CLIMA) values (?,?,?,?,?,?,?,?)";
		
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, planta.getNomePop());
			bd.st.setString(2, planta.getDtCadastro());
			bd.st.setString(3, planta.getObservacao());
			bd.st.setString(4, planta.getTipo());
			bd.st.setString(5, planta.getOrigem());
			bd.st.setString(6, planta.getNomeCient());
			bd.st.setString(7, planta.getFamilia());
			bd.st.setString(8, planta.getClima());
			bd.st.executeUpdate();
			men = "Planta inserida com sucesso!"; // Armazena uma informa��o p�s execu��o.
		}
		
		catch(SQLException erro) {
			men = "Falha: " + erro;
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op��o.
		return men;
	}
	
	/**
	 * Armazena um Usuario no banco de dados.
	 * @param Usuario - o usuario a ser gravado.
	 * @return - uma mensagem informando o resultado de uma opera��o.
	 */
	public String alterar(Planta planta) {
		
		// Verifica��o em console do recebimento das informa��es.
		System.out.println(planta.getId() + planta.getNomePop() + planta.getDtCadastro() + planta.getObservacao() + planta.getTipo()
		+ planta.getOrigem() + planta.getNomeCient() + planta.getFamilia() + planta.getClima());
		
		//Instru��o a ser executada no Banco de Dados.
		sql = "insert into TB_PLANTA (NOME_POPULAR, DT_CADASTRO, OBSERVACOES, TIPO_PLANTA,"
				+ "ORIGEM, NOME_CIENT, FAMILIA, CLIMA) values (?,?,?,?,?,?,?,?)";
				
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, planta.getNomePop());
			bd.st.setString(2, planta.getDtCadastro());
			bd.st.setString(3, planta.getObservacao());
			bd.st.setString(4, planta.getTipo());
			bd.st.setString(5, planta.getOrigem());
			bd.st.setString(6, planta.getNomeCient());
			bd.st.setString(7, planta.getFamilia());
			bd.st.setString(8, planta.getClima());
			bd.st.executeUpdate();
			men = "Planta alterada com sucesso!"; // Armazena uma informa��o p�s execu��o.
		}
		
		catch(SQLException erro) {
				men = "Falha: " + erro;
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op��o.
		return men;
	}
	
	/**
	 * Exclui um Usuario a partir de seu ID.
	 * @param Text - o ID do Usuario
	 * @return - uma mensagem informando o resultado da opera��o
	 */
	public String excluir(Usuario usuario) {
		
		// Verifica��o em console do recebimento das informa��es.
		System.out.println(usuario.getId());
		
		//Instru��o a ser executada no Banco de Dados.
		sql = "delete from TB_USUARIO where ID_USUARIO = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, usuario.getId());
			int n = bd.st.executeUpdate();
			
			if (n==1) {
				men = "Usuario exclu�do com sucesso!"; // Armazena uma informa��o p�s execu��o.
			}
			else {
				men = "Usuario n�o encontrado"; // Armazena uma informa��o p�s execu��o.
			}
			
			men = "Usuario exclu�do com sucesso!"; // Armazena uma informa��o p�s execu��o.
		}
		
		catch(SQLException erro) {
			
			men = "Erro: " + erro; // Imprimi o erro encontrado.
			
			}
		
		finally {
			bd.close();  // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op��o.
		return men;
	}
}
