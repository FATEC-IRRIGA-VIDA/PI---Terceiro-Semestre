package metodos;

import java.awt.Window;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import telas.TelaInicial;
import telas_usuario.CadastrosUsuario;

public class MetodoLogin {

	private String loginV;
	private String senhaV;
	private String validado;
	private int tamanhoSenha;
	private String validado2;
	public static TelaInicial tela2;
	public static CadastrosUsuario tela13;
	
	/**
	 * M?todo que checa o login do usu?rio por meio do Login e Senha.
	 * @param login - vari?vel que recebe o login digitado.
	 * @param senha - vari?vel que recebe a senha digitada.
	 * @return - retorna o status da valida??o
	 */
	public String checarLogin(String login, String senha) {
		
		
		loginV = login;
		senhaV = senha;
		
		if (loginV.equals("mateus")&&senhaV.equals("mateus2021"))
		{
			validado = "Acesso Concedido!";
			TelaInicial tela2 = new TelaInicial();
			tela2.setVisible(true);
		}
		
		else if (loginV.equals("alice")&&senhaV.equals("alice2021"))
		{
			validado = "Acesso Concedido!";
			CadastrosUsuario tela13 = new CadastrosUsuario();
			tela13.setVisible(true);
		}
		
		else if (loginV.equals("lucas")&&senhaV.equals("lucas2021"))
		{
			validado = "Acesso Concedido!";
			TelaInicial tela2 = new TelaInicial();
			tela2.setVisible(true);
		}
		
		else if (loginV.equals("fabricia")&&senhaV.equals("fabricia2021"))
		{
			validado = "Acesso Concedido!";
			TelaInicial tela2 = new TelaInicial();
			tela2.setVisible(true);
		}
		
		else 
			validado = "Acesso Negado! Tente novamente.";
		return validado;
	}
	
	/***
	 * M?todo que valida se a senha inserida possui o valor m?nimo de caracteres.
	 * @param senha - vari?vel que recebe a senha digitada.
	 */
	public void tamanhoSenha(String senha) {
		
		tamanhoSenha = senha.length();
		
		if (tamanhoSenha<8)
			{
				validado2 = "A senha deve ter no min?mo 8 caracteres";
				JOptionPane.showMessageDialog(null, validado2);
			}
	}
	
	/***
	 * M?todo que mostra as informa??es validadas na tela.
	 */
	public void mostrar() {
		System.out.println("Login: " + loginV);
		System.out.println("Senha: " + senhaV);
		JOptionPane.showMessageDialog(null, validado);
	}
}
