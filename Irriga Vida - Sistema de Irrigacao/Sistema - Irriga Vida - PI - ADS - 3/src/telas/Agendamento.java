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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agendamento extends JFrame {

	private JPanel contentPane;
	private JTextField textDescricaoAgendamento;
	private JTextField textTipoAgendamento;
	private JTextField textCodUsuario;
	private JTextField textCodAgendamento;
	public static Cadastros tela3;
	public static Agendamento tela9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agendamento frame = new Agendamento();
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
	public Agendamento() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Agendamento");
		setBounds(100, 100, 758, 526);
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
		dtrpnA.setBounds(10, 47, 438, 395);
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
		btSair.setBounds(10, 453, 89, 23);
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
		btVoltar.setBounds(106, 453, 89, 23);
		contentPane.add(btVoltar);
		
		JLabel labelDataPrevista = new JLabel("Data Prevista");
		labelDataPrevista.setForeground(Color.WHITE);
		labelDataPrevista.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDataPrevista.setBounds(458, 309, 132, 14);
		contentPane.add(labelDataPrevista);
		
		textDescricaoAgendamento = new JTextField();
		textDescricaoAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		textDescricaoAgendamento.setColumns(10);
		textDescricaoAgendamento.setBounds(460, 278, 269, 20);
		contentPane.add(textDescricaoAgendamento);
		
		JLabel labelDescricaoAgendamento = new JLabel("Descri\u00E7\u00E3o do Agendamento");
		labelDescricaoAgendamento.setForeground(Color.WHITE);
		labelDescricaoAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDescricaoAgendamento.setBounds(458, 255, 183, 14);
		contentPane.add(labelDescricaoAgendamento);
		
		textTipoAgendamento = new JTextField();
		textTipoAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoAgendamento.setColumns(10);
		textTipoAgendamento.setBounds(458, 184, 271, 20);
		contentPane.add(textTipoAgendamento);
		
		JLabel labelTipoAgendamento = new JLabel("Tipo do Agendamento");
		labelTipoAgendamento.setForeground(Color.WHITE);
		labelTipoAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoAgendamento.setBounds(458, 159, 132, 14);
		contentPane.add(labelTipoAgendamento);
		
		textCodUsuario = new JTextField();
		textCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodUsuario.setColumns(10);
		textCodUsuario.setBounds(458, 128, 271, 20);
		contentPane.add(textCodUsuario);
		
		JLabel labelCodUsuario = new JLabel("C\u00F3digo do Usu\u00E1rio");
		labelCodUsuario.setForeground(Color.WHITE);
		labelCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodUsuario.setBounds(458, 103, 132, 14);
		contentPane.add(labelCodUsuario);
		
		textCodAgendamento = new JTextField();
		textCodAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodAgendamento.setColumns(10);
		textCodAgendamento.setBounds(458, 72, 271, 20);
		contentPane.add(textCodAgendamento);
		
		JLabel labelCodAgendamento = new JLabel("C\u00F3digo do Agendamento");
		labelCodAgendamento.setForeground(Color.WHITE);
		labelCodAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodAgendamento.setBounds(458, 47, 168, 14);
		contentPane.add(labelCodAgendamento);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(458, 215, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(607, 215, 122, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(458, 452, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btCancelar.setBackground(new Color(0, 128, 0));
		btCancelar.setBounds(607, 452, 122, 25);
		contentPane.add(btCancelar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(516, 12, 168, 25);
		contentPane.add(btNovoCadastro);
		
		JLabel labelDataRealizada = new JLabel("Data Realizada");
		labelDataRealizada.setForeground(Color.WHITE);
		labelDataRealizada.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDataRealizada.setBounds(458, 355, 132, 14);
		contentPane.add(labelDataRealizada);
		
		JLabel labelStatus = new JLabel("Status");
		labelStatus.setForeground(Color.WHITE);
		labelStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		labelStatus.setBounds(458, 399, 132, 14);
		contentPane.add(labelStatus);
		
		JDateChooser dateChooserDataPrevista = new JDateChooser();
		dateChooserDataPrevista.setBounds(458, 324, 168, 20);
		contentPane.add(dateChooserDataPrevista);
		
		JDateChooser dateChooserDataRealizada = new JDateChooser();
		dateChooserDataRealizada.setBounds(458, 369, 168, 20);
		contentPane.add(dateChooserDataRealizada);
		
		JComboBox ComboBoxStatusAgendamento = new JComboBox();
		ComboBoxStatusAgendamento.setBounds(458, 420, 168, 22);
		contentPane.add(ComboBoxStatusAgendamento);
	}
}
