package telas_acesso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import consultas_bd_arquivos_apoio.MetodoLogin;
import metodos.AcessoBD;
import metodos.DocumentoLimitado;
import telas.TelaInicial;
import telas_usuario.CadastrosUsuario;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;
	private JComboBox ComboBoxPerfilAcesso;
	public static CadastrosUsuario tela13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Tela Login");
		setBounds(100, 100, 463, 245);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textLogin = new JTextField();
		textLogin.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textLogin.setFont(new Font("Arial", Font.PLAIN, 12));
		textLogin.setBounds(232, 47, 206, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setDocument( new DocumentoLimitado(12) ); //definindo o tamanho do campo
		textSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		textSenha.setColumns(8);
		textSenha.setBounds(232, 96, 206, 20);
		contentPane.add(textSenha);
		
		JLabel labelLogin = new JLabel("Login:");
		labelLogin.setForeground(new Color(255, 255, 255));
		labelLogin.setFont(new Font("Arial", Font.BOLD, 12));
		labelLogin.setBounds(187, 49, 76, 17);
		contentPane.add(labelLogin);
		
		JLabel labelSenha = new JLabel("Senha:");
		labelSenha.setForeground(new Color(255, 250, 240));
		labelSenha.setFont(new Font("Arial", Font.BOLD, 12));
		labelSenha.setBounds(186, 99, 46, 14);
		contentPane.add(labelSenha);
		
		//Bot?o Conectar ao Sistema
		JButton btConectar = new JButton("Conectar");
		btConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AcessoBD bd = new AcessoBD();
				if(bd.getConnection()){ 
					
					String sql ="select * from TB_USUARIO"; // instru??o executada no banco de dados.
					try {
						
						// Recebendo os valores inseridos.
						String login = textLogin.getText();
						String senha = textSenha.getText();
						
						//Definindo a vari?vel recebida na sele??o
						String statusPerfil; // PERFIL_USUARIO

						if(ComboBoxPerfilAcesso.getSelectedItem().equals("Administrador"))
							statusPerfil = "A";
						
						else if(ComboBoxPerfilAcesso.getSelectedItem().equals("Usuario"))
							statusPerfil = "U";
						
						else 
							statusPerfil = "X"; // valor aleat?rio n?o utilizado.
						
						int cont=0; // vari?vel de controle para as condi??es de leitura.
						
						bd.st = bd.con.prepareStatement(sql); // preparar a instru??o para ser executada.
						bd.rs = bd.st.executeQuery(); // Obt?m a posicao BOF da tabela e executa a Consulta.
						while(bd.rs.next()) { // enquanto existir o pr?ximo registro
						
						if (bd.rs.getString("NOME_USUARIO").equals(login)&&bd.rs.getString("SENHA_USU").equals(senha)&&
								bd.rs.getString("PERFIL_USUARIO").equals(statusPerfil)&&bd.rs.getString("STATUS_USUARIO").equals("A"))
							{
								
								if(bd.rs.getString("PERFIL_USUARIO").equals("A")) {
									
									JOptionPane.showMessageDialog(null, "Usu?rio encontrado!");
									
									// Chama a tela de op??es para o ADMINISTRADOR.
									TelaInicial tela2 = new TelaInicial();
									tela2.setVisible(true);
									cont=1; // vari?vel de controle para sair do la?o.
									
								}
								
								else
								{
									
									JOptionPane.showMessageDialog(null, "Usu?rio encontrado!");
									
									// Chama a tela de op??es para o USU?RIO.
									CadastrosUsuario tela13 = new CadastrosUsuario();
									tela13.setVisible(true);
									cont=1; // vari?vel de controle para sair do la?o.
									
								}
							}
						
						else if  (bd.rs.getString("NOME_USUARIO").equals(login)&&bd.rs.getString("SENHA_USU").equals(senha)&&
								bd.rs.getString("PERFIL_USUARIO").equals(statusPerfil)&&bd.rs.getString("STATUS_USUARIO").equals("I"))
							{
								JOptionPane.showMessageDialog(null, "Usu?rio Desativado, contacte o ADM!");
								cont=1; // vari?vel de controle para sair do la?o.
							}
						
						}
						
						if(cont==0) // Condi??o que indica erros nos dados informados ou Usu?rio indispon?vel.
							JOptionPane.showMessageDialog(null, "Verifique os dados, Usu?rio n?o encontrado!");
					}
					catch(SQLException erro) { 
						System.out.println(erro); // mostra o erro encontrado quando tentou a conex?o.
					}
					finally {
						bd.close(); // encerra a conex?o ao BD.
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Falha na conex?o com o BD!"); // retorna a mensagem de falha de conex?o ao BD.
				}
				
				/*MetodoLogin user01 = new MetodoLogin();
				
				user01.checarLogin(login, senha);
				user01.tamanhoSenha(senha);
				user01.mostrar();*/
				
			}
		});
		btConectar.setForeground(new Color(255, 255, 255));
		btConectar.setBackground(new Color(0, 128, 0));
		btConectar.setFont(new Font("Arial", Font.BOLD, 12));
		btConectar.setBounds(349, 169, 89, 23);
		contentPane.add(btConectar);
		
		JLabel labelLogo = new JLabel("New label");
		labelLogo.setBackground(new Color(0, 128, 0));
		labelLogo.setIcon(new ImageIcon("C:\\Users\\Mateus Acer\\Desktop\\App_Study\\Irriga Vida - Sistema de Irrigacao\\Logo.JPG"));
		//labelLogo.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\Irriga Vida - Sistema de Irrigacao\\Logo.JPG"));
		labelLogo.setBounds(10, 11, 161, 166);
		contentPane.add(labelLogo);
		
		JLabel labelPerfilAcesso = new JLabel("Perfil:");
		labelPerfilAcesso.setForeground(Color.WHITE);
		labelPerfilAcesso.setFont(new Font("Arial", Font.PLAIN, 12));
		labelPerfilAcesso.setBounds(187, 135, 132, 14);
		contentPane.add(labelPerfilAcesso);
		
		//JComboBox ComboBoxPerfilAcesso = new JComboBox();
		ComboBoxPerfilAcesso = new JComboBox();
		ComboBoxPerfilAcesso.setModel(new DefaultComboBoxModel(new String[] {"<Selecionar uma op\u00E7\u00E3o>", "Administrador", "Usuario"}));
		ComboBoxPerfilAcesso.setBounds(232, 127, 174, 31);
		contentPane.add(ComboBoxPerfilAcesso);
	}
}
