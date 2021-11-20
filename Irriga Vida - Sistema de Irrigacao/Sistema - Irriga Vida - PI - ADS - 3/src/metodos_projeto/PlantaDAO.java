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
	 * @param Planta - A Planta a ser gravada.
	 * @return - uma mensagem informando o resultado de uma operação.
	 */
	public String incluir(Planta planta) {
		
		// Verificação em console do recebimento das informações.
		System.out.println(planta.getId() + planta.getNomePop() + planta.getDtCadastro() + planta.getObservacao() + planta.getTipo()
		+ planta.getOrigem() + planta.getNomeCient() + planta.getFamilia() + planta.getClima());
		
		
		//Instrução a ser executada no Banco de Dados.
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
			men = "Planta inserida com sucesso!"; // Armazena uma informação pós execução.
		}
		
		catch(SQLException erro) {
			men = "Falha: " + erro;
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a opção.
		return men;
	}
	
	/**
	 * Altera uma Planta no banco de dados.
	 * @param Planta - A Planta a ser gravada.
	 * @return - uma mensagem informando o resultado de uma operação.
	 */
	public String alterar(Planta planta) {
		
		// Verificação em console do recebimento das informações.
		System.out.println(planta.getId() + planta.getNomePop() + planta.getDtCadastro() + planta.getObservacao() + planta.getTipo()
		+ planta.getOrigem() + planta.getNomeCient() + planta.getFamilia() + planta.getClima());
		
		//Instrução a ser executada no Banco de Dados.
		sql = "update TB_PLANTA set NOME_POPULAR = ?, DT_CADASTRO = ?, OBSERVACOES = ?, TIPO_PLANTA = ?,"
				+ "ORIGEM = ?, NOME_CIENT = ?, FAMILIA = ?, CLIMA = ? where ID_PLANTA = ?";
				
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
			bd.st.setString(9, planta.getId());
			bd.st.executeUpdate();
			men = "Planta alterada com sucesso!"; // Armazena uma informação pós execução.
		}
		
		catch(SQLException erro) {
				men = "Falha: " + erro;
		}
			
		finally {
			bd.close(); // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a opção.
		return men;
	}
	
	/**
	 * Exclui uma Planta a partir de seu ID.
	 * @param Planta - o ID da Planta.
	 * @return - uma mensagem informando o resultado da operação.
	 */
	public String excluir(Planta planta) {
		
		// Verificação em console do recebimento das informações.
		System.out.println(planta.getId());
		
		//Instrução a ser executada no Banco de Dados.
		sql = "delete from TB_PLANTA where ID_PLANTA = ?";
		
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, planta.getId());
			int n = bd.st.executeUpdate();
			
			if (n==1) {
				men = "Planta excluída com sucesso!"; // Armazena uma informação pós execução.
			}
			else {
				men = "Planta não encontrada"; // Armazena uma informação pós execução.
			}
			
			men = "Planta excluída com sucesso!"; // Armazena uma informação pós execução.
		}
		
		catch(SQLException erro) {
			
			men = "Erro: " + erro; // Imprimi o erro encontrado.
			
			}
		
		finally {
			bd.close();  // Finaliza o Acesso ao Banco de Dados.
		}
		
		JOptionPane.showMessageDialog(null, men); // Imprimi a mensagem obtida durante a opção.
		return men;
	}
}
