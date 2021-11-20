package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;

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
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 247);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textLogin = new JTextField();
		textLogin.setFont(new Font("Arial", Font.PLAIN, 12));
		textLogin.setBounds(232, 47, 130, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		textSenha.setColumns(10);
		textSenha.setBounds(232, 96, 130, 20);
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
		
		JButton btConectar = new JButton("Conectar");
		btConectar.setForeground(new Color(255, 255, 255));
		btConectar.setBackground(new Color(0, 128, 0));
		btConectar.setFont(new Font("Arial", Font.BOLD, 12));
		btConectar.setBounds(250, 156, 89, 23);
		contentPane.add(btConectar);
		
		JLabel labelLogo = new JLabel("New label");
		labelLogo.setBackground(new Color(0, 128, 0));
		labelLogo.setIcon(new ImageIcon("C:\\Users\\Mateus Acer\\Desktop\\App_Study\\Irriga Vida - Sistema de Irrigacao\\Logo.JPG"));
		labelLogo.setBounds(10, 11, 161, 166);
		contentPane.add(labelLogo);
	}
}
