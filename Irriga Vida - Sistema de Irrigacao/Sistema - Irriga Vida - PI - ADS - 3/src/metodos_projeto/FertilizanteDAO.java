package metodos_projeto;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import metodos.AcessoBD;

public class FertilizanteDAO {

	private AcessoBD bd;
	private String men, sql;
	
	// Esatabelecendo o Construtor para a Classe FertilizanteDAO
	public FertilizanteDAO() {
		bd = new AcessoBD(); // instancia um objeto da Classe BD.
	}
	
	/**
	 * Armazena um Fertilizante no banco de dados.
	 * @param Fertilizante - O Fertilizante a ser gravado.
	 * @return - uma mensagem informando o resultado de uma opera??o.
	 */
	public String incluir(Fertilizante fertilizante) {
		
		// Verifica??o em console do recebimento das informa??es.
		System.out.println(fertilizante.getId() + fertilizante.getNome() + fertilizante.getTipo() + fertilizante.getMarca() +
				fertilizante.getPeso() + fertilizante.getObservacao() + fertilizante.getTipoAplicacao() + 
				fertilizante.getClassificacao());		

		//Instru??o a ser executada no Banco de Dados.
		sql = "insert into TB_FERTILIZANTE (NOME_FERTILIZANTE, TIPO_FERTILIZANTE, MARCA_FERT, PESO_EMBALAGEM, OBSERVACAO,"
				+ "TIPO_APLIC, CLASSIF) values (?,?,?,?,?,?,?)";
		
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, fertilizante.getNome());
			bd.st.setString(2, fertilizante.getTipo());
			bd.st.setString(3, fertilizante.getMarca());
			bd.st.setString(4, fertilizante.getPeso());
			bd.st.setString(5, fertilizante.getObservacao());
			bd.st.setString(6, fertilizante.getTipoAplicacao());
			bd.st.setString(7, fertilizante.getClassificacao());
			bd.st.executeUpdate();
			men = "Fertilizante inserido com sucesso!"; // Armazena uma informa??o p?s execu??o.
		}
		
		catch(SQLException erro) {
			men = "Falha: " + erro;
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op??o.
		return men;
	}
	
	/**
	 * Altera um Fertilizante no banco de dados.
	 * @param Fertilizante - O Fertilizante a ser gravado.
	 * @return - uma mensagem informando o resultado de uma opera??o.
	 */
	public String alterar(Fertilizante fertilizante) {
		
		// Verifica??o em console do recebimento das informa??es.
				System.out.println(fertilizante.getId() + fertilizante.getNome() + fertilizante.getTipo() + fertilizante.getMarca() +
						fertilizante.getPeso() + fertilizante.getObservacao() + fertilizante.getTipoAplicacao() + 
						fertilizante.getClassificacao());	
		
		//Instru??o a ser executada no Banco de Dados.
		sql = "update TB_FERTILIZANTE set NOME_FERTILIZANTE = ?, TIPO_FERTILIZANTE = ?, MARCA_FERT = ?,"
				+ " PESO_EMBALAGEM = ?, OBSERVACAO = ?, TIPO_APLIC = ?, CLASSIF = ? where ID_FERTILIZANTE = ?";

		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, fertilizante.getNome());
			bd.st.setString(2, fertilizante.getTipo());
			bd.st.setString(3, fertilizante.getMarca());
			bd.st.setString(4, fertilizante.getPeso());
			bd.st.setString(5, fertilizante.getObservacao());
			bd.st.setString(6, fertilizante.getTipoAplicacao());
			bd.st.setString(7, fertilizante.getClassificacao());
			bd.st.setString(8, fertilizante.getId());
			bd.st.executeUpdate();
			men = "Fertilizante Alterado com sucesso!"; // Armazena uma informa??o p?s execu??o.
		}
		
		catch(SQLException erro) {
				men = "Falha: " + erro;
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op??o.
		return men;
	}
	
	/**
	 * Exclui um Fertilizante a partir de seu ID.
	 * @param Fertilizante - o ID do Fertilizante.
	 * @return - uma mensagem informando o resultado da opera??o.
	 */
	public String excluir(Fertilizante fertilizante) {
		
		// Verifica??o em console do recebimento das informa??es.
		System.out.println(fertilizante.getId());
		
		//Instru??o a ser executada no Banco de Dados.
		sql = "delete from TB_FERTILIZANTE where ID_FERTILIZANTE = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, fertilizante.getId());
			int n = bd.st.executeUpdate();
			
			if (n==1) {
				men = "Fertilizante exclu?do com sucesso!"; // Armazena uma informa??o p?s execu??o.
			}
			else {
				men = "Fertilizante n?o encontrado"; // Armazena uma informa??o p?s execu??o.
			}
			
			men = "Fertilizante exclu?do com sucesso!"; // Armazena uma informa??o p?s execu??o.
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
