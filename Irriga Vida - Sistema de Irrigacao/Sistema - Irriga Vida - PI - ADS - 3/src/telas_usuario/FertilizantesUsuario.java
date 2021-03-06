package telas_usuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.DocumentoLimitado;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FertilizantesUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textPesoEmbalagem;
	private JTextField textMarcaFertilizante;
	private JTextField textTipoFertilizante;
	private JTextField textNomeFertilizante;
	private JTextField textCodFertilizante;
	private JTextField textObservacao;
	private JTextField textTipoDeAplicacao;
	private JTextField textClassificacao;
	public static FertilizantesUsuario tela17;
	public static CadastrosUsuario tela13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FertilizantesUsuario frame = new FertilizantesUsuario();
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
	public FertilizantesUsuario() {
		setTitle("Fertilizantes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 828, 561);
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
		dtrpnA.setBounds(10, 47, 438, 408);
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
		btSair.setBounds(10, 488, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela13 = new CadastrosUsuario();
				tela13.setVisible(true);
				CadastrosUsuario.tela17.setVisible(false);
				
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(692, 488, 89, 23);
		contentPane.add(btVoltar);
		
		textPesoEmbalagem = new JTextField();
		textPesoEmbalagem.setDocument( new DocumentoLimitado(4) ); //definindo o tamanho do campo
		textPesoEmbalagem.setFont(new Font("Arial", Font.PLAIN, 12));
		textPesoEmbalagem.setColumns(10);
		textPesoEmbalagem.setBounds(629, 117, 152, 20);
		contentPane.add(textPesoEmbalagem);
		
		JLabel labelPesoEmbalagem = new JLabel("Peso Embalagem");
		labelPesoEmbalagem.setForeground(Color.WHITE);
		labelPesoEmbalagem.setFont(new Font("Arial", Font.PLAIN, 12));
		labelPesoEmbalagem.setBounds(629, 92, 132, 14);
		contentPane.add(labelPesoEmbalagem);
		
		textMarcaFertilizante = new JTextField();
		textMarcaFertilizante.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textMarcaFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textMarcaFertilizante.setColumns(10);
		textMarcaFertilizante.setBounds(458, 225, 152, 20);
		contentPane.add(textMarcaFertilizante);
		
		JLabel labelMarcaFertilizante = new JLabel("Marca Fertilizante");
		labelMarcaFertilizante.setForeground(Color.WHITE);
		labelMarcaFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelMarcaFertilizante.setBounds(456, 202, 132, 14);
		contentPane.add(labelMarcaFertilizante);
		
		textTipoFertilizante = new JTextField();
		textTipoFertilizante.setDocument( new DocumentoLimitado(10) ); //definindo o tamanho do campo
		textTipoFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoFertilizante.setColumns(10);
		textTipoFertilizante.setBounds(458, 171, 152, 20);
		contentPane.add(textTipoFertilizante);
		
		JLabel labelTipoFertilizante = new JLabel("Tipo Fertilizante");
		labelTipoFertilizante.setForeground(Color.WHITE);
		labelTipoFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoFertilizante.setBounds(458, 148, 132, 14);
		contentPane.add(labelTipoFertilizante);
		
		textNomeFertilizante = new JTextField();
		textNomeFertilizante.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textNomeFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textNomeFertilizante.setColumns(10);
		textNomeFertilizante.setBounds(458, 117, 152, 20);
		contentPane.add(textNomeFertilizante);
		
		JLabel labelNomeFertilizante = new JLabel("Nome Fertilizante");
		labelNomeFertilizante.setForeground(Color.WHITE);
		labelNomeFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNomeFertilizante.setBounds(458, 88, 132, 14);
		contentPane.add(labelNomeFertilizante);
		
		textCodFertilizante = new JTextField();
		//textCodFertilizante.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textCodFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodFertilizante.setColumns(10);
		textCodFertilizante.setBounds(458, 57, 152, 20);
		contentPane.add(textCodFertilizante);
		
		JLabel labelCodFertilizante = new JLabel("C\u00F3digo Fertilizante");
		labelCodFertilizante.setForeground(Color.WHITE);
		labelCodFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodFertilizante.setBounds(458, 28, 132, 14);
		contentPane.add(labelCodFertilizante);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(488, 306, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpando dados inseridos nas textboxs.
				textCodFertilizante.setText("");
				textNomeFertilizante.setText("");
				textTipoFertilizante.setText("");
				textMarcaFertilizante.setText("");
				textPesoEmbalagem.setText("");
				textObservacao.setText("");
				textTipoDeAplicacao.setText("");
				textClassificacao.setText("");
		
			}
		});
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(488, 348, 122, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(642, 289, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btCancelar.setBackground(new Color(0, 128, 0));
		btCancelar.setBounds(642, 333, 122, 25);
		contentPane.add(btCancelar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(642, 369, 122, 25);
		contentPane.add(btNovoCadastro);
		
		JLabel labelObservacao = new JLabel("Observa\u00E7\u00E3o");
		labelObservacao.setForeground(Color.WHITE);
		labelObservacao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelObservacao.setBounds(629, 28, 132, 14);
		contentPane.add(labelObservacao);
		
		textObservacao = new JTextField();
		textObservacao.setDocument( new DocumentoLimitado(150) ); //definindo o tamanho do campo
		textObservacao.setFont(new Font("Arial", Font.PLAIN, 12));
		textObservacao.setColumns(10);
		textObservacao.setBounds(629, 53, 152, 20);
		contentPane.add(textObservacao);
		
		JLabel labelTipoDeAplicacao = new JLabel("Tipo de Aplica\u00E7\u00E3o");
		labelTipoDeAplicacao.setForeground(Color.WHITE);
		labelTipoDeAplicacao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoDeAplicacao.setBounds(629, 148, 132, 14);
		contentPane.add(labelTipoDeAplicacao);
		
		textTipoDeAplicacao = new JTextField();
		textTipoDeAplicacao.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textTipoDeAplicacao.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoDeAplicacao.setColumns(10);
		textTipoDeAplicacao.setBounds(629, 171, 152, 20);
		contentPane.add(textTipoDeAplicacao);
		
		JLabel labelClassificacao = new JLabel("Classifica\u00E7\u00E3o");
		labelClassificacao.setForeground(Color.WHITE);
		labelClassificacao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelClassificacao.setBounds(629, 202, 132, 14);
		contentPane.add(labelClassificacao);
		
		textClassificacao = new JTextField();
		textClassificacao.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textClassificacao.setFont(new Font("Arial", Font.PLAIN, 12));
		textClassificacao.setColumns(10);
		textClassificacao.setBounds(629, 225, 152, 20);
		contentPane.add(textClassificacao);
	}

}
