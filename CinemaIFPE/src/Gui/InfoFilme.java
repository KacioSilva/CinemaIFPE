package Gui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import Core.Filme;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class InfoFilme extends JFrame {

	private JPanel contentPane;
	private JTextArea txtSinopse;
	private JLabel Filme;
	private JPanel panel_1;
	private JLabel classificacaoIndicativa;
	private JPanel panel_2;
	private JLabel genero;
	private JPanel panel_3;
	private JLabel duracao;
	private JPanel panel_4;
	private JLabel dataLancamento;
	private JPanel panel_5;
	private JLabel diretor;
	private JButton btnNewButton;
	private JLabel lblNewLabel_6;
	private JLabel cineifPaulista;
	private JLabel lblNewLabel_7;
	private JButton help;
	private JButton voltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoFilme frame = new InfoFilme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public InfoFilme() throws Exception {
		Filme filme = new Filme();
		
		filme.pegarFilmes(1);
		
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		
		contentPane.setLayout(null);
		txtSinopse = new JTextArea();
		txtSinopse.setEditable(false);
		txtSinopse.setLineWrap(true);
		txtSinopse.setBackground(Color.WHITE);
		txtSinopse.setForeground(SystemColor.infoText);
	  	txtSinopse.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	  
	  	txtSinopse.setText((filme.getSinopse()));
	  
	  	
	  	//------CRIANDO O SCROLLPANE
	  	JScrollPane scroll = new JScrollPane(txtSinopse, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	  	scroll.setBounds(722, 185, 240, 230);
	  	contentPane.add(scroll);
	  	
	  	Filme = new JLabel();
	  	Filme.setBounds(354, 137, 214, 255);
	  	String buscarfoto = new Filme().buscarCartaz(1);
	    String nomedoarquivo = buscarfoto;
	  	Filme.setIcon(new ImageIcon(nomedoarquivo));
	  	Filme.setText(buscarfoto);

	  	contentPane.add(Filme);
	  	
	  	
	  	
	  	JPanel panel = new JPanel();
	  	panel.setBounds(27, 130, 160, 49);
	  	panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nome", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  	contentPane.add(panel);
	  	panel.setLayout(null);
	  	
	  	JLabel nomeFilme = new JLabel("Nome");
	  	nomeFilme.setText(filme.getNome());
	  	nomeFilme.setBounds(32, 11, 118, 27);
	  	panel.add(nomeFilme);
	  	
	  	panel_1 = new JPanel();
	  	panel_1.setLayout(null);
	  	panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Classifica\u00E7\u00E3o Indicativa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  	panel_1.setBounds(29, 206, 160, 49);
	  	contentPane.add(panel_1);
	  	
	  	classificacaoIndicativa = new JLabel("Classificação Indicativa");
	  	classificacaoIndicativa.setText(filme.getClassIndicativa());
	  	classificacaoIndicativa.setBounds(32, 11, 118, 27);
	  	panel_1.add(classificacaoIndicativa);
	  	
	  	panel_2 = new JPanel();
	  	panel_2.setLayout(null);
	  	panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "G\u00EAnero", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  	panel_2.setBounds(29, 284, 160, 49);
	  	contentPane.add(panel_2);
	  	
	  	genero = new JLabel("Gênero");
	  	genero.setText(filme.getGenero());
	  	genero.setBounds(32, 11, 118, 27);
	  	panel_2.add(genero);
	  	
	  	panel_3 = new JPanel();
	  	panel_3.setLayout(null);
	  	panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dura\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  	panel_3.setBounds(29, 360, 160, 49);
	  	contentPane.add(panel_3);
	  	
	  	duracao = new JLabel("Duração");
	  	duracao.setText(filme.getDuracao());
	  	duracao.setBounds(32, 11, 118, 27);
	  	panel_3.add(duracao);
	  	
	  	panel_4 = new JPanel();
	  	panel_4.setLayout(null);
	  	panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Data de Lan\u00E7amento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  	panel_4.setBounds(29, 430, 160, 49);
	  	contentPane.add(panel_4);
	  	
	  	dataLancamento = new JLabel("Data Lançamento");
	  	dataLancamento.setText(filme.getAnoLancamento());
	  	dataLancamento.setBounds(32, 11, 118, 27);
	  	panel_4.add(dataLancamento);
	  	
	  	panel_5 = new JPanel();
	  	panel_5.setLayout(null);
	  	panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Diretor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	  	panel_5.setBounds(29, 514, 160, 49);
	  	contentPane.add(panel_5);
	  	
	  	diretor = new JLabel("Diretor");
	  	diretor.setText(filme.getDiretor());
	  	diretor.setBounds(32, 11, 118, 27);
	  	panel_5.add(diretor);
	  	
	  	btnNewButton = new JButton("Comprar Ingresso");
	  	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	  	btnNewButton.setBounds(363, 581, 171, 40);
	  	contentPane.add(btnNewButton);
	  	
	  	lblNewLabel_6 = new JLabel("Sessão Disponível");
	  	lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
	  	lblNewLabel_6.setBounds(349, 451, 214, 28);
	  	contentPane.add(lblNewLabel_6);
	  	
	  	cineifPaulista = new JLabel("CineIF Paulista");
	  	cineifPaulista.setForeground(new Color(63, 164, 13, 236));
	  	cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 62));
	  	cineifPaulista.setBounds(268, 22, 445, 85);
	  	contentPane.add(cineifPaulista);
	  	
	  	lblNewLabel_7 = new JLabel("8:00 A.M ");
	  	lblNewLabel_7.setForeground(Color.RED);
	  	lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
	  	lblNewLabel_7.setBounds(407, 493, 108, 37);
	  	contentPane.add(lblNewLabel_7);
	  	
	  	JButton help = new JButton("Help");
		help.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		 JOptionPane.showMessageDialog(null, "Nessa tela, você tem acesso às informações do filme. " +
	                     "você pode dar continuidade a compra. ", "Help", JOptionPane.QUESTION_MESSAGE);
	      	}
	      });
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		help.setBounds(897, 25, 66, 29);
		contentPane.add(help);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial voltar = null;
				try {
					voltar = new TelaInicial();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        voltar.setVisible(true);
		        dispose();
			}
		});
		voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		voltar.setBounds(10, 22, 75, 35);
		contentPane.add(voltar);	
	}  	
}
