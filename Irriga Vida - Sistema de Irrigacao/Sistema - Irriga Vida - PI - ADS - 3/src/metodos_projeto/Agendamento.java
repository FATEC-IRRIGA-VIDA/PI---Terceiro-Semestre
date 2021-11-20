package metodos_projeto;

public class Agendamento {
	
	public String id;
	public String idUsuario;
	public String idEquipamento;
	private String descricao;
	private String tipoAgendamento;
	private String dtAgendamento;
	private String statusAgendamento;

	// ID_AGENDAMENTO	ID_USUARIO	ID_EQUIPAMENTO	DESCRICAO	TIPO_AGEN	DT_MARCADA_AGEND	STATUS_AGEN
	
	/**
	 * Método Construtor para receber todos os dados de um Agendamento.
	 * @param text - variável que armazena o valor recebido do ID.
	 * @param text2 - variável que armazena o valor recebido do ID DO USUÁRIO.
	 * @param text3 - variável que armazena o valor recebido do ID DO EQUIPAMENTO.
	 * @param text4 - variável que armazena o valor recebido da DESCRIÇÃO.
	 * @param statusTipoDoAgendamento - variável que armazena o valor recebido do TIPO DO AGENDAMENTO.
	 * @param dtAgendamento2 - variável que armazena o valor recebido da DATA MARCADA DO AGENDAMENTO.
	 * @param statusAgendamento2 - variável que armazena o valor recebido do STATUS DO AGENDAMENTO.
	 */
	public Agendamento(String text, String text2, String text3, String text4, String statusTipoDoAgendamento,
			String dtAgendamento2, String statusAgendamento2) {
		this.id=text;
		this.idUsuario=text2;
		this.idEquipamento=text3;
		this.descricao=text4;
		this.tipoAgendamento=statusTipoDoAgendamento;
		this.dtAgendamento=dtAgendamento2;
		this.statusAgendamento=statusAgendamento2;
	}

	/**
	 * Método Construtor para receber o código de um Agendamento.
	 * @param text - variável que armazena o valor recebido do ID.
	 */
	public Agendamento(String text) {
		this.id=text;
	}

	/**
	 * Método que recebe o ID.
	 * @return - retorna ID.
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
	 *  Método que recebe o ID DO USUÁRIO.
	 * @return - retorna ID DO USUÁRIO.
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
	 *  Método que recebe o ID DO EQUIPAMENTO.
	 * @return - retorna ID DO EQUIPAMENTO.
	 */
	public String getIdEquipamento() {
		return idEquipamento;
	}
	
	/**
	 * Método que define o ID DO EQUIPAMENTO.
	 * @param text3 - variável que armazena o ID DO EQUIPAMENTO.
	 */
	public void setIdEquipamento(String text3) {
		this.idEquipamento = text3;
	}
	
	
	/**
	 *  Método que recebe a DESCRIÇÃO.
	 * @return - retorna a DESCRIÇÃO.
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * Método que define a DESCRIÇÃO.
	 * @param text4 - variável que armazena a DESCRIÇÃO.
	 */
	public void setDescricao(String text4) {
		this.descricao = text4;
	}
	
	
	/** 
	 *  Método que recebe o TIPO DO AGENDAMENTO.
	 * @return - retorna TIPO DO AGENDAMENTO.
	 */
	public String getTipoAgendamento() {
		return tipoAgendamento;
	}
	
	/**
	 * Método que define o TIPO DO AGENDAMENTO.
	 * @param statusTipoDoAgendamento - variável que armazena o TIPO DO AGENDAMENTO.
	 */
	public void setTipoAgendamento(String statusTipoDoAgendamento) {
		this.tipoAgendamento = statusTipoDoAgendamento;
	}
	
	
	/**
	 *  Método que recebe a DATA MARCADA DO AGENDAMENTO.
	 * @return - retorna a DATA MARCADA DO AGENDAMENTO.
	 */
	public String getDtAgendamento() {
		return dtAgendamento;
	}
	
	/**
	 * Método que define a DATA MARCADA DO AGENDAMENTO.
	 * @param dtAgendamento2 - variável que armazena a DATA MARCADA DO AGENDAMENTO.
	 */
	public void setDtAgendamento(String dtAgendamento2) {
		this.dtAgendamento = dtAgendamento2;
	}
	
	
	/**
	 *  Método que recebe o STATUS DO AGENDAMENTO.
	 * @return - retorna STATUS DO AGENDAMENTO.
	 */
	public String getStatusAgendamento() {
		return statusAgendamento;
	}
	
	/**
	 * Método que define o STATUS DO AGENDAMENTO.
	 * @param statusAgendamento2 - variável que armazena o STATUS DO AGENDAMENTO.
	 */
	public void setStatusAgendamento(String statusAgendamento2) {
		this.statusAgendamento = statusAgendamento2;
	}
}
