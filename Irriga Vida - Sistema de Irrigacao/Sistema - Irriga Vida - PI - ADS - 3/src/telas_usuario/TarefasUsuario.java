package telas_usuario;

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

import metodos.DocumentoLimitado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TarefasUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textObservacao;
	private JTextField textTipo;
	private JTextField textDescricao;
	private JTextField textCodTarefa;
	private JTextField textCodUsuario;
	public static TarefasUsuario tela16;
	public static CadastrosUsuario tela13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TarefasUsuario frame = new TarefasUsuario();
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
	public TarefasUsuario() {
		setTitle("Tarefas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 825, 460);
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
		btSair.setBounds(10, 392, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela13 = new CadastrosUsuario();
				tela13.setVisible(true);
				CadastrosUsuario.tela16.setVisible(false);
				
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(109, 392, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel labelDapTarefa = new JLabel("Data da Prevista Tarefa ");
		labelDapTarefa.setForeground(Color.WHITE);
		labelDapTarefa.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDapTarefa.setBounds(460, 352, 132, 14);
		contentPane.add(labelDapTarefa);
		
		textObservacao = new JTextField();
		textObservacao.setDocument( new DocumentoLimitado(150) ); //definindo o tamanho do campo
		textObservacao.setFont(new Font("Arial", Font.PLAIN, 12));
		textObservacao.setColumns(10);
		textObservacao.setBounds(460, 305, 181, 20);
		contentPane.add(textObservacao);
		
		JLabel labelObservacao = new JLabel("Observa\u00E7\u00E3o");
		labelObservacao.setForeground(Color.WHITE);
		labelObservacao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelObservacao.setBounds(458, 282, 152, 14);
		contentPane.add(labelObservacao);
		
		textTipo = new JTextField();
		textTipo.setToolTipText("C - COLHEITA | A - AVALIA\u00C7\u00C3O ");
		textTipo.setDocument( new DocumentoLimitado(1) ); //definindo o tamanho do campo
		textTipo.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipo.setColumns(10);
		textTipo.setBounds(458, 251, 183, 20);
		contentPane.add(textTipo);
		
		JLabel labelTipo = new JLabel("Tipo");
		labelTipo.setForeground(Color.WHITE);
		labelTipo.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipo.setBounds(458, 228, 132, 14);
		contentPane.add(labelTipo);
		
		textDescricao = new JTextField();
		textDescricao.setDocument( new DocumentoLimitado(80) ); //definindo o tamanho do campo
		textDescricao.setFont(new Font("Arial", Font.PLAIN, 12));
		textDescricao.setColumns(10);
		textDescricao.setBounds(458, 197, 183, 20);
		contentPane.add(textDescricao);
		
		JLabel labelDescricao = new JLabel("Descri\u00E7\u00E3o");
		labelDescricao.setForeground(Color.WHITE);
		labelDescricao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDescricao.setBounds(458, 172, 132, 14);
		contentPane.add(labelDescricao);
		
		textCodTarefa = new JTextField();
		//textCodTarefa.setDocument( new DocumentoLimitado(10) ); //definindo o tamanho do campo
		textCodTarefa.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodTarefa.setColumns(10);
		textCodTarefa.setBounds(458, 72, 183, 20);
		contentPane.add(textCodTarefa);
		
		JLabel labelCodTarefa = new JLabel("C\u00F3digo Tarefa");
		labelCodTarefa.setForeground(Color.WHITE);
		labelCodTarefa.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodTarefa.setBounds(458, 47, 132, 14);
		contentPane.add(labelCodTarefa);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(662, 72, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpando dados inseridos nas textboxs.
				textCodTarefa.setText("");
				textDescricao.setText("");
				textTipo.setText("");
				textObservacao.setText("");
				textCodUsuario.setText("");
				
			}
		});
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(662, 114, 122, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(662, 150, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btCancelar.setBackground(new Color(0, 128, 0));
		btCancelar.setBounds(662, 186, 122, 25);
		contentPane.add(btCancelar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(662, 222, 122, 25);
		contentPane.add(btNovoCadastro);
		
		JDateChooser dateChooserDapTarefa = new JDateChooser();
		dateChooserDapTarefa.setBounds(460, 377, 152, 20);
		contentPane.add(dateChooserDapTarefa);
		
		JLabel labelExecTarefa = new JLabel("Data da Execu\u00E7\u00E3o Tarefa");
		labelExecTarefa.setForeground(Color.WHITE);
		labelExecTarefa.setFont(new Font("Arial", Font.PLAIN, 12));
		labelExecTarefa.setBounds(632, 352, 152, 14);
		contentPane.add(labelExecTarefa);
		
		JDateChooser dateChooserExecTarefa = new JDateChooser();
		dateChooserExecTarefa.setBounds(632, 377, 152, 20);
		contentPane.add(dateChooserExecTarefa);
		
		JLabel labelStatus = new JLabel("Status");
		labelStatus.setForeground(Color.WHITE);
		labelStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		labelStatus.setBounds(662, 258, 132, 14);
		contentPane.add(labelStatus);
		
		JComboBox ComboBoxStatus = new JComboBox();
		ComboBoxStatus.setModel(new DefaultComboBoxModel(new String[] {"Pendente", "Finalizada"}));
		ComboBoxStatus.setBounds(662, 284, 98, 31);
		contentPane.add(ComboBoxStatus);
		
		JLabel labelCodUsuario = new JLabel("C\u00F3digo do Usuario");
		labelCodUsuario.setForeground(Color.WHITE);
		labelCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodUsuario.setBounds(458, 103, 132, 14);
		contentPane.add(labelCodUsuario);
		
		textCodUsuario = new JTextField();
		//textCodUsuario.setDocument( new DocumentoLimitado(10) ); //definindo o tamanho do campo
		textCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodUsuario.setColumns(10);
		textCodUsuario.setBounds(458, 128, 183, 20);
		contentPane.add(textCodUsuario);
	}
}
