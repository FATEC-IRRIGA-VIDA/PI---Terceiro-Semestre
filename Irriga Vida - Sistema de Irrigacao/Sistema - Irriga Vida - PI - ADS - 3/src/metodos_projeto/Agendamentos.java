package metodos_projeto;

public class Agendamentos {
	
	public int id;
	private String descricao;
	private char tipo;
	private char status;
	private String dtAgendamento;
	public int idUsuario;
	public int idEquipamento;
	
	/***
	 *  Método que irá realizar as operações do sistema á respeito aos Agendamentos (Cadastrar, Editar, Excluir, Consultar) 
	 */
	private void manterAgendamento() {
		
		// Lógica ainda a ser implementada
	}
	
	/***
	 * Método que irá receber o id de um equipamento e buscar na classe Equipamento
	 * @param idEquipamento - id de um determinado equipamento
	 * @return - retorna o equipamento correspondente
	 */
	private Equipamento buscarEquipamento(int idEquipamento) {
		return null;
		
		// Lógica ainda a ser implementada
	}
	
	/***
	 * Método que irá receber o id de um usuário e buscar na classe Usuário
	 * @param idUsuario - id de um determinado usuário
	 * @return - retorna o usuário correspondente
	 */
	private Usuario buscarUsuario(int idUsuario) {
		return null;
		
		// Lógica ainda a ser implementada
	}
	
	/***
	 * Método que valida se a data agendada está disponível
	 * @param dtAgendamento - data armazenada durante inserção
	 * @return - retorna uma mensagem de validação
	 */
	private String validarDataAgendamento(String dtAgendamento) {
		String mensagem = null;
		return mensagem;
	}
}
