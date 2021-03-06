package metodos_projeto;

public class Planta {

	
	public String id;
	private String nomePop;
	private String dtCadastro;
	private String observacao;
	private String tipo;
	private String origem;
	private String nomeCient;
	private String familia;
	private String clima;
	
	/**
	 *  M?todo Construtor para receber todos os dados de uma Planta.
	 * @param text - vari?vel que armazena o valor recebido do ID.
	 * @param text2 - vari?vel que armazena o valor recebido do NOME POUPULAR.
	 * @param dtCadastro2 - vari?vel que armazena o valor recebido da DATA DE CADASTRO.
	 * @param text3 - vari?vel que armazena o valor recebido da OBSERVA??O.
	 * @param text4 - vari?vel que armazena o valor recebido do TIPO DA PLANTA.
	 * @param text5 - vari?vel que armazena o valor recebido da ORIGEM.
	 * @param text6 - vari?vel que armazena o valor recebido do NOME CIENTIF?CO.
	 * @param text7 - vari?vel que armazena o valor recebido da FAM?LIA.
	 * @param text8 - vari?vel que armazena o valor recebido do CLIMA.
	 */
	public Planta(String text, String text2, String dtCadastro2, String text3, String text4, String text5, String text6,
			String text7, String text8) {
		this.id=text;
		this.nomePop=text2;
		this.dtCadastro=dtCadastro2;
		this.observacao=text3;
		this.tipo=text4;
		this.origem=text5;
		this.nomeCient=text6;
		this.familia=text7;
		this.clima=text8;
	}

	/**
	 * M?todo Construtor para receber o c?digo de uma Planta.
	 * @param text - vari?vel que armazena o valor recebido do ID.
	 */
	public Planta(String text) {
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
	 * M?todo que recebe o NOME POUPULAR.
	 * @return - retorna o NOME POUPULAR.
	 */
	public String getNomePop() {
		return nomePop;
	}

	/**
	 * M?todo que define o NOME POUPULAR.
	 * @param text2 - vari?vel que armazena o NOME POUPULAR.
	 */
	public void setNomePop(String text2) {
		this.nomePop = text2;
	}

	/**
	 * M?todo que recebe a DATA DE CADASTRO.
	 * @return - retorna a DATA DE CADASTRO.
	 */
	public String getDtCadastro() {
		return dtCadastro;
	}

	/**
	 * M?todo que define a DATA DE CADASTRO.
	 * @param dtCadastro2 - vari?vel que armazena a DATA DE CADASTRO.
	 */
	public void setDtCadastro(String dtCadastro2) {
		this.dtCadastro = dtCadastro2;
	}

	/**
	 * M?todo que recebe a OBSERVA??O.
	 * @return - retorna a  OBSERVA??O.
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * M?todo que define a OBSERVA??O.
	 * @param text3 - vari?vel que armazena a OBSERVA??O.
	 */
	public void setObservacao(String text3) {
		this.observacao = text3;
	}

	/**
	 * M?todo que recebe o TIPO DA PLANTA.
	 * @return - retorna o TIPO DA PLANTA.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * M?todo que define o TIPO DA PLANTA.
	 * @param text4 - vari?vel que armazena o TIPO DA PLANTA.
	 */
	public void setTipo(String text4) {
		this.tipo = text4;
	}

	/**
	 * M?todo que recebe a ORIGEM.
	 * @return - retorna a ORIGEM.
	 */
	public String getOrigem() {
		return origem;
	}

	/**
	 * M?todo que define a ORIGEM.
	 * @param text5 - vari?vel que armazena a ORIGEM.
	 */
	public void setOrigem(String text5) {
		this.origem = text5;
	}

	/**
	 * M?todo que recebe o NOME CIENTIF?CO.
	 * @return - retorna o NOME CIENTIF?CO.
	 */
	public String getNomeCient() {
		return nomeCient;
	}

	/**
	 * M?todo que define o NOME CIENTIF?CO.
	 * @param text6 - vari?vel que armazena o NOME CIENTIF?CO.
	 */
	public void setNomeCient(String text6) {
		this.nomeCient = text6;
	}

	/**
	 * M?todo que recebe a FAM?LIA.
	 * @return - retorna a FAM?LIA.
	 */
	public String getFamilia() {
		return familia;
	}

	/**
	 * M?todo que define a FAM?LIA.
	 * @param text7 - vari?vel que armazena a FAM?LIA.
	 */ 
	public void setFamilia(String text7) {
		this.familia = text7;
	}

	/**
	 * M?todo que recebe o CLIMA.
	 * @return - retorna o CLIMA.
	 */
	public String getClima() {
		return clima;
	}

	/**
	 * M?todo que define o CLIMA.
	 * @param text8 - vari?vel que armazena o CLIMA.
	 */
	public void setClima(String text8) {
		this.clima = text8;
	}
}
