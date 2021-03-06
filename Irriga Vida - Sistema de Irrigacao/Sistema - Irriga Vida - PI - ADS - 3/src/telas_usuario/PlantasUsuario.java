package telas_usuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import metodos.AcessoBD;
import metodos.DocumentoLimitado;
import telas_usuario.CadastrosUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class PlantasUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textCodPlanta;
	private JTextField textNomePlanta;
	private JTextField textNomeCientifico;
	private JTextField textOrigem;
	private JTextField textFamilia;
	public static PlantasUsuario tela14;
	public static CadastrosUsuario tela13;
	private JTextField textTipoDaPlanta;
	private JTextField textClima;
	private JTextField textObservacoes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlantasUsuario frame = new PlantasUsuario();
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
	public PlantasUsuario() {
		setTitle("Plantas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 825, 472);
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
		
		textCodPlanta = new JTextField();
		//textPlanta.setDocument( new DocumentoLimitado(30) ); //definindo o tamanho do campo
		textCodPlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodPlanta.setColumns(10);
		textCodPlanta.setBounds(458, 76, 152, 20);
		contentPane.add(textCodPlanta);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AcessoBD bd = new AcessoBD();
				if(bd.getConnection()){ 
					
					String sql ="select * from TB_PLANTA "; // instru??o executada no banco de dados.
					try {
						
						// Recebendo os valores inseridos.
						String  id = textCodPlanta.getText(); // ID_PLANTA							
						String nome = textNomePlanta.getText(); // NOME_POPULAR
						String nomect = textNomeCientifico.getText(); // NOME_CIENT
						String origem = textOrigem.getText(); // ORIGEM
						String familia = textFamilia.getText(); // FAMILIA
						String tipo = textTipoDaPlanta.getText(); // TIPO_PLANTA
						String clima = textClima.getText(); // CLIMA
						String obs = textObservacoes.getText(); // OBSERVACOES
						
						
						int cont=0; // variavel para controle da valida??o da consulta cont=0 (sem registro) / cont=1 (registro encontrado).
						
						bd.st = bd.con.prepareStatement(sql); // preparar a instru??o para ser executada.
						bd.rs = bd.st.executeQuery(); // Obt?m a posicao BOF da tabela e executa a Consulta.
						while (bd.rs.next()) { // enquanto existir o pr?ximo registro
							
							// Pesquisa por todos os campos
							if (id.equals(bd.rs.getString("ID_PLANTA"))
									&& nome.equals(bd.rs.getString("NOME_POPULAR")) && nomect.equals(bd.rs.getString("NOME_CIENT")) 
									&& origem.equals(bd.rs.getString("ORIGEM")) && familia.equals(bd.rs.getString("FAMILIA"))
									&& tipo.equals(bd.rs.getString("TIPO_PLANTA")) && clima.equals(bd.rs.getString("CLIMA"))
									&& obs.equals(bd.rs.getString("OBSERVACOES"))) {
								cont = 1; // Atribui valor 1 para sair da consulta.
								JOptionPane.showMessageDialog(null, "Planta j? cadastrada!");
							}

							/*// Pesquisa pelo campo ID
							else if (id.equals(bd.rs.getString("ID_PLANTA")))
								{
									cont = 1; // Atribui valor 1 para sair da consulta.
									JOptionPane.showMessageDialog(null, "Planta j? cadastrada!" + ": " + bd.rs.getString("NOME_POPULAR"));
								}*/
							
							// Pesquisa sem o Campo Observa??es
							else if (id.equals(bd.rs.getString("ID_PLANTA"))
									&& nome.equals(bd.rs.getString("NOME_POPULAR")) && nomect.equals(bd.rs.getString("NOME_CIENT")) 
									&& origem.equals(bd.rs.getString("ORIGEM")) && familia.equals(bd.rs.getString("FAMILIA"))
									&& tipo.equals(bd.rs.getString("TIPO_PLANTA")) && clima.equals(bd.rs.getString("CLIMA"))) {
								cont = 1; // Atribui valor 1 para sair da consulta.
								JOptionPane.showMessageDialog(null, "Planta j? cadastrada!");
							}
							
							// Pesquisa sem o Campo Tipo da Planta
							else if (id.equals(bd.rs.getString("ID_PLANTA"))
									&& nome.equals(bd.rs.getString("NOME_POPULAR")) && nomect.equals(bd.rs.getString("NOME_CIENT")) 
									&& origem.equals(bd.rs.getString("ORIGEM")) && familia.equals(bd.rs.getString("FAMILIA"))
									&& clima.equals(bd.rs.getString("CLIMA"))) {
								cont = 1; // Atribui valor 1 para sair da consulta.
								JOptionPane.showMessageDialog(null, "Planta j? cadastrada!");
							}
							
							// Pesquisa sem o Campo Origem
							else if (id.equals(bd.rs.getString("ID_PLANTA"))
									&& nome.equals(bd.rs.getString("NOME_POPULAR")) && nomect.equals(bd.rs.getString("NOME_CIENT")) 
									&& familia.equals(bd.rs.getString("FAMILIA"))
									&& tipo.equals(bd.rs.getString("TIPO_PLANTA")) && clima.equals(bd.rs.getString("CLIMA"))) {
								cont = 1; // Atribui valor 1 para sair da consulta.
								JOptionPane.showMessageDialog(null, "Planta j? cadastrada!");
							}
							
							// Pesquisa sem o Campo Nome Cientifico
							else if (id.equals(bd.rs.getString("ID_PLANTA"))
									&& nome.equals(bd.rs.getString("NOME_POPULAR")) && origem.equals(bd.rs.getString("ORIGEM")) 
									&& familia.equals(bd.rs.getString("FAMILIA"))
									&& tipo.equals(bd.rs.getString("TIPO_PLANTA")) && clima.equals(bd.rs.getString("CLIMA"))) {
								cont = 1; // Atribui valor 1 para sair da consulta.
								JOptionPane.showMessageDialog(null, "Planta j? cadastrada!");
							}
							
							// Pesquisa sem o Campo Familia
							else if (id.equals(bd.rs.getString("ID_PLANTA"))
									&& nome.equals(bd.rs.getString("NOME_POPULAR")) && nomect.equals(bd.rs.getString("NOME_CIENT")) 
									&& origem.equals(bd.rs.getString("ORIGEM")) 
									&& tipo.equals(bd.rs.getString("TIPO_PLANTA")) && clima.equals(bd.rs.getString("CLIMA"))) {
								cont = 1; // Atribui valor 1 para sair da consulta.
								JOptionPane.showMessageDialog(null, "Planta j? cadastrada!");
							}
							
							// Pesquisa sem o Campo Clima
							else if (id.equals(bd.rs.getString("ID_PLANTA"))
									&& nome.equals(bd.rs.getString("NOME_POPULAR")) && nomect.equals(bd.rs.getString("NOME_CIENT")) 
									&& origem.equals(bd.rs.getString("ORIGEM")) && familia.equals(bd.rs.getString("FAMILIA"))
									&& tipo.equals(bd.rs.getString("TIPO_PLANTA"))){
								cont = 1; // Atribui valor 1 para sair da consulta.
								JOptionPane.showMessageDialog(null, "Planta j? cadastrada!");
							}
							
							}
								// Dado n?o encontrado no Banco de dados.
								if(cont==0)
									JOptionPane.showMessageDialog(null, "Planta n?o cadastrada no sistema!");	
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
		btPesquisar.setBounds(620, 71, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpando dados inseridos nas textboxs.
				textCodPlanta.setText("");
				textNomePlanta.setText("");
				textNomeCientifico.setText("");
				textOrigem.setText("");
				textFamilia.setText("");
				textTipoDaPlanta.setText("");
				textClima.setText("");
				textObservacoes.setText("");
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
		btSair.setBounds(10, 396, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					tela13 = new CadastrosUsuario();
					tela13.setVisible(true);
					CadastrosUsuario.tela14.setVisible(false);
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(109, 396, 89, 23);
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
		
		textTipoDaPlanta = new JTextField();
		textTipoDaPlanta.setDocument( new DocumentoLimitado(10) ); //definindo o tamanho do campo
		textTipoDaPlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoDaPlanta.setColumns(10);
		textTipoDaPlanta.setBounds(639, 280, 152, 20);
		contentPane.add(textTipoDaPlanta);
		
		JLabel labelTipoDaPlanta = new JLabel("Tipo da Planta");
		labelTipoDaPlanta.setForeground(Color.WHITE);
		labelTipoDaPlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoDaPlanta.setBounds(639, 257, 132, 14);
		contentPane.add(labelTipoDaPlanta);
		
		JLabel labelClima = new JLabel("Clima");
		labelClima.setForeground(Color.WHITE);
		labelClima.setFont(new Font("Arial", Font.PLAIN, 12));
		labelClima.setBounds(639, 311, 132, 14);
		contentPane.add(labelClima);
		
		textClima = new JTextField();
		textClima.setDocument( new DocumentoLimitado(20) ); //definindo o tamanho do campo
		textClima.setFont(new Font("Arial", Font.PLAIN, 12));
		textClima.setColumns(10);
		textClima.setBounds(639, 334, 152, 20);
		contentPane.add(textClima);
		
		textObservacoes = new JTextField();
		textObservacoes.setDocument( new DocumentoLimitado(120) ); //definindo o tamanho do campo
		textObservacoes.setFont(new Font("Arial", Font.PLAIN, 12));
		textObservacoes.setColumns(10);
		textObservacoes.setBounds(458, 388, 333, 39);
		contentPane.add(textObservacoes);
		
		JLabel labelObservacoes = new JLabel("Observa\u00E7\u00F5es");
		labelObservacoes.setForeground(Color.WHITE);
		labelObservacoes.setFont(new Font("Arial", Font.PLAIN, 12));
		labelObservacoes.setBounds(458, 365, 132, 14);
		contentPane.add(labelObservacoes);
	}

}
