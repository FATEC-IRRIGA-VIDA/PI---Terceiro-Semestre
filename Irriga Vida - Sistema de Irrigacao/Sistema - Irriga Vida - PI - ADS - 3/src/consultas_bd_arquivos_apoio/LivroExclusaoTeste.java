package consultas_bd_arquivos_apoio;

public class LivroExclusaoTeste {

	public static void main(String[] args) {
		
		BookDAO dao = new BookDAO(); // instanciando um objeto da classe BookDAO para executar uma a��o.
		System.out.println(dao.excluir("001")); // Executando a exclus�o do dado informado.
	}
}
