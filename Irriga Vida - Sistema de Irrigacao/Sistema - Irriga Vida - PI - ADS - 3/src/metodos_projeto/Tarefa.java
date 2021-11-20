package metodos_projeto;

public class Tarefa {


	public String id;
	private String idUsuario;
	private String descricao;
	private String observacao;
	private String dtExecucao;
	private String dtPrevista;
	private String tipo;
	private String status;

	// ID_TAREFA	ID_USUARIO	DESCRICAO	OBS_TAREFA	DT_REAL_TAREFA	DT_PREVISTA	TIPO_TAREFA	STATUS_TAREFA

	/**
	 * Método Construtor para receber todos os dados de uma Tarefa.
	 * @param text - variável que armazena o valor recebido do ID.
	 * @param text2 - variável que armazena o valor recebido do ID DO USUÁRIO.
	 * @param text3 - variável que armazena o valor recebido da DESCRIÇÃO.
	 * @param text4 - variável que armazena o valor recebido da OBSERVAÇÃO DA TAREFA.
	 * @param dtExecucao2 - variável que armazena o valor recebido da DATA REAL DA TAREFA. 
	 * @param dtPrevista2 - variável que armazena o valor recebido da DATA PREVISTA.
	 * @param tipoTarefa - variável que armazena o valor recebido do TIPO DA TAREFA.
	 * @param statusTarefa - variável que armazena o valor recebido do STATUS DA  TAREFA.
	 */
	public Tarefa(String text, String text2, String text3, String text4, String dtExecucao2, String dtPrevista2,
			String tipoTarefa, String statusTarefa) {
		this.id=text;
		this.idUsuario=text2;
		this.descricao=text3;
		this.observacao=text4;
		this.dtExecucao=dtExecucao2;
		this.dtPrevista=dtPrevista2;
		this.tipo=tipoTarefa;
		this.status=statusTarefa;
	}

	/**
	 * Método Construtor para receber o código de uma Tarefa.
	 * @param text - variável que armazena o valor recebido do ID.
	 */
	public Tarefa(String text) {
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
	 * @param text - variável que armazena o ID.
	 */
	public void setId(String text) {
		this.id = text;
	}


	/**
	 * Método que recebe o ID DO USUÁRIO.
	 * @return - retorna o ID DO USUÁRIO.
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Método que define o ID DO USUÁRIO.
	 * @param text2 - variável que armazena o ID DO USUÁRIO.
	 */
	public void setIdUsuario(String text2) {
		this.idUsuario = text2;
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
	 * @param text3 - variável que armazena a DESCRIÇÃO.
	 */
	public void setDescricao(String text3) {
		this.descricao = text3;
	}


	/**
	 * Método que recebe a OBSERVAÇÃO DA TAREFA.
	 * @return - retorna a OBSERVAÇÃO DA TAREFA.
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * Método que define a OBSERVAÇÃO DA TAREFA.
	 * @param text4 - variável que armazena a OBSERVAÇÃO DA TAREFA.
	 */
	public void setObservacao(String text4) {
		this.observacao = text4;
	}


	/**
	 * Método que recebe a DATA REAL DA TAREFA.
	 * @return - retorna a DATA REAL DA TAREFA.
	 */
	public String getDtExecucao() {
		return dtExecucao;
	}

	/**
	 * Método que define a DATA REAL DA TAREFA.
	 * @param dtExecucao2 - variável que armazena a DATA REAL DA TAREFA.
	 */
	public void setDtExecucao(String dtExecucao2) {
		this.dtExecucao = dtExecucao2;
	}

	
	
	/**
	 * Método que recebe a DATA PREVISTA.
	 * @return - retorna a DATA PREVISTA.
	 */
	public String getDtPrevista() {
		return dtPrevista;
	}

	/**
	 * Método que define a DATA PREVISTA.
	 * @param dtPrevista2 - variável que armazena a DATA PREVISTA.
	 */
	public void setDtPrevista(String dtPrevista2) {
		this.dtPrevista = dtPrevista2;
	}


	/**
	 * Método que recebe o TIPO DA TAREFA.
	 * @return - retorna o TIPO DA TAREFA.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método que define o TIPO DA TAREFA.
	 * @param tipoTarefa - variável que armazena o TIPO DA TAREFA.
	 */
	public void setTipo(String tipoTarefa) {
		this.tipo = tipoTarefa;
	}


	/**
	 * Método que recebe o STATUS DA  TAREFA.
	 * @return - retorna o STATUS DA  TAREFA.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Método que define o STATUS DA  TAREFA.
	 * @param statusTarefa - variável que armazena o STATUS DA  TAREFA.
	 */
	public void setStatus(String statusTarefa) {
		this.status = statusTarefa;
	}
	
}
