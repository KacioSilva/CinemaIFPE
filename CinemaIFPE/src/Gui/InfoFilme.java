package Gui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import Core.Filme;
import Core.Sessao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;


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
	private JLabel lblHorario;
	private JButton help;
	private JButton voltar;
	private JLabel nomeFilme;
	private static String nomePoltrona;
	private static String horarioPoltrona;
	private static String minutoPoltrona;
	private static String segundoPoltrona;
	
	private Sessao sessao = new Sessao();

	public static Object getMinutoPoltrona() {
		return minutoPoltrona;
	}

	public static void setMinutoPoltrona(String minutoPoltrona) {
		InfoFilme.minutoPoltrona = minutoPoltrona;
	}

	public static Object getSegundoPoltrona() {
		return segundoPoltrona;
	}

	public static void setSegundoPoltrona(String segundoPoltrona) {
		InfoFilme.segundoPoltrona = segundoPoltrona;
	}

	public static Object getNomePoltrona() {
		return nomePoltrona;
	}

	public void setNomePoltrona(String nomePoltrona) {
		this.nomePoltrona = nomePoltrona;
	}

	
	public static Object getHorarioPoltrona() {
		return horarioPoltrona;
	}

	public void setHorarioPoltrona(String horarioPoltrona) {
		this.horarioPoltrona = horarioPoltrona;
	}
	
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
	
	public InfoFilme(){
		try {
			sessao.pegarSessao(TelaInicial.getIdFilme());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		int horas = Integer.parseInt(sessao.getHoras());
		int minutos = Integer.parseInt(sessao.getMinutos());
		int segundos = Integer.parseInt(sessao.getSegundos());
		LocalTime tempoAtual = LocalTime.now();
		LocalTime tempoBD = LocalTime.of(horas, minutos, segundos);
		Duration tempoDiferenca = Duration.between(tempoAtual, tempoBD);
		System.out.println(tempoDiferenca);

		
		setTitle("Informações sobre o filme");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InfoFilme.class.getResource("/Midia/ifpe.png")));
		Filme filme = new Filme();
		
		try {
			filme.pegarFilmes(TelaInicial.getIdFilme());
			sessao.pegarSessao(TelaInicial.getIdFilme());
		} catch (Exception e2) {
			txtSinopse.setText("erro de conexão");
			genero.setText("erro de conexão");
			duracao.setText("erro de conexão");
			dataLancamento.setText("erro de conexão");
			diretor.setText("erro de conexão");
			classificacaoIndicativa.setText("erro de conexão");
			nomeFilme.setText("erro de conexão");
		}
		
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
	  
	  	txtSinopse.setText(filme.getSinopse());
	  
	  	//------CRIANDO O SCROLLPANE
	  	JScrollPane scroll = new JScrollPane(txtSinopse, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	  	scroll.setBounds(722, 185, 240, 230);
	  	contentPane.add(scroll);
	  	

	  	Filme = new JLabel();
	  	Filme.setBounds(354, 137, 214, 255);
	  	String buscarfoto = new Filme().buscarCartaz(TelaInicial.getIdFilme());
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
	  	nomeFilme.setBounds(10, 11, 140, 27);
	  	panel.add(nomeFilme);
	  	
	  	setNomePoltrona(filme.getNome());
	  	
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
	  	if(tempoDiferenca.isNegative()) {
	  		btnNewButton.setEnabled(false);
		}
		
	  	btnNewButton.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			Poltronas poltronas = new Poltronas();
	  			poltronas.setVisible(true);
	  			dispose();
	  			
	  		}
	  	});
	  	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	  	btnNewButton.setBounds(354, 572, 278, 40);
	  	contentPane.add(btnNewButton);
	  	
	  	
	  	lblNewLabel_6 = new JLabel("Sessão Disponível");
	  	if(tempoDiferenca.isNegative()) {
	  		lblNewLabel_6.setText("Sessão Indisposnível");
		}
	  	
	  	lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
	  	lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
	  	lblNewLabel_6.setBounds(354, 451, 278, 28);
	  	contentPane.add(lblNewLabel_6);
	  	
	  	cineifPaulista = new JLabel("CineIF Paulista");
	  	cineifPaulista.setForeground(new Color(63, 164, 13, 236));
	  	cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 62));
	  	cineifPaulista.setBounds(268, 22, 445, 85);
	  	contentPane.add(cineifPaulista);
	  	
	  	
	  	lblHorario = new JLabel();
	  	lblHorario.setHorizontalAlignment(SwingConstants.CENTER);
	  	lblHorario.setForeground(Color.RED);
	  	lblHorario.setFont(new Font("Tahoma", Font.BOLD, 17));
	  	lblHorario.setBounds(354, 499, 278, 37);
	  	lblHorario.setText(sessao.getHoras()+" Horas" + " " + sessao.getMinutos()+ " Minutos");
	  	contentPane.add(lblHorario);
	  	
	  	//pegando horario sessão
	  	setHorarioPoltrona(sessao.getHoras());
	  	setMinutoPoltrona(sessao.getMinutos());
	  	setSegundoPoltrona(sessao.getSegundos());
	  	
	  
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
				TelaDeFilmes voltar = null;
				voltar = new TelaDeFilmes();
		        voltar.setVisible(true);
		        dispose();
			}
		});
		voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		voltar.setBounds(10, 22, 75, 35);
		contentPane.add(voltar);	
		
		JLabel lblNewLabel = new JLabel("SINOPSE");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(722, 152, 240, 23);
		contentPane.add(lblNewLabel);
	}  	
}