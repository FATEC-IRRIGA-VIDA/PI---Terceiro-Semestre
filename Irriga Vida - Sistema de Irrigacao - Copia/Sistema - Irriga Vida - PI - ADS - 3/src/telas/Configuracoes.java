package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuracoes extends JFrame {

	private JPanel contentPane;
	private JTextField textDescricaoConfiguracao;
	private JTextField textValorConfiguracao;
	private JTextField textCodUsuario;
	private JTextField textCodConfiguracao;
	public static TelaInicial tela2;
	public static Configuracoes tela11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracoes frame = new Configuracoes();
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
	public Configuracoes() {
		setTitle("Configura\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 765, 441);
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
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btSair.setForeground(Color.WHITE);
		btSair.setFont(new Font("Arial", Font.BOLD, 12));
		btSair.setBackground(new Color(0, 128, 0));
		btSair.setBounds(10, 374, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela2 = new TelaInicial();
				tela2.setVisible(true);
				TelaInicial.tela11.setVisible(false);
				
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(653, 374, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel labelDataAlteracao = new JLabel("Data da Altera\u00E7\u00E3o");
		labelDataAlteracao.setForeground(Color.WHITE);
		labelDataAlteracao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDataAlteracao.setBounds(458, 267, 132, 14);
		contentPane.add(labelDataAlteracao);
		
		textDescricaoConfiguracao = new JTextField();
		textDescricaoConfiguracao.setFont(new Font("Arial", Font.PLAIN, 12));
		textDescricaoConfiguracao.setColumns(10);
		textDescricaoConfiguracao.setBounds(460, 236, 152, 20);
		contentPane.add(textDescricaoConfiguracao);
		
		JLabel labelDescricaoConfiguracao = new JLabel("Descri\u00E7\u00E3o da Configura\u00E7\u00E3o");
		labelDescricaoConfiguracao.setForeground(Color.WHITE);
		labelDescricaoConfiguracao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDescricaoConfiguracao.setBounds(458, 213, 152, 14);
		contentPane.add(labelDescricaoConfiguracao);
		
		textValorConfiguracao = new JTextField();
		textValorConfiguracao.setFont(new Font("Arial", Font.PLAIN, 12));
		textValorConfiguracao.setColumns(10);
		textValorConfiguracao.setBounds(458, 182, 152, 20);
		contentPane.add(textValorConfiguracao);
		
		JLabel labelValorConfiguracao = new JLabel("Valor da Configura\u00E7\u00E3o");
		labelValorConfiguracao.setForeground(Color.WHITE);
		labelValorConfiguracao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelValorConfiguracao.setBounds(458, 159, 132, 14);
		contentPane.add(labelValorConfiguracao);
		
		textCodUsuario = new JTextField();
		textCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodUsuario.setColumns(10);
		textCodUsuario.setBounds(458, 128, 152, 20);
		contentPane.add(textCodUsuario);
		
		JLabel labelCodUsuario = new JLabel("C\u00F3digo do Usu\u00E1rio");
		labelCodUsuario.setForeground(Color.WHITE);
		labelCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodUsuario.setBounds(458, 103, 132, 14);
		contentPane.add(labelCodUsuario);
		
		textCodConfiguracao = new JTextField();
		textCodConfiguracao.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodConfiguracao.setColumns(10);
		textCodConfiguracao.setBounds(458, 72, 152, 20);
		contentPane.add(textCodConfiguracao);
		
		JLabel labelCodConfiguracao = new JLabel("C\u00F3digo de Configura\u00E7\u00E3o");
		labelCodConfiguracao.setForeground(Color.WHITE);
		labelCodConfiguracao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodConfiguracao.setBounds(458, 47, 132, 14);
		contentPane.add(labelCodConfiguracao);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(620, 71, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
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
		
		JDateChooser dateChooserDataAlteracao = new JDateChooser();
		dateChooserDataAlteracao.setBounds(458, 292, 152, 20);
		contentPane.add(dateChooserDataAlteracao);
	}
}
