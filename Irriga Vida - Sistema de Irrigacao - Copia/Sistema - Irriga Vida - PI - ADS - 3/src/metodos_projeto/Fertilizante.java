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
	 * Método Construtor para receber todos os dados de um Fertilizante.
	 * @param text - variável que armazena o valor recebido do ID.
	 * @param text2 - variável que armazena o valor recebido do NOME.
	 * @param text3 - variável que armazena o valor recebido do TIPO.
	 * @param text4 - variável que armazena o valor recebido da MARCA.
	 * @param text5 - variável que armazena o valor recebido do PESO DA EMBALAGEM.
	 * @param text6 - variável que armazena o valor recebido da OBSERVAÇÃO.
	 * @param text7 - variável que armazena o valor recebido do TIPO DE APLICAÇÃO.
	 * @param text8 - variável que armazena o valor recebido da CLASSIICAÇÃO.
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
	 * Método Construtor para receber o código de um Fertilizante.
	 * @param text - variável que armazena o valor recebido do ID.
	 */
	public Fertilizante(String text) {
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
	 * Método que recebe o NOME.
	 * @return - retorna o NOME.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método que define o NOME.
	 * @param text2 - variável que armazena o NOME.
	 */
	public void setNome(String text2) {
		this.nome = text2;
	}

	
	/**
	 * Método que recebe o TIPO.
	 * @return - retorna o TIPO.
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Método que define o TIPO.
	 * @param text3 - variável que armazena o TIPO.
	 */
	public void setTipo(String text3) {
		this.tipo = text3;
	}

	
	/**
	 * Método que recebe a MARCA.
	 * @return - retorna a MARCA.
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Método que define a MARCA.
	 * @param text4 - variável que armazena a MARCA.
	 */
	public void setMarca(String text4) {
		this.marca = text4;
	}

	
	/**
	 * Método que recebe o PESO DA EMBALAGEM.
	 * @return - retorna o PESO DA EMBALAGEM.
	 */
	public String getPeso() {
		return peso;
	}
	
	/**
	 * Método que define o PESO DA EMBALAGEM.
	 * @param text5 - variável que armazena o PESO DA EMBALAGEM.
	 */
	public void setPeso(String text5) {
		this.peso = text5;
	}

	
	/**
	 * Método que recebe a OBSERVAÇÃO.
	 * @return - retorna a OBSERVAÇÃO.
	 */
	public String getObservacao() {
		return observacao;
	}
	
	/**
	 * Método que define a OBSERVAÇÃO.
	 * @param text6 - variável que armazena a OBSERVAÇÃO.
	 */
	public void setObservacao(String text6) {
		this.observacao = text6;
	}

	
	/**
	 * Método que recebe o TIPO DE APLICAÇÃO.
	 * @return - retorna o TIPO DE APLICAÇÃO.
	 */
	public String getTipoAplicacao() {
		return tipoAplicacao;
	}
	
	/**
	 * Método que define o TIPO DE APLICAÇÃO.
	 * @param text7 - variável que armazena o TIPO DE APLICAÇÃO.
	 */
	public void setTipoAplicacao(String text7) {
		this.tipoAplicacao = text7;
	}

	
	/**
	 * Método que recebe a CLASSIICAÇÃO.
	 * @return - retorna a CLASSIICAÇÃO.
	 */
	public String getClassificacao() {
		return classificacao;
	}
	
	/**
	 * Método que define a CLASSIICAÇÃO.
	 * @param text8 - variável que armazena a CLASSIICAÇÃO.
	 */
	public void setClassificacao(String text8) {
		this.classificacao = text8;
	}
	
}
