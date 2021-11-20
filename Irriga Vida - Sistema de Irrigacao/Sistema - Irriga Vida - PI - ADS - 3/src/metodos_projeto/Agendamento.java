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
	 * M�todo Construtor para receber todos os dados de um Agendamento.
	 * @param text - vari�vel que armazena o valor recebido do ID.
	 * @param text2 - vari�vel que armazena o valor recebido do ID DO USU�RIO.
	 * @param text3 - vari�vel que armazena o valor recebido do ID DO EQUIPAMENTO.
	 * @param text4 - vari�vel que armazena o valor recebido da DESCRI��O.
	 * @param statusTipoDoAgendamento - vari�vel que armazena o valor recebido do TIPO DO AGENDAMENTO.
	 * @param dtAgendamento2 - vari�vel que armazena o valor recebido da DATA MARCADA DO AGENDAMENTO.
	 * @param statusAgendamento2 - vari�vel que armazena o valor recebido do STATUS DO AGENDAMENTO.
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
	 * M�todo Construtor para receber o c�digo de um Agendamento.
	 * @param text - vari�vel que armazena o valor recebido do ID.
	 */
	public Agendamento(String text) {
		this.id=text;
	}

	/**
	 * M�todo que recebe o ID.
	 * @return - retorna ID.
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
	 *  M�todo que recebe o ID DO USU�RIO.
	 * @return - retorna ID DO USU�RIO.
	 */
	public String getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * M�todo que define o ID DO USU�RIO.
	 * @param text2 - vari�vel que armazena o ID DO USU�RIO.
	 */
	public void setIdUsuario(String text2) {
		this.idUsuario = text2;
	}
	
	
	/**
	 *  M�todo que recebe o ID DO EQUIPAMENTO.
	 * @return - retorna ID DO EQUIPAMENTO.
	 */
	public String getIdEquipamento() {
		return idEquipamento;
	}
	
	/**
	 * M�todo que define o ID DO EQUIPAMENTO.
	 * @param text3 - vari�vel que armazena o ID DO EQUIPAMENTO.
	 */
	public void setIdEquipamento(String text3) {
		this.idEquipamento = text3;
	}
	
	
	/**
	 *  M�todo que recebe a DESCRI��O.
	 * @return - retorna a DESCRI��O.
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * M�todo que define a DESCRI��O.
	 * @param text4 - vari�vel que armazena a DESCRI��O.
	 */
	public void setDescricao(String text4) {
		this.descricao = text4;
	}
	
	
	/** 
	 *  M�todo que recebe o TIPO DO AGENDAMENTO.
	 * @return - retorna TIPO DO AGENDAMENTO.
	 */
	public String getTipoAgendamento() {
		return tipoAgendamento;
	}
	
	/**
	 * M�todo que define o TIPO DO AGENDAMENTO.
	 * @param statusTipoDoAgendamento - vari�vel que armazena o TIPO DO AGENDAMENTO.
	 */
	public void setTipoAgendamento(String statusTipoDoAgendamento) {
		this.tipoAgendamento = statusTipoDoAgendamento;
	}
	
	
	/**
	 *  M�todo que recebe a DATA MARCADA DO AGENDAMENTO.
	 * @return - retorna a DATA MARCADA DO AGENDAMENTO.
	 */
	public String getDtAgendamento() {
		return dtAgendamento;
	}
	
	/**
	 * M�todo que define a DATA MARCADA DO AGENDAMENTO.
	 * @param dtAgendamento2 - vari�vel que armazena a DATA MARCADA DO AGENDAMENTO.
	 */
	public void setDtAgendamento(String dtAgendamento2) {
		this.dtAgendamento = dtAgendamento2;
	}
	
	
	/**
	 *  M�todo que recebe o STATUS DO AGENDAMENTO.
	 * @return - retorna STATUS DO AGENDAMENTO.
	 */
	public String getStatusAgendamento() {
		return statusAgendamento;
	}
	
	/**
	 * M�todo que define o STATUS DO AGENDAMENTO.
	 * @param statusAgendamento2 - vari�vel que armazena o STATUS DO AGENDAMENTO.
	 */
	public void setStatusAgendamento(String statusAgendamento2) {
		this.statusAgendamento = statusAgendamento2;
	}
}
