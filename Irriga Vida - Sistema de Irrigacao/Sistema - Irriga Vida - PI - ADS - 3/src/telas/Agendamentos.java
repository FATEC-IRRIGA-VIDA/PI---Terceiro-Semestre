package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import metodos.DocumentoLimitado;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Agendamentos extends JFrame {

	private JPanel contentPane;
	private JTextField textDescricaoAgendamento;
	private JTextField textCodUsuario;
	private JTextField textCodAgendamento;
	public static Cadastros tela3;
	public static Agendamentos tela9;
	private JTextField textCodEquipamento;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agendamentos frame = new Agendamentos();
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
	public Agendamentos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Agendamentos");
		setBounds(100, 100, 1050, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelSI = new JLabel("Sistema de Irriga\u00E7\u00E3o");
		labelSI.setHorizontalAlignment(SwingConstants.CENTER);
		labelSI.setForeground(Color.WHITE);
		labelSI.setFont(new Font("Arial", Font.BOLD, 14));
		labelSI.setBackground(Color.WHITE);
		labelSI.setBounds(122, 11, 168, 25);
		contentPane.add(labelSI);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btSair.setForeground(Color.WHITE);
		btSair.setFont(new Font("Arial", Font.BOLD, 12));
		btSair.setBackground(new Color(0, 128, 0));
		btSair.setBounds(10, 488, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela3 = new Cadastros();
				tela3.setVisible(true);
				Cadastros.tela9.setVisible(false);
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(942, 488, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel labelDataPrevista = new JLabel("Data Prevista");
		labelDataPrevista.setForeground(Color.WHITE);
		labelDataPrevista.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDataPrevista.setBounds(202, 439, 132, 14);
		contentPane.add(labelDataPrevista);
		
		textDescricaoAgendamento = new JTextField();
		textDescricaoAgendamento.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textDescricaoAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		textDescricaoAgendamento.setColumns(10);
		textDescricaoAgendamento.setBounds(202, 328, 488, 20);
		contentPane.add(textDescricaoAgendamento);
		
		JLabel labelDescricaoAgendamento = new JLabel("Descri\u00E7\u00E3o do Agendamento");
		labelDescricaoAgendamento.setForeground(Color.WHITE);
		labelDescricaoAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDescricaoAgendamento.setBounds(200, 305, 183, 14);
		contentPane.add(labelDescricaoAgendamento);
		
		textCodUsuario = new JTextField();
		//textCodUsuario.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodUsuario.setColumns(10);
		textCodUsuario.setBounds(34, 385, 132, 20);
		contentPane.add(textCodUsuario);
		
		JLabel labelCodUsuario = new JLabel("C\u00F3digo do Usu\u00E1rio");
		labelCodUsuario.setForeground(Color.WHITE);
		labelCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodUsuario.setBounds(34, 360, 132, 14);
		contentPane.add(labelCodUsuario);
		
		textCodAgendamento = new JTextField();
		//textCodAgendamento.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textCodAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodAgendamento.setColumns(10);
		textCodAgendamento.setBounds(34, 330, 140, 20);
		contentPane.add(textCodAgendamento);
		
		JLabel labelCodAgendamento = new JLabel("C\u00F3digo do Agendamento");
		labelCodAgendamento.setForeground(Color.WHITE);
		labelCodAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodAgendamento.setBounds(34, 305, 168, 14);
		contentPane.add(labelCodAgendamento);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(796, 343, 101, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpando dados inseridos nas textboxs.
				textCodAgendamento.setText("");
				textCodUsuario.setText("");
				textDescricaoAgendamento.setText("");
				textCodEquipamento.setText("");
				
			}
		});
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(796, 383, 101, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(909, 343, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btCancelar.setBackground(new Color(0, 128, 0));
		btCancelar.setBounds(909, 383, 122, 25);
		contentPane.add(btCancelar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(796, 300, 235, 25);
		contentPane.add(btNovoCadastro);
		
		JLabel labelStatus = new JLabel("Status");
		labelStatus.setForeground(Color.WHITE);
		labelStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		labelStatus.setBounds(202, 389, 132, 14);
		contentPane.add(labelStatus);
		
		JDateChooser dateChooserDataPrevista = new JDateChooser();
		dateChooserDataPrevista.setBounds(292, 433, 168, 20);
		contentPane.add(dateChooserDataPrevista);
		
		JComboBox ComboBoxStatusAgendamento = new JComboBox();
		ComboBoxStatusAgendamento.setModel(new DefaultComboBoxModel(new String[] {"Efetuado", "Pendente", "Cancelado"}));
		ComboBoxStatusAgendamento.setBounds(257, 385, 140, 22);
		contentPane.add(ComboBoxStatusAgendamento);
		
		JLabel labelCodEquipamento = new JLabel("C\u00F3digo do Equipamento ");
		labelCodEquipamento.setForeground(Color.WHITE);
		labelCodEquipamento.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodEquipamento.setBounds(34, 416, 183, 14);
		contentPane.add(labelCodEquipamento);
		
		textCodEquipamento = new JTextField();
		//textCodEquipamento.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textCodEquipamento.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodEquipamento.setColumns(10);
		textCodEquipamento.setBounds(36, 439, 130, 20);
		contentPane.add(textCodEquipamento);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 1016, 232);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel labelStatus_1 = new JLabel("Status");
		labelStatus_1.setForeground(Color.WHITE);
		labelStatus_1.setFont(new Font("Arial", Font.PLAIN, 12));
		labelStatus_1.setBounds(427, 389, 132, 14);
		contentPane.add(labelStatus_1);
		
		JComboBox ComboBoxStatusAgendamento_1 = new JComboBox();
		ComboBoxStatusAgendamento_1.setBounds(482, 385, 140, 22);
		contentPane.add(ComboBoxStatusAgendamento_1);
		
		JButton btNovoCadastro_1 = new JButton("Novo Cadastro");
		btNovoCadastro_1.setForeground(Color.WHITE);
		btNovoCadastro_1.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro_1.setBackground(new Color(0, 128, 0));
		btNovoCadastro_1.setBounds(796, 13, 235, 25);
		contentPane.add(btNovoCadastro_1);
	}
}
