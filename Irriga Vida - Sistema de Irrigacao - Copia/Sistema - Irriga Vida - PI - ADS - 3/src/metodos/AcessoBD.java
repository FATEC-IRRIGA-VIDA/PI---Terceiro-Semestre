package metodos;

import java.sql.*; // Seleciona todos os imports necessários, Contém classes e interfaces utilizadas no acesso e manipulação de dados via JDBC.

public class AcessoBD {

	// Realiza a conexão ao BD por meio do driver do banco.
	public Connection con = null;
	
	// Realiza a execução de instruções SQL.
	public PreparedStatement st = null;
	
	// Maniupula uma tabela em memória.
	public ResultSet rs = null;
	
	// Pacote.Classe do driver
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // especifica o caminho em que está o driver. 
	private final String DATABASENAME = "DB_IRRIGA_VIDA"; // nome do banco de dados ques está sendo acessado.
	private final String URL ="jdbc:sqlserver://localhost:1433;databasename=" + DATABASENAME ; // direciona a porta que é usado para a conexão ao BD.
	private final String LOGIN ="sa"; // nome do LOGIN que está sendo acessado.
	private final String PASSWORD ="Sqlshadow"; // senha do LOGIN que está sendo acessado.
	
	/***
	 * Realiza a conexão ao banco de dados
	 * @return - true em caso de sucesso ou false caso contrário
	 */
	public boolean getConnection() {
		try {
			Class.forName(DRIVER); // carregando o DRIVER
			//System.out.println("Driver carregado com sucesso !!!"); // retorno de carregamento.
			con = DriverManager.getConnection(URL,LOGIN,PASSWORD); // fornecendo os parâmetros de acesso do BD.
			System.out.println("Conectado com sucesso!"); // retorno de conexão.
			System.out.println("\n");
			return true;
			}
		catch(ClassNotFoundException erro) {
			System.out.println("Driver não encontrado !!!"); // retorno do DRIVER ausente.
			return false;
		}
		catch(SQLException erro) {
			System.out.println("Falha na conexão" + erro); // retorno de falha de conexão com o BD.
			return false;
		}
	}
	
	/***
	 * Encerra a conexão ao banco de dados, fechando todos objetos utilizados.
	 */
	public void close() {
		try {
			if(rs!=null) rs.close(); // Encerra o ResultSet na ausência de valores.
			if(st!=null) st.close(); // Encerra o PreparedStatement senão houve execução de instruções.
			if(con!=null) {
				con.close(); // encerra a conexão ao BD.
				System.out.println("\n");
				System.out.println("Conexão ao Banco de Dados encerrada...");
			}
		}
		catch(SQLException erro){}
	}
	
	public static void main(String[] args) {
		
		AcessoBD bd = new AcessoBD();
		bd.getConnection();
		//executar uma instrução
		bd.close();
	}
}
