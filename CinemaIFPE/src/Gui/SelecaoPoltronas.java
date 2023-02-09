package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import Core.ControlePoltrona;
import Core.Filme;
import Core.Sala;

import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelecaoPoltronas extends JFrame {

	private JPanel contentPane;
	private static List<String> poltronaSelecionada = new ArrayList<String>();
	
	public static List getPoltronaSelecionada() {
		return poltronaSelecionada;
	}
	
	public static void resetarPoltronaSelecionada() {
		poltronaSelecionada.clear();
	}
	
	
	private int pegarSoma;
	
	private ControlePoltrona controle = new ControlePoltrona();

	
	private static String A1Set;
	private static String A2Set;
	private static String A3Set;
	private static String A4Set;
	private static String A5Set;
	
	private static String B1Set;
	private static String B2Set;
	private static String B3Set;
	private static String B4Set;
	private static String B5Set;
	
	private static String C1Set;
	private static String C2Set;
	private static String C3Set;
	private static String C4Set;
	private static String C5Set;

	private static String D1Set;
	private static String D2Set;
	private static String D3Set;
	private static String D4Set;
	private static String D5Set;
	
	
	
	public static String getA1Set() {
		return A1Set;
	}

	public static void setA1Set(String a1Set) {
		A1Set = a1Set;
	}

	public static String getA2Set() {
		return A2Set;
	}

	public static void setA2Set(String a2Set) {
		A2Set = a2Set;
	}

	public static String getA3Set() {
		return A3Set;
	}

	public static void setA3Set(String a3Set) {
		A3Set = a3Set;
	}

	public static String getA4Set() {
		return A4Set;
	}

	public static void setA4Set(String a4Set) {
		A4Set = a4Set;
	}

	public static String getA5Set() {
		return A5Set;
	}

	public static void setA5Set(String a5Set) {
		A5Set = a5Set;
	}

	public static String getB1Set() {
		return B1Set;
	}

	public static void setB1Set(String b1Set) {
		B1Set = b1Set;
	}

	public static String getB2Set() {
		return B2Set;
	}

	public static void setB2Set(String b2Set) {
		B2Set = b2Set;
	}

	public static String getB3Set() {
		return B3Set;
	}

	public static void setB3Set(String b3Set) {
		B3Set = b3Set;
	}

	public static String getB4Set() {
		return B4Set;
	}

	public static void setB4Set(String b4Set) {
		B4Set = b4Set;
	}

	public static String getB5Set() {
		return B5Set;
	}

	public static void setB5Set(String b5Set) {
		B5Set = b5Set;
	}

	public static String getC1Set() {
		return C1Set;
	}

	public static void setC1Set(String c1Set) {
		C1Set = c1Set;
	}

	public static String getC2Set() {
		return C2Set;
	}

	public static void setC2Set(String c2Set) {
		C2Set = c2Set;
	}

	public static String getC3Set() {
		return C3Set;
	}

	public static void setC3Set(String c3Set) {
		C3Set = c3Set;
	}

	public static String getC4Set() {
		return C4Set;
	}

	public static void setC4Set(String c4Set) {
		C4Set = c4Set;
	}

	public static String getC5Set() {
		return C5Set;
	}

	public static void setC5Set(String c5Set) {
		C5Set = c5Set;
	}

	public static String getD1Set() {
		return D1Set;
	}

	public static void setD1Set(String d1Set) {
		D1Set = d1Set;
	}

	public static String getD2Set() {
		return D2Set;
	}

	public static void setD2Set(String d2Set) {
		D2Set = d2Set;
	}

	public static String getD3Set() {
		return D3Set;
	}

	public static void setD3Set(String d3Set) {
		D3Set = d3Set;
	}

	public static String getD4Set() {
		return D4Set;
	}

	public static void setD4Set(String d4Set) {
		D4Set = d4Set;
	}

	public static String getD5Set() {
		return D5Set;
	}

	public static void setD5Set(String d5Set) {
		D5Set = d5Set;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecaoPoltronas frame = new SelecaoPoltronas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public SelecaoPoltronas() {
		
		System.out.println(SelecaoPoltronas.getPoltronaSelecionada());
		
		ControlePoltrona cp = new ControlePoltrona();
		Sala sala = new Sala();
		try {
			sala.pegarPreco();
		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(SelecaoPoltronas.class.getResource("ifpe.png")));
		
		
		setTitle("Escolha de poltronas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 1000, 720));
		setSize(1000,720);
		setResizable(false);
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
		
		System.out.println(TelaInicial.getIdFilme());
		JButton D1 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD1("D1");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1D1().equals("0")){
            	D1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2D1().equals("0")){
            	D1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3D1().equals("0")){
            	D1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4D1().equals("0")){
            	D1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5D1().equals("0")){
            	D1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5D1().equals("1")){
            	D1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6D1().equals("0")){
                D1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6D1().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    D1Set = "1";
	                    poltronaSelecionada.add("D1");
	                 
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	D1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    D1Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("D1");
	                   
	                    
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);               
	                    }
	                   
			}
		}});
		D1.setBounds(41, 42, 55, 40);
		panel.add(D1);
		
		  
		
		JButton D2 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD2("D2");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1D2().equals("0")){
                D2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2D2().equals("0")){
                D2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3D2().equals("0")){
                D2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4D2().equals("0")){
                D2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5D2().equals("0")){
                D2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5D2().equals("1")){
                D2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6D2().equals("0")){
                D2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6D2().equals("1")){
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
	                	D2Set = "1";
	                    D2.setBackground(Color.blue);
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    poltronaSelecionada.add("D2");
	                   
	                    
	                    	                    
	               
	                } else if(cont == 2) {
	                	D2Set = "0";
	                	cp.subtracao(sala.getPreco());
	                	D2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    poltronaSelecionada.remove("D2");
	                    
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    		                 	
	                    }
	                   
			}
		}});
		D2.setBounds(183, 42, 55, 40);
		panel.add(D2);
		
		
		
		JButton D3 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD3("D3");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1D3().equals("0")){
                D3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1D3().equals("1")){
                D3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2D3().equals("0")){
                D3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2D3().equals("1")){
                D3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3D3().equals("0")){
                D3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3D3().equals("1")){
                D3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4D3().equals("0")){
                D3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4D3().equals("1")){
                D3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5D3().equals("0")){
                D3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5D3().equals("1")){
                D3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6D3().equals("0")){
                D3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6D3().equals("1")){
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
	                	D3Set = "1";
	                    D3.setBackground(Color.blue);
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    poltronaSelecionada.add("D3");
	                    
	                   
	                    	                    
	               
	                } else if(cont == 2) {
	                	D3Set = "0";
	                	cp.subtracao(sala.getPreco());
	                	D3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    poltronaSelecionada.remove("D3");
	                    
	                    cont = 0;
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);                    		                  	
	                    }                
			}
		}});
		D3.setBounds(328, 42, 55, 40);
		panel.add(D3);
		
		
		
		JButton D4 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD4("D4");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1D4().equals("0")){
            	D4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2D4().equals("0")){
            	D4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3D4().equals("0")){
            	D4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4D4().equals("0")){
            	D4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5D4().equals("0")){
            	D4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5D4().equals("1")){
            	D4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6D4().equals("0")){
            	D4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6D4().equals("1")){
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
	                	D4Set = "1";
	                    D4.setBackground(Color.blue);
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    poltronaSelecionada.add("D4");
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	D4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    D4Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("D4");
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);	                                        	
	                    }	                           
			}
		}});
		D4.setBounds(463, 42, 55, 40);
		panel.add(D4);
		
		JButton D5 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasD5("D5");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		 if(TelaInicial.getIdFilme() == 1){
	            if(ControlePoltrona.getPoltronaLivreS1D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(ControlePoltrona.getPoltronaLivreS1D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
		 if(TelaInicial.getIdFilme() == 2){
	            if(ControlePoltrona.getPoltronaLivreS2D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(ControlePoltrona.getPoltronaLivreS2D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
		 if(TelaInicial.getIdFilme() == 3){
	            if(ControlePoltrona.getPoltronaLivreS3D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(ControlePoltrona.getPoltronaLivreS3D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
		 if(TelaInicial.getIdFilme() == 4){
	            if(ControlePoltrona.getPoltronaLivreS4D5().equals("0")){
	            	D5.setEnabled(true);
	            }else if(ControlePoltrona.getPoltronaLivreS4D5().equals("1")){
	            	D5.setEnabled(false);
	            }
	        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5D5().equals("0")){
            	D5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5D5().equals("1")){
            	D5.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6D5().equals("0")){
            	D5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6D5().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    D5Set = "1";
	                    poltronaSelecionada.add("D5");
	                    
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	D5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    D5Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("D5");
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);	                   	                    	
	                    }
	          	                   
			}
		}});
		D5.setBounds(588, 42, 55, 40);
		panel.add(D5);
		
		JButton C1 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC1("C1");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1C1().equals("0")){
                C1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1C1().equals("1")){
                C1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2C1().equals("0")){
                C1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2C1().equals("1")){
                C1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3C1().equals("0")){
                C1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3C1().equals("1")){
                C1.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4C1().equals("0")){
                C1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4C1().equals("1")){
                C1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5C1().equals("0")){
                C1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5C1().equals("1")){
                C1.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6C1().equals("0")){
                C1.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6C1().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    C1Set = "1";
	                    poltronaSelecionada.add("C1");
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	C1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    C1Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("C1");
	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);	                    		                    	
	                    }	                            
			}
		}});
		C1.setBounds(41, 133, 55, 40);
		panel.add(C1);
		
		JButton C2 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC2("C2");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1C2().equals("0")){
                C2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1C2().equals("1")){
                C2.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2C2().equals("0")){
                C2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2C2().equals("1")){
                C2.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3C2().equals("0")){
                C2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3C2().equals("1")){
                C2.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4C2().equals("0")){
                C2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4C2().equals("1")){
                C2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5C2().equals("0")){
                C2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5C2().equals("1")){
                C2.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6C2().equals("0")){
                C2.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6C2().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    C2Set = "1";
	                    poltronaSelecionada.add("C2");
	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	C2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    C2Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("C2");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    		                    	
	                    }
	                     
			}
		}});
		C2.setBounds(183, 133, 55, 40);
		panel.add(C2);
		
		JButton C3 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC3("C3");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1C3().equals("0")){
                C3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1C3().equals("1")){
                C3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2C3().equals("0")){
                C3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2C3().equals("1")){
                C3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3C3().equals("0")){
                C3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3C3().equals("1")){
                C3.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4C3().equals("0")){
                C3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4C3().equals("1")){
                C3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5C3().equals("0")){
                C3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5C3().equals("1")){
                C3.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6C3().equals("0")){
                C3.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6C3().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    C3Set = "1";
	                    poltronaSelecionada.add("C3");

	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	C3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    C3Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("C3");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	            
	                    	
	                    }
	          
	                   
			}
		}});
		C3.setBounds(328, 133, 55, 40);
		panel.add(C3);
		
		JButton C4 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC4("C4");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1C4().equals("0")){
                C4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1C4().equals("1")){
                C4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2C4().equals("0")){
                C4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2C4().equals("1")){
                C4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3C4().equals("0")){
                C4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3C4().equals("1")){
                C4.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4C4().equals("0")){
                C4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4C4().equals("1")){
                C4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5C4().equals("0")){
                C4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5C4().equals("1")){
                C4.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6C4().equals("0")){
                C4.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6C4().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    C4Set = "1";
	                    poltronaSelecionada.add("C4");

	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	C4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    C4Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("C4");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		C4.setBounds(463, 133, 55, 40);
		panel.add(C4);
		
		JButton C5 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
            controle.pegarPoltronasC5("C5");
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
		
		
		if(TelaInicial.getIdFilme() == 1){
            if(ControlePoltrona.getPoltronaLivreS1C5().equals("0")){
                C5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS1C5().equals("1")){
                C5.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 2){
            if(ControlePoltrona.getPoltronaLivreS2C5().equals("0")){
                C5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS2C5().equals("1")){
                C5.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 3){
            if(ControlePoltrona.getPoltronaLivreS3C5().equals("0")){
                C5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS3C5().equals("1")){
                C5.setEnabled(false);
            }
        }
		if(TelaInicial.getIdFilme() == 4){
            if(ControlePoltrona.getPoltronaLivreS4C5().equals("0")){
                C5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS4C5().equals("1")){
                C5.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 5){
            if(ControlePoltrona.getPoltronaLivreS5C5().equals("0")){
                C5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS5C5().equals("1")){
                C5.setEnabled(false);
            }
        }
        if(TelaInicial.getIdFilme() == 6){
            if(ControlePoltrona.getPoltronaLivreS6C5().equals("0")){
            	C5.setEnabled(true);
            }else if(ControlePoltrona.getPoltronaLivreS6C5().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    C5Set = "1";
	                    poltronaSelecionada.add("C5");

	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	C5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    C5Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("C5");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		C5.setBounds(588, 133, 55, 40);
		panel.add(C5);
		
		JButton B5 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB5("B5");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1B5().equals("0")){
				B5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2B5().equals("0")){
				B5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3B5().equals("0")){
				B5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4B5().equals("0")){
				B5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5B5().equals("0")){
				B5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5B5().equals("1")){
				B5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6B5().equals("0")){
				B5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6B5().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    B5Set = "1";
	                    poltronaSelecionada.add("B5");

	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	B5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    B5Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("B5");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B5.setBounds(588, 234, 55, 40);
		panel.add(B5);
		
		JButton B4 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB4("B4");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1B4().equals("0")){
				B4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2B4().equals("0")){
				B4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3B4().equals("0")){
				B4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4B4().equals("0")){
				B4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5B4().equals("0")){
				B4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5B4().equals("1")){
				B4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6B4().equals("0")){
				B4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6B4().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    B4Set = "1";
	                    poltronaSelecionada.add("B4");

	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	B4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    B4Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("B4");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B4.setBounds(463, 234, 55, 40);
		panel.add(B4);
		
		
		JButton B3 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB3("B3");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1B3().equals("0")){
				B3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2B3().equals("0")){
				B3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3B3().equals("0")){
				B3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4B3().equals("0")){
				B3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5B3().equals("0")){
				B3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5B3().equals("1")){
				B3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6B3().equals("0")){
				B3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6B3().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    B3Set = "1";
	                    poltronaSelecionada.add("B3");

	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	B3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    B3Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("B3");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});		B3.setBounds(328, 234, 55, 40);
		panel.add(B3);
		
		JButton B2 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB2("B2");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1B2().equals("0")){
				B2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2B2().equals("0")){
				B2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3B2().equals("0")){
				B2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4B2().equals("0")){
				B2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5B2().equals("0")){
				B2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5B2().equals("1")){
				B2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6B2().equals("0")){
				B2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6B2().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    B2Set = "1";
	                    poltronaSelecionada.add("B2");

	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	B2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    B2Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("B2");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B2.setBounds(183, 234, 55, 40);
		panel.add(B2);
		
		
		
		JButton B1 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
			controle.pegarPoltronasB1("B1");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1B1().equals("0")){
				B1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2B1().equals("0")){
				B1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3B1().equals("0")){
				B1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4B1().equals("0")){
				B1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5B1().equals("0")){
				B1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5B1().equals("1")){
				B1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6B1().equals("0")){
				B1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6B1().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    B1Set = "1";
	                    poltronaSelecionada.add("B1");

	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	B1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    B1Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("B1");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		B1.setBounds(41, 234, 55, 40);
		panel.add(B1);
		
		JButton A1 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		try {
			controle.pegarPoltronas("A1");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		

		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1().equals("0")){
				A1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2().equals("0")){
				A1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3().equals("0")){
				A1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4().equals("0")){
				A1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5().equals("0")){
				A1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5().equals("1")){
				A1.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6().equals("0")){
				A1.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    A1Set = "1";
	                    poltronaSelecionada.add("A1");

	                    	                    
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	A1.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    A1Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("A1");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A1.setBounds(41, 326, 55, 40);
		panel.add(A1);
		
		JButton A2 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		try {
			controle.pegarPoltronasA2("A2");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1A2().equals("0")){
				A2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2A2().equals("0")){
				A2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3A2().equals("0")){
				A2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4A2().equals("0")){
				A2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5A2().equals("0")){
				A2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5A2().equals("1")){
				A2.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6A2().equals("0")){
				A2.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6A2().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    A2Set = "1";
	                    poltronaSelecionada.add("A2");
   
	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	A2.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    A2Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("A2");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A2.setBounds(183, 326, 55, 40);
		panel.add(A2);
		
		JButton A3 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		try {
			controle.pegarPoltronasA3("A3");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1A3().equals("0")){
				A3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2A3().equals("0")){
				A3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3A3().equals("0")){
				A3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4A3().equals("0")){
				A3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5A3().equals("0")){
				A3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5A3().equals("1")){
				A3.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6A3().equals("0")){
				A3.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6A3().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    A3Set = "1";
	                    poltronaSelecionada.add("A3");

	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	A3.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    A3Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("A3");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A3.setBounds(328, 326, 55, 40);
		panel.add(A3);
		
		JButton A4 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		
		try {
			controle.pegarPoltronasA4("A4");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1A4().equals("0")){
				A4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2A4().equals("0")){
				A4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3A4().equals("0")){
				A4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4A4().equals("0")){
				A4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5A4().equals("0")){
				A4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5A4().equals("1")){
				A4.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6A4().equals("0")){
				A4.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6A4().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    A4Set = "1";
	                    poltronaSelecionada.add("A4");

	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	A4.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    A4Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("A4");

	                    
	                    if(cp.getPreco() == 0) {
	                    	
	                    	totalPoltronas.setText("");
	                    	botaoContinuar.setEnabled(false);
	                    	
	                    	
	                    }
	          
	                   
			}
		}});
		A4.setBounds(463, 326, 55, 40);
		panel.add(A4);
		
		JButton A5 = new JButton(new ImageIcon(SelecaoPoltronas.class.getResource("poltrona (1).png")));
		
		
		try {
			controle.pegarPoltronasA5("A5");
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
		if(TelaInicial.getIdFilme() == 1){
			if(ControlePoltrona.getPoltronaLivreS1A5().equals("0")){
				A5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS1A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 2){
			if(ControlePoltrona.getPoltronaLivreS2A5().equals("0")){
				A5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS2A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 3){
			if(ControlePoltrona.getPoltronaLivreS3A5().equals("0")){
				A5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS3A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 4){
			if(ControlePoltrona.getPoltronaLivreS4A5().equals("0")){
				A5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS4A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 5){
			if(ControlePoltrona.getPoltronaLivreS5A5().equals("0")){
				A5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS5A5().equals("1")){
				A5.setEnabled(false);
			}
		}
		if(TelaInicial.getIdFilme() == 6){
			if(ControlePoltrona.getPoltronaLivreS6A5().equals("0")){
				A5.setEnabled(true);
			}else if(ControlePoltrona.getPoltronaLivreS6A5().equals("1")){
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
	                    cp.soma(sala.getPreco());	                    
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    botaoContinuar.setEnabled(true);
	                    A5Set = "1";
	                    poltronaSelecionada.add("A5");

	               
	                } else if(cont == 2) {
	                	cp.subtracao(sala.getPreco());
	                	A5.setBackground(new Color(240,240,240,240));
	                    totalPoltronas.setText("Total: R$"+cp.getPreco()+",00");
	                    A5Set = "0";
	                    cont = 0;
	                    poltronaSelecionada.remove("A5");

	                    
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
				cp.setPreco(0);
				InfoFilme voltarinfo = new InfoFilme();
				voltarinfo.setVisible(true);
				dispose();
			}
		});
		voltar.setBackground(new Color(240, 240, 240));
        voltar.setIcon(new ImageIcon(TelaTodosFilmes.class.getResource("retornar.png")));
        voltar.setBorderPainted(false);
        voltar.setFocusPainted(false);
        voltar.setBounds(10, 22, 66, 40);
        voltar.setText("");
        contentPane.add(voltar);
        
        
        JButton help = new JButton("");
	  	help.setIcon(new ImageIcon(InfoFilme.class.getResource("ponto-de-interrogacao.png")));
		help.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		 JOptionPane.showMessageDialog(null, "Nessa tela, você pode selecionar as poltronas " + "\n" +
	                     "que deseja e visualizar o preço. ", "Help", JOptionPane.QUESTION_MESSAGE);
	      	}
	      });
		help.setBorderPainted(false);
		help.setFocusPainted(false);
		help.setBackground(new Color(240, 240, 240));
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		help.setBounds(909, 30, 65, 32);
		contentPane.add(help);		
	}
}