package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Core.Filme;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;

public class TelaDeFilmes extends JFrame {

	private JPanel contentPane;

	//-------CRIANDO A TELA
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeFilmes frame = new TelaDeFilmes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaDeFilmes() {
		
		setTitle("Escolha de filmes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaDeFilmes.class.getResource("/Midia/ifpe.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//-------CRIANDO OS LABELS
		JLabel lblConfirmacao = new JLabel("New label");
		lblConfirmacao.setBounds(664, 86, 93, 14);
		contentPane.add(lblConfirmacao);
		
		
		JLabel catalogo = new JLabel("Catálogo de Filmes");
		catalogo.setForeground(new Color(63, 164, 13, 236));
		catalogo.setFont(new Font("Sitka Heading", Font.PLAIN, 50));
		catalogo.setBounds(291, 22, 405, 53);
		contentPane.add(catalogo);
		
		JLabel emExibicao = new JLabel("Em Exibição:");
		emExibicao.setFont(new Font("Tahoma", Font.BOLD, 17));
		emExibicao.setBounds(412, 86, 114, 23);
		contentPane.add(emExibicao);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial voltar = null;
				
				voltar = new TelaInicial();
		        voltar.setVisible(true);
		        dispose();
		        }
			
		});
		voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		voltar.setBounds(10, 22, 75, 35);
		contentPane.add(voltar);
	
		
		JButton help = new JButton("Help");
		help.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	JOptionPane.showMessageDialog(null, "Nessa tela, o cliente pode optar por acessar algum dos filmes em exibição. Os filmes " +
	        "que estão 'Em Breve' serão exibidos nas próximas sessões.", "Help", JOptionPane.QUESTION_MESSAGE);
	    	
	    }
	 });
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		help.setBounds(883, 35, 66, 29);
		contentPane.add(help);
		
		JLabel Filme1 = new JLabel("");
		Filme1.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	      
	        	TelaInicial.setIdFilme(1);
				InfoFilme infoFilme = new InfoFilme();
		        infoFilme.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto1;
		try {
			buscarfoto1 = new Filme().buscarCartaz(1);
			String nomedoarquivo1 = buscarfoto1;
		    Filme1.setIcon(new ImageIcon(nomedoarquivo1));
		    Filme1.setText(buscarfoto1);
		    contentPane.add(Filme1);
		    Filme1.setBounds(10, 123, 214, 255);
			
		} catch (ClassNotFoundException e1) {
			lblConfirmacao.setText("Erro de conexão");
		}
		catch (SQLException e1) {
			lblConfirmacao.setText("Erro de conexão");
		
		}
	      
	      
		JLabel Filme2 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme2.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaInicial.setIdFilme(2);
				InfoFilme infoFilme = new InfoFilme();
		        infoFilme.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto2;
		try {
			buscarfoto2 = new Filme().buscarCartaz(2);
			String nomedoarquivo2 = buscarfoto2;
		    Filme2.setIcon(new ImageIcon(nomedoarquivo2));
		    Filme2.setText(buscarfoto2);
		    contentPane.add(Filme2);
		    Filme2.setBounds(382, 123, 214, 255);
			
		} catch (ClassNotFoundException e1) {
			lblConfirmacao.setText("Erro de conexão");
			
		} catch (SQLException e1) {
			lblConfirmacao.setText("Erro de conexão");
		
			}
			
		
		JLabel Filme3 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme3.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaInicial.setIdFilme(3);
				InfoFilme infoFilme = new InfoFilme();
		        infoFilme.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto3;
		
	
		try {
			buscarfoto3 = new Filme().buscarCartaz(3);
			String nomedoarquivo3 = buscarfoto3;
			Filme3.setIcon(new ImageIcon(nomedoarquivo3));
			Filme3.setText(buscarfoto3);
			contentPane.add(Filme3);
			Filme3.setBounds(760, 123, 214, 255);
			
			}catch (ClassNotFoundException e1) {
				lblConfirmacao.setText("Erro de conexão");
			
			}catch (SQLException e1) {
				lblConfirmacao.setText("Erro de conexão");
		
				}
	
		
		JLabel Filme6 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme6.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaInicial.setIdFilme(6);
				InfoFilme infoFilme = new InfoFilme();
		        infoFilme.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto6;
		try {
			buscarfoto6 = new Filme().buscarCartaz(6);
			String nomedoarquivo6 = buscarfoto6;
		    Filme6.setIcon(new ImageIcon(nomedoarquivo6));
		    Filme6.setText(buscarfoto6);
		    contentPane.add(Filme6);
		    Filme6.setBounds(760, 415, 214, 255);
			
		}catch (ClassNotFoundException e1) {
			lblConfirmacao.setText("Erro de conexão");
			
		}catch (SQLException e1) {
			lblConfirmacao.setText("Erro de conexão");
		
		}
		
	  
		JLabel Filme5 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme5.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaInicial.setIdFilme(5);
				InfoFilme infoFilme = new InfoFilme();
		        infoFilme.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto5;
		try {
			buscarfoto5 = new Filme().buscarCartaz(5);
			String nomedoarquivo5 = buscarfoto5;
		    Filme5.setIcon(new ImageIcon(nomedoarquivo5));
		    Filme5.setText(buscarfoto5);
		    contentPane.add(Filme5);
		    Filme5.setBounds(382, 415, 215, 255);
			
		} catch (ClassNotFoundException e1) {
			lblConfirmacao.setText("Erro de conexão");
			
		} catch (SQLException e1) {
			lblConfirmacao.setText("Erro de conexão");
		
		}
		
	    
		JLabel Filme4 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme4.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaInicial.setIdFilme(4);
				InfoFilme infoFilme = new InfoFilme();
		        infoFilme.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto4;
		try {
			buscarfoto4 = new Filme().buscarCartaz(4);
			String nomedoarquivo4 = buscarfoto4;
		    Filme4.setIcon(new ImageIcon(nomedoarquivo4));
		    Filme4.setText(buscarfoto4);
		    contentPane.add(Filme4);
		    Filme4.setBounds(10, 415, 214, 255);	
		} catch (ClassNotFoundException e1) {
			lblConfirmacao.setText("Erro de conexão");
			
		} catch (SQLException e1) {
			lblConfirmacao.setText("Erro de conexão");
		
		}
		
		
	    
	    
	    JPanel panel = new JPanel();
	    panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel.setBounds(5, 119, 224, 264);
	    contentPane.add(panel);
	    panel.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setLayout(null);
	    panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_1.setBounds(378, 119, 222, 264);
	    contentPane.add(panel_1);
	    
	    JPanel panel_1_1 = new JPanel();
	    panel_1_1.setLayout(null);
	    panel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_1_1.setBounds(755, 119, 224, 264);
	    contentPane.add(panel_1_1);
	    
	    JPanel panel_1_1_1 = new JPanel();
	    panel_1_1_1.setLayout(null);
	    panel_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_1_1_1.setBounds(5, 409, 227, 268);
	    contentPane.add(panel_1_1_1);
	    
	    JPanel panel_1_1_1_1 = new JPanel();
	    panel_1_1_1_1.setLayout(null);
	    panel_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_1_1_1_1.setBounds(378, 408, 223, 272);
	    contentPane.add(panel_1_1_1_1);
	    
	    JPanel panel_1_1_1_2 = new JPanel();
	    panel_1_1_1_2.setLayout(null);
	    panel_1_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_1_1_1_2.setBounds(752, 409, 227, 268);
	    contentPane.add(panel_1_1_1_2);
	    
	   
	}
}