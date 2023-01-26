package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
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
import javax.swing.border.CompoundBorder;
import javax.swing.SpinnerNumberModel;
import java.awt.event.KeyAdapter;

public class TelaLanche extends JFrame {

	private JPanel contentPane;
	
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
		cineifPaulista.setForeground(new Color(63, 164, 13, 236));
		cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 62));
		cineifPaulista.setBounds(249, 10, 445, 132);
		contentPane.add(cineifPaulista);
		
		JButton help = new JButton("Help");
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		help.setBounds(893, 26, 66, 29);
		contentPane.add(help);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Poltronas poltrona = new Poltronas();
				poltrona.setVisible(true);
				dispose();
			}
		});
		voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		voltar.setBounds(10, 26, 75, 35);
		contentPane.add(voltar);
		
		JButton botaoContinuar = new JButton("CONTINUAR");
		botaoContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoContinuar.setFont(new Font("Arial", Font.BOLD, 14));
		botaoContinuar.setBounds(343, 639, 149, 39);
		contentPane.add(botaoContinuar);
		
		JLabel fotoLanche1 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche1.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche1.setBackground(new Color(128, 255, 255));
		fotoLanche1.setBounds(21, 184, 159, 167);	
		String buscarfoto1;
		
			try {
				buscarfoto1 = new Lanche().buscarFotoLanche(1);
			    String nomedoarquivo1 = buscarfoto1;
			    fotoLanche1.setIcon(new ImageIcon(nomedoarquivo1));
			  	fotoLanche1.setText(buscarfoto1);
			  	contentPane.add(fotoLanche1);
			} catch (ClassNotFoundException e4) {
				lblConfirmacao.setText("Erro de conexão");
			} catch (SQLException e4) {
				lblConfirmacao.setText("Erro de conexão");
			}

		
		
		
		JLabel fotoLanche2 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche2.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche2.setBackground(new Color(128, 255, 255));
		fotoLanche2.setBounds(383, 184, 159, 167);		
		String buscarfoto2;
		try {
			buscarfoto2 = new Lanche().buscarFotoLanche(2);
			String nomedoarquivo2 = buscarfoto2;
		  	fotoLanche2.setIcon(new ImageIcon(nomedoarquivo2));
		  	fotoLanche2.setText(buscarfoto2);				
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
		  	fotoLanche3.setText(buscarfoto3);		
			contentPane.add(fotoLanche3);
		} catch (ClassNotFoundException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		} catch (SQLException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		}	      
	    
		
		JLabel fotoLanche4 = new JLabel("SELECIONE UMA FOTO");
		fotoLanche4.setHorizontalAlignment(SwingConstants.CENTER);
		fotoLanche4.setBackground(new Color(128, 255, 255));
		fotoLanche4.setBounds(21, 447, 159, 167);
		String buscarfoto4;
		try {
			buscarfoto4 = new Lanche().buscarFotoLanche(4);
			 String nomedoarquivo4 = buscarfoto4;
			 fotoLanche4.setIcon(new ImageIcon(nomedoarquivo4));
			 fotoLanche4.setText(buscarfoto4);		
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
			fotoLanche5.setText(buscarfoto5);				
			contentPane.add(fotoLanche5);
		} catch (ClassNotFoundException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		} catch (SQLException e2) {
			lblConfirmacao.setText("Erro de Conexão");
		}	      
	   
		
		JSpinner spinner = new JSpinner();
		spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
					}
				}
			
		});
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner.setBounds(21, 399, 159, 20);
		contentPane.add(spinner);
		
		
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner_1.setBounds(383, 399, 159, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner_2.setBounds(770, 399, 159, 20);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner_3.setBounds(23, 653, 159, 20);
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner_4.setBounds(770, 653, 159, 20);
		contentPane.add(spinner_4);
		
		//////////////////////////////////////////////////////////////
		JLabel lblLanche1 = new JLabel("nome lanche");
		lblLanche1.setFont(new Font("Arial", Font.BOLD, 12));
		lblLanche1.setHorizontalAlignment(SwingConstants.CENTER);
				
			try {
				lanche.pegarLanche(1);
			} catch (Exception e1) {
				lblConfirmacao.setText("Erro de Conexão");
			} 		
		lblLanche1.setText(lanche.getNomeLanche());		
		lblLanche1.setBounds(23, 361, 157, 28);
		contentPane.add(lblLanche1);
		//////////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////
		JLabel lblLanche2 = new JLabel("nome lanche");
		lblLanche2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLanche2.setFont(new Font("Arial", Font.BOLD, 12));
		
		try {
			lanche.pegarLanche(2);
			lblLanche2.setText(lanche.getNomeLanche());
			lblLanche2.setBounds(385, 361, 159, 28);
			contentPane.add(lblLanche2);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		} 
		
		////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////
		JLabel lblLanche3 = new JLabel("nome lanche");
		lblLanche3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLanche3.setFont(new Font("Arial", Font.BOLD, 12));
		
		try {
			lanche.pegarLanche(3);
			lblLanche3.setText(lanche.getNomeLanche());
			lblLanche3.setBounds(770, 361, 159, 28);
			contentPane.add(lblLanche3);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		}
		
		//////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////
		JLabel lblLanche4 = new JLabel("nome lanche");
		lblLanche4.setHorizontalAlignment(SwingConstants.CENTER);
		lblLanche4.setFont(new Font("Arial", Font.BOLD, 12));
		
		try {
			lanche.pegarLanche(4);
			lblLanche4.setText(lanche.getNomeLanche());
			lblLanche4.setBounds(21, 615, 157, 28);
			contentPane.add(lblLanche4);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		} 
		
		///////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////
		
		JLabel lblLanche5 = new JLabel("nome lanche");
		lblLanche5.setHorizontalAlignment(SwingConstants.CENTER);
		lblLanche5.setFont(new Font("Arial", Font.BOLD, 12));
		try {
			lanche.pegarLanche(5);
			lblLanche5.setText(lanche.getNomeLanche());
			lblLanche5.setBounds(770, 615, 157, 28);
			contentPane.add(lblLanche5);
		} catch (Exception e1) {
			lblConfirmacao.setText("Erro de Conexão");
		} 
		
		/////////////////////////////////////////////////////////////////////////
		JLabel lblTotIngresso = new JLabel("TOTAL INGRESSO:");
		lblTotIngresso.setFont(new Font("Arial", Font.BOLD, 12));
		lblTotIngresso.setBounds(343, 512, 308, 25);
		contentPane.add(lblTotIngresso);
		
		JLabel lblTotLanches = new JLabel("TOTAL LANCHES:");
		lblTotLanches.setFont(new Font("Arial", Font.BOLD, 12));
		lblTotLanches.setBounds(343, 547, 199, 25);
		contentPane.add(lblTotLanches);
		
		JLabel lblTotGeral = new JLabel("TOTAL GERAL:");
		lblTotGeral.setFont(new Font("Arial", Font.BOLD, 12));
		lblTotGeral.setBounds(343, 582, 199, 25);
		contentPane.add(lblTotGeral);
		
		JButton botaoPular = new JButton("PULAR");
		botaoPular.setFont(new Font("Arial", Font.BOLD, 14));
		botaoPular.setBounds(502, 639, 149, 39);
		contentPane.add(botaoPular);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(371, 109, 149, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lanches");
		lblNewLabel.setBounds(21, 0, 116, 44);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		
	}
}
