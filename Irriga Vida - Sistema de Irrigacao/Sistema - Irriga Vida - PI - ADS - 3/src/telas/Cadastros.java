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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastros extends JFrame {

	private JPanel contentPane;
	public static TelaInicial tela2;
	public static Cadastros tela3;
	public static Usuarios tela4;
	public static CadastroPlanta tela5;
	public static Plantio tela6;
	public static Composicao tela7;
	public static Fertilizante tela8;
	public static Agendamento tela9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastros frame = new Cadastros();
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
	public Cadastros() {
		setTitle("Cadastros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 561, 349);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelSI = new JLabel("Sistema de Irriga\u00E7\u00E3o");
		labelSI.setForeground(new Color(255, 255, 255));
		labelSI.setBackground(new Color(255, 255, 255));
		labelSI.setHorizontalAlignment(SwingConstants.CENTER);
		labelSI.setFont(new Font("Arial", Font.BOLD, 14));
		labelSI.setBounds(256, 11, 168, 25);
		contentPane.add(labelSI);
		
		JLabel labelLogo = new JLabel("New label");
		labelLogo.setIcon(new ImageIcon("C:\\Users\\Mateus Acer\\Desktop\\App_Study\\Irriga Vida - Sistema de Irrigacao\\Logo.JPG"));
		labelLogo.setBackground(new Color(0, 128, 0));
		labelLogo.setBounds(10, 72, 161, 166);
		contentPane.add(labelLogo);
		
		JButton btUsuarios = new JButton("1. Usu\u00E1rios");
		btUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela4 = new Usuarios();
				tela4.setVisible(true);
				Usuarios.tela3.setVisible(false);
				
			}
		});
		btUsuarios.setForeground(Color.WHITE);
		btUsuarios.setFont(new Font("Arial", Font.BOLD, 12));
		btUsuarios.setBackground(new Color(0, 128, 0));
		btUsuarios.setBounds(194, 95, 138, 25);
		contentPane.add(btUsuarios);
		
		JButton btPlanta = new JButton("2. Planta");
		btPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela5 = new CadastroPlanta();
				tela5.setVisible(true);
				CadastroPlanta.tela3.setVisible(false);
			}
		});
		btPlanta.setForeground(Color.WHITE);
		btPlanta.setFont(new Font("Arial", Font.BOLD, 12));
		btPlanta.setBackground(new Color(0, 128, 0));
		btPlanta.setBounds(194, 131, 138, 25);
		contentPane.add(btPlanta);
		
		JButton btPlantio = new JButton("3. Plantio");
		btPlantio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela6 = new Plantio();
				tela6.setVisible(true);
				Plantio.tela3.setVisible(false);
			}
		});
		btPlantio.setForeground(Color.WHITE);
		btPlantio.setFont(new Font("Arial", Font.BOLD, 12));
		btPlantio.setBackground(new Color(0, 128, 0));
		btPlantio.setBounds(194, 171, 138, 25);
		contentPane.add(btPlantio);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btSair.setForeground(Color.WHITE);
		btSair.setFont(new Font("Arial", Font.BOLD, 12));
		btSair.setBackground(new Color(0, 128, 0));
		btSair.setBounds(28, 267, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela2 = new TelaInicial();
				tela2.setVisible(true);
				TelaInicial.tela3.setVisible(false);
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(434, 267, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel labelCadastros = new JLabel("CADASTROS");
		labelCadastros.setForeground(new Color(255, 255, 255));
		labelCadastros.setBackground(new Color(255, 255, 255));
		labelCadastros.setHorizontalAlignment(SwingConstants.CENTER);
		labelCadastros.setFont(new Font("Arial", Font.BOLD, 14));
		labelCadastros.setBounds(3, 36, 168, 25);
		contentPane.add(labelCadastros);
		
		JButton btComposicao = new JButton("4. Composi\u00E7\u00E3o");
		btComposicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela7 = new Composicao();
				tela7.setVisible(true);
				Composicao.tela3.setVisible(false);
			}
		});
		btComposicao.setForeground(Color.WHITE);
		btComposicao.setFont(new Font("Arial", Font.BOLD, 12));
		btComposicao.setBackground(new Color(0, 128, 0));
		btComposicao.setBounds(361, 95, 138, 25);
		contentPane.add(btComposicao);
		
		JButton btFertilizantes = new JButton("5. Fertilizantes");
		btFertilizantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela8 = new Fertilizante();
				tela8.setVisible(true);
				Fertilizante.tela3.setVisible(false);
			}
		});
		btFertilizantes.setForeground(Color.WHITE);
		btFertilizantes.setFont(new Font("Arial", Font.BOLD, 12));
		btFertilizantes.setBackground(new Color(0, 128, 0));
		btFertilizantes.setBounds(361, 131, 138, 25);
		contentPane.add(btFertilizantes);
		
		JButton btAgendamentos = new JButton("6. Agendamentos");
		btAgendamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela9 = new Agendamento();
				tela9.setVisible(true);
				Agendamento.tela3.setVisible(false);
			}
		});
		btAgendamentos.setForeground(Color.WHITE);
		btAgendamentos.setFont(new Font("Arial", Font.BOLD, 12));
		btAgendamentos.setBackground(new Color(0, 128, 0));
		btAgendamentos.setBounds(361, 172, 138, 25);
		contentPane.add(btAgendamentos);
	}

}
