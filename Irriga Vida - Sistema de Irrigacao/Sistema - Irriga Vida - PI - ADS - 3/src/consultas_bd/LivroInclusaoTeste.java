package consultas_bd;

public class LivroInclusaoTeste {

	public static void main(String[] args) {
		
		Book livro = new Book("008","C#2",43.89); // Atribuindo valores a partir do Construtor para o objeto livro.
		
		BookDAO dao = new BookDAO(); // instanciando um objeto da classe BookDAO para executar uma ação.
		
		System.out.println(dao.gravar(livro));
		//System.out.println(dao.incluir(livro));
		
		//dao.preencherDados(); // Alocando dados ao objeto criado da Classe BookDAO.
		
	}
}
