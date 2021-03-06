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
	 * M?todo Construtor para receber todos os dados de uma Tarefa.
	 * @param text - vari?vel que armazena o valor recebido do ID.
	 * @param text2 - vari?vel que armazena o valor recebido do ID DO USU?RIO.
	 * @param text3 - vari?vel que armazena o valor recebido da DESCRI??O.
	 * @param text4 - vari?vel que armazena o valor recebido da OBSERVA??O DA TAREFA.
	 * @param dtExecucao2 - vari?vel que armazena o valor recebido da DATA REAL DA TAREFA. 
	 * @param dtPrevista2 - vari?vel que armazena o valor recebido da DATA PREVISTA.
	 * @param tipoTarefa - vari?vel que armazena o valor recebido do TIPO DA TAREFA.
	 * @param statusTarefa - vari?vel que armazena o valor recebido do STATUS DA  TAREFA.
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
	 * M?todo Construtor para receber o c?digo de uma Tarefa.
	 * @param text - vari?vel que armazena o valor recebido do ID.
	 */
	public Tarefa(String text) {
		this.id=text;
	}


	/**
	 * M?todo que recebe o ID.
	 * @return - retorna o ID.
	 */
	public String getId() {
		return id;
	}

	/**
	 * M?todo que define o ID.
	 * @param text - vari?vel que armazena o ID.
	 */
	public void setId(String text) {
		this.id = text;
	}


	/**
	 * M?todo que recebe o ID DO USU?RIO.
	 * @return - retorna o ID DO USU?RIO.
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * M?todo que define o ID DO USU?RIO.
	 * @param text2 - vari?vel que armazena o ID DO USU?RIO.
	 */
	public void setIdUsuario(String text2) {
		this.idUsuario = text2;
	}


	/**
	 * M?todo que recebe a DESCRI??O.
	 * @return - retorna a DESCRI??O.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * M?todo que define a DESCRI??O.
	 * @param text3 - vari?vel que armazena a DESCRI??O.
	 */
	public void setDescricao(String text3) {
		this.descricao = text3;
	}


	/**
	 * M?todo que recebe a OBSERVA??O DA TAREFA.
	 * @return - retorna a OBSERVA??O DA TAREFA.
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * M?todo que define a OBSERVA??O DA TAREFA.
	 * @param text4 - vari?vel que armazena a OBSERVA??O DA TAREFA.
	 */
	public void setObservacao(String text4) {
		this.observacao = text4;
	}


	/**
	 * M?todo que recebe a DATA REAL DA TAREFA.
	 * @return - retorna a DATA REAL DA TAREFA.
	 */
	public String getDtExecucao() {
		return dtExecucao;
	}

	/**
	 * M?todo que define a DATA REAL DA TAREFA.
	 * @param dtExecucao2 - vari?vel que armazena a DATA REAL DA TAREFA.
	 */
	public void setDtExecucao(String dtExecucao2) {
		this.dtExecucao = dtExecucao2;
	}

	
	
	/**
	 * M?todo que recebe a DATA PREVISTA.
	 * @return - retorna a DATA PREVISTA.
	 */
	public String getDtPrevista() {
		return dtPrevista;
	}

	/**
	 * M?todo que define a DATA PREVISTA.
	 * @param dtPrevista2 - vari?vel que armazena a DATA PREVISTA.
	 */
	public void setDtPrevista(String dtPrevista2) {
		this.dtPrevista = dtPrevista2;
	}


	/**
	 * M?todo que recebe o TIPO DA TAREFA.
	 * @return - retorna o TIPO DA TAREFA.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * M?todo que define o TIPO DA TAREFA.
	 * @param tipoTarefa - vari?vel que armazena o TIPO DA TAREFA.
	 */
	public void setTipo(String tipoTarefa) {
		this.tipo = tipoTarefa;
	}


	/**
	 * M?todo que recebe o STATUS DA  TAREFA.
	 * @return - retorna o STATUS DA  TAREFA.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * M?todo que define o STATUS DA  TAREFA.
	 * @param statusTarefa - vari?vel que armazena o STATUS DA  TAREFA.
	 */
	public void setStatus(String statusTarefa) {
		this.status = statusTarefa;
	}
	
}
