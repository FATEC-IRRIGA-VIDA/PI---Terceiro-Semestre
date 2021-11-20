package metodos_projeto;

public class Equipamento {

	public String id;
	private String descricao;
	private String valor;
	private String dtUltManutencao;
	
	/**
	 *  Método Construtor para receber todos os dados de um Equipamento.
	 * @param text - variável que armazena o valor recebido do ID.
	 * @param text2 - variável que armazena o valor recebido da DESCRIÇÃO.
	 * @param text3 - variável que armazena o valor recebido do VALOR.
	 * @param dataUm - variável que armazena o valor recebido da DATA DA ÚLTIMA MANUTENÇÃO.
	 */
	public Equipamento(String text, String text2, String text3, String dataUm) {
		this.id=text;
		this.descricao=text2;
		this.valor=text3;
		this.dtUltManutencao=dataUm;
	}

	/**
	 * Método Construtor para receber o código de um Equipamento.
	 * @param text - variável que armazena o valor recebido do ID.
	 */
	public Equipamento(String text) {
		this.id=text;
	}

	/**
	 * Método que recebe o ID.
	 * @return - retorna o ID.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Método que define o ID.
	 * @param id - variável que armazena o ID.
	 */
	public void setId(String text) {
		this.id = text;
	}

	/**
	 * Método que recebe a DESCRIÇÃO.
	 * @return - retorna a DESCRIÇÃO.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Método que define a DESCRIÇÃO.
	 * @param descricao - variável que armazena a DESCRIÇÃO.
	 */
	public void setDescricao(String text2) {
		this.descricao = text2;
	}

	/**
	 * Método que recebe o VALOR.
	 * @return - retorna o VALOR.
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Método que define o VALOR.
	 * @param valor - variável que armazena o VALOR.
	 */
	public void setValor(String text3) {
		this.valor = text3;
	}

	/**
	 * Método que recebe a DATA DA ÚLTIMA MANUTENÇÃO.
	 * @return - retorna a DATA DA ÚLTIMA MANUTENÇÃO.
	 */
	public String getDtUltManutencao() {
		return dtUltManutencao;
	}

	/**
	 * Método que define a DATA DA ÚLTIMA MANUTENÇÃO.
	 * @param dtUltManutencao - variável que armazena a DATA DA ÚLTIMA MANUTENÇÃO.
	 */
	public void setDtUltManutencao(String dataUm) {
		this.dtUltManutencao = dataUm;
	}
}
