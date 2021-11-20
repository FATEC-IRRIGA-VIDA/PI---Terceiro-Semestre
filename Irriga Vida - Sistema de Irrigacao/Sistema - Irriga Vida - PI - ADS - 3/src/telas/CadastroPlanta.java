package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.DocumentoLimitado;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPlanta extends JFrame {

	private JPanel contentPane;
	private JTextField textPlanta;
	private JTextField textNomePlanta;
	private JTextField textNomeCientifico;
	private JTextField textOrigem;
	private JTextField textFamilia;
	public static Cadastros tela3;
	public static CadastroPlanta tela5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPlanta frame = new CadastroPlanta();
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
	public CadastroPlanta() {
		setTitle("Cadastro de Plantas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 796, 443);
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
		
		JEditorPane dtrpnA = new JEditorPane();
		dtrpnA.setBackground(Color.LIGHT_GRAY);
		dtrpnA.setBounds(10, 47, 438, 305);
		contentPane.add(dtrpnA);
		
		JLabel labelCodPlanta = new JLabel("C\u00F3digo da Planta");
		labelCodPlanta.setForeground(Color.WHITE);
		labelCodPlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodPlanta.setBounds(458, 47, 132, 14);
		contentPane.add(labelCodPlanta);
		
		textPlanta = new JTextField();
		//textPlanta.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textPlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		textPlanta.setColumns(10);
		textPlanta.setBounds(458, 76, 152, 20);
		contentPane.add(textPlanta);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(620, 71, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpando dados inseridos nas textboxs.
				textPlanta.setText("");
				textNomePlanta.setText("");
				textNomeCientifico.setText("");
				textOrigem.setText("");
				textFamilia.setText("");
			}
		});
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(620, 113, 122, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(620, 149, 122, 25);
		contentPane.add(btAtualizar);
		
		textNomePlanta = new JTextField();
		textNomePlanta.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textNomePlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		textNomePlanta.setColumns(10);
		textNomePlanta.setBounds(458, 149, 152, 20);
		contentPane.add(textNomePlanta);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btCancelar.setBackground(new Color(0, 128, 0));
		btCancelar.setBounds(620, 185, 122, 25);
		contentPane.add(btCancelar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(620, 221, 122, 25);
		contentPane.add(btNovoCadastro);
		
		textNomeCientifico = new JTextField();
		textNomeCientifico.setDocument( new DocumentoLimitado(50) ); //definindo o tamanho do campo
		textNomeCientifico.setFont(new Font("Arial", Font.PLAIN, 12));
		textNomeCientifico.setColumns(10);
		textNomeCientifico.setBounds(458, 215, 152, 20);
		contentPane.add(textNomeCientifico);
		
		textOrigem = new JTextField();
		textOrigem.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textOrigem.setFont(new Font("Arial", Font.PLAIN, 12));
		textOrigem.setColumns(10);
		textOrigem.setBounds(460, 278, 152, 20);
		contentPane.add(textOrigem);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btSair.setForeground(Color.WHITE);
		btSair.setFont(new Font("Arial", Font.BOLD, 12));
		btSair.setBackground(new Color(0, 128, 0));
		btSair.setBounds(20, 374, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela3 = new Cadastros();
				tela3.setVisible(true);
				Cadastros.tela5.setVisible(false);
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(669, 374, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel labelNomePlanta = new JLabel("Nome da Planta");
		labelNomePlanta.setForeground(Color.WHITE);
		labelNomePlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNomePlanta.setBounds(458, 120, 132, 14);
		contentPane.add(labelNomePlanta);
		
		JLabel labelNomeCientifico = new JLabel("Nome Cientifico");
		labelNomeCientifico.setForeground(Color.WHITE);
		labelNomeCientifico.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNomeCientifico.setBounds(458, 192, 132, 14);
		contentPane.add(labelNomeCientifico);
		
		JLabel labelOrigem = new JLabel("Origem");
		labelOrigem.setForeground(Color.WHITE);
		labelOrigem.setFont(new Font("Arial", Font.PLAIN, 12));
		labelOrigem.setBounds(458, 255, 132, 14);
		contentPane.add(labelOrigem);
		
		JLabel labelFamlia = new JLabel("Fam\u00EDlia");
		labelFamlia.setForeground(Color.WHITE);
		labelFamlia.setFont(new Font("Arial", Font.PLAIN, 12));
		labelFamlia.setBounds(458, 309, 132, 14);
		contentPane.add(labelFamlia);
		
		textFamilia = new JTextField();
		textFamilia.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textFamilia.setFont(new Font("Arial", Font.PLAIN, 12));
		textFamilia.setColumns(10);
		textFamilia.setBounds(458, 332, 152, 20);
		contentPane.add(textFamilia);
	}

}
