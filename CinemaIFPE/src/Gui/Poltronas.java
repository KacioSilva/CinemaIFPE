package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import Core.ControlePoltrona;
import Core.Filme;

import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class Poltronas extends JFrame {

	private JPanel contentPane;
	private int preco;
	private int pegarSoma;
	private int pegandoCPsoma;
	private ControlePoltrona controle = new ControlePoltrona();
	private int idFilme = 5;
	private String D1;
	


	public String getD1() {
		return D1;
	}


	public void setD1(String d1) {
		D1 = d1;
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poltronas frame = new Poltronas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Poltronas() {
		
		
		
		ControlePoltrona cp = new ControlePoltrona();
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Poltronas.class.getResource("/Midia/ifpe.png")));
		
		
		
		setTitle("Escolha de poltronas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 1000, 720));
		setSize(1000,720);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(151, 102, 691, 447);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel totalPoltronas = new JLabel("");
		totalPoltronas.setFont(new Font("Arial", Font.BOLD, 14));
		totalPoltronas.setHorizontalAlignment(SwingConstants.CENTER);
		totalPoltronas.setBounds(421, 606, 130, 25);
		contentPane.add(totalPoltronas);
		
		
		JButton botaoContinuar = new JButton("continuar");
		botaoContinuar.setEnabled(false);
	
		botaoContinuar.setBounds(421, 641, 130, 32);
		contentPane.add(botaoContinuar);
		botaoContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaLanche telalanche = new TelaLanche();
				telalanche.setVisible(true);
				dispose();
		
			}
		});
		
		
		JButton D1 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD1("D1");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5D1().equals("0")){
            	D1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5D1().equals("0")){
            	D1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5D1().equals("0")){
            	D1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5D1().equals("0")){
            	D1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5D1().equals("0")){
            	D1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6D1().equals("0")){
                D1.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D1().equals("1")){
                D1.setEnabled(false);
            }
        }
		
		
		D1.setBorderPainted(false);
		D1.setFocusPainted(false);
		D1.setBackground(new Color(240,240,240,240));
		D1.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    D1.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    setD1("1");
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	D1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    setD1("0");
	                    cont = 0;
	                    
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		D1.setBounds(41, 42, 55, 40);
		panel.add(D1);
		
		  
		
		JButton D2 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD2("D2");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5D2().equals("0")){
                D2.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS6D2().equals("0")){
                D2.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS6D2().equals("0")){
                D2.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS6D2().equals("0")){
                D2.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5D2().equals("0")){
                D2.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6D2().equals("0")){
                D2.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D2().equals("1")){
                D2.setEnabled(false);
            }
        }
		
		
		D2.setBorderPainted(false);
		D2.setFocusPainted(false);
		D2.setBackground(new Color(240,240,240,240));
		D2.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    D2.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	D2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		D2.setBounds(183, 42, 55, 40);
		panel.add(D2);
		
		
		
		JButton D3 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD3("D3");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5D3().equals("0")){
                D3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D3().equals("1")){
                D3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5D3().equals("0")){
                D3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D3().equals("1")){
                D3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5D3().equals("0")){
                D3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D3().equals("1")){
                D3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5D3().equals("0")){
                D3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D3().equals("1")){
                D3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5D3().equals("0")){
                D3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D3().equals("1")){
                D3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6D3().equals("0")){
                D3.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D3().equals("1")){
                D3.setEnabled(false);
            }
        }
		
		
		D3.setBorderPainted(false);
		D3.setFocusPainted(false);
		D3.setBackground(new Color(240,240,240,240));
		D3.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    D3.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	D3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		D3.setBounds(328, 42, 55, 40);
		panel.add(D3);
		
		
		
		JButton D4 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD4("D4");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5D4().equals("0")){
            	D4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5D4().equals("0")){
            	D4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5D4().equals("0")){
            	D4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5D4().equals("0")){
            	D4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5D4().equals("0")){
            	D4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6D4().equals("0")){
            	D4.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
		
		
		D4.setBorderPainted(false);
		D4.setFocusPainted(false);
		D4.setBackground(new Color(240,240,240,240));
		D4.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    D4.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	D4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		D4.setBounds(463, 42, 55, 40);
		panel.add(D4);
		
		JButton D5 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD5("D5");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		 if(TelaInicial.getIdFilme() == 1){
	            if(controle.getPoltronaLivreS5D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(controle.getPoltronaLivreS5D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
		 if(TelaInicial.getIdFilme() == 2){
	            if(controle.getPoltronaLivreS5D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(controle.getPoltronaLivreS5D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
		 if(TelaInicial.getIdFilme() == 3){
	            if(controle.getPoltronaLivreS5D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(controle.getPoltronaLivreS5D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
		 if(TelaInicial.getIdFilme() == 4){
	            if(controle.getPoltronaLivreS5D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(controle.getPoltronaLivreS5D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5D5().equals("0")){
            	D5.setEnabled(true);
            }else if(controle.getPoltronaLivreS5D5().equals("1")){
            	D5.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6D5().equals("0")){
            	D5.setEnabled(true);
            }else if(controle.getPoltronaLivreS6D5().equals("1")){
            	D5.setEnabled(false);
            }
        }
		
		
		D5.setBorderPainted(false);
		D5.setFocusPainted(false);
		D5.setBackground(new Color(240,240,240,240));
		D5.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    D5.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	D5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		D5.setBounds(588, 42, 55, 40);
		panel.add(D5);
		
		JButton C1 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC1("C1");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5C1().equals("0")){
                C1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C1().equals("1")){
                C1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5C1().equals("0")){
                C1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C1().equals("1")){
                C1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5C1().equals("0")){
                C1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C1().equals("1")){
                C1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5C1().equals("0")){
                C1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C1().equals("1")){
                C1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5C1().equals("0")){
                C1.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C1().equals("1")){
                C1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6C1().equals("0")){
                C1.setEnabled(true);
            }else if(controle.getPoltronaLivreS6C1().equals("1")){
                C1.setEnabled(false);
            }
        }
		
		
		C1.setBorderPainted(false);
		C1.setFocusPainted(false);
		C1.setBackground(new Color(240,240,240,240));
		C1.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    C1.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	C1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		C1.setBounds(41, 133, 55, 40);
		panel.add(C1);
		
		JButton C2 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC2("C2");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5C2().equals("0")){
                C2.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C2().equals("1")){
                C2.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5C2().equals("0")){
                C2.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C2().equals("1")){
                C2.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5C2().equals("0")){
                C2.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C2().equals("1")){
                C2.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5C2().equals("0")){
                C2.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C2().equals("1")){
                C2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5C2().equals("0")){
                C2.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C2().equals("1")){
                C2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6C2().equals("0")){
                C2.setEnabled(true);
            }else if(controle.getPoltronaLivreS6C2().equals("1")){
                C2.setEnabled(false);
            }
        }
		
		C2.setBorderPainted(false);
		C2.setFocusPainted(false);
		C2.setBackground(new Color(240,240,240,240));
		C2.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    C2.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	C2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		C2.setBounds(183, 133, 55, 40);
		panel.add(C2);
		
		JButton C3 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC3("C3");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5C3().equals("0")){
                C3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C3().equals("1")){
                C3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5C3().equals("0")){
                C3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C3().equals("1")){
                C3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5C3().equals("0")){
                C3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C3().equals("1")){
                C3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5C3().equals("0")){
                C3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C3().equals("1")){
                C3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5C3().equals("0")){
                C3.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C3().equals("1")){
                C3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6C3().equals("0")){
                C3.setEnabled(true);
            }else if(controle.getPoltronaLivreS6C3().equals("1")){
                C3.setEnabled(false);
            }
        }

		
		
		C3.setBorderPainted(false);
		C3.setFocusPainted(false);
		C3.setBackground(new Color(240,240,240,240));
		C3.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    C3.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	C3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		C3.setBounds(328, 133, 55, 40);
		panel.add(C3);
		
		JButton C4 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC4("C4");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5C4().equals("0")){
                C4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C4().equals("1")){
                C4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5C4().equals("0")){
                C4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C4().equals("1")){
                C4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5C4().equals("0")){
                C4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C4().equals("1")){
                C4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5C4().equals("0")){
                C4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C4().equals("1")){
                C4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5C4().equals("0")){
                C4.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C4().equals("1")){
                C4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6C4().equals("0")){
                C4.setEnabled(true);
            }else if(controle.getPoltronaLivreS6C4().equals("1")){
                C4.setEnabled(false);
            }
        }
		
		
		
		C4.setBorderPainted(false);
		C4.setFocusPainted(false);
		C4.setBackground(new Color(240,240,240,240));
		C4.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    C4.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	C4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		C4.setBounds(463, 133, 55, 40);
		panel.add(C4);
		
		JButton C5 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC5("C5");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(controle.getPoltronaLivreS5C5().equals("0")){
                C5.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C5().equals("1")){
                C5.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(controle.getPoltronaLivreS5C5().equals("0")){
                C5.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C5().equals("1")){
                C5.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(controle.getPoltronaLivreS5C5().equals("0")){
                C5.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C5().equals("1")){
                C5.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(controle.getPoltronaLivreS5C5().equals("0")){
                C5.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C5().equals("1")){
                C5.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(controle.getPoltronaLivreS5C5().equals("0")){
                C5.setEnabled(true);
            }else if(controle.getPoltronaLivreS5C5().equals("1")){
                C5.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(controle.getPoltronaLivreS6C5().equals("0")){
            	C5.setEnabled(true);
            }else if(controle.getPoltronaLivreS6C5().equals("1")){
            	C5.setEnabled(false);
            }
        }
		
		
		
		C5.setBorderPainted(false);
		C5.setFocusPainted(false);
		C5.setBackground(new Color(240,240,240,240));
		C5.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    C5.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	C5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		C5.setBounds(588, 133, 55, 40);
		panel.add(C5);
		
		JButton B5 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB5("B5");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5B5().equals("0")){
				B5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5B5().equals("0")){
				B5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5B5().equals("0")){
				B5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5B5().equals("0")){
				B5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5B5().equals("0")){
				B5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6B5().equals("0")){
				B5.setEnabled(true);
			}else if(controle.getPoltronaLivreS6B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		
		
		B5.setBorderPainted(false);
		B5.setFocusPainted(false);
		B5.setBackground(new Color(240,240,240,240));
		B5.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    B5.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	B5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B5.setBounds(588, 234, 55, 40);
		panel.add(B5);
		
		JButton B4 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB4("B4");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5B4().equals("0")){
				B4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5B4().equals("0")){
				B4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5B4().equals("0")){
				B4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5B4().equals("0")){
				B4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5B4().equals("0")){
				B4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6B4().equals("0")){
				B4.setEnabled(true);
			}else if(controle.getPoltronaLivreS6B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		
		
		B4.setBorderPainted(false);
		B4.setFocusPainted(false);
		B4.setBackground(new Color(240,240,240,240));
		B4.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    B4.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	B4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B4.setBounds(463, 234, 55, 40);
		panel.add(B4);
		
		
		JButton B3 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB3("B3");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5B3().equals("0")){
				B3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5B3().equals("0")){
				B3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5B3().equals("0")){
				B3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5B3().equals("0")){
				B3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5B3().equals("0")){
				B3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6B3().equals("0")){
				B3.setEnabled(true);
			}else if(controle.getPoltronaLivreS6B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		
		
		B3.setBorderPainted(false);
		B3.setFocusPainted(false);
		B3.setBackground(new Color(240,240,240,240));
		B3.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    B3.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	B3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});		B3.setBounds(328, 234, 55, 40);
		panel.add(B3);
		
		JButton B2 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB2("B2");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5B2().equals("0")){
				B2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5B2().equals("0")){
				B2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5B2().equals("0")){
				B2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5B2().equals("0")){
				B2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5B2().equals("0")){
				B2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6B2().equals("0")){
				B2.setEnabled(true);
			}else if(controle.getPoltronaLivreS6B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		
		
		B2.setBorderPainted(false);
		B2.setFocusPainted(false);
		B2.setBackground(new Color(240,240,240,240));
		B2.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    B2.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	B2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B2.setBounds(183, 234, 55, 40);
		panel.add(B2);
		
		
		
		JButton B1 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB1("B1");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5B1().equals("0")){
				B1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5B1().equals("0")){
				B1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5B1().equals("0")){
				B1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5B1().equals("0")){
				B1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5B1().equals("0")){
				B1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6B1().equals("0")){
				B1.setEnabled(true);
			}else if(controle.getPoltronaLivreS6B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		
		
		B1.setBorderPainted(false);
		B1.setFocusPainted(false);
		B1.setBackground(new Color(240,240,240,240));
		B1.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    B1.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	B1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B1.setBounds(41, 234, 55, 40);
		panel.add(B1);
		
		JButton A1 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		ControlePoltrona controleA1 = new ControlePoltrona();
		try {
			controle.pegarPoltronas("A1");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		

		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5().equals("0")){
				A1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5().equals("0")){
				A1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5().equals("0")){
				A1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5().equals("0")){
				A1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5().equals("0")){
				A1.setEnabled(true);
			}else if(controle.getPoltronaLivreS5().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6().equals("0")){
				A1.setEnabled(true);
			}else if(controle.getPoltronaLivreS6().equals("1")){
				A1.setEnabled(false);
			}
		}
		
		A1.setBorderPainted(false);
		A1.setFocusPainted(false);
		A1.setBackground(new Color(240,240,240,240));
		A1.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    A1.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	A1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A1.setBounds(41, 326, 55, 40);
		panel.add(A1);
		
		JButton A2 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		try {
			controle.pegarPoltronasA2("A2");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5A2().equals("0")){
				A2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5A2().equals("0")){
				A2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5A2().equals("0")){
				A2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5A2().equals("0")){
				A2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5A2().equals("0")){
				A2.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6A2().equals("0")){
				A2.setEnabled(true);
			}else if(controle.getPoltronaLivreS6A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		A2.setBorderPainted(false);
		A2.setFocusPainted(false);
		A2.setBackground(new Color(240,240,240,240));
		A2.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    A2.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	A2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A2.setBounds(183, 326, 55, 40);
		panel.add(A2);
		
		JButton A3 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		try {
			controle.pegarPoltronasA3("A3");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5A3().equals("0")){
				A3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5A3().equals("0")){
				A3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5A3().equals("0")){
				A3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5A3().equals("0")){
				A3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5A3().equals("0")){
				A3.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6A3().equals("0")){
				A3.setEnabled(true);
			}else if(controle.getPoltronaLivreS6A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		
		A3.setBorderPainted(false);
		A3.setFocusPainted(false);
		A3.setBackground(new Color(240,240,240,240));
		A3.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    A3.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	A3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A3.setBounds(328, 326, 55, 40);
		panel.add(A3);
		
		JButton A4 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		
		try {
			controle.pegarPoltronasA4("A4");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5A4().equals("0")){
				A4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5A4().equals("0")){
				A4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5A4().equals("0")){
				A4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5A4().equals("0")){
				A4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5A4().equals("0")){
				A4.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6A4().equals("0")){
				A4.setEnabled(true);
			}else if(controle.getPoltronaLivreS6A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		
		
		A4.setBorderPainted(false);
		A4.setFocusPainted(false);
		A4.setBackground(new Color(240,240,240,240));
		A4.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    A4.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	A4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A4.setBounds(463, 326, 55, 40);
		panel.add(A4);
		
		JButton A5 = new JButton(new ImageIcon(Poltronas.class.getResource("/Midia/poltrona (1).png")));
		
		
		try {
			controle.pegarPoltronasA5("A5");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(controle.getPoltronaLivreS5A5().equals("0")){
				A5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(controle.getPoltronaLivreS5A5().equals("0")){
				A5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(controle.getPoltronaLivreS5A5().equals("0")){
				A5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(controle.getPoltronaLivreS5A5().equals("0")){
				A5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(controle.getPoltronaLivreS5A5().equals("0")){
				A5.setEnabled(true);
			}else if(controle.getPoltronaLivreS5A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(controle.getPoltronaLivreS6A5().equals("0")){
				A5.setEnabled(true);
			}else if(controle.getPoltronaLivreS6A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		
		
		A5.setBorderPainted(false);
		A5.setFocusPainted(false);
		A5.setBackground(new Color(240,240,240,240));
		A5.addActionListener(new ActionListener() {
			int cont;
			public void actionPerformed(ActionEvent e) {
				
				 cont = cont + 1;
	                if(cont == 1) {
	                    A5.setBackground(Color.blue);
	                    cp.soma(20);	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(20);
	                	A5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A5.setBounds(588, 326, 55, 40);
		panel.add(A5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(28, 411, 632, 26);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTela = new JLabel("TELA");
		lblTela.setFont(new Font("Arial", Font.BOLD, 15));
		lblTela.setForeground(new Color(255, 255, 255));
		lblTela.setBackground(new Color(255, 255, 255));
		lblTela.setHorizontalAlignment(SwingConstants.CENTER);
		lblTela.setBounds(0, 0, 632, 23);
		panel_1.add(lblTela);
		
		JLabel lblLinhaA = new JLabel("A");
		lblLinhaA.setFont(new Font("Arial", Font.BOLD, 14));
		lblLinhaA.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinhaA.setBounds(62, 445, 45, 17);
		contentPane.add(lblLinhaA);
		
		JLabel lblLinhaB = new JLabel("B");
		lblLinhaB.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinhaB.setFont(new Font("Arial", Font.BOLD, 14));
		lblLinhaB.setBounds(62, 354, 45, 17);
		contentPane.add(lblLinhaB);
		
		JLabel lblLinhaC = new JLabel("C");
		lblLinhaC.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinhaC.setFont(new Font("Arial", Font.BOLD, 14));
		lblLinhaC.setBounds(62, 254, 45, 17);
		contentPane.add(lblLinhaC);
		
		JLabel lblLinhaD = new JLabel("D");
		lblLinhaD.setHorizontalAlignment(SwingConstants.CENTER);
		lblLinhaD.setFont(new Font("Arial", Font.BOLD, 14));
		lblLinhaD.setBounds(62, 164, 45, 17);
		contentPane.add(lblLinhaD);
		
		JLabel lblColuna1 = new JLabel("1");
		lblColuna1.setHorizontalAlignment(SwingConstants.CENTER);
		lblColuna1.setFont(new Font("Arial", Font.BOLD, 14));
		lblColuna1.setBounds(198, 63, 45, 17);
		contentPane.add(lblColuna1);
		
		JLabel lblColuna2 = new JLabel("2");
		lblColuna2.setHorizontalAlignment(SwingConstants.CENTER);
		lblColuna2.setFont(new Font("Arial", Font.BOLD, 14));
		lblColuna2.setBounds(346, 63, 45, 17);
		contentPane.add(lblColuna2);
		
		JLabel lblColuna3 = new JLabel("3");
		lblColuna3.setHorizontalAlignment(SwingConstants.CENTER);
		lblColuna3.setFont(new Font("Arial", Font.BOLD, 14));
		lblColuna3.setBounds(486, 63, 45, 17);
		contentPane.add(lblColuna3);
		
		JLabel lblColuna4 = new JLabel("4");
		lblColuna4.setHorizontalAlignment(SwingConstants.CENTER);
		lblColuna4.setFont(new Font("Arial", Font.BOLD, 14));
		lblColuna4.setBounds(625, 63, 45, 17);
		contentPane.add(lblColuna4);
		
		JLabel lblColuna5 = new JLabel("5");
		lblColuna5.setHorizontalAlignment(SwingConstants.CENTER);
		lblColuna5.setFont(new Font("Arial", Font.BOLD, 14));
		lblColuna5.setBounds(752, 63, 45, 17);
		contentPane.add(lblColuna5);
		
		JLabel labelFilme = new JLabel("");
		labelFilme.setFont(new Font("Arial", Font.BOLD, 15));
		labelFilme.setHorizontalAlignment(SwingConstants.CENTER);
		labelFilme.setBounds(151, 559, 361, 37);
		labelFilme.setText(String.valueOf(InfoFilme.getNomePoltrona()));
		contentPane.add(labelFilme);
		
		JLabel labelHorario = new JLabel("HORÁRIO");
		labelHorario.setFont(new Font("Arial", Font.BOLD, 15));
		labelHorario.setHorizontalAlignment(SwingConstants.CENTER);
		labelHorario.setBounds(522, 559, 320, 32);
		labelHorario.setText(String.valueOf(InfoFilme.getHorarioPoltrona() +" Horas " + InfoFilme.getMinutoPoltrona() + " Minutos " ));
		contentPane.add(labelHorario);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InfoFilme voltarinfo = new InfoFilme();
				voltarinfo.setVisible(true);
				dispose();
			}
		});
		voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		voltar.setBounds(20, 25, 75, 35);
		contentPane.add(voltar);
	 
		
	System.out.println(pegarSoma);	
	}
}
