package metodos_projeto;

public class Plantio {

	public int id;
	private String tempirrigui;
	private Planta idplanta;
	private String dtIniPlantio;
	private double metragem;
	private int qtdeSemente;
	private String tipoAdubo;
	private String dtFimPlantio;
	private String dtIniColheita;
	private String dtFimColheita;
	private char tipo;
	private Fertilizante idFertilizante;
	
	/***
	 *  Método que irá realizar as operações do sistema á respeito aos Plantios (Cadastrar, Editar, Excluir, Consultar) 
	 */
	private void manterPlantio() {
		
		// Lógica ainda a ser implementada
	}
	
	/***
	 * Método que irá receber o id de uma planta e buscar na classe Planta
	 * @param idPlanta - id de uma determinada planta
	 * @return - retorna a planta correspondente
	 */
	private Planta buscarPlanta(int idPlanta) {
		return null;
		
		// Lógica ainda a ser implementada
	}
	
	/***
	 * Método que irá receber o id de um fertilizante e buscar na classe Fertilizante
	 * @param idFertilizante - id de um determinado fertilizante
	 * @return - retorna o fertilizante correspondente
	 */
	private Fertilizante buscarFertilizante(int idFertilizante) {
		return null;
		
		// Lógica ainda a ser implementada
	}
}
