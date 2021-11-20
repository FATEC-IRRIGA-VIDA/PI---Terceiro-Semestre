package telas_usuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.AcessoBD;
import metodos.DocumentoLimitado;
import metodos_projeto.Equipamento;
import metodos_projeto.EquipamentoDAO;
import metodos_projeto.Fertilizante;
import metodos_projeto.FertilizanteDAO;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FertilizantesUsuario4 extends JFrame {

	private JPanel contentPane;
	private JTextField textPesoEmbalagem;
	private JTextField textMarcaFertilizante;
	private JTextField textTipoFertilizante;
	private JTextField textNomeFertilizante;
	private JTextField textCodFertilizante;
	private JTextField textObservacao;
	private JTextField textTipoDeAplicacao;
	private JTextField textClassificacao;
	public static FertilizantesUsuario4 tela17;
	public static CadastrosUsuario tela13;
	private JTable table_fertilizantes;
	
	/***
	 * Metódo que executa uma pesquisa em toda a tabela de Fertilizantes. (FILTRO)
	 */
	public void refreshTable() {
		
		AcessoBD bd = new AcessoBD();
		if(bd.getConnection()){ 
			
			String sql ="select * from TB_FERTILIZANTE"; // instrução executada no banco de dados.
			try {
				bd.st = bd.con.prepareStatement(sql); // preparar a instrução para ser executada.
				bd.rs = bd.st.executeQuery(); // Obtém a posicao BOF da tabela e executa a Consulta.
				table_fertilizantes.setModel(DbUtils.resultSetToTableModel(bd.rs));	
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
					FertilizantesUsuario4 frame = new FertilizantesUsuario4();
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
	public FertilizantesUsuario4() {
		setTitle("Fertilizantes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1013, 490);
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
		btSair.setBounds(10, 425, 89, 23);
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
		btVoltar.setBounds(899, 425, 89, 23);
		contentPane.add(btVoltar);
		
		textPesoEmbalagem = new JTextField();
		textPesoEmbalagem.setDocument( new DocumentoLimitado(4) ); //definindo o tamanho do campo
		textPesoEmbalagem.setFont(new Font("Arial", Font.PLAIN, 12));
		textPesoEmbalagem.setColumns(10);
		textPesoEmbalagem.setBounds(355, 365, 152, 20);
		contentPane.add(textPesoEmbalagem);
		
		JLabel labelPesoEmbalagem = new JLabel("Peso Embalagem");
		labelPesoEmbalagem.setForeground(Color.WHITE);
		labelPesoEmbalagem.setFont(new Font("Arial", Font.PLAIN, 12));
		labelPesoEmbalagem.setBounds(355, 340, 132, 14);
		contentPane.add(labelPesoEmbalagem);
		
		textMarcaFertilizante = new JTextField();
		textMarcaFertilizante.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textMarcaFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textMarcaFertilizante.setColumns(10);
		textMarcaFertilizante.setBounds(183, 365, 152, 20);
		contentPane.add(textMarcaFertilizante);
		
		JLabel labelMarcaFertilizante = new JLabel("Marca Fertilizante");
		labelMarcaFertilizante.setForeground(Color.WHITE);
		labelMarcaFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelMarcaFertilizante.setBounds(181, 342, 132, 14);
		contentPane.add(labelMarcaFertilizante);
		
		textTipoFertilizante = new JTextField();
		textTipoFertilizante.setDocument( new DocumentoLimitado(10) ); //definindo o tamanho do campo
		textTipoFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoFertilizante.setColumns(10);
		textTipoFertilizante.setBounds(181, 305, 152, 20);
		contentPane.add(textTipoFertilizante);
		
		JLabel labelTipoFertilizante = new JLabel("Tipo Fertilizante");
		labelTipoFertilizante.setForeground(Color.WHITE);
		labelTipoFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoFertilizante.setBounds(181, 276, 132, 14);
		contentPane.add(labelTipoFertilizante);
		
		textNomeFertilizante = new JTextField();
		textNomeFertilizante.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textNomeFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textNomeFertilizante.setColumns(10);
		textNomeFertilizante.setBounds(10, 365, 152, 20);
		contentPane.add(textNomeFertilizante);
		
		JLabel labelNomeFertilizante = new JLabel("Nome Fertilizante");
		labelNomeFertilizante.setForeground(Color.WHITE);
		labelNomeFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNomeFertilizante.setBounds(10, 336, 132, 14);
		contentPane.add(labelNomeFertilizante);
		
		textCodFertilizante = new JTextField();
		//textCodFertilizante.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textCodFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodFertilizante.setColumns(10);
		textCodFertilizante.setBounds(10, 305, 152, 20);
		contentPane.add(textCodFertilizante);
		
		JLabel labelCodFertilizante = new JLabel("C\u00F3digo Fertilizante");
		labelCodFertilizante.setForeground(Color.WHITE);
		labelCodFertilizante.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodFertilizante.setBounds(10, 276, 132, 14);
		contentPane.add(labelCodFertilizante);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AcessoBD bd = new AcessoBD();
				if(bd.getConnection()){ 

					String sql ="select * from TB_FERTILIZANTE where ID_FERTILIZANTE = ? or NOME_FERTILIZANTE = ? or TIPO_FERTILIZANTE = ? or MARCA_FERT = ? "
							+ "or PESO_EMBALAGEM = ? or OBSERVACAO = ? or TIPO_APLIC = ? or CLASSIF = ?"; // instrução executada no banco de dados.

					try {
						
						// Recebendo os valores inseridos.
						/*String  id = textCodFertilizante.getText(); // ID_FERTILIZANTE	
						String  nome = textNomeFertilizante.getText(); // NOME_FERTILIZANTE		
						String  tipo =  textTipoFertilizante.getText(); // TIPO_FERTILIZANTE		
						String  marca =  textMarcaFertilizante.getText(); // MARCA_FERT	
						String  pesoEmbalagem =  textPesoEmbalagem.getText(); // PESO_EMBALAGEM	
						String  observacao =  textObservacao.getText(); // OBSERVACAO		
						String  tipoAplicacao =  textTipoDeAplicacao.getText(); // TIPO_APLIC		
						String  classificacao =  textClassificacao.getText(); // CLASSIF*/									
						
						bd.st = bd.con.prepareStatement(sql); // preparar a instrução para ser executada.
						bd.st.setString(1, textCodFertilizante.getText());
						bd.st.setString(2, textNomeFertilizante.getText());
						bd.st.setString(3, textTipoFertilizante.getText());
						bd.st.setString(4, textMarcaFertilizante.getText());
						bd.st.setString(5, textPesoEmbalagem.getText());
						bd.st.setString(6, textObservacao.getText());
						bd.st.setString(7, textTipoDeAplicacao.getText());
						bd.st.setString(8, textClassificacao.getText());
						bd.rs = bd.st.executeQuery(); // Obtém a posicao BOF da tabela e executa a Consulta.
						table_fertilizantes.setModel(DbUtils.resultSetToTableModel(bd.rs));	
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
		btPesquisar.setBounds(720, 315, 122, 25);
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
		btLimpar.setBounds(720, 356, 122, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fertilizante fertilizante = new Fertilizante(textCodFertilizante.getText(),textNomeFertilizante.getText(),
						textTipoFertilizante.getText(),textMarcaFertilizante.getText(),textPesoEmbalagem.getText(),
						textObservacao.getText(),textTipoDeAplicacao.getText(),textClassificacao.getText());
				
				FertilizanteDAO dao = new FertilizanteDAO();
				dao.alterar(fertilizante);
			}
		});
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(866, 315, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btDeletar = new JButton("Deletar");
		btDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fertilizante fertilizante = new Fertilizante(textCodFertilizante.getText());
				
				FertilizanteDAO dao = new FertilizanteDAO();
				dao.excluir(fertilizante);
			}
		});
		btDeletar.setForeground(Color.WHITE);
		btDeletar.setFont(new Font("Arial", Font.BOLD, 12));
		btDeletar.setBackground(new Color(0, 128, 0));
		btDeletar.setBounds(866, 356, 122, 25);
		contentPane.add(btDeletar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fertilizante fertilizante = new Fertilizante(textCodFertilizante.getText(),textNomeFertilizante.getText(),
						textTipoFertilizante.getText(),textMarcaFertilizante.getText(),textPesoEmbalagem.getText(),
						textObservacao.getText(),textTipoDeAplicacao.getText(),textClassificacao.getText());
				
				FertilizanteDAO dao = new FertilizanteDAO();
				dao.incluir(fertilizante);
			}
		});
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(720, 279, 268, 25);
		contentPane.add(btNovoCadastro);
		
		JLabel labelObservacao = new JLabel("Observa\u00E7\u00E3o");
		labelObservacao.setForeground(Color.WHITE);
		labelObservacao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelObservacao.setBounds(355, 276, 132, 14);
		contentPane.add(labelObservacao);
		
		textObservacao = new JTextField();
		textObservacao.setDocument( new DocumentoLimitado(150) ); //definindo o tamanho do campo
		textObservacao.setFont(new Font("Arial", Font.PLAIN, 12));
		textObservacao.setColumns(10);
		textObservacao.setBounds(355, 301, 152, 20);
		contentPane.add(textObservacao);
		
		JLabel labelTipoDeAplicacao = new JLabel("Tipo de Aplica\u00E7\u00E3o");
		labelTipoDeAplicacao.setForeground(Color.WHITE);
		labelTipoDeAplicacao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoDeAplicacao.setBounds(532, 276, 132, 14);
		contentPane.add(labelTipoDeAplicacao);
		
		textTipoDeAplicacao = new JTextField();
		textTipoDeAplicacao.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textTipoDeAplicacao.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoDeAplicacao.setColumns(10);
		textTipoDeAplicacao.setBounds(532, 299, 152, 20);
		contentPane.add(textTipoDeAplicacao);
		
		JLabel labelClassificacao = new JLabel("Classifica\u00E7\u00E3o");
		labelClassificacao.setForeground(Color.WHITE);
		labelClassificacao.setFont(new Font("Arial", Font.PLAIN, 12));
		labelClassificacao.setBounds(532, 340, 132, 14);
		contentPane.add(labelClassificacao);
		
		textClassificacao = new JTextField();
		textClassificacao.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textClassificacao.setFont(new Font("Arial", Font.PLAIN, 12));
		textClassificacao.setColumns(10);
		textClassificacao.setBounds(532, 365, 152, 20);
		contentPane.add(textClassificacao);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 979, 224);
		contentPane.add(scrollPane);
		
		table_fertilizantes = new JTable();
		scrollPane.setViewportView(table_fertilizantes);
		
		JButton btFiltroFertilizantes = new JButton("Filtrar Fertilizantes");
		btFiltroFertilizantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				refreshTable();
			}
		});
		btFiltroFertilizantes.setForeground(Color.WHITE);
		btFiltroFertilizantes.setFont(new Font("Arial", Font.BOLD, 12));
		btFiltroFertilizantes.setBackground(new Color(0, 128, 0));
		btFiltroFertilizantes.setBounds(720, 11, 268, 25);
		contentPane.add(btFiltroFertilizantes);
	}
}
