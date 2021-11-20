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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Composicao extends JFrame {

	private JPanel contentPane;
	private JTextField textPorcentagem;
	private JTextField textNomeComposicao;
	private JTextField textCodFertilizante;
	private JTextField textCodComposicao;
	public static Cadastros tela3;
	public static Composicao tela7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Composicao frame = new Composicao();
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
	public Composicao() {
		setTitle("Composi\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 795, 456);
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
		labelSI.setBounds(139, 22, 168, 25);
		contentPane.add(labelSI);
		
		JEditorPane dtrpnA = new JEditorPane();
		dtrpnA.setBackground(Color.LIGHT_GRAY);
		dtrpnA.setBounds(10, 58, 455, 305);
		contentPane.add(dtrpnA);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btSair.setForeground(Color.WHITE);
		btSair.setFont(new Font("Arial", Font.BOLD, 12));
		btSair.setBackground(new Color(0, 128, 0));
		btSair.setBounds(37, 385, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela3 = new Cadastros();
				tela3.setVisible(true);
				Cadastros.tela7.setVisible(false);
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(686, 385, 89, 23);
		contentPane.add(btVoltar);
		
		textPorcentagem = new JTextField();
		textPorcentagem.setFont(new Font("Arial", Font.PLAIN, 12));
		textPorcentagem.setColumns(10);
		textPorcentagem.setBounds(477, 289, 152, 20);
		contentPane.add(textPorcentagem);
		
		JLabel labelPorcentagem = new JLabel("Porcentagem");
		labelPorcentagem.setForeground(Color.WHITE);
		labelPorcentagem.setFont(new Font("Arial", Font.PLAIN, 12));
		labelPorcentagem.setBounds(475, 266, 132, 14);
		contentPane.add(labelPorcentagem);
		
		textNomeComposicao = new JTextField();
		textNomeComposicao.setFont(new Font("Arial", Font.PLAIN, 12));
		textNomeComposicao.setColumns(10);
		textNomeComposicao.setBounds(475, 226, 152, 20);
		contentPane.add(textNomeComposicao);
		
		JLabel labelNomeComposicao = new JLabel("Nome Composi\u00E7\u00E3o");
		labelNomeComposicao.setForeground(Color.WHITE);
		labelNomeComposicao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNomeComposicao.setBounds(475, 203, 132, 14);
		contentPane.add(labelNomeComposicao);
		
		textCodFertilizante = new JTextField();
		textCodFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodFertilizante.setColumns(10);
		textCodFertilizante.setBounds(475, 160, 152, 20);
		contentPane.add(textCodFertilizante);
		
		JLabel labelCodFertilizante = new JLabel("C\u00F3digo Fertilizante");
		labelCodFertilizante.setForeground(Color.WHITE);
		labelCodFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodFertilizante.setBounds(475, 131, 132, 14);
		contentPane.add(labelCodFertilizante);
		
		textCodComposicao = new JTextField();
		textCodComposicao.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodComposicao.setColumns(10);
		textCodComposicao.setBounds(475, 87, 152, 20);
		contentPane.add(textCodComposicao);
		
		JLabel labelCodComposicao = new JLabel("C\u00F3digo Composi\u00E7\u00E3o");
		labelCodComposicao.setForeground(Color.WHITE);
		labelCodComposicao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodComposicao.setBounds(475, 58, 132, 14);
		contentPane.add(labelCodComposicao);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(637, 82, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(637, 124, 122, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(637, 160, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btCancelar.setBackground(new Color(0, 128, 0));
		btCancelar.setBounds(637, 196, 122, 25);
		contentPane.add(btCancelar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(637, 232, 122, 25);
		contentPane.add(btNovoCadastro);
	}

}
