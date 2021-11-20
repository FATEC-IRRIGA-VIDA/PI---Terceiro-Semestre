package consultas_bd;

public class Book {

	// Criação da Classe semelhante aos elementos na Tabela do Banco de Dados.
	private String isbn, titulo;
	private double preco;
	
	public String toString() {
		return isbn + "," + titulo + "," + preco;
	}
	
	// Métodos Construtores 
	public Book() {
		
	}
	
	public Book(String isbn, String titulo, double preco) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
	}

	// Getters and Setters dos elementos
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
}
