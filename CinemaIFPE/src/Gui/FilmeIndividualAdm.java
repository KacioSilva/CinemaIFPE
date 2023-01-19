package Gui;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Core.Administrador;
import Core.Filme;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FilmeIndividualAdm extends JFrame {
	
	private JPanel contentPane;
	private String alterarimagem;
	private String posicao;
	private JTextField txtClassificacao;
	private JTextField txtDuracao;
	private JTextField txtGenero;
	private JTextField txtDiretor;
	private JTextField txtSinopse;
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
	private JTextField textCartaz;
	private JTextField textField_2;
	private JTextField textLancamento;

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
		nomeFilme.setFont(new Font("Arial", Font.BOLD, 16));
		nomeFilme.setBounds(354, 127, 181, 29);
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
	    txtClassificacao.setHorizontalAlignment(SwingConstants.CENTER);
	    txtClassificacao.setText("IDADE");
	    txtClassificacao.setBounds(39, 202, 144, 19);
	    contentPane.add(txtClassificacao);
	    txtClassificacao.setColumns(10);
	    
	    txtDuracao = new JTextField();
	    txtDuracao.setHorizontalAlignment(SwingConstants.CENTER);
	    txtDuracao.setText("DURAÇÃO");
	    txtDuracao.setBounds(39, 260, 144, 19);
	    contentPane.add(txtDuracao);
	    txtDuracao.setColumns(10);
	    
	    txtGenero = new JTextField();
	    txtGenero.setHorizontalAlignment(SwingConstants.CENTER);
	    txtGenero.setText("genero");
	    txtGenero.setBounds(39, 312, 144, 19);
	    contentPane.add(txtGenero);
	    txtGenero.setColumns(10);
	    
	    txtDiretor = new JTextField();
	    txtDiretor.setHorizontalAlignment(SwingConstants.CENTER);
	    txtDiretor.setText("DIRETOR");
	    txtDiretor.setBounds(39, 364, 144, 19);
	    contentPane.add(txtDiretor);
	    txtDiretor.setColumns(10);
	    
	    txtSinopse = new JTextField();
	    txtSinopse.setHorizontalAlignment(SwingConstants.CENTER);
	    txtSinopse.setText("SINOPSE");
	    txtSinopse.setBounds(715, 142, 245, 233);
	    contentPane.add(txtSinopse);
	    txtSinopse.setColumns(10);
	    
	    
	    
	    
	    limparCampos = new JButton("LIMPAR");
	    limparCampos.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    	}
	    });
	    limparCampos.setBounds(491, 584, 103, 29);
	    contentPane.add(limparCampos);
	    
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
	    labelFotoFilme.setBounds(354, 166, 181, 209);
	    contentPane.add(labelFotoFilme);
	    
	    
	    tfcaminhofoto = new JTextField();
	    tfcaminhofoto.setBounds(316, 416, 280, 19);
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
	    			
	    			File file = new File("");
	    			file = arquivo.getSelectedFile(); //Pega o arquivo selecionado pelo usuário
	    			nomeArquivo = file.getAbsolutePath(); // pegando o caminho da imagem e armazenando numa variável
	    			tfcaminhofoto.setText(nomeArquivo);
	    			ImageIcon fotoFilme = new ImageIcon(file.getPath()); 
	    			labelFotoFilme.setIcon(new ImageIcon(fotoFilme.getImage().getScaledInstance(labelFotoFilme.getWidth(), 
	    					labelFotoFilme.getHeight(), Image.SCALE_DEFAULT)));
	    			
	    		}
	    	}
	    });
	    adicionarImagem.setBounds(394, 447, 115, 38);
	    contentPane.add(adicionarImagem);
	    
	    
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
//	                    confirmacao.setText("Tudo certo!");
//	                    confirmacao.setForeground(new Color(36, 187, 11));

	                }catch (RuntimeException e1){
	                	System.out.println("ERRO1 " + e1.getMessage());
//	                    confirmacao.setText(e1.getMessage());
//	                    confirmacao.setForeground(new Color(245, 13, 13, 255));

	                } catch (SQLException ex) {
	                	System.out.println("ERRO2");
//	                    confirmacao.setText("Erro de conexao!");
//	                    confirmacao.setForeground(new Color(245, 13, 13, 255));
	                    //throw new RuntimeException(ex);
	                } catch (ClassNotFoundException e2) {
	                	System.out.println("ERRO3");
//	                	confirmacao.setText(e2.getMessage());
					}
	  	    			  	    		
	  	    	}
	  	    });
	  		salvar.setBounds(316, 584, 103, 29);
	  	    contentPane.add(salvar);
	  	    
	  	    JButton sessao1 = new JButton("sessao1");
	  	    sessao1.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
						filmeObj.conectar();
						filmeObj.pegarFilmes(1);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	  	    		
	  	    		textId.setText("1");
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    		textLancamento.setText(filmeObj.getAnoLancamento());
						
	  	    	}
	  	    });
	  	    sessao1.setBounds(272, 26, 85, 29);
	  	    contentPane.add(sessao1);
	  	    
	  	    
	  	    
	  	    JButton sessao2 = new JButton("sessao2");
	  	    sessao2.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
						filmeObj.conectar();
						filmeObj.pegarFilmes(2);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    	}
	  	    });
	  	    sessao2.setBounds(387, 26, 85, 29);
	  	    contentPane.add(sessao2);
	  	    
	  	    
	  	    sessao3 = new JButton("sessao3");
	  	    sessao3.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		try {
						filmeObj.conectar();
						filmeObj.pegarFilmes(3);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
		    	}
		    });
		    sessao3.setBounds(509, 26, 85, 29);
		    contentPane.add(sessao3);
		    
		    sessao4 = new JButton("sessao4");
		    sessao4.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		try {
						filmeObj.conectar();
						filmeObj.pegarFilmes(4);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
		    	}
		    });
		    sessao4.setBounds(627, 26, 85, 29);
		    contentPane.add(sessao4);
		    
		    
		    JButton sessao5 = new JButton("sessao5");
	  	    sessao5.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
						filmeObj.conectar();
						filmeObj.pegarFilmes(5);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
	  	    	}
	  	    });
	  	    sessao5.setBounds(741, 26, 85, 29);
	  	    contentPane.add(sessao5);
	  	    
	  	    
	  	    JButton sessao6 = new JButton("sessao6");
	  	    sessao6.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		try {
						filmeObj.conectar();
						filmeObj.pegarFilmes(6);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
	  	    		
	  	    		txtClassificacao.setText(filmeObj.getClassIndicativa());
	  	    		txtDuracao.setText(filmeObj.getDuracao());
	  	    		txtGenero.setText(filmeObj.getGenero());
	  	    		txtDiretor.setText(filmeObj.getDiretor());
	  	    		tfcaminhofoto.setText(filmeObj.getCartaz());
	  	    		textFilme.setText(filmeObj.getNome());
	  	    		txtSinopse.setText(filmeObj.getSinopse());
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
	  	    lblDuracao.setBounds(39, 230, 69, 19);
	  	    contentPane.add(lblDuracao);
	  	    
	  	    JLabel lblGenero = new JLabel("Genero:");
	  	    lblGenero.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblGenero.setBounds(39, 288, 85, 13);
	  	    contentPane.add(lblGenero);
	  	    
	  	    JLabel lblDiretor = new JLabel("Diretor:");
	  	    lblDiretor.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblDiretor.setBounds(39, 340, 69, 13);
	  	    contentPane.add(lblDiretor);
	  	    
	  	    JLabel lblCaminhoFoto = new JLabel("Caminho da foto:");
	  	    lblCaminhoFoto.setHorizontalAlignment(SwingConstants.LEFT);
	  	    lblCaminhoFoto.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblCaminhoFoto.setBounds(394, 377, 280, 29);
	  	    contentPane.add(lblCaminhoFoto);
	  	    
	  	    textId = new JTextField();
	  	    textId.setBounds(39, 149, 144, 19);
	  	    contentPane.add(textId);
	  	    textId.setColumns(10);
	  	    
	  	    JLabel lblID = new JLabel("ID:");
	  	    lblID.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblID.setBounds(41, 127, 45, 13);
	  	    contentPane.add(lblID);
	  	    
	  	    textCartaz = new JTextField();
	  	    textCartaz.setBounds(39, 416, 144, 19);
	  	    contentPane.add(textCartaz);
	  	    textCartaz.setColumns(10);
	  	    
	  	    JLabel lblCartaz = new JLabel("cartaz:");
	  	    lblCartaz.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblCartaz.setBounds(39, 393, 69, 13);
	  	    contentPane.add(lblCartaz);
	  	    
	  	    textField_2 = new JTextField();
	  	    textField_2.setColumns(10);
	  	    textField_2.setBounds(39, 416, 144, 19);
	  	    contentPane.add(textField_2);
	  	    
	  	    textLancamento = new JTextField();
	  	    textLancamento.setColumns(10);
	  	    textLancamento.setBounds(39, 466, 144, 19);
	  	    contentPane.add(textLancamento);
	  	    
	  	    JLabel lblDataLancamento = new JLabel("Data - Lançamento:");
	  	    lblDataLancamento.setFont(new Font("Arial", Font.BOLD, 12));
	  	    lblDataLancamento.setBounds(39, 443, 130, 13);
	  	    contentPane.add(lblDataLancamento);
	  	 }
}
