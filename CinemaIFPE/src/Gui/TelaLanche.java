package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import Core.ControlePoltrona;
import Core.Filme;
import Core.Lanche;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.SpinnerNumberModel;
import java.awt.event.KeyAdapter;
import javax.swing.border.Border;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class TelaLanche extends JFrame {

	private JPanel contentPane;
	private int qtdLanche1 = 0;
	private int qtdLanche2 = 0;
	private int qtdLanche3 = 0;
	private int qtdLanche4 = 0;
	private int qtdLanche5 = 0;
	private int valorLanche1;
	private int valorLanche2;
	private int valorLanche3;
	private int valorLanche4;
	private int valorLanche5;
			
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLanche frame = new TelaLanche();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaLanche() {
		
		
		
		Lanche lanche = new Lanche();
		
		setTitle("Escolha de lanches");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLanche.class.getResource("/Midia/ifpe.png")));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConfirmacao = new JLabel("");
		lblConfirmacao.setBounds(410, 447, 110, 29);
		contentPane.add(lblConfirmacao);
		
		JLabel cineifPaulista = new JLabel("CineIF Paulista");
		cineifPaulista.setHorizontalAlignment(SwingConstants.CENTER);
		cineifPaulista.setForeground(new Color(63, 164, 13, 236));
		cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 62));
		cineifPaulista.setBounds(0, 10, 986, 132);
		contentPane.add(cineifPaulista);
		
		JButton help = new JButton("Help");
		help.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	JOptionPane.showMessageDialog(null, "Você pode selecionar os lanches que deseja comprar." + "\n" +
	    "Você pode também pular sem comprar algum lanche.", "Help", JOptionPane.QUESTION_MESSAGE);
	      	}
	      });
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));

		help.setBounds(881, 25, 66, 29);
		contentPane.add(help);
		
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlePoltrona cp = new ControlePoltrona();
				cp.setPreco(0);
				SelecaoPoltronas poltrona = new SelecaoPoltronas();
				poltrona.setVisible(true);
				
				dispose();
			}
		});
		voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		voltar.setBounds(10, 26, 75, 35);
		contentPane.add(voltar);
		
		JLabel fotoLanche1 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche1.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche1.setBackground(new Color(128, 255, 255));
		fotoLanche1.setBounds(54, 184, 159, 167);	
		String buscarfoto1;
		
			try {
				buscarfoto1 = new Lanche().buscarFotoLanche(1);
			    String nomedoarquivo1 = buscarfoto1;
			    fotoLanche1.setIcon(new ImageIcon(nomedoarquivo1));
			  	fotoLanche1.setText("");
			  	contentPane.add(fotoLanche1);
			} catch (ClassNotFoundException e4) {
				lblConfirmacao.setText("Erro de conexão");
			} catch (SQLException e4) {
				lblConfirmacao.setText("Erro de conexão");
			}

		
		
		
		JLabel fotoLanche2 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche2.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche2.setBackground(new Color(128, 255, 255));
		fotoLanche2.setBounds(426, 184, 159, 167);		
		String buscarfoto2;
		try {
			buscarfoto2 = new Lanche().buscarFotoLanche(2);
			String nomedoarquivo2 = buscarfoto2;
		  	fotoLanche2.setIcon(new ImageIcon(nomedoarquivo2));
		  	fotoLanche2.setText("");				
			contentPane.add(fotoLanche2);
		} catch (ClassNotFoundException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		} catch (SQLException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		}	      
	    
				
		JLabel fotoLanche3 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche3.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche3.setBackground(new Color(128, 255, 255));
		fotoLanche3.setBounds(770, 184, 159, 167);		
		String buscarfoto3;
		try {
			buscarfoto3 = new Lanche().buscarFotoLanche(3);
			String nomedoarquivo3 = buscarfoto3;
		  	fotoLanche3.setIcon(new ImageIcon(nomedoarquivo3));
		  	fotoLanche3.setText("");		
			contentPane.add(fotoLanche3);
		} catch (ClassNotFoundException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		} catch (SQLException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		}	      
	    
		
		JLabel fotoLanche4 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche4.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche4.setBackground(new Color(128, 255, 255));
		fotoLanche4.setBounds(54, 447, 159, 167);
		String buscarfoto4;
		try {
			buscarfoto4 = new Lanche().buscarFotoLanche(4);
			 String nomedoarquivo4 = buscarfoto4;
			 fotoLanche4.setIcon(new ImageIcon(nomedoarquivo4));
			 fotoLanche4.setText("");		
			 contentPane.add(fotoLanche4);
		} catch (ClassNotFoundException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		} catch (SQLException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		}	      
	   
		
		JLabel fotoLanche5 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche5.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche5.setBackground(new Color(128, 255, 255));
		fotoLanche5.setBounds(770, 447, 159, 167);		
		String buscarfoto5;
		try {
			buscarfoto5 = new Lanche().buscarFotoLanche(5);
			String nomedoarquivo5 = buscarfoto5;
			fotoLanche5.setIcon(new ImageIcon(nomedoarquivo5));
			fotoLanche5.setText("");				
			contentPane.add(fotoLanche5);
		} catch (ClassNotFoundException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		} catch (SQLException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		}
		
		//////////////////////////////////////////////////////////////
		JLabel lblLanche1 = new JLabel("nome lanche");
		lblLanche1.setFont(new Font("Arial", Font.BOLD, 12));
		lblLanche1.setHorizontalAlignment(SwingConstants.LEFT);
				
			try {
				lanche.pegarLanche(1);
			} catch (Exception e1) {
				lblConfirmacao.setText("Erro de Conexão");
			} 		
		lblLanche1.setText("R$: " + lanche.getPreco() + ",00 / " + lanche.getNomeLanche());		
		lblLanche1.setBounds(56, 361, 199, 28);
		contentPane.add(lblLanche1);
		//////////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////
		JLabel lblLanche2 = new JLabel("nome lanche");
		lblLanche2.setHorizontalAlignment(SwingConstants.LEFT);
		lblLanche2.setFont(new Font("Arial", Font.BOLD, 12));
		
		try {
			lanche.pegarLanche(2);
			lblLanche2.setText("R$: " + lanche.getPreco() + ",00 / " + lanche.getNomeLanche());
			lblLanche2.setBounds(426, 361, 199, 28);
			contentPane.add(lblLanche2);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		} 
		
		////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////
		JLabel lblLanche3 = new JLabel("nome lanche");
		lblLanche3.setHorizontalAlignment(SwingConstants.LEFT);
		lblLanche3.setFont(new Font("Arial", Font.BOLD, 12));
		
		try {
			lanche.pegarLanche(3);
			lblLanche3.setText("R$: " + lanche.getPreco() + ",00 / " + lanche.getNomeLanche());;
			lblLanche3.setBounds(770, 361, 216, 28);
			contentPane.add(lblLanche3);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		}
		
		//////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////
		JLabel lblLanche4 = new JLabel("nome lanche");
		lblLanche4.setHorizontalAlignment(SwingConstants.LEFT);
		lblLanche4.setFont(new Font("Arial", Font.BOLD, 12));
		
		try {
			lanche.pegarLanche(4);
			lblLanche4.setText("R$: " + lanche.getPreco() + ",00 / " + lanche.getNomeLanche());
			lblLanche4.setBounds(54, 615, 199, 28);
			contentPane.add(lblLanche4);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		} 
		
		///////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////
		
		JLabel lblLanche5 = new JLabel("nome lanche");
		lblLanche5.setHorizontalAlignment(SwingConstants.LEFT);
		lblLanche5.setFont(new Font("Arial", Font.BOLD, 12));
		try {
			lanche.pegarLanche(5);
			lblLanche5.setText("R$: " + lanche.getPreco() + ",00 / " + lanche.getNomeLanche());
			lblLanche5.setBounds(770, 615, 216, 28);
			contentPane.add(lblLanche5);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		} 
		
		/////////////////////////////////////////////////////////////////////////
		ControlePoltrona cp = new ControlePoltrona();
		JLabel lblTotalIngresso = new JLabel();
		lblTotalIngresso.setText("TOTAL INGRESSO:" + "    " + "R$" + cp.getPreco());
		lblTotalIngresso.setFont(new Font("Arial", Font.BOLD, 12));
		lblTotalIngresso.setBounds(352, 461, 308, 25);
		contentPane.add(lblTotalIngresso);
		
		JLabel lblTotalLanches = new JLabel("TOTAL LANCHES: " + "    "+ "R$ 0");
		lblTotalLanches.setFont(new Font("Arial", Font.BOLD, 12));
		lblTotalLanches.setBounds(352, 496, 199, 25);
		contentPane.add(lblTotalLanches);
		
		JLabel lblTotalGeral = new JLabel("TOTAL GERAL:"+ "          " + "R$" + cp.getPreco());
		lblTotalGeral.setFont(new Font("Arial", Font.BOLD, 12));
		lblTotalGeral.setBounds(352, 531, 199, 25);
		contentPane.add(lblTotalGeral);
		
		JLabel lblQuantidade2 = new JLabel("0");
		lblQuantidade2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade2.setFont(new Font("Arial", Font.BOLD, 16));
		lblQuantidade2.setBounds(451, 390, 87, 35);
		contentPane.add(lblQuantidade2);
		
		JLabel lblQuantidade3 = new JLabel("0");
		lblQuantidade3.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade3.setFont(new Font("Arial", Font.BOLD, 16));
		lblQuantidade3.setBounds(804, 390, 81, 35);
		contentPane.add(lblQuantidade3);
		
		JLabel lblQuantidade5 = new JLabel("0");
		lblQuantidade5.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade5.setFont(new Font("Arial", Font.BOLD, 16));
		lblQuantidade5.setBounds(804, 639, 81, 35);
		contentPane.add(lblQuantidade5);
		
		JLabel lblQuantidade4 = new JLabel("0");
		lblQuantidade4.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade4.setFont(new Font("Arial", Font.BOLD, 16));
		lblQuantidade4.setBounds(88, 639, 81, 35);
		contentPane.add(lblQuantidade4);
		
		
		
		
		JLabel lblQuantidade1 = new JLabel();
		lblQuantidade1.setText("0");
		lblQuantidade1.setFont(new Font("Arial", Font.BOLD, 16));
		lblQuantidade1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade1.setBounds(88, 390, 81, 35);
		//lblQuantidade1.setText(quantidade);
		contentPane.add(lblQuantidade1);
		
		JButton adicionarLanche1 = new JButton("");
		adicionarLanche1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});	
		adicionarLanche1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche1 = new Lanche();
				try {
					lanche1.pegarLanche(1);
				} catch (ClassNotFoundException | SQLException e2) {
					e2.printStackTrace();
				}
				try {
					lanche1.pegarLanche(1);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				if(qtdLanche1 <= 9) {
				qtdLanche1 +=1;
				int operacao = lanche1.multiplicacaoLanche(qtdLanche1);
				valorLanche1 = operacao; 
				lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				}
				
				lblQuantidade1.setText(Integer.toString(qtdLanche1));
				
			}
		});
		adicionarLanche1.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/adicionarpngg.png")));
		adicionarLanche1.setBorderPainted(false);
		adicionarLanche1.setFocusPainted(false);		
		adicionarLanche1.setBounds(158, 390, 55, 40);
		adicionarLanche1.setBackground(new Color(240, 240, 240));
		contentPane.add(adicionarLanche1);
		
		
		JButton subtrairLanche1 = new JButton("");
		subtrairLanche1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche1 = new Lanche();
				try {
					lanche1.pegarLanche(1);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(qtdLanche1 > 0) {
					qtdLanche1 -=1;
					int operacao = lanche1.subtracaoLanche(qtdLanche1);
					valorLanche1 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				}
				
				
				lblQuantidade1.setText(Integer.toString(qtdLanche1));
			}
		});
		subtrairLanche1.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/subtrair.png")));
		subtrairLanche1.setBorderPainted(false);
		subtrairLanche1.setFocusPainted(false);
		subtrairLanche1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		subtrairLanche1.setBounds(43, 390, 55, 40);
		subtrairLanche1.setBackground(new Color(240, 240, 240,240));
		contentPane.add(subtrairLanche1);
		
		JButton adicionarLanche2 = new JButton("");
		adicionarLanche2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche2 = new Lanche();
				try {
					lanche2.pegarLanche(2);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				if(qtdLanche2 <= 9 ) {
					qtdLanche2 +=1;
					int operacao = lanche2.multiplicacaoLanche(qtdLanche2);
					valorLanche2 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					}
					
					lblQuantidade2.setText(Integer.toString(qtdLanche2));
					
			
			}
		});
		
		adicionarLanche2.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/adicionarpngg.png")));
		adicionarLanche2.setFocusPainted(false);
		adicionarLanche2.setBorderPainted(false);
		adicionarLanche2.setBackground(SystemColor.menu);
		adicionarLanche2.setBounds(528, 390, 55, 40);
		contentPane.add(adicionarLanche2);
		
		JButton subtrairLanche2 = new JButton("");
		subtrairLanche2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche2 = new Lanche();
				try {
					lanche2.pegarLanche(2);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				if(qtdLanche2 > 0) {
					qtdLanche2 -=1;
					int operacao = lanche2.subtracaoLanche(qtdLanche2); 
					valorLanche2 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				}	lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				lblQuantidade2.setText(Integer.toString(qtdLanche2));
			}
		});
		subtrairLanche2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		subtrairLanche2.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/subtrair.png")));
		subtrairLanche2.setFocusPainted(false);
		subtrairLanche2.setBorderPainted(false);
		subtrairLanche2.setBackground(new Color(240, 240, 240, 240));
		subtrairLanche2.setBounds(412, 390, 55, 40);
		contentPane.add(subtrairLanche2);
		
		JButton adicionarLanche3 = new JButton("");
		adicionarLanche3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche3 = new Lanche();
				try {
					lanche3.pegarLanche(3);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				if(qtdLanche3 <= 9 ) {
					qtdLanche3 +=1;
					int operacao = lanche3.multiplicacaoLanche(qtdLanche3);
					valorLanche3 = operacao;  
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					}
				lblQuantidade3.setText(Integer.toString(qtdLanche3));
			}
		});
		adicionarLanche3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adicionarLanche3.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/adicionarpngg.png")));
		adicionarLanche3.setFocusPainted(false);
		adicionarLanche3.setBorderPainted(false);
		adicionarLanche3.setBackground(SystemColor.menu);
		adicionarLanche3.setBounds(874, 390, 55, 40);
		contentPane.add(adicionarLanche3);
		
		JButton adicionarLanche5 = new JButton("");
		adicionarLanche5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche5 = new Lanche();
				try {
					lanche5.pegarLanche(5);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				if(qtdLanche5 <= 9 ) {
					qtdLanche5 +=1;
					int operacao = lanche5.multiplicacaoLanche(qtdLanche5);
					valorLanche5 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					}
				lblQuantidade5.setText(Integer.toString(qtdLanche5));
			}
		});
		adicionarLanche5.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/adicionarpngg.png")));
		adicionarLanche5.setFocusPainted(false);
		adicionarLanche5.setBorderPainted(false);
		adicionarLanche5.setBackground(SystemColor.menu);
		adicionarLanche5.setBounds(874, 638, 55, 40);
		contentPane.add(adicionarLanche5);
		
		JButton adicionarLanche4 = new JButton("");
		adicionarLanche4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche4 = new Lanche();
				try {
					lanche4.pegarLanche(4);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				
				if(qtdLanche4 <= 9 ) {
					qtdLanche4 +=1;
					int operacao = lanche4.multiplicacaoLanche(qtdLanche4);
					valorLanche4 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
					}
				lblQuantidade4.setText(Integer.toString(qtdLanche4));
			}
		});
		adicionarLanche4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adicionarLanche4.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/adicionarpngg.png")));
		adicionarLanche4.setFocusPainted(false);
		adicionarLanche4.setBorderPainted(false);
		adicionarLanche4.setBackground(SystemColor.menu);
		adicionarLanche4.setBounds(158, 638, 55, 40);
		contentPane.add(adicionarLanche4);
		
		JButton subtrairLanche4 = new JButton("");
		subtrairLanche4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche4 = new Lanche();
				try {
					lanche4.pegarLanche(4);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}

				if(qtdLanche4 > 0) {
					qtdLanche4 -=1;
					int operacao = lanche4.subtracaoLanche(qtdLanche4); 
					valorLanche4 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				}	lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				lblQuantidade4.setText(Integer.toString(qtdLanche4));
			}
		});
		subtrairLanche4.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/subtrair.png")));
		subtrairLanche4.setFocusPainted(false);
		subtrairLanche4.setBorderPainted(false);
		subtrairLanche4.setBackground(new Color(240, 240, 240, 240));
		subtrairLanche4.setBounds(43, 639, 55, 40);
		contentPane.add(subtrairLanche4);
		
		JButton subtrairLanche3 = new JButton("");
		subtrairLanche3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche3 = new Lanche();
				try {
					lanche3.pegarLanche(3);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				if(qtdLanche3 > 0) {
					qtdLanche3 -=1;
					int operacao = lanche3.subtracaoLanche(qtdLanche3);
					valorLanche3 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				}	lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				lblQuantidade3.setText(Integer.toString(qtdLanche3));
			}
		});
		subtrairLanche3.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/subtrair.png")));
		subtrairLanche3.setFocusPainted(false);
		subtrairLanche3.setBorderPainted(false);
		subtrairLanche3.setBackground(new Color(240, 240, 240, 240));
		subtrairLanche3.setBounds(759, 390, 55, 40);
		contentPane.add(subtrairLanche3);
		
		JButton subtrairLanche5 = new JButton("");
		subtrairLanche5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lanche lanche5 = new Lanche();
				try {
					lanche5.pegarLanche(5);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				if(qtdLanche5 > 0) {
					qtdLanche5 -=1;
					int operacao = lanche5.subtracaoLanche(qtdLanche5);
					valorLanche5 = operacao; 
					lblTotalLanches.setText("TOTAL LANCHES: " + "    " + "R$" + (valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				}	lblTotalGeral.setText("TOTAL GERAL: " + "          " + "R$" + (cp.getPreco() + valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5));
				lblQuantidade5.setText(Integer.toString(qtdLanche5));
			}
		});
		subtrairLanche5.setIcon(new ImageIcon(TelaLanche.class.getResource("/Midia/subtrair.png")));
		subtrairLanche5.setFocusPainted(false);
		subtrairLanche5.setBorderPainted(false);
		subtrairLanche5.setBackground(new Color(240, 240, 240, 240));
		subtrairLanche5.setBounds(759, 638, 55, 40);
		contentPane.add(subtrairLanche5);
		
		JLabel tituloLanches = new JLabel("LANCHES");
		tituloLanches.setForeground(new Color(63, 164, 13));
		tituloLanches.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLanches.setFont(new Font("Arial", Font.BOLD, 25));
		tituloLanches.setBounds(0, 129, 998, 45);
		contentPane.add(tituloLanches);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(337, 454, 337, 189);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton botaoContinuar = new JButton("CONTINUAR");
		botaoContinuar.setBounds(78, 139, 179, 39);
		panel_1.add(botaoContinuar);
		botaoContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(valorLanche1 + valorLanche2 + valorLanche3 + valorLanche4 + valorLanche5);
			}
		});
		botaoContinuar.setFont(new Font("Arial", Font.BOLD, 14));
	}
}