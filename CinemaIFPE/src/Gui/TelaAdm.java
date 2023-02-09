package Gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Core.Administrador;
import Core.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

public class TelaAdm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel mensagem; 

	//-------CRIANDO A TELA
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdm frame = new TelaAdm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public TelaAdm() {
		
		setTitle("Login do administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAdm.class.getResource("ifpe.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//-------CRIANDO OS LABELS
		
		JLabel cineifPaulista = new JLabel("CineIF Paulista");
		cineifPaulista.setHorizontalAlignment(SwingConstants.CENTER);
		cineifPaulista.setForeground(new Color(63, 164, 13, 236));
		cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 42));
		cineifPaulista.setBounds(20, 11, 954, 132);
		contentPane.add(cineifPaulista);
		
		JLabel usuario = new JLabel("Usuário:");
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usuario.setBounds(308, 474, 81, 29);
	    contentPane.add(usuario);
	      
	    JLabel senha = new JLabel("Senha:");
	    senha.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    senha.setBounds(323, 525, 66, 29);
	    contentPane.add(senha);
	      
	    mensagem = new JLabel("  ");
	    mensagem.setHorizontalAlignment(SwingConstants.CENTER);
	    mensagem.setFont(new Font("Tahoma", Font.BOLD, 16));
	    mensagem.setBounds(0, 570, 984, 25);
	    contentPane.add(mensagem);
	      
	    JLabel administrador = new JLabel("ADMINISTRADOR");
	    administrador.setFont(new Font("Tahoma", Font.BOLD, 18));
	    administrador.setBounds(389, 437, 187, 25);
	    contentPane.add(administrador);
		
	    //-------CRIANDO OS BOTÕES
	    
	    
        
	    JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial voltar = null;
				try {
					voltar = new TelaInicial();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					mensagem.setText("não foi possível voltar. Reinicie o sistema");
				}
		        voltar.setVisible(true);
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
		help.setIcon(new ImageIcon(TelaInicial.class.getResource("ponto-de-interrogacao.png")));
		help.setBorderPainted(false);
		help.setFocusPainted(false);
		help.setBackground(new Color(240, 240, 240));
		help.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	JOptionPane.showMessageDialog(null, "Essa tela é restrita ao administrador. Ele pode fazer o Login e ter acesso" +
	        "as suas funções de trabalho.", "Help", JOptionPane.QUESTION_MESSAGE);
	      	}
	      });
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));

		help.setBounds(909, 30, 65, 32);
		contentPane.add(help);
		
		JButton entrar = new JButton("");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textField.getText();
				String senha = new String(passwordField.getPassword());
				
				try{
	                boolean logar = Funcionario.login(usuario, senha);
	                if(logar) {
	                	HubADM hubADM = new HubADM();
	 	                hubADM.setVisible(true);
	 	                dispose();
	                }
	                else {
	                	mensagem.setText("Usuário ou senha incorreta");
	                }
	             
	            }catch (ClassNotFoundException e1) {
                    mensagem.setText("Erro inesperado, tente novamente.");
                } catch (RuntimeException e1) {
                    mensagem.setText(e1.getMessage());
                    mensagem.setForeground(new Color(241, 5, 5));
                    
            	}catch(SQLException e1) {
            		mensagem.setText("Usuário ou senha incorreta");
            	}
			}
		});
		entrar.setIcon(new ImageIcon(TelaInicial.class.getResource("login.png")));
		entrar.setBorderPainted(false);
		entrar.setFocusPainted(false);
		entrar.setBackground(new Color(240, 240, 240));
		entrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		entrar.setBounds(432, 606, 80, 48);
		contentPane.add(entrar);
		
		
		
		//--------CRIANDO AS CAIXAS DE TEXTO
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String usuario = textField.getText();
				String senha = new String(passwordField.getPassword());
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					try{
						boolean login = Funcionario.login(usuario, senha);
						if(login) {
							HubADM hubADM = new HubADM();
			                hubADM.setVisible(true);
			                dispose();
						}
						else {
		                	mensagem.setText("Usuário ou senha incorreta");
		                	mensagem.setForeground(new Color(241, 5, 5));
		                }
		                
		            }catch (RuntimeException e1){
		                mensagem.setText(e1.getMessage());
		                mensagem.setForeground(new Color(241, 5, 5));
		            }catch(SQLException e1) {
		            	mensagem.setText("Usuário ou senha incorreta");
		            	mensagem.setForeground(new Color(241, 5, 5));
		            }catch(ClassNotFoundException e1) {
		            	mensagem.setText("Erro inesperado, tente novamente.");
		            	mensagem.setForeground(new Color(241, 5, 5));
		            }

					
				}
			}
		});
	    textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    textField.setBounds(399, 476, 163, 29);
	    contentPane.add(textField);
	    textField.setColumns(10);
	      
	    passwordField = new JPasswordField();
	    passwordField.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyPressed(KeyEvent e) {
	    		
	    		String usuario = textField.getText();
				String senha = new String(passwordField.getPassword());
				
	    		if( e.getKeyCode() == KeyEvent.VK_ENTER ) {
	    			
	    			try{
		                boolean login = Funcionario.login(usuario, senha);
		                if(login) {
		                	HubADM hubADM = new HubADM();
			                hubADM.setVisible(true);
			                dispose();
		                }
		                else {
		                	mensagem.setText("Usuário ou senha incorreta");
		                	mensagem.setForeground(new Color(241, 5, 5));
		                }
		               
		                
		            }catch (RuntimeException e1){
		                mensagem.setText(e1.getMessage());
		                mensagem.setForeground(new Color(241, 5, 5));
		            }catch(SQLException e1) {
		            	mensagem.setText("Usuário ou senha incorreta");
		            	mensagem.setForeground(new Color(241, 5, 5));
		            }catch(ClassNotFoundException e1) {
		            	mensagem.setText("Erro inesperado, tente novamente.");
		            	mensagem.setForeground(new Color(241, 5, 5));
		            }
	    		}
	    	}
	    });
	    passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    passwordField.setBounds(399, 527, 163, 29);
	    contentPane.add(passwordField);
	    
	    
	    //-------CRIANDO A IMAGEM IFPE	
	    ImageIcon logo_ifpe = new ImageIcon((getClass().getResource("ifpe.png")));
	    JLabel ifpe = new JLabel(logo_ifpe);
	    getContentPane().add(ifpe);
	    ifpe.setBounds(333,129,284,281);
	}
}