package metodos_projeto;

public class Plantio {

	public String id;
	private String idPlanta;
	private String idFertilizante;
	private String tipoAdubo;
	private String tempirrigui;
	private String metragem;
	private String qtdeSemente;
	private String tipoPlantio;
	private String dtIniPlantio;
	private String dtFimPlantio;
	private String dtIniColheita;
	private String dtFimColheita;

	// ID_PLANTIO	ID_PLANTA	ID_FERTILIZANTE	TIPO_ADUBO	TEMPO_MED_IRRIGA	METRAGEM	QTD_SEMENTE	TIPO_PLANTIO	
	//  DT_INI_PLANTIO	DT_FIM_PLANTIO	DT_INI_COLHEITA	DT_FIM_COLHEITA
	
	/**
	 * M?todo Construtor para receber todos os dados de um Plantio.
	 * @param text - vari?vel que armazena o valor recebido do ID.
	 * @param text2 - vari?vel que armazena o valor recebido do ID DA PLANTA.
	 * @param text3 - vari?vel que armazena o valor recebido do ID DO FERTILIZANTE.
	 * @param text4 - vari?vel que armazena o valor recebido do TIPO DO ADUBO.
	 * @param text5 - vari?vel que armazena o valor recebido do TEMPO M?DIO DE IRRIGA??O.
	 * @param text6 - vari?vel que armazena o valor recebido da METRAGEM.
	 * @param text7 - vari?vel que armazena o valor recebido da QUANTIDADE DE SEMENTES.
	 * @param tipoPlantio2 - vari?vel que armazena o valor recebido do TIPO DO PLANTIO.
	 * @param dtInicioP - vari?vel que armazena o valor recebido da DATA INICIO PLANTIO.
	 * @param dtFimP - vari?vel que armazena o valor recebido da DATA FIM PLANTIO.
	 * @param dtInicioC - vari?vel que armazena o valor recebido da DATA INICIO COLHEITA.
	 * @param dtFimC - vari?vel que armazena o valor recebido da DATA FIM COLHEITA.
	 */
	public Plantio(String text, String text2, String text3, String text4, String text5, String text6, String text7,
			String tipoPlantio2, String dtInicioP, String dtFimP, String dtInicioC, String dtFimC) {
		this.id=text;
		this.idPlanta=text2;
		this.idFertilizante=text3;
		this.tipoAdubo=text4;
		this.tempirrigui=text5;
		this.metragem=text6;
		this.qtdeSemente=text7;
		this.tipoPlantio=tipoPlantio2;
		this.dtIniPlantio=dtInicioP;
		this.dtFimPlantio=dtFimP;
		this.dtIniColheita=dtInicioC;
		this.dtFimColheita=dtFimC;
	}

	/**
	 * M?todo Construtor para receber o c?digo de um Plantio.
	 * @param text - vari?vel que armazena o valor recebido do ID.
	 */
	public Plantio(String text) {
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
	 * @param text - vari?vel que armazena o valor recebido do ID.
	 */
	public void setId(String text) {
		this.id = text;
	}

	
	/**
	 * M?todo que recebe o ID DA PLANTA.
	 * @return - retorna o ID DA PLANTA.
	 */
	public String getIdPlanta() {
		return idPlanta;
	}
	/**
	 * M?todo que define o ID DA PLANTA.
	 * @param text2 - vari?vel que armazena o valor recebido do ID DA PLANTA.
	 */
	public void setIdPlanta(String text2) {
		this.idPlanta = text2;
	}

	
	/**
	 * M?todo que recebe o ID DO FERTILIZANTE.
	 * @return - retorna o ID DO FERTILIZANTE.
	 */
	public String getIdFertilizante() {
		return idFertilizante;
	}
	/**
	 * M?todo que define o ID DO FERTILIZANTE.
	 * @param text3 - vari?vel que armazena o valor recebido do ID DO FERTILIZANTE.
	 */
	public void setIdFertilizante(String text3) {
		this.idFertilizante = text3;
	}

	
	/**
	 * M?todo que recebe o TIPO DO ADUBO.
	 * @return - retorna o TIPO DO ADUBO.
	 */ 
	public String getTipoAdubo() {
		return tipoAdubo;
	}
	/**
	 * M?todo que define o TIPO DO ADUBO.
	 * @param text4 - vari?vel que armazena o valor recebido do TIPO DO ADUBO.
	 */
	public void setTipoAdubo(String text4) {
		this.tipoAdubo = text4;
	}

	
	/**
	 * M?todo que recebe o TEMPO M?DIO DE IRRIGA??O.
	 * @return - retorna o TEMPO M?DIO DE IRRIGA??O.
	 */
	public String getTempirrigui() {
		return tempirrigui;
	}
	/**
	 * M?todo que define o TEMPO M?DIO DE IRRIGA??O.
	 * @param text5 - vari?vel que armazena o valor recebido do TEMPO M?DIO DE IRRIGA??O.
	 */
	public void setTempirrigui(String text5) {
		this.tempirrigui = text5;
	}

	
	/**
	 * M?todo que recebe a METRAGEM.
	 * @return - retorna a METRAGEM.
	 */
	public String getMetragem() {
		return metragem;
	}
	/**
	 * M?todo que define a METRAGEM.
	 * @param text6 - vari?vel que armazena o valor recebido da METRAGEM.
	 */
	public void setMetragem(String text6) {
		this.metragem = text6;
	}

	
	/**
	 * M?todo que recebe a QUANTIDADE DE SEMENTES.
	 * @return - retorna a QUANTIDADE DE SEMENTES.
	 */
	public String getQtdeSemente() {
		return qtdeSemente;
	}
	/**
	 * M?todo que define a QUANTIDADE DE SEMENTES.
	 * @param text7 - vari?vel que armazena o valor recebido da QUANTIDADE DE SEMENTES.
	 */
	public void setQtdeSemente(String text7) {
		this.qtdeSemente = text7;
	}

	
	/**
	 * M?todo que recebe o TIPO DO PLANTIO.
	 * @return - retorna o TIPO DO PLANTIO.
	 */
	public String getTipoPlantio() {
		return tipoPlantio;
	}
	/**
	 * M?todo que define o TIPO DO PLANTIO.
	 * @param tipoPlantio2 - vari?vel que armazena o valor recebido do TIPO DO PLANTIO.
	 */
	public void setTipoPlantio(String tipoPlantio2) {
		this.tipoPlantio = tipoPlantio2;
	}

	
	/**
	 * M?todo que recebe a DATA INICIO PLANTIO.
	 * @return - retorna a DATA INICIO PLANTIO.
	 */
	public String getDtIniPlantio() {
		return dtIniPlantio;
	}
	/**
	 * M?todo que define a DATA INICIO PLANTIO.
	 * @param dtInicioP - vari?vel que armazena o valor recebido da DATA INICIO PLANTIO.
	 */
	public void setDtIniPlantio(String dtInicioP) {
		this.dtIniPlantio = dtInicioP;
	}

	
	/**
	 * M?todo que recebe a DATA FIM PLANTIO.
	 * @return - retorna a DATA FIM PLANTIO.
	 */
	public String getDtFimPlantio() {
		return dtFimPlantio;
	}
	/**
	 * M?todo que define a DATA FIM PLANTIO.
	 * @param dtFimP - vari?vel que armazena o valor recebido a DATA FIM PLANTIO.
	 */
	public void setDtFimPlantio(String dtFimP) {
		this.dtFimPlantio = dtFimP;
	}

	
	/**
	 * M?todo que recebe a DATA INICIO COLHEITA.
	 * @return - retorna a DATA INICIO COLHEITA.
	 */
	public String getDtIniColheita() {
		return dtIniColheita;
	}
	/**
	 * M?todo que define a DATA INICIO COLHEITA.
	 * @param dtInicioC - vari?vel que armazena o valor recebido da DATA INICIO COLHEITA.
	 */
	public void setDtIniColheita(String dtInicioC) {
		this.dtIniColheita = dtInicioC;
	}

	
	/**
	 * M?todo que recebe a DATA FIM COLHEITA.
	 * @return - retorna a DATA FIM COLHEITA.
	 */
	public String getDtFimColheita() {
		return dtFimColheita;
	}
	/**
	 * M?todo que define a DATA FIM COLHEITA.
	 * @param dtFimC - vari?vel que armazena o valor recebido da DATA FIM COLHEITA.
	 */
	public void setDtFimColheita(String dtFimC) {
		this.dtFimColheita = dtFimC;
	}
	
	
}
