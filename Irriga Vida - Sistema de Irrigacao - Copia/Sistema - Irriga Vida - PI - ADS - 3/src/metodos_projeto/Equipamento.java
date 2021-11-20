package metodos_projeto;

public class Equipamento {

	public String id;
	private String descricao;
	private String valor;
	private String dtUltManutencao;
	
	/**
	 *  M�todo Construtor para receber todos os dados de um Equipamento.
	 * @param text - vari�vel que armazena o valor recebido do ID.
	 * @param text2 - vari�vel que armazena o valor recebido da DESCRI��O.
	 * @param text3 - vari�vel que armazena o valor recebido do VALOR.
	 * @param dataUm - vari�vel que armazena o valor recebido da DATA DA �LTIMA MANUTEN��O.
	 */
	public Equipamento(String text, String text2, String text3, String dataUm) {
		this.id=text;
		this.descricao=text2;
		this.valor=text3;
		this.dtUltManutencao=dataUm;
	}

	/**
	 * M�todo Construtor para receber o c�digo de um Equipamento.
	 * @param text - vari�vel que armazena o valor recebido do ID.
	 */
	public Equipamento(String text) {
		this.id=text;
	}

	/**
	 * M�todo que recebe o ID.
	 * @return - retorna o ID.
	 */
	public String getId() {
		return id;
	}

	/**
	 * M�todo que define o ID.
	 * @param text - vari�vel que armazena o ID.
	 */
	public void setId(String text) {
		this.id = text;
	}

	/**
	 * M�todo que recebe a DESCRI��O.
	 * @return - retorna a DESCRI��O.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * M�todo que define a DESCRI��O.
	 * @param text2 - vari�vel que armazena a DESCRI��O.
	 */
	public void setDescricao(String text2) {
		this.descricao = text2;
	}

	/**
	 * M�todo que recebe o VALOR.
	 * @return - retorna o VALOR.
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * M�todo que define o VALOR.
	 * @param text3 - vari�vel que armazena o VALOR.
	 */
	public void setValor(String text3) {
		this.valor = text3;
	}

	/**
	 * M�todo que recebe a DATA DA �LTIMA MANUTEN��O.
	 * @return - retorna a DATA DA �LTIMA MANUTEN��O.
	 */
	public String getDtUltManutencao() {
		return dtUltManutencao;
	}

	/**
	 * M�todo que define a DATA DA �LTIMA MANUTEN��O.
	 * @param dataUm - vari�vel que armazena a DATA DA �LTIMA MANUTEN��O.
	 */
	public void setDtUltManutencao(String dataUm) {
		this.dtUltManutencao = dataUm;
	}
}
