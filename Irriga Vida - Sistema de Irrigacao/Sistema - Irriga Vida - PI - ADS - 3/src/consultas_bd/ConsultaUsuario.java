package consultas_bd;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import metodos.AcessoBD;

public class ConsultaUsuario {

	public static void main(String[] args) {
		
		AcessoBD bd = new AcessoBD();
		if(bd.getConnection()){ 
			String sql ="select * from TB_USUARIO"; // instrução executada no banco de dados.
			try {
				bd.st = bd.con.prepareStatement(sql); // preparar a instrução para ser executada.
				bd.rs = bd.st.executeQuery(); // Obtém a posicao BOF da tabela e executa a Consulta.
				while(bd.rs.next()) { // enquanto existir o próximo registro
				System.out.println(bd.rs.getString("id_usuario") +  " - " + bd.rs.getString("NOME_USUARIO") +
				" - " + bd.rs.getString("SENHA_USU"));
				//System.out.println(bd.rs.getInt("id_usuario") + " - " + bd.rs.getString("nome"));
				
				
				//INSERT INTO TB_USUARIO(NOME_USUARIO, SENHA_USU,DT_CADASTRO_USU,EMAIL_USU,STATUS_USUARIO)
				//VALUES('ALICE','ADM123','02/10/2021','alice.alves@fatec.sp.gov.br','A');

				//System.out.println(bd.rs.getInt(1) + " - " + bd.rs.getString(2));
				}
			}
			catch(SQLException erro) { 
				System.out.println(erro); // mostra o erro encontrado quando tentou a conexão.
			}
			finally {
				bd.close(); // encerra a conexão ao BD.
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Falha na conexão com o BD!"); // retorna a mensagem de falha de conexão ao BD.
		}
	}
}




