package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import metodos.AcessoBD;
import metodos.DocumentoLimitado;
import metodos_projeto.Agendamento;
import metodos_projeto.AgendamentoDAO;
import metodos_projeto.Usuario;
import metodos_projeto.UsuarioDAO;
import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	private JTable table_agendamento;
	private JDateChooser dateChooserDataPrevista;
	private JComboBox ComboBoxStatusAgendamento;
	private JComboBox ComboBoxTipoDoAgendamento;

	/***
	 * Metódo que executa uma pesquisa em toda a tabela de Agendamentos. (FILTRO)
	 */
	public void refreshTable() {
		
		AcessoBD bd = new AcessoBD();
		if(bd.getConnection()){ 
			
			String sql ="select * from TB_AGENDAMENTOS;"; // instrução executada no banco de dados.
			try {
				bd.st = bd.con.prepareStatement(sql); // preparar a instrução para ser executada.
				bd.rs = bd.st.executeQuery(); // Obtém a posicao BOF da tabela e executa a Consulta.
				table_agendamento.setModel(DbUtils.resultSetToTableModel(bd.rs));	
				}	
			
			catch(SQLException erro) { 
				System.out.println(erro); // mostra o erro encontrado quando tentou a conexão.
			}
			finally {
				bd.close(); // encerra a conexão ao BD.
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
		textDescricaoAgendamento.setBounds(202, 328, 532, 20);
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
				
				AcessoBD bd = new AcessoBD();
				if(bd.getConnection()){ 

					String sql ="select * from TB_AGENDAMENTOS where ID_AGENDAMENTO = ? or ID_USUARIO = ? or ID_EQUIPAMENTO = ? or DESCRICAO = ? "; // instrução executada no banco de dados.

					try {
						
						// Recebendo os valores inseridos.
						/*String  id = textCodAgendamento.getText(); // ID_AGENDAMENTO	
						String  idUsuario = textCodUsuario.getText(); // ID_USUARIO		
						String  idEquipamento =  textCodEquipamento.getText(); // ID_EQUIPAMENTO	
						String  descricao =  textDescricaoAgendamento.getText(); // DESCRICAO*/	
							
						bd.st = bd.con.prepareStatement(sql); // preparar a instrução para ser executada.
						bd.st.setString(1, textCodAgendamento.getText());
						bd.st.setString(2, textCodUsuario.getText());
						bd.st.setString(3, textCodEquipamento.getText());
						bd.st.setString(4, textDescricaoAgendamento.getText());
						bd.rs = bd.st.executeQuery(); // Obtém a posicao BOF da tabela e executa a Consulta.
						table_agendamento.setModel(DbUtils.resultSetToTableModel(bd.rs));	
						}	
					
					catch(SQLException erro) { 
						System.out.println(erro); // mostra o erro encontrado quando tentou a conexão.
					}
					catch(NumberFormatException erro) { 
						System.out.println("Insira um dado para busca !"); // erro na leitura em caso de valor em branco.
					}
					finally {
						bd.close(); // encerra a conexão ao BD.
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Falha na conexão com o BD!"); // retorna a mensagem de falha de conexão ao BD.
				}
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
				textCodEquipamento.setText("");
				textDescricaoAgendamento.setText("");
				
			}
		});
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(796, 383, 101, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Definindo condicionais para a Data de Agendamento
				//DateFormat df = new  SimpleDateFormat("yyyy-MM-dd");
				DateFormat df = new  SimpleDateFormat("dd-MM-yyyy");
				
				String dtAgendamento = "0";
				if(dateChooserDataPrevista.getDate() != null) {
					dtAgendamento = (df.format(dateChooserDataPrevista.getDate()));    //Formatação da DT_MARCADA_AGEND.
				}
				else
					JOptionPane.showMessageDialog(null, "Insira data válida no Campo");
				
				//Definindo as variaveis a partir de cada combinação de seleção.
				String statusAgendamento; // STATUS_AGEN -- E - EFETUADO | P - PENDENTE | C- CANCELADO  
				String statusTipoDoAgendamento; // TIPO_AGEN  -- P -PREVENTIVA | U - URGENCIA
				
				if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Preventiva")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Efetuado"))
				{
					statusTipoDoAgendamento = "P";
					statusAgendamento = "E";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Preventiva")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Pendente"))
				{
					statusTipoDoAgendamento = "P";
					statusAgendamento = "P";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Preventiva")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Cancelado"))
				{
					statusTipoDoAgendamento = "P";
					statusAgendamento = "C";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Urgência")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Efetuado"))
				{
					statusTipoDoAgendamento = "U";
					statusAgendamento = "E";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Urgência")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Pendente"))
				{
					statusTipoDoAgendamento = "U";
					statusAgendamento = "P";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Urgência")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Cancelado"))
				{
					statusTipoDoAgendamento = "U";
					statusAgendamento = "C";
				}
				
				else
				{
					statusTipoDoAgendamento = "";
					statusAgendamento = "";
				}
				
				Agendamento agendamento = new Agendamento(textCodAgendamento.getText(), textCodUsuario.getText(), textCodEquipamento.getText(),
						textDescricaoAgendamento.getText(), statusTipoDoAgendamento, dtAgendamento, statusAgendamento);
				
				AgendamentoDAO dao = new AgendamentoDAO();
				dao.alterar(agendamento);
			}
		});
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(909, 343, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btDeletar = new JButton("Deletar");
		btDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Agendamento agendamento = new Agendamento(textCodAgendamento.getText());
				
				AgendamentoDAO dao = new AgendamentoDAO();
				dao.excluir(agendamento);
			}
		});
		btDeletar.setForeground(Color.WHITE);
		btDeletar.setFont(new Font("Arial", Font.BOLD, 12));
		btDeletar.setBackground(new Color(0, 128, 0));
		btDeletar.setBounds(909, 383, 122, 25);
		contentPane.add(btDeletar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Definindo condicionais para a Data de Agendamento
				//DateFormat df = new  SimpleDateFormat("yyyy-MM-dd");
				DateFormat df = new  SimpleDateFormat("dd-MM-yyyy");
				
				String dtAgendamento = "0";
				if(dateChooserDataPrevista.getDate() != null) {
					dtAgendamento = (df.format(dateChooserDataPrevista.getDate()));    //Formatação da DT_MARCADA_AGEND.
				}
				else
					JOptionPane.showMessageDialog(null, "Insira data válida no Campo");
				
				//Definindo as variaveis a partir de cada combinação de seleção.
				String statusAgendamento; // STATUS_AGEN -- E - EFETUADO | P - PENDENTE | C- CANCELADO  
				String statusTipoDoAgendamento; // TIPO_AGEN  -- P -PREVENTIVA | U - URGENCIA
				
				if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Preventiva")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Efetuado"))
				{
					statusTipoDoAgendamento = "P";
					statusAgendamento = "E";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Preventiva")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Pendente"))
				{
					statusTipoDoAgendamento = "P";
					statusAgendamento = "P";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Preventiva")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Cancelado"))
				{
					statusTipoDoAgendamento = "P";
					statusAgendamento = "C";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Urgência")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Efetuado"))
				{
					statusTipoDoAgendamento = "U";
					statusAgendamento = "E";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Urgência")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Pendente"))
				{
					statusTipoDoAgendamento = "U";
					statusAgendamento = "P";
				}
				
				else if(ComboBoxTipoDoAgendamento.getSelectedItem().equals("Urgência")&&ComboBoxStatusAgendamento.getSelectedItem().equals("Cancelado"))
				{
					statusTipoDoAgendamento = "U";
					statusAgendamento = "C";
				}
				
				else
				{
					statusTipoDoAgendamento = "";
					statusAgendamento = "";
				}
				
				Agendamento agendamento = new Agendamento(textCodAgendamento.getText(), textCodUsuario.getText(), textCodEquipamento.getText(),
						textDescricaoAgendamento.getText(), statusTipoDoAgendamento, dtAgendamento, statusAgendamento);
				
				AgendamentoDAO dao = new AgendamentoDAO();
				dao.incluir(agendamento);
			}
		});
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
		
		//JDateChooser dateChooserDataPrevista = new JDateChooser();
		dateChooserDataPrevista = new JDateChooser();
		dateChooserDataPrevista.setBounds(292, 433, 168, 20);
		contentPane.add(dateChooserDataPrevista);
		
		//JComboBox ComboBoxStatusAgendamento = new JComboBox();
		ComboBoxStatusAgendamento = new JComboBox();
		ComboBoxStatusAgendamento.setModel(new DefaultComboBoxModel(new String[] {"<Selecionar uma op\u00E7\u00E3o>", "Efetuado", "Pendente", "Cancelado"}));
		ComboBoxStatusAgendamento.setBounds(257, 385, 160, 22);
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
		
		table_agendamento = new JTable();
		scrollPane.setViewportView(table_agendamento);
		
		JLabel labelTipoDoAgendamento = new JLabel("Tipo do Agendamento");
		labelTipoDoAgendamento.setForeground(Color.WHITE);
		labelTipoDoAgendamento.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoDoAgendamento.setBounds(427, 389, 132, 14);
		contentPane.add(labelTipoDoAgendamento);
		
		//JComboBox ComboBoxTipoDoAgendamento = new JComboBox();
		ComboBoxTipoDoAgendamento = new JComboBox();
		ComboBoxTipoDoAgendamento.setModel(new DefaultComboBoxModel(new String[] {"<Selecionar uma op\u00E7\u00E3o>", "Preventiva", "Urg\u00EAncia"}));
		ComboBoxTipoDoAgendamento.setBounds(581, 384, 153, 22);
		contentPane.add(ComboBoxTipoDoAgendamento);
		
		JButton btFiltroAgendamento = new JButton("Filtrar Agendamento");
		btFiltroAgendamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				refreshTable();
			}
		});
		btFiltroAgendamento.setForeground(Color.WHITE);
		btFiltroAgendamento.setFont(new Font("Arial", Font.BOLD, 12));
		btFiltroAgendamento.setBackground(new Color(0, 128, 0));
		btFiltroAgendamento.setBounds(796, 13, 235, 25);
		contentPane.add(btFiltroAgendamento);
	}
}
