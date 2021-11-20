package metodos_projeto;

public class Usuario {

	public int id;
	public String nome;
	private String senha;
	private char status;
	private String email;
	private String dtCadastro;
	private String dtAlteracao;
	
	/***
	 * Método que valida o acesso do usuário ao sistema
	 * @param nome - variavel com o nome do usuário
	 * @param senha - variavel com a senha do usuário
	 * @return - retorna o status do usuário
	 */
	public String validarUsuario (String nome, String senha) {
		String mensagem = null;
		return mensagem;
		
		// Lógica ainda a ser implementada
	}
	
	/***
	 * Método que irá realizar as operações do sistema á respeito aos Usuários (Cadastrar, Editar, Excluir, Consultar)
	 */
	private void manterUsuario() {
		
		// Lógica ainda a ser implementada
	}
}
