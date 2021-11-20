package telas_usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import telas.Agendamentos;
import telas.Equipamentos;
import telas.Fertilizantes;
import telas.Plantas;
import telas.Plantios;
import telas.Tarefas;

public class CadastrosUsuario extends JFrame {

	private JPanel contentPane;
	public static CadastrosUsuario tela13;
	public static PlantasUsuario tela14;
	public static PlantiosUsuario tela15;
	public static TarefasUsuario tela16;
	public static FertilizantesUsuario tela17;
	public static EquipamentosUsuario tela18;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrosUsuario frame = new CadastrosUsuario();
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
	public CadastrosUsuario() {
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
		//labelLogo.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\Irriga Vida - Sistema de Irrigacao\\Logo.JPG"));
		labelLogo.setBackground(new Color(0, 128, 0));
		labelLogo.setBounds(10, 72, 161, 166);
		contentPane.add(labelLogo);
		
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
		
		JLabel labelCadastros = new JLabel("CADASTROS");
		labelCadastros.setForeground(new Color(255, 255, 255));
		labelCadastros.setBackground(new Color(255, 255, 255));
		labelCadastros.setHorizontalAlignment(SwingConstants.CENTER);
		labelCadastros.setFont(new Font("Arial", Font.BOLD, 14));
		labelCadastros.setBounds(3, 36, 168, 25);
		contentPane.add(labelCadastros);
		
		JButton btnPlantas = new JButton("1. Plantas");
		btnPlantas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela14 = new PlantasUsuario();
				tela14.setVisible(true);
				PlantasUsuario.tela13.setVisible(false);
				
			}
		});
		btnPlantas.setForeground(Color.WHITE);
		btnPlantas.setFont(new Font("Arial", Font.BOLD, 12));
		btnPlantas.setBackground(new Color(0, 128, 0));
		btnPlantas.setBounds(206, 72, 138, 25);
		contentPane.add(btnPlantas);
		
		JButton btnPlantios = new JButton("2. Plantios");
		btnPlantios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela15 = new PlantiosUsuario();
				tela15.setVisible(true);
				PlantiosUsuario.tela13.setVisible(false);
				
			}
		});
		btnPlantios.setForeground(Color.WHITE);
		btnPlantios.setFont(new Font("Arial", Font.BOLD, 12));
		btnPlantios.setBackground(new Color(0, 128, 0));
		btnPlantios.setBounds(206, 108, 138, 25);
		contentPane.add(btnPlantios);
		
		JButton btnTarefas = new JButton("3. Tarefas");
		btnTarefas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela16 = new TarefasUsuario();
				tela16.setVisible(true);
				TarefasUsuario.tela13.setVisible(false);
				
			}
		});
		btnTarefas.setForeground(Color.WHITE);
		btnTarefas.setFont(new Font("Arial", Font.BOLD, 12));
		btnTarefas.setBackground(new Color(0, 128, 0));
		btnTarefas.setBounds(206, 149, 138, 25);
		contentPane.add(btnTarefas);
		
		JButton btnFertilizantes = new JButton("4. Fertilizantes");
		btnFertilizantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela17 = new FertilizantesUsuario();
				tela17.setVisible(true);
				FertilizantesUsuario.tela13.setVisible(false);
				
			}
		});
		btnFertilizantes.setForeground(Color.WHITE);
		btnFertilizantes.setFont(new Font("Arial", Font.BOLD, 12));
		btnFertilizantes.setBackground(new Color(0, 128, 0));
		btnFertilizantes.setBounds(373, 72, 138, 25);
		contentPane.add(btnFertilizantes);
		
		JButton btnEquipamentos = new JButton("5. Equipamentos");
		btnEquipamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela18 = new EquipamentosUsuario();
				tela18.setVisible(true);
				EquipamentosUsuario.tela13.setVisible(false);
				
			}
		});
		btnEquipamentos.setForeground(Color.WHITE);
		btnEquipamentos.setFont(new Font("Arial", Font.BOLD, 12));
		btnEquipamentos.setBackground(new Color(0, 128, 0));
		btnEquipamentos.setBounds(373, 108, 138, 25);
		contentPane.add(btnEquipamentos);
	}
}
