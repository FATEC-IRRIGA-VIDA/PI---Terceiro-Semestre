package metodos;

import javax.swing.JOptionPane;

public class MetodoLogin {

	private String loginV;
	private String senhaV;
	private String validado;
	private int tamanhoSenha;
	private String validado2;
	
	public String checarLogin(String login, String senha) {
		
		
		loginV = login;
		senhaV = senha;
		
		if (loginV.equals("mateus")&&senhaV.equals("mateus2021"))
			validado = "Acesso Concedido!";
		else 
			validado = "Acesso Negado! Tente novamente.";
		return validado;
	}
	
	public void tamanhoSenha(String senha) {
		
		tamanhoSenha = senha.length();
		
		if (tamanhoSenha<8)
			{
				validado2 = "A senha deve ter no min�mo 8 caracteres";
				JOptionPane.showMessageDialog(null, validado2);
			}
	}
	
	public void mostrar() {
		System.out.println("Login: " + loginV);
		System.out.println("Senha: " + senhaV);
		JOptionPane.showMessageDialog(null, validado);
	}
}
