package Gui;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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


public class FilmeIndividualAdm extends JFrame {
	
	private JPanel contentPane;
	private String alterarimagem;
	private String posicao;
	private JTextField txtIdade;
	private JTextField txtDuracao;
	private JTextField txtGenero;
	private JTextField txtDiretor;
	private JTextField txtSinopse;
	private JButton limparCampos;
	private JButton botaos2;
	private JButton botaos3;
	private JTextField tfAlterarNome;
	private String nomedofilme;
	private JTextField tfcaminhofoto;
	private Filme filme;
	private String nomeArquivo;

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
		nomeFilme.setBounds(39, 103, 181, 29);
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
	    
	    
	    
	    txtIdade = new JTextField();
	    txtIdade.setHorizontalAlignment(SwingConstants.CENTER);
	    txtIdade.setText("IDADE");
	    txtIdade.setBounds(39, 374, 62, 19);
	    contentPane.add(txtIdade);
	    txtIdade.setColumns(10);
	    
	    txtDuracao = new JTextField();
	    txtDuracao.setHorizontalAlignment(SwingConstants.CENTER);
	    txtDuracao.setText("DURAÇÃO");
	    txtDuracao.setBounds(101, 374, 58, 19);
	    contentPane.add(txtDuracao);
	    txtDuracao.setColumns(10);
	    
	    txtGenero = new JTextField();
	    txtGenero.setHorizontalAlignment(SwingConstants.CENTER);
	    txtGenero.setText("genero");
	    txtGenero.setBounds(160, 374, 60, 19);
	    contentPane.add(txtGenero);
	    txtGenero.setColumns(10);
	    
	    txtDiretor = new JTextField();
	    txtDiretor.setHorizontalAlignment(SwingConstants.CENTER);
	    txtDiretor.setText("DIRETOR");
	    txtDiretor.setBounds(80, 403, 96, 19);
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
	    limparCampos.setBounds(493, 584, 103, 29);
	    contentPane.add(limparCampos);
	    
	    botaos2 = new JButton("sessao3");
	    botaos2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    botaos2.setBounds(509, 26, 85, 29);
	    contentPane.add(botaos2);
	    
	    botaos3 = new JButton("sessao4");
	    botaos3.setBounds(627, 26, 85, 29);
	    contentPane.add(botaos3);
	    
	    JLabel lblNewLabel = new JLabel("TRAILER");
	    lblNewLabel.setFont(new Font("Arial", Font.BOLD, 28));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setBounds(381, 191, 181, 123);
	    contentPane.add(lblNewLabel);
	    
	    tfAlterarNome = new JTextField();
	    tfAlterarNome.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    	}
	    });
	    tfAlterarNome.setBounds(715, 457, 207, 19);
	    contentPane.add(tfAlterarNome);
	    tfAlterarNome.setColumns(10);
	    
	    JLabel lblNewLabel_1 = new JLabel("ALTERAR NOME DO FILME:");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	    lblNewLabel_1.setBounds(715, 434, 176, 13);
	    contentPane.add(lblNewLabel_1);
	    
	    
	  
	    
	    JLabel labelFotoFilme = new JLabel("SELECIONE UMA FOTO");
	    labelFotoFilme.setHorizontalAlignment(SwingConstants.CENTER);
	    labelFotoFilme.setBackground(new Color(128, 255, 255));
	    labelFotoFilme.setBounds(39, 155, 181, 209);
	    contentPane.add(labelFotoFilme);
	    
	    
	    tfcaminhofoto = new JTextField();
	    tfcaminhofoto.setBounds(10, 445, 280, 19);
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
	    adicionarImagem.setBounds(76, 493, 115, 38);
	    contentPane.add(adicionarImagem);
	    
	    
	    JButton salvar = new JButton("SALVAR");
	  		salvar.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    		String cartaz = nomeArquivo;
	  	    		String trailer = "trailer";
	  	    		String diretor = txtDiretor.getText();
	  	    		String duracao = txtDuracao.getText();
	  	    		String genero = txtGenero.getText();
	  				String idade = txtIdade.getText();
	  	    		String sinopse = txtSinopse.getText();
	  	    			  	    		
	  	    	}
	  	    });
	  		salvar.setBounds(358, 584, 103, 29);
	  	    contentPane.add(salvar);
	  	    
	  	    JButton botaos1_1 = new JButton("sessao1");
	  	    botaos1_1.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    	}
	  	    });
	  	    botaos1_1.setBounds(272, 26, 85, 29);
	  	    contentPane.add(botaos1_1);
	  	    
	  	    JButton btnSessao_1 = new JButton("sessao5");
	  	    btnSessao_1.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    	}
	  	    });
	  	    btnSessao_1.setBounds(741, 26, 85, 29);
	  	    contentPane.add(btnSessao_1);
	  	    
	  	    JButton btnSessao_2 = new JButton("sessao6");
	  	    btnSessao_2.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    	}
	  	    });
	  	    btnSessao_2.setBounds(856, 26, 85, 29);
	  	    contentPane.add(btnSessao_2);
	  	    
	  	    JButton btnSessao = new JButton("sessao2");
	  	    btnSessao.addActionListener(new ActionListener() {
	  	    	public void actionPerformed(ActionEvent e) {
	  	    	}
	  	    });
	  	    btnSessao.setBounds(387, 26, 85, 29);
	  	    contentPane.add(btnSessao);
	  	 }
}