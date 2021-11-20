package metodos_projeto;

public class Fertilizante {

	public String id;
	private String nome;
	private String tipo;
	private String marca;
	private String peso;
	private String observacao;
	private String tipoAplicacao;
	private String classificacao;
	
	/**
	 * M�todo Construtor para receber todos os dados de um Fertilizante.
	 * @param text - vari�vel que armazena o valor recebido do ID.
	 * @param text2 - vari�vel que armazena o valor recebido do NOME.
	 * @param text3 - vari�vel que armazena o valor recebido do TIPO.
	 * @param text4 - vari�vel que armazena o valor recebido da MARCA.
	 * @param text5 - vari�vel que armazena o valor recebido do PESO DA EMBALAGEM.
	 * @param text6 - vari�vel que armazena o valor recebido da OBSERVA��O.
	 * @param text7 - vari�vel que armazena o valor recebido do TIPO DE APLICA��O.
	 * @param text8 - vari�vel que armazena o valor recebido da CLASSIICA��O.
	 */
	public Fertilizante(String text, String text2, String text3, String text4, String text5, String text6, String text7,
			String text8) {
		this.id = text;
		this.nome = text2;
		this.tipo=text3;
		this.marca=text4;
		this.peso=text5;
		this.observacao=text6;
		this.tipoAplicacao=text7;
		this.classificacao=text8;
	}

	/**
	 * M�todo Construtor para receber o c�digo de um Fertilizante.
	 * @param text - vari�vel que armazena o valor recebido do ID.
	 */
	public Fertilizante(String text) {
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
	 * M�todo que recebe o NOME.
	 * @return - retorna o NOME.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * M�todo que define o NOME.
	 * @param text2 - vari�vel que armazena o NOME.
	 */
	public void setNome(String text2) {
		this.nome = text2;
	}

	
	/**
	 * M�todo que recebe o TIPO.
	 * @return - retorna o TIPO.
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * M�todo que define o TIPO.
	 * @param text3 - vari�vel que armazena o TIPO.
	 */
	public void setTipo(String text3) {
		this.tipo = text3;
	}

	
	/**
	 * M�todo que recebe a MARCA.
	 * @return - retorna a MARCA.
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * M�todo que define a MARCA.
	 * @param text4 - vari�vel que armazena a MARCA.
	 */
	public void setMarca(String text4) {
		this.marca = text4;
	}

	
	/**
	 * M�todo que recebe o PESO DA EMBALAGEM.
	 * @return - retorna o PESO DA EMBALAGEM.
	 */
	public String getPeso() {
		return peso;
	}
	
	/**
	 * M�todo que define o PESO DA EMBALAGEM.
	 * @param text5 - vari�vel que armazena o PESO DA EMBALAGEM.
	 */
	public void setPeso(String text5) {
		this.peso = text5;
	}

	
	/**
	 * M�todo que recebe a OBSERVA��O.
	 * @return - retorna a OBSERVA��O.
	 */
	public String getObservacao() {
		return observacao;
	}
	
	/**
	 * M�todo que define a OBSERVA��O.
	 * @param text6 - vari�vel que armazena a OBSERVA��O.
	 */
	public void setObservacao(String text6) {
		this.observacao = text6;
	}

	
	/**
	 * M�todo que recebe o TIPO DE APLICA��O.
	 * @return - retorna o TIPO DE APLICA��O.
	 */
	public String getTipoAplicacao() {
		return tipoAplicacao;
	}
	
	/**
	 * M�todo que define o TIPO DE APLICA��O.
	 * @param text7 - vari�vel que armazena o TIPO DE APLICA��O.
	 */
	public void setTipoAplicacao(String text7) {
		this.tipoAplicacao = text7;
	}

	
	/**
	 * M�todo que recebe a CLASSIICA��O.
	 * @return - retorna a CLASSIICA��O.
	 */
	public String getClassificacao() {
		return classificacao;
	}
	
	/**
	 * M�todo que define a CLASSIICA��O.
	 * @param text8 - vari�vel que armazena a CLASSIICA��O.
	 */
	public void setClassificacao(String text8) {
		this.classificacao = text8;
	}
	
}
