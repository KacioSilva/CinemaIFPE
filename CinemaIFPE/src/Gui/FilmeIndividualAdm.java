package Gui;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Core.Administrador;
import Core.Filme;
import Core.Imagem;
import Database.Conexao;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;


public class FilmeIndividualAdm extends JFrame {
	
	private JPanel contentPane;
	private String alterarimagem;
	private String posicao;
	private JTextField txtClassificacao;
	private JTextField txtDuracao;
	private JTextField txtGenero;
	private JTextField txtDiretor;
	private JButton limparCampos;
	private JButton sessao3;
	private JButton sessao4;
	private JTextField textFilme;
	private String nomedofilme;
	private JTextField tfcaminhofoto;
	private Filme filme;
	private String nomeArquivo;
	private Filme filmeObj = new Filme();
	private JTextField textId;
	private JTextField textLancamento;
	private JTextArea txtSinopse;
	private JTable jtableImagem;
	File file;
	Conexao conexao = new Conexao();
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	//-------CRIANDO A TELA
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmeIndividualAdm frame = new FilmeIndividualAdm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public FilmeIndividualAdm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FilmeIndividualAdm.class.getResource("/Midia/ifpe.png")));
		
		setTitle("ALTERAR FILMES - ADM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
		//-------CRIANDO OS LABELS	
		JLabel nomeFilme = new JLabel("NOME DO FILME");
		nomeFilme.setHorizontalAlignment(SwingConstants.CENTER);
		nomeFilme.setFont(new Font("Arial", Font.BOLD, 14));
		nomeFilme.setBounds(354, 127, 217, 29);
		contentPane.add(nomeFilme);
		
	  
		
		
		//-------CRIANDO OS BOTÕES	
	    JButton voltar = new JButton("VOLTAR");
	    voltar.setFont(new Font("Arial", Font.BOLD, 12));
	    voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HubADM voltando = new HubADM();
				voltando.setVisible(true);
				dispose();
			}
		});
	    voltar.setBounds(39, 26, 85, 29);
		contentPane.add(voltar);
	   
//	    
//	    JButton fotofilme = new JButton("FOTO DO FILME");
//	    fotofilme.addActionListener(new ActionListener() {
//	    	public void actionPerformed(ActionEvent e) {
//	    	}
//	    });
//	    fotofilme.setBounds(39, 142, 181, 222);
//	    contentPane.add(fotofilme);
	    
	    
	    
	    txtClassificacao = new JTextField();
	    
	    txtClassificacao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
	    
	    txtClassificacao.setHorizontalAlignment(SwingConstants.CENTER);
	    txtClassificacao.setBounds(39, 202, 144, 19);
	    contentPane.add(txtClassificacao);
	    txtClassificacao.setColumns(10);
	    
	    txtDuracao = new JTextField();
	    
	    txtDuracao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
	    
	    txtDuracao.setHorizontalAlignment(SwingConstants.CENTER);
	    txtDuracao.setBounds(39, 260, 144, 19);
	    contentPane.add(txtDuracao);
	    txtDuracao.setColumns(10);
	    
	    txtGenero = new JTextField();
	    txtGenero.setHorizontalAlignment(SwingConstants.CENTER);
	    txtGenero.setBounds(39, 312, 144, 19);
	    contentPane.add(txtGenero);
	    txtGenero.setColumns(10);
	    
	    txtDiretor = new JTextField();
	    txtDiretor.setHorizontalAlignment(SwingConstants.CENTER);
	    txtDiretor.setBounds(39, 364, 144, 19);
	    contentPane.add(txtDiretor);
	    txtDiretor.setColumns(10);
	    
	    
	    
	   
	    
	    textFilme = new JTextField();
	    textFilme.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    	}
	    });
	    textFilme.setBounds(39, 526, 144, 19);
	    contentPane.add(textFilme);
	    textFilme.setColumns(10);
	    
	    JLabel lblnomeFilme = new JLabel("Nome do filme:");
	    lblnomeFilme.setFont(new Font("Arial", Font.BOLD, 12));
	    lblnomeFilme.setBounds(39, 503, 144, 13);
	    contentPane.add(lblnomeFilme);
	    
	    
	  
	    
	    JLabel labelFotoFilme = new JLabel("SELECIONE UMA FOTO");
	    labelFotoFilme.setHorizontalAlignment(SwingConstants.CENTER);
	    labelFotoFilme.setBackground(new Color(128, 255, 255));
	    labelFotoFilme.setBounds(354, 166, 217, 246);
	    contentPane.add(labelFotoFilme);
	    
	    
	    
	    limparCampos = new JButton("LIMPAR");
	    limparCampos.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		txtClassificacao.setText("");
	    		txtDuracao.setText("");
	    		txtGenero.setText("");
	    		txtDiretor.setText("");
	    		tfcaminhofoto.setText("");
	    		textLancamento.setText("");
	    		textFilme.setText("");
	    		txtSinopse.setText("");
	    		//labelFotoFilme.setIcon(null);
	    		
	    		
	    		
	    	
	    	}
	    });
	    limparCampos.setBounds(467, 584, 103, 29);
	    contentPane.add(limparCampos);
	    
	    
	    
	    tfcaminhofoto = new JTextField();
	    tfcaminhofoto.setBounds(39, 414, 144, 19);
	    contentPane.add(tfcaminhofoto);
	    tfcaminhofoto.setColumns(10);
	    
	    
	    
	    
	    JButton adicionarImagem = new JButton("add imagem");
	    adicionarImagem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		JFileChooser arquivo = new JFileChooser();
	    		arquivo.setDialogTitle("Selecione uma imagem"); //título da tela de escolha de arquivos
	    		arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY); //setando para escolher apenas arquivos
	    		int op = arquivo.showOpenDialog(getComponent(0)); //Abrindo tela de escolha de arquivos
	    		
	    		if(op == JFileChooser.APPROVE_OPTION) { // Verificando se o usuário escolheu algum arquivo
	    			
	    			labelFotoFilme.setIcon(null);
	    			
	    			file = new File("");
	    			file = arquivo.getSelectedFile(); //Pega o arquivo selecionado pelo usuário
	    			nomeArquivo = file.getAbsolutePath(); // pegando o caminho da imagem e armazenando numa variável
	    			tfcaminhofoto.setText(nomeArquivo);
	    			ImageIcon fotoFilme = new ImageIcon(file.getPath()); 
	    			labelFotoFilme.setIcon(new ImageIcon(fotoFilme.getImage().getScaledInstance(labelFotoFilme.getWidth(), 
	    					labelFotoFilme.getHeight(), Image.SCALE_DEFAULT)));
	    			
	    			String nomedoarquivo = tfcaminhofoto.getText();
	  	    		labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	    			
	    		}
	    	}
	    });
	    adicionarImagem.setBounds(398, 456, 115, 38);
	    contentPane.add(adicionarImagem);
	    
	    
	    JLabel lblConfirmacao = new JLabel("");
  	    lblConfirmacao.setFont(new Font("Arial", Font.BOLD, 15));
  	    lblConfirmacao.setHorizontalAlignment(SwingConstants.CENTER);
  	    lblConfirmacao.setBounds(39, 584, 144, 29);
  	    contentPane.add(lblConfirmacao);
	    
	    JButton salvar = new JButton("SALVAR");
	  		salvar.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		
	  	    		
	  	    	
	  	    		String idFilme = textId.getText();
	  	    		String idadeIndicativa = txtClassificacao.getText();
	  	    		String nome = textFilme.getText();
	  	    		String cartaz = tfcaminhofoto.getText();
	  	    		String trailer = "trailer";
	  	    		String diretor = txtDiretor.getText();
	  	    		String duracao = txtDuracao.getText();
	  	    		String genero = txtGenero.getText();
	  				String lancamento = textLancamento.getText();
	  	    		String sinopse = txtSinopse.getText();
	  	    		try{
	  	    			
	  	    			
	  	    			
	  	    			
	  	    			Administrador.funcEditarFilme(idFilme, nome, cartaz, trailer, sinopse, diretor, duracao, genero, lancamento, idadeIndicativa);
                        
	  	    			System.out.println("EDITOU");
	  	    			lblConfirmacao.setText("TUDO CERTO!");
	  	    			lblConfirmacao.setForeground(new Color(36, 187, 11));

	                }catch (RuntimeException e1){
	                	System.out.println("ERRO1 " + e1.getMessage());
	                    //lblConfirmacao.setText(e1.getMessage());
	                    //lblConfirmacao.setForeground(new Color(245, 13, 13, 255));

	                } catch (SQLException ex) {
	                	System.out.println("ERRO2");
	                    //lblConfirmacao.setText("Erro de conexao!");
	                    //lblConfirmacao.setForeground(new Color(245, 13, 13, 255));
	                    throw new RuntimeException(ex);
	                } catch (ClassNotFoundException e2) {
	                	System.out.println("ERRO3");
	                	//lblConfirmacao.setText(e2.getMessage());
					} catch(Exception e2) {
						//lblConfirmacao.setText("Erro na imagem");
					}
	  	    			  	    		
	  	    	}
	  	    });
	  		salvar.setBounds(354, 584, 103, 29);
	  	    contentPane.add(salvar);
	  	    
	  	    
	  	    
	  	    txtSinopse = new JTextArea();
	  	    txtSinopse.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	  	    txtSinopse.setLineWrap(true);
//	  	    txtSinopse.setBounds(698, 131, 257, 249);
//	  	    contentPane.add(txtSinopse);
	  	    
	  	    
	  	    JScrollPane scroll = new JScrollPane(txtSinopse, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	  	    scroll.setBounds(698, 131, 240, 230);
	  	    contentPane.add(scroll);
	  	    
	  	    
	  	    
	  	    
	  	    
	  	    JButton sessao1 = new JButton("sessao1");
	  	    sessao1.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
						filmeObj.pegarFilmes(1);
					} catch (Exception e1) {
						lblConfirmacao.setText(e1.getMessage());
					}
	  	    		
	  	  
	  	    		nomeFilme.setText(filmeObj.getNome());
	  	    		textId.setText("1");	
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    		textLancamento.setText(filmeObj.getAnoLancamento());
	  	    		
	  	    		
	  	    		
	  	    		String nomedoarquivo = tfcaminhofoto.getText();
	  	    		labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
						
	  	    	}
	  	    });
	  	    sessao1.setBounds(272, 26, 85, 29);
	  	    contentPane.add(sessao1);
	  	    
	  	    
	  	    
	  	    JButton sessao2 = new JButton("sessao2");
	  	    sessao2.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
						filmeObj.pegarFilmes(2);
					} catch (Exception e1) {
						lblConfirmacao.setText(e1.getMessage());
					}
	  	    		
	  	    		nomeFilme.setText(filmeObj.getNome());
	  	    		textId.setText("2");	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    		textLancamento.setText(filmeObj.getAnoLancamento());
	  	    		
	  	    		String nomedoarquivo = tfcaminhofoto.getText();
	  	    		labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	}
	  	    });
	  	    sessao2.setBounds(387, 26, 85, 29);
	  	    contentPane.add(sessao2);
	  	    
	  	    
	  	    sessao3 = new JButton("sessao3");
	  	    sessao3.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		try {
						filmeObj.pegarFilmes(3);
					}catch (Exception e1) {
						lblConfirmacao.setText(e1.getMessage());
					}
		    		nomeFilme.setText(filmeObj.getNome());
		    		textId.setText("3");	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    		textLancamento.setText(filmeObj.getAnoLancamento());
	  	    		
	  	    		String nomedoarquivo = tfcaminhofoto.getText();
	  	    		labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
		    	}
		    });
		    sessao3.setBounds(509, 26, 85, 29);
		    contentPane.add(sessao3);
		    
		    sessao4 = new JButton("sessao4");
		    sessao4.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		try {
						filmeObj.pegarFilmes(4);
					} catch (Exception e1) {
						lblConfirmacao.setText(e1.getMessage());
					}
		    		nomeFilme.setText(filmeObj.getNome());
		    		textId.setText("4");	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    		textLancamento.setText(filmeObj.getAnoLancamento());
	  	    		
	  	    		String nomedoarquivo = tfcaminhofoto.getText();
	  	    		labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
		    	}
		    });
		    sessao4.setBounds(627, 26, 85, 29);
		    contentPane.add(sessao4);
		    
		    
		    JButton sessao5 = new JButton("sessao5");
	  	    sessao5.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
	  	    			conexao.conectar();
						filmeObj.pegarFilmes(5);
					} catch (Exception e1) {
						lblConfirmacao.setText(e1.getMessage());
					}
	  	    		nomeFilme.setText(filmeObj.getNome());
	  	    		textId.setText("5");	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    		textLancamento.setText(filmeObj.getAnoLancamento());
	  	    		
	  	    		String nomedoarquivo = tfcaminhofoto.getText();
	  	    		labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	}
	  	    });
	  	    sessao5.setBounds(741, 26, 85, 29);
	  	    contentPane.add(sessao5);
	  	    
	  	    
	  	    JButton sessao6 = new JButton("sessao6");
	  	    sessao6.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
						filmeObj.pegarFilmes(6);
					} catch (Exception e1) {
						lblConfirmacao.setText(e1.getMessage());
					}
	  	    		nomeFilme.setText(filmeObj.getNome());
	  	    		textId.setText("6");	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    		textLancamento.setText(filmeObj.getAnoLancamento());
	  	    		
	  	    		String nomedoarquivo = tfcaminhofoto.getText();
	  	    		labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	}
	  	    });
	  	    sessao6.setBounds(856, 26, 85, 29);
	  	    contentPane.add(sessao6);
	  	    
	  	    JLabel lblClassIndicativa = new JLabel("Classificação indicativa:");
	  	    lblClassIndicativa.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblClassIndicativa.setBounds(39, 178, 149, 13);
	  	    contentPane.add(lblClassIndicativa);
	  	    
	  	    JLabel lblDuracao = new JLabel("Duração:");
	  	    lblDuracao.setHorizontalAlignment(SwingConstants.LEFT);
	  	    lblDuracao.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblDuracao.setBounds(39, 230, 144, 19);
	  	    contentPane.add(lblDuracao);
	  	    
	  	    JLabel lblGenero = new JLabel("Genero:");
	  	    lblGenero.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblGenero.setBounds(39, 288, 144, 13);
	  	    contentPane.add(lblGenero);
	  	    
	  	    JLabel lblDiretor = new JLabel("Diretor:");
	  	    lblDiretor.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblDiretor.setBounds(39, 340, 144, 13);
	  	    contentPane.add(lblDiretor);
	  	    
	  	    JLabel lblCaminhoFoto = new JLabel("Caminho da foto:");
	  	    lblCaminhoFoto.setHorizontalAlignment(SwingConstants.LEFT);
	  	    lblCaminhoFoto.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblCaminhoFoto.setBounds(39, 393, 144, 19);
	  	    contentPane.add(lblCaminhoFoto);
	  	    
	  	    textId = new JTextField();
	  	    
	  	  textId.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
					}
				}
			});
	  	    
	  	    textId.setBackground(new Color(0, 0, 0));
	  	    textId.setFont(new Font("Arial", Font.BOLD, 14));
	  	    textId.setEnabled(false);
	  	    textId.setHorizontalAlignment(SwingConstants.CENTER);
	  	    textId.setBounds(39, 149, 144, 19);
	  	    contentPane.add(textId);
	  	    textId.setColumns(10);
	  	    
	  	    JLabel lblID = new JLabel("ID:");
	  	    lblID.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblID.setBounds(41, 127, 142, 13);
	  	    contentPane.add(lblID);
	  	    
	  	    textLancamento = new JTextField();
	  	    textLancamento.setColumns(10);
	  	    textLancamento.setBounds(39, 466, 144, 19);
	  	    contentPane.add(textLancamento);
	  	    
	  	    JLabel lblDataLancamento = new JLabel("Data - Lançamento:");
	  	    lblDataLancamento.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblDataLancamento.setBounds(39, 443, 144, 13);
	  	    contentPane.add(lblDataLancamento);
	  	    
	  	    
	  	 }
}
