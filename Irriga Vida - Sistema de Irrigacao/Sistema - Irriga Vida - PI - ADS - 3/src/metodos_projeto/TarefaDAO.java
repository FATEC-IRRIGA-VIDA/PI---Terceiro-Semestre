package metodos_projeto;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import metodos.AcessoBD;

public class TarefaDAO {

	private AcessoBD bd;
	private String men, sql;
	
	// Esatabelecendo o Construtor para a Classe TarefaDAO
	public TarefaDAO() {
		bd = new AcessoBD(); // instancia um objeto da Classe BD.
	}
	
	/**
	 * Armazena uma Tarefa no banco de dados.
	 * @param Tarefa - A Tarefa a ser gravada.
	 * @return - uma mensagem informando o resultado de uma opera??o.
	 */
	public String incluir(Tarefa tarefa) {
		
		// Verifica??o em console do recebimento das informa??es.
		System.out.println(tarefa.getId() + tarefa.getIdUsuario() + tarefa.getDescricao() + tarefa.getObservacao() + 
				tarefa.getDtExecucao() + tarefa.getDtPrevista() + tarefa.getTipo() + tarefa.getStatus());		
		
		//Instru??o a ser executada no Banco de Dados.
		sql = "insert into TB_TAREFAS (ID_USUARIO, DESCRICAO, OBS_TAREFA, DT_REAL_TAREFA, DT_PREVISTA,"
				+ "TIPO_TAREFA, STATUS_TAREFA) values (?,?,?,?,?,?,?)";
		
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, tarefa.getIdUsuario());
			bd.st.setString(2, tarefa.getDescricao());
			bd.st.setString(3, tarefa.getObservacao());
			bd.st.setString(4, tarefa.getDtExecucao());
			bd.st.setString(5, tarefa.getDtPrevista());
			bd.st.setString(6, tarefa.getTipo());
			bd.st.setString(7, tarefa.getStatus());
			bd.st.executeUpdate();
			men = "Tarefa inserida com sucesso!"; // Armazena uma informa??o p?s execu??o.
		}
		
		catch(SQLException erro) {

			/*men = "Falha: " + erro;
			JOptionPane.showMessageDialog(null, men); // Imprimi o erro encontrado.*/

			if(erro.toString().indexOf("CHECK")>=0) {
				men = "Erro de cla?sula CHECK, Favor selecionar uma op??o no STATUS e/ou TIPO DE TAREFA";
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
	 * Altera uma Tarefa no banco de dados.
	 * @param Tarefa - A Tarefa a ser gravada.
	 * @return - uma mensagem informando o resultado de uma opera??o.
	 */
	public String alterar(Tarefa tarefa) {
		
		// Verifica??o em console do recebimento das informa??es.
		System.out.println(tarefa.getId() + tarefa.getIdUsuario() + tarefa.getDescricao() + tarefa.getObservacao() + 
				tarefa.getDtExecucao() + tarefa.getDtPrevista() + tarefa.getTipo() + tarefa.getStatus());		
				
				
		// ID_TAREFA	ID_USUARIO	DESCRICAO	OBS_TAREFA	DT_REAL_TAREFA	DT_PREVISTA	TIPO_TAREFA	STATUS_TAREFA
				
		//Instru??o a ser executada no Banco de Dados.
		sql = "update TB_TAREFAS  set ID_USUARIO = ?, DESCRICAO = ?, OBS_TAREFA = ?,"
				+ " DT_REAL_TAREFA = ?, DT_PREVISTA = ?, TIPO_TAREFA = ?, STATUS_TAREFA = ? where ID_TAREFA = ?";
		
		//Acessando o Banco de Dados.
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, tarefa.getIdUsuario());
			bd.st.setString(2, tarefa.getDescricao());
			bd.st.setString(3, tarefa.getObservacao());
			bd.st.setString(4, tarefa.getDtExecucao());
			bd.st.setString(5, tarefa.getDtPrevista());
			bd.st.setString(6, tarefa.getTipo());
			bd.st.setString(7, tarefa.getStatus());
			bd.st.setString(8, tarefa.getId());
			bd.st.executeUpdate();
			men = "Tarefa Alterada com sucesso!"; // Armazena uma informa??o p?s execu??o.
		}
		
		catch(SQLException erro) {
			/*men = "Falha: " + erro;
			JOptionPane.showMessageDialog(null, men); // Imprimi o erro encontrado.*/

			if(erro.toString().indexOf("CHECK")>=0) {
				men = "Erro de cla?sula CHECK, Favor selecionar uma op??o no STATUS e/ou TIPO DE TAREFA";
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
	 * Exclui uma Tarefa a partir de seu ID.
	 * @param Tarefa - o ID da Tarefa
	 * @return - uma mensagem informando o resultado da opera??o.
	 */
	public String excluir(Tarefa tarefa) {
		
		// Verifica??o em console do recebimento das informa??es.
		System.out.println(tarefa.getId());
		
		//Instru??o a ser executada no Banco de Dados.
		sql = "delete from TB_TAREFAS where ID_TAREFA = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, tarefa.getId());
			int n = bd.st.executeUpdate();
			
			if (n==1) {
				men = "Tarefa exclu?da com sucesso!"; // Armazena uma informa??o p?s execu??o.
			}
			else {
				men = "Tarefa n?o encontrada"; // Armazena uma informa??o p?s execu??o.
			}
			
			men = "Tarefa exclu?da com sucesso!"; // Armazena uma informa??o p?s execu??o.
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
