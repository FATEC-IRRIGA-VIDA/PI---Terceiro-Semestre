package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setTitle("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelSI = new JLabel("Sistema de Irriga\u00E7\u00E3o");
		labelSI.setForeground(new Color(255, 255, 255));
		labelSI.setHorizontalAlignment(SwingConstants.CENTER);
		labelSI.setFont(new Font("Arial", Font.BOLD, 14));
		labelSI.setBounds(256, 11, 168, 25);
		contentPane.add(labelSI);
		
		JLabel labelLogo = new JLabel("New label");
		labelLogo.setIcon(new ImageIcon("C:\\Users\\Mateus Acer\\Desktop\\App_Study\\Irriga Vida - Sistema de Irrigacao\\Logo.JPG"));
		labelLogo.setBackground(new Color(0, 128, 0));
		labelLogo.setBounds(52, 71, 161, 166);
		contentPane.add(labelLogo);
		
		JButton btSair = new JButton("Sair");
		btSair.setForeground(Color.WHITE);
		btSair.setFont(new Font("Arial", Font.BOLD, 12));
		btSair.setBackground(new Color(0, 128, 0));
		btSair.setBounds(28, 267, 89, 23);
		contentPane.add(btSair);
		
		JButton btCadastros = new JButton("Cadastros");
		btCadastros.setForeground(Color.WHITE);
		btCadastros.setFont(new Font("Arial", Font.BOLD, 12));
		btCadastros.setBackground(new Color(0, 128, 0));
		btCadastros.setBounds(271, 94, 138, 25);
		contentPane.add(btCadastros);
		
		JButton btRelatorios = new JButton("Relat\u00F3rios");
		btRelatorios.setForeground(Color.WHITE);
		btRelatorios.setFont(new Font("Arial", Font.BOLD, 12));
		btRelatorios.setBackground(new Color(0, 128, 0));
		btRelatorios.setBounds(271, 130, 138, 25);
		contentPane.add(btRelatorios);
		
		JButton btConfiguracoes = new JButton("Configura\u00E7\u00F5es");
		btConfiguracoes.setForeground(Color.WHITE);
		btConfiguracoes.setFont(new Font("Arial", Font.BOLD, 12));
		btConfiguracoes.setBackground(new Color(0, 128, 0));
		btConfiguracoes.setBounds(271, 166, 138, 25);
		contentPane.add(btConfiguracoes);
	}

}
