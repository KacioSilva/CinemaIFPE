package Gui;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class FilmeIndividualAdm extends JFrame {
	
	private JPanel contentPane;
	private JTextField tfAlterImg;
	private String alterarimagem;
	private String posicao;
	private JTextField txtIdade;
	private JTextField txtDurao;
	private JTextField txtGenero;
	private JTextField txtDiretor;
	private JTextField txtSinopse;
	private JButton limparCampos;

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
		nomeFilme.setFont(new Font("Arial", Font.BOLD, 16));
		nomeFilme.setBounds(63, 103, 139, 29);
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
		
	
	    
	    //-----CRIANDO AS IMAGENS
	    tfAlterImg = new JTextField();
	    tfAlterImg.setFont(new Font("Arial", Font.PLAIN, 12));
	    tfAlterImg.setHorizontalAlignment(SwingConstants.CENTER);
	    tfAlterImg.setText("/midia/teste4.png");
	    tfAlterImg.setBounds(715, 46, 245, 29);
	    contentPane.add(tfAlterImg);
	    tfAlterImg.setColumns(10);
	    
	    JButton fotofilme = new JButton("FOTO DO FILME");
	    fotofilme.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    fotofilme.setBounds(39, 142, 181, 222);
	    contentPane.add(fotofilme);
	    
	    txtIdade = new JTextField();
	    txtIdade.setText("IDADE");
	    txtIdade.setBounds(39, 374, 62, 19);
	    contentPane.add(txtIdade);
	    txtIdade.setColumns(10);
	    
	    txtDurao = new JTextField();
	    txtDurao.setText("DURAÇÃO");
	    txtDurao.setBounds(101, 374, 58, 19);
	    contentPane.add(txtDurao);
	    txtDurao.setColumns(10);
	    
	    txtGenero = new JTextField();
	    txtGenero.setText("genero");
	    txtGenero.setBounds(160, 374, 60, 19);
	    contentPane.add(txtGenero);
	    txtGenero.setColumns(10);
	    
	    txtDiretor = new JTextField();
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
	    
	    
	    JButton salvar = new JButton("SALVAR");
		salvar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	   	
	    	}
	    });
		salvar.setBounds(358, 584, 103, 29);
	    contentPane.add(salvar);
	    
	    limparCampos = new JButton("LIMPAR");
	    limparCampos.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    	}
	    });
	    limparCampos.setBounds(493, 584, 103, 29);
	    contentPane.add(limparCampos);
	  
	    
	   
	    
	    
	    
	    
	}
}