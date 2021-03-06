package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.AcessoBD;
import metodos.DocumentoLimitado;
import metodos_projeto.Usuario;
import metodos_projeto.UsuarioDAO;
import net.proteanit.sql.DbUtils;

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
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.List;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;

import consultas_bd_arquivos_apoio.BookDAO;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textCodUsuario;
	private JTextField textNomeUsuario;
	private JTextField textSenha2;
	private JTextField textEmail;
	public static Cadastros tela3;
	public static Usuarios tela4;
	private JTable table_usuario;
	private JComboBox ComboBoxPerfil;
	private JComboBox ComboBoxStatusUsuario;
	private JDateChooser dateChooserDtCadastro;
	private JDateChooser dateChooserDtAlteracao;

	/***
	 * Met?do que executa uma pesquisa em toda a tabela do Usuario. (FILTRO)
	 */
	public void refreshTable() {
		
		AcessoBD bd = new AcessoBD();
		if(bd.getConnection()){ 
			
			String sql ="select * from TB_USUARIO"; // instru??o executada no banco de dados.
			try {
				bd.st = bd.con.prepareStatement(sql); // preparar a instru??o para ser executada.
				bd.rs = bd.st.executeQuery(); // Obt?m a posicao BOF da tabela e executa a Consulta.
				table_usuario.setModel(DbUtils.resultSetToTableModel(bd.rs));	
				}	
			
			catch(SQLException erro) { 
				System.out.println(erro); // mostra o erro encontrado quando tentou a conex?o.
			}
			finally {
				bd.close(); // encerra a conex?o ao BD.
			}
		}
	}

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		btPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				AcessoBD bd = new AcessoBD();
				if(bd.getConnection()){ 
					
					String sql ="select * from TB_USUARIO where ID_USUARIO = ? or NOME_USUARIO = ? or SENHA_USU = ? or EMAIL_USU = ?"; // instru??o executada no banco de dados.
					try {
						
						// Recebendo os valores inseridos.
						/*String id = textCodUsuario.getText(); // ID_USUARIO
						String nome = textNomeUsuario.getText(); // NOME_USUARIO
						String senha = textSenha2.getText(); // SENHA_USU
						String email = textEmail.getText(); // EMAIL_USU*/
						
						// STATUS_USUARIO
						// PERFIL_USUARIO*/
						// DT_CADASTRO_USU
						// DT_ALTERACAO_USU
						
						bd.st = bd.con.prepareStatement(sql); // preparar a instru??o para ser executada.
						bd.st.setString(1, textCodUsuario.getText());
						bd.st.setString(2, textNomeUsuario.getText());
						bd.st.setString(3, textSenha2.getText());
						bd.st.setString(4, textEmail.getText());
						bd.rs = bd.st.executeQuery(); // Obt?m a posicao BOF da tabela e executa a Consulta.
						table_usuario.setModel(DbUtils.resultSetToTableModel(bd.rs));	

						}	
					
					catch(SQLException erro) { 
						System.out.println(erro); // mostra o erro encontrado quando tentou a conex?o.
					}
					catch(NumberFormatException erro) { 
						System.out.println("Insira um dado para busca !"); // erro na leitura em caso de valor em branco.
					}
					finally {
						bd.close(); // encerra a conex?o ao BD.
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Falha na conex?o com o BD!"); // retorna a mensagem de falha de conex?o ao BD.
				}
			}
		});
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(527, 216, 106, 25);
		contentPane.add(btPesquisar);
		
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
				Cadastros.tela4.setVisible(false);
				
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(669, 374, 89, 23);
		contentPane.add(btVoltar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpando dados inseridos nas textboxs.
				textCodUsuario.setText("");
				textNomeUsuario.setText("");
				textSenha2.setText("");
				textEmail.setText("");
			}
		});
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(527, 252, 106, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
				//Definindo condicionais para as Datas Cadastro e Altera??o.
				//DateFormat df = new  SimpleDateFormat("yyyy-MM-dd");
				DateFormat df = new  SimpleDateFormat("dd-MM-yyyy");
				
				String dtCadastro = "0";
				String dtAlteracao = "0";
				if(dateChooserDtCadastro.getDate() != null && dateChooserDtAlteracao.getDate() !=null) {
					dtCadastro = (df.format(dateChooserDtCadastro.getDate()));    //Formata??o da DT_CADASTRO_USU.
					dtAlteracao = (df.format(dateChooserDtAlteracao.getDate()));  //Formata??o da DT_ALTERACAO_USU
				}
				else
					JOptionPane.showMessageDialog(null, "Insira datas v?lidas nos Campos");
				
				//Definindo as variaveis a partir de cada combina??o de sele??o.
				String statusUsuario; // STATUS_USUARIO
				String statusPerfil; // PERFIL_USUARIO

				
				if(ComboBoxStatusUsuario.getSelectedItem().equals("Ativado")&&ComboBoxPerfil.getSelectedItem().equals("Administrador"))
				{
					statusUsuario = "A";
					statusPerfil = "A";
				}
				
				else if(ComboBoxStatusUsuario.getSelectedItem().equals("Ativado")&&ComboBoxPerfil.getSelectedItem().equals("Usuario"))
				{
					statusUsuario = "A";
					statusPerfil = "U";
				}
				
				else if(ComboBoxStatusUsuario.getSelectedItem().equals("Desativado")&&ComboBoxPerfil.getSelectedItem().equals("Administrador"))
				{
					statusUsuario = "I";
					statusPerfil = "A";
				}
				
				else if(ComboBoxStatusUsuario.getSelectedItem().equals("Desativado")&&ComboBoxPerfil.getSelectedItem().equals("Usuario"))
				{
					statusUsuario = "I";
					statusPerfil = "U";
				}
				
				else
				{
					statusUsuario = "";
					statusPerfil = "";
					//JOptionPane.showMessageDialog(null, "Selecione os campos de Status e Perfil");
				}
				
				//Sem uso das Datas
				/*Usuario usuario = new Usuario(textCodUsuario.getText(),textNomeUsuario.getText(),textSenha2.getText(),textEmail.getText(),
						statusUsuario,statusPerfil);*/
				
				Usuario usuario = new Usuario(textCodUsuario.getText(),textNomeUsuario.getText(),textSenha2.getText(),dtCadastro,
						textEmail.getText(),dtAlteracao,statusUsuario,statusPerfil);
				
				UsuarioDAO dao = new UsuarioDAO();
				dao.alterar(usuario);
			}
		});
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(636, 216, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btDeletar = new JButton("Deletar");
		btDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario usuario = new Usuario(textCodUsuario.getText()); 
				
				UsuarioDAO dao = new UsuarioDAO();
				dao.excluir(usuario);
			}
		});
		btDeletar.setForeground(Color.WHITE);
		btDeletar.setFont(new Font("Arial", Font.BOLD, 12));
		btDeletar.setBackground(new Color(0, 128, 0));
		btDeletar.setBounds(636, 252, 122, 25);
		contentPane.add(btDeletar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Definindo condicionais para as Datas Cadastro e Altera??o.
				//DateFormat df = new  SimpleDateFormat("yyyy-MM-dd");
				DateFormat df = new  SimpleDateFormat("dd-MM-yyyy");
				
				String dtCadastro = "0";
				String dtAlteracao = "0";
				if(dateChooserDtCadastro.getDate() != null && dateChooserDtAlteracao.getDate() !=null) {
					dtCadastro = (df.format(dateChooserDtCadastro.getDate()));    //Formata??o da DT_CADASTRO_USU.
					dtAlteracao = (df.format(dateChooserDtAlteracao.getDate()));  //Formata??o da DT_ALTERACAO_USU
				}
				else
					JOptionPane.showMessageDialog(null, "Insira datas v?lidas nos Campos");
				
				
				//Definindo as variaveis a partir de cada combina??o de sele??o.
				String statusUsuario; // STATUS_USUARIO
				String statusPerfil; // PERFIL_USUARIO

				if(ComboBoxStatusUsuario.getSelectedItem().equals("Ativado")&&ComboBoxPerfil.getSelectedItem().equals("Administrador"))
				{
					statusUsuario = "A";
					statusPerfil = "A";
				}
				
				else if(ComboBoxStatusUsuario.getSelectedItem().equals("Ativado")&&ComboBoxPerfil.getSelectedItem().equals("Usuario"))
				{
					statusUsuario = "A";
					statusPerfil = "U";
				}
				
				else if(ComboBoxStatusUsuario.getSelectedItem().equals("Desativado")&&ComboBoxPerfil.getSelectedItem().equals("Administrador"))
				{
					statusUsuario = "I";
					statusPerfil = "A";
				}
				
				else if(ComboBoxStatusUsuario.getSelectedItem().equals("Desativado")&&ComboBoxPerfil.getSelectedItem().equals("Usuario"))
				{
					statusUsuario = "I";
					statusPerfil = "U";
				}
				
				else
				{
					statusUsuario = "";
					statusPerfil = "";
					//JOptionPane.showMessageDialog(null, "Selecione os campos de Status e Perfil");
				}
				
				//Sem uso das Datas
				/*Usuario usuario = new Usuario(textCodUsuario.getText(),textNomeUsuario.getText(),textSenha2.getText(),textEmail.getText(),
						statusUsuario,statusPerfil);*/
				
				Usuario usuario = new Usuario(textCodUsuario.getText(),textNomeUsuario.getText(),textSenha2.getText(),dtCadastro,
						textEmail.getText(),dtAlteracao,statusUsuario,statusPerfil);
				
				UsuarioDAO dao = new UsuarioDAO();
				dao.incluir(usuario);
			}
		});
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(527, 288, 231, 25);
		contentPane.add(btNovoCadastro);
		
		JLabel labelCodUusario = new JLabel("C\u00F3digo do Usu\u00E1rio ");
		labelCodUusario.setForeground(new Color(255, 255, 255));
		labelCodUusario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodUusario.setBounds(20, 206, 132, 14);
		contentPane.add(labelCodUusario);
		
		JLabel labelNomeUsuario = new JLabel("Nome do Usu\u00E1rio");
		labelNomeUsuario.setForeground(new Color(255, 255, 255));
		labelNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNomeUsuario.setBounds(20, 276, 132, 14);
		contentPane.add(labelNomeUsuario);
		
		JLabel labelSenha2 = new JLabel("Senha");
		labelSenha2.setForeground(new Color(255, 255, 255));
		labelSenha2.setFont(new Font("Arial", Font.PLAIN, 12));
		labelSenha2.setBounds(182, 206, 132, 14);
		contentPane.add(labelSenha2);
		
		JLabel labelEmail = new JLabel("E-mail");
		labelEmail.setForeground(new Color(255, 255, 255));
		labelEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		labelEmail.setBounds(182, 277, 132, 14);
		contentPane.add(labelEmail);
		
		JLabel labelStatus = new JLabel("Status");
		labelStatus.setForeground(new Color(255, 255, 255));
		labelStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		labelStatus.setBounds(362, 206, 132, 14);
		contentPane.add(labelStatus);
		
		textCodUsuario = new JTextField();
		// textCodUsuario.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodUsuario.setColumns(10);
		textCodUsuario.setBounds(20, 235, 152, 20);
		contentPane.add(textCodUsuario);
		
		JList list = new JList();
		list.setBounds(458, 361, 132, -32);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(468, 340, 1, 1);
		contentPane.add(list_1);
		
		textNomeUsuario = new JTextField();
		textNomeUsuario.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textNomeUsuario.setColumns(10);
		textNomeUsuario.setBounds(20, 307, 152, 20);
		contentPane.add(textNomeUsuario);
		
		textSenha2 = new JTextField();
		textSenha2.setDocument( new DocumentoLimitado(10) ); //definindo o tamanho do campo
		textSenha2.setFont(new Font("Arial", Font.PLAIN, 12));
		textSenha2.setColumns(10);
		textSenha2.setBounds(182, 235, 152, 20);
		contentPane.add(textSenha2);
		
		textEmail = new JTextField();
		textEmail.setDocument( new DocumentoLimitado(50) ); //definindo o tamanho do campo
		textEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		textEmail.setColumns(10);
		textEmail.setBounds(184, 307, 152, 20);
		contentPane.add(textEmail);
		
		ComboBoxStatusUsuario = new JComboBox();
		ComboBoxStatusUsuario.setModel(new DefaultComboBoxModel(new String[] {"<Selecionar uma op\u00E7\u00E3o>", "Ativado", "Desativado"}));
		ComboBoxStatusUsuario.setBounds(362, 232, 152, 31);
		contentPane.add(ComboBoxStatusUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 47, 727, 148);
		contentPane.add(scrollPane);
		
		table_usuario = new JTable();
		scrollPane.setViewportView(table_usuario);
		
		JLabel labelPerfil = new JLabel("Perfil");
		labelPerfil.setForeground(Color.WHITE);
		labelPerfil.setFont(new Font("Arial", Font.PLAIN, 12));
		labelPerfil.setBounds(362, 276, 132, 14);
		contentPane.add(labelPerfil);
		
		ComboBoxPerfil = new JComboBox();
		ComboBoxPerfil.setModel(new DefaultComboBoxModel(new String[] {"<Selecionar uma op\u00E7\u00E3o>", "Administrador", "Usuario"}));
		ComboBoxPerfil.setBounds(362, 302, 152, 31);
		contentPane.add(ComboBoxPerfil);
		
		JLabel labelDtCadastro = new JLabel("Data Cadastro");
		labelDtCadastro.setForeground(Color.WHITE);
		labelDtCadastro.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDtCadastro.setBounds(352, 352, 150, 14);
		contentPane.add(labelDtCadastro);
		
		//JDateChooser dateChooserDtCadastro = new JDateChooser();
		dateChooserDtCadastro = new JDateChooser();
		dateChooserDtCadastro.setBounds(352, 377, 136, 20);
		contentPane.add(dateChooserDtCadastro);
		
		JLabel labelDtAlteracao = new JLabel("Data Altera\u00E7\u00E3o ");
		labelDtAlteracao.setForeground(Color.WHITE);
		labelDtAlteracao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelDtAlteracao.setBounds(520, 352, 150, 14);
		contentPane.add(labelDtAlteracao);
		
		//JDateChooser dateChooserDtAlteracao = new JDateChooser();
		dateChooserDtAlteracao = new JDateChooser();
		dateChooserDtAlteracao.setBounds(516, 377, 136, 20);
		contentPane.add(dateChooserDtAlteracao);
		
		JButton btFiltroUsuarios = new JButton("Filtrar Usu\u00E1rios");
		btFiltroUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshTable();
			}
		});
		btFiltroUsuarios.setForeground(Color.WHITE);
		btFiltroUsuarios.setFont(new Font("Arial", Font.BOLD, 12));
		btFiltroUsuarios.setBackground(new Color(0, 128, 0));
		btFiltroUsuarios.setBounds(516, 12, 231, 25);
		contentPane.add(btFiltroUsuarios);
		
	}
}
