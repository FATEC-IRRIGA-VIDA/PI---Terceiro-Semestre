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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Plantio extends JFrame {

	private JPanel contentPane;
	private JTextField textQuantidadeDeSementes;
	private JTextField textTempoMedio;
	private JTextField textTipoPlantio;
	private JTextField textCodFertilizantes;
	private JTextField textCodPlantio;
	private JTextField textCodPlanta;
	private JTextField textCodUsuario;
	private JTextField textTipoDeAdubo;
	private JTextField textMetragem;
	public static Cadastros tela3;
	public static Plantio tela6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plantio frame = new Plantio();
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
	public Plantio() {
		setTitle("Plantio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 892, 538);
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
		dtrpnA.setBounds(10, 47, 438, 346);
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
		btSair.setBounds(10, 465, 89, 23);
		contentPane.add(btSair);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela3 = new Cadastros();
				tela3.setVisible(true);
				Cadastros.tela6.setVisible(false);
				
			}
		});
		btVoltar.setForeground(Color.WHITE);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btVoltar.setBackground(new Color(0, 128, 0));
		btVoltar.setBounds(778, 465, 89, 23);
		contentPane.add(btVoltar);
		
		textQuantidadeDeSementes = new JTextField();
		textQuantidadeDeSementes.setFont(new Font("Arial", Font.PLAIN, 12));
		textQuantidadeDeSementes.setColumns(10);
		textQuantidadeDeSementes.setBounds(458, 332, 132, 20);
		contentPane.add(textQuantidadeDeSementes);
		
		JLabel labelQuantidadeDeSementes = new JLabel("Quantidade de Sementes");
		labelQuantidadeDeSementes.setForeground(Color.WHITE);
		labelQuantidadeDeSementes.setFont(new Font("Arial", Font.PLAIN, 12));
		labelQuantidadeDeSementes.setBounds(458, 309, 150, 14);
		contentPane.add(labelQuantidadeDeSementes);
		
		textTempoMedio = new JTextField();
		textTempoMedio.setFont(new Font("Arial", Font.PLAIN, 12));
		textTempoMedio.setColumns(10);
		textTempoMedio.setBounds(460, 278, 130, 20);
		contentPane.add(textTempoMedio);
		
		JLabel labelTempoMedio = new JLabel("Tempo M\u00E9dio Irriga\u00E7\u00E3o");
		labelTempoMedio.setForeground(Color.WHITE);
		labelTempoMedio.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTempoMedio.setBounds(458, 255, 132, 14);
		contentPane.add(labelTempoMedio);
		
		textTipoPlantio = new JTextField();
		textTipoPlantio.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoPlantio.setColumns(10);
		textTipoPlantio.setBounds(458, 215, 132, 20);
		contentPane.add(textTipoPlantio);
		
		JLabel labelTipoPlantio = new JLabel("Tipo de Plantio");
		labelTipoPlantio.setForeground(Color.WHITE);
		labelTipoPlantio.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoPlantio.setBounds(458, 192, 132, 14);
		contentPane.add(labelTipoPlantio);
		
		textCodFertilizantes = new JTextField();
		textCodFertilizantes.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodFertilizantes.setColumns(10);
		textCodFertilizantes.setBounds(458, 149, 132, 20);
		contentPane.add(textCodFertilizantes);
		
		JLabel labelCodFertilizantes = new JLabel("C\u00F3digo Fertilizantes");
		labelCodFertilizantes.setForeground(Color.WHITE);
		labelCodFertilizantes.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodFertilizantes.setBounds(458, 120, 132, 14);
		contentPane.add(labelCodFertilizantes);
		
		textCodPlantio = new JTextField();
		textCodPlantio.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodPlantio.setColumns(10);
		textCodPlantio.setBounds(458, 76, 132, 20);
		contentPane.add(textCodPlantio);
		
		JLabel labelCodPlantio = new JLabel("C\u00F3digo do Plantio");
		labelCodPlantio.setForeground(Color.WHITE);
		labelCodPlantio.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodPlantio.setBounds(458, 47, 132, 14);
		contentPane.add(labelCodPlantio);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.setForeground(Color.WHITE);
		btPesquisar.setFont(new Font("Arial", Font.BOLD, 12));
		btPesquisar.setBackground(new Color(0, 128, 0));
		btPesquisar.setBounds(745, 73, 122, 25);
		contentPane.add(btPesquisar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setForeground(Color.WHITE);
		btLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btLimpar.setBackground(new Color(0, 128, 0));
		btLimpar.setBounds(745, 115, 122, 25);
		contentPane.add(btLimpar);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.setForeground(Color.WHITE);
		btAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btAtualizar.setBackground(new Color(0, 128, 0));
		btAtualizar.setBounds(745, 151, 122, 25);
		contentPane.add(btAtualizar);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btCancelar.setBackground(new Color(0, 128, 0));
		btCancelar.setBounds(745, 187, 122, 25);
		contentPane.add(btCancelar);
		
		JButton btNovoCadastro = new JButton("Novo Cadastro");
		btNovoCadastro.setForeground(Color.WHITE);
		btNovoCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btNovoCadastro.setBackground(new Color(0, 128, 0));
		btNovoCadastro.setBounds(745, 223, 122, 25);
		contentPane.add(btNovoCadastro);
		
		JLabel labelCodPlanta = new JLabel("C\u00F3digo da Planta");
		labelCodPlanta.setForeground(Color.WHITE);
		labelCodPlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodPlanta.setBounds(614, 47, 132, 14);
		contentPane.add(labelCodPlanta);
		
		textCodPlanta = new JTextField();
		textCodPlanta.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodPlanta.setColumns(10);
		textCodPlanta.setBounds(614, 76, 98, 20);
		contentPane.add(textCodPlanta);
		
		textCodUsuario = new JTextField();
		textCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textCodUsuario.setColumns(10);
		textCodUsuario.setBounds(614, 149, 98, 20);
		contentPane.add(textCodUsuario);
		
		JLabel labelCodUsuario = new JLabel("C\u00F3digo do Usu\u00E1rio");
		labelCodUsuario.setForeground(Color.WHITE);
		labelCodUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		labelCodUsuario.setBounds(614, 120, 132, 14);
		contentPane.add(labelCodUsuario);
		
		textTipoDeAdubo = new JTextField();
		textTipoDeAdubo.setFont(new Font("Arial", Font.PLAIN, 12));
		textTipoDeAdubo.setColumns(10);
		textTipoDeAdubo.setBounds(614, 215, 98, 20);
		contentPane.add(textTipoDeAdubo);
		
		JLabel labelTipoDeAdubo = new JLabel("Tipo de Adubo");
		labelTipoDeAdubo.setForeground(Color.WHITE);
		labelTipoDeAdubo.setFont(new Font("Arial", Font.PLAIN, 12));
		labelTipoDeAdubo.setBounds(614, 192, 132, 14);
		contentPane.add(labelTipoDeAdubo);
		
		textMetragem = new JTextField();
		textMetragem.setFont(new Font("Arial", Font.PLAIN, 12));
		textMetragem.setColumns(10);
		textMetragem.setBounds(616, 278, 98, 20);
		contentPane.add(textMetragem);
		
		JLabel labelMetragem = new JLabel("Metragem (m\u00B2)");
		labelMetragem.setForeground(Color.WHITE);
		labelMetragem.setFont(new Font("Arial", Font.PLAIN, 12));
		labelMetragem.setBounds(614, 255, 132, 14);
		contentPane.add(labelMetragem);
		
		JLabel labelInicioPlantio = new JLabel("Inicio do Plantio");
		labelInicioPlantio.setForeground(Color.WHITE);
		labelInicioPlantio.setFont(new Font("Arial", Font.PLAIN, 12));
		labelInicioPlantio.setBounds(458, 379, 150, 14);
		contentPane.add(labelInicioPlantio);
		
		JLabel labelFimPlantio = new JLabel("Fim do Plantio");
		labelFimPlantio.setForeground(Color.WHITE);
		labelFimPlantio.setFont(new Font("Arial", Font.PLAIN, 12));
		labelFimPlantio.setBounds(458, 436, 150, 14);
		contentPane.add(labelFimPlantio);
		
		JLabel labelInicioColheita = new JLabel("Inicio da Colheita");
		labelInicioColheita.setForeground(Color.WHITE);
		labelInicioColheita.setFont(new Font("Arial", Font.PLAIN, 12));
		labelInicioColheita.setBounds(618, 379, 150, 14);
		contentPane.add(labelInicioColheita);
		
		JLabel labelFimColheita = new JLabel("Fim da Colheita");
		labelFimColheita.setForeground(Color.WHITE);
		labelFimColheita.setFont(new Font("Arial", Font.PLAIN, 12));
		labelFimColheita.setBounds(618, 436, 150, 14);
		contentPane.add(labelFimColheita);
		
		JDateChooser dateChooserInicioPlantio = new JDateChooser();
		dateChooserInicioPlantio.setBounds(454, 404, 136, 20);
		contentPane.add(dateChooserInicioPlantio);
		
		JDateChooser dateChooserFimPlantio = new JDateChooser();
		dateChooserFimPlantio.setBounds(454, 465, 136, 20);
		contentPane.add(dateChooserFimPlantio);
		
		JDateChooser dateChooserInicioColheita = new JDateChooser();
		dateChooserInicioColheita.setBounds(614, 404, 136, 20);
		contentPane.add(dateChooserInicioColheita);
		
		JDateChooser dateChooserFimColheita = new JDateChooser();
		dateChooserFimColheita.setBounds(614, 465, 136, 20);
		contentPane.add(dateChooserFimColheita);
	}
}
