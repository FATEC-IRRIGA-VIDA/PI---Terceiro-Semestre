package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.List;
import javax.swing.ListSelectionModel;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textCodUsuario;
	private JTextField textNomeUsuario;
	private JTextField textSenha2;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setTitle("Usu\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setForeground(new Color(0, 0, 0));
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
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(620, 71, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btSair = new JButton("Sair");
		btSair.setForeground(Color.WHITE);
		btSair.setFont(new Font("Arial", Font.BOLD, 12));
		btSair.setBackground(new Color(0, 128, 0));
		btSair.setBounds(20, 374, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(669, 374, 89, 23);
		contentPane.add(btVoltar);
		
		JEditorPane dtrpnA = new JEditorPane();
		dtrpnA.setBackground(new Color(192, 192, 192));
		dtrpnA.setBounds(10, 47, 438, 305);
		contentPane.add(dtrpnA);
		
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
		
		JLabel labelCodUusario = new JLabel("C\u00F3digo do Usu\u00E1rio ");
		labelCodUusario.setForeground(new Color(255, 255, 255));
		labelCodUusario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodUusario.setBounds(458, 47, 132, 14);
		contentPane.add(labelCodUusario);
		
		JLabel labelNomeUsuario = new JLabel("Nome do Usu\u00E1rio");
		labelNomeUsuario.setForeground(new Color(255, 255, 255));
		labelNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNomeUsuario.setBounds(458, 118, 132, 14);
		contentPane.add(labelNomeUsuario);
		
		JLabel labelSenha2 = new JLabel("Senha");
		labelSenha2.setForeground(new Color(255, 255, 255));
		labelSenha2.setFont(new Font("Arial", Font.PLAIN, 12));
		labelSenha2.setBounds(458, 190, 132, 14);
		contentPane.add(labelSenha2);
		
		JLabel labelEmail = new JLabel("E-mail");
		labelEmail.setForeground(new Color(255, 255, 255));
		labelEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		labelEmail.setBounds(458, 253, 132, 14);
		contentPane.add(labelEmail);
		
		JLabel labelStatus = new JLabel("Status");
		labelStatus.setForeground(new Color(255, 255, 255));
		labelStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		labelStatus.setBounds(458, 307, 132, 14);
		contentPane.add(labelStatus);
		
		textCodUsuario = new JTextField();
		textCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodUsuario.setColumns(10);
		textCodUsuario.setBounds(458, 76, 152, 20);
		contentPane.add(textCodUsuario);
		
		JList list = new JList();
		list.setBounds(458, 361, 132, -32);
		contentPane.add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(122, 149, 17, 48);
		contentPane.add(scrollBar);
		
		JList list_1 = new JList();
		list_1.setBounds(468, 340, 1, 1);
		contentPane.add(list_1);
		
		JList list_2 = new JList();
		list_2.setFont(new Font("Arial", Font.PLAIN, 12));
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Ativo", "Desativado", "Inativado"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setBounds(458, 332, 142, 48);
		contentPane.add(list_2);
		
		textNomeUsuario = new JTextField();
		textNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textNomeUsuario.setColumns(10);
		textNomeUsuario.setBounds(458, 149, 152, 20);
		contentPane.add(textNomeUsuario);
		
		textSenha2 = new JTextField();
		textSenha2.setFont(new Font("Arial", Font.PLAIN, 12));
		textSenha2.setColumns(10);
		textSenha2.setBounds(458, 215, 152, 20);
		contentPane.add(textSenha2);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		textEmail.setColumns(10);
		textEmail.setBounds(460, 278, 152, 20);
		contentPane.add(textEmail);
	}
}
