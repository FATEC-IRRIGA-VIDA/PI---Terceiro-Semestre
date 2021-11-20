package metodos_projeto;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import metodos.AcessoBD;

public class PlantioDAO {

	private AcessoBD bd;
	private String men, sql;
	
	// Esatabelecendo o Construtor para a Classe PlantioDAO
	public PlantioDAO() {
		bd = new AcessoBD(); // instancia um objeto da Classe BD.
	}
	
	/**
	 * Armazena um Plantio no banco de dados.
	 * @param Plantio - o Plantio a ser gravado.
	 * @return - uma mensagem informando o resultado de uma opera��o.
	 */
	public String incluir(Plantio plantio) {
		
		// Verifica��o em console do recebimento das informa��es.
		System.out.println(plantio.getId() + plantio.getIdPlanta() + plantio.getIdFertilizante() + plantio.getTipoAdubo() +
				plantio.getTempirrigui() + plantio.getMetragem() + plantio.getQtdeSemente() + plantio.getTipoPlantio() +
				plantio.getDtIniPlantio() + plantio.getDtFimPlantio() + plantio.getDtIniColheita() + plantio.getDtFimColheita());		
		
		// ID_PLANTIO	ID_PLANTA	ID_FERTILIZANTE	TIPO_ADUBO	TEMPO_MED_IRRIGA	METRAGEM	QTD_SEMENTE	TIPO_PLANTIO	
		//  DT_INI_PLANTIO	DT_FIM_PLANTIO	DT_INI_COLHEITA	DT_FIM_COLHEITA
		
		//Instru��o a ser executada no Banco de Dados.
		sql = "insert into TB_PLANTIO (ID_PLANTA, ID_FERTILIZANTE, TIPO_ADUBO, TEMPO_MED_IRRIGA, METRAGEM,"
				+ "QTD_SEMENTE, TIPO_PLANTIO, DT_INI_PLANTIO, DT_FIM_PLANTIO, DT_INI_COLHEITA,DT_FIM_COLHEITA ) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?)";
		
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, plantio.getIdPlanta());
			bd.st.setString(2, plantio.getIdFertilizante());
			bd.st.setString(3, plantio.getTipoAdubo());
			bd.st.setString(4, plantio.getTempirrigui());
			bd.st.setString(5, plantio.getMetragem());
			bd.st.setString(6, plantio.getQtdeSemente());
			bd.st.setString(7, plantio.getTipoPlantio());
			bd.st.setString(8, plantio.getDtIniPlantio());
			bd.st.setString(9, plantio.getDtFimPlantio());
			bd.st.setString(10, plantio.getDtIniColheita());
			bd.st.setString(11, plantio.getDtFimColheita());
			bd.st.executeUpdate();
			men = "Plantio inserido com sucesso!"; // Armazena uma informa��o p�s execu��o.
		}
		
		catch(SQLException erro) {

			/*men = "Falha: " + erro;
			JOptionPane.showMessageDialog(null, men); // Imprimi o erro encontrado.*/

			if(erro.toString().indexOf("CHECK")>=0) {
				men = "Erro de cla�sula CHECK, Favor selecionar uma op��o no TIPO DE PLANTIO";
			}

			else {
				men = "Falha: " + erro;
			}
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op��o.
		return men;
	}
	
	/**
	 * Altera um Plantio no banco de dados.
	 * @param Plantio - O Plantio a ser gravado.
	 * @return - uma mensagem informando o resultado de uma opera��o.
	 */
	public String alterar(Plantio plantio) {
		
		// Verifica��o em console do recebimento das informa��es.
		System.out.println(plantio.getId() + plantio.getIdPlanta() + plantio.getIdFertilizante() + plantio.getTipoAdubo() +
				plantio.getTempirrigui() + plantio.getMetragem() + plantio.getQtdeSemente() + plantio.getTipoPlantio() +
				plantio.getDtIniPlantio() + plantio.getDtFimPlantio() + plantio.getDtIniColheita() + plantio.getDtFimColheita());	
				
				
		// ID_PLANTIO	ID_PLANTA	ID_FERTILIZANTE	TIPO_ADUBO	TEMPO_MED_IRRIGA	METRAGEM	QTD_SEMENTE	TIPO_PLANTIO	
		//  DT_INI_PLANTIO	DT_FIM_PLANTIO	DT_INI_COLHEITA	DT_FIM_COLHEITA
				
		//Instru��o a ser executada no Banco de Dados.
		sql = "update TB_PLANTIO  set ID_PLANTA = ?, ID_FERTILIZANTE = ?, TIPO_ADUBO = ?,"
				+ " TEMPO_MED_IRRIGA = ?, METRAGEM = ?, QTD_SEMENTE = ?, TIPO_PLANTIO = ?,"
				+ " DT_INI_PLANTIO = ?, DT_FIM_PLANTIO = ?, DT_INI_COLHEITA = ?, DT_FIM_COLHEITA = ? where ID_PLANTIO = ?";
		
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, plantio.getIdPlanta());
			bd.st.setString(2, plantio.getIdFertilizante());
			bd.st.setString(3, plantio.getTipoAdubo());
			bd.st.setString(4, plantio.getTempirrigui());
			bd.st.setString(5, plantio.getMetragem());
			bd.st.setString(6, plantio.getQtdeSemente());
			bd.st.setString(7, plantio.getTipoPlantio());
			bd.st.setString(8, plantio.getDtIniPlantio());
			bd.st.setString(9, plantio.getDtFimPlantio());
			bd.st.setString(10, plantio.getDtIniColheita());
			bd.st.setString(11, plantio.getDtFimColheita());
			bd.st.setString(12, plantio.getId());
			bd.st.executeUpdate();
			men = "Plantio Alterado com sucesso!"; // Armazena uma informa��o p�s execu��o.
		}
		
		catch(SQLException erro) {
			/*men = "Falha: " + erro;
			JOptionPane.showMessageDialog(null, men); // Imprimi o erro encontrado.*/

			if(erro.toString().indexOf("CHECK")>=0) {
				men = "Erro de cla�sula CHECK, Favor selecionar uma op��o no TIPO DE PLANTIO";
			}

			else {
				men = "Falha: " + erro;
			}
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a op��o.
		return men;
	}
	
	/**
	 * Exclui um Plantio a partir de seu ID.
	 * @param Plantio - o ID do Plantio.
	 * @return - uma mensagem informando o resultado da opera��o.
	 */
	public String excluir(Plantio plantio) {
		
		// Verifica��o em console do recebimento das informa��es.
		System.out.println(plantio.getId());
		
		//Instru��o a ser executada no Banco de Dados.
		sql = "delete from TB_PLANTIO where ID_PLANTIO = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, plantio.getId());
			int n = bd.st.executeUpdate();
			
			if (n==1) {
				men = "Plantio exclu�do com sucesso!"; // Armazena uma informa��o p�s execu��o.
			}
			else {
				men = "Plantio n�o encontrado"; // Armazena uma informa��o p�s execu��o.
			}
			
			men = "Plantio exclu�do com sucesso!"; // Armazena uma informa��o p�s execu��o.
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
