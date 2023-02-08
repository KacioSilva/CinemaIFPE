package Gui;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Core.Administrador;
import Core.FormatTft;
import Core.Lanche;
import Database.Conexao;
import Database.CreateInserts;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.awt.Toolkit;

public class EditLanche extends JFrame {
	Conexao conexao = new Conexao();
	Lanche lanche = new Lanche();
	
	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfNome;
	private JTextField tfMarca;
	private JTextField tfPreco;
	private String ID;
	private String nome;
	private String marca;
	private String preco;
	private String caminhoFoto;
	private File file;
	private JTextField tfcaminhofoto;
	private String nomeArquivo;
	

	//-------CRIANDO TELA
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditLanche frame = new EditLanche();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EditLanche() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EditLanche.class.getResource("/Midia/ifpe.png")));
		
		setResizable(false);
		setTitle("Editar Lanches - ADM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//-------CRIANDO OS LABELS
		
		JLabel labelFotoFilme = new JLabel("SELECIONE UMA FOTO");
	    labelFotoFilme.setHorizontalAlignment(SwingConstants.CENTER);
	    labelFotoFilme.setBackground(new Color(128, 255, 255));
	    labelFotoFilme.setBounds(356, 153, 217, 246);
	    contentPane.add(labelFotoFilme);
	    
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(702, 27, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(702, 118, 67, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Marca:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(702, 210, 67, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Preço:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(702, 302, 85, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel confirmacao = new JLabel("");
		confirmacao.setHorizontalAlignment(SwingConstants.CENTER);
		confirmacao.setBounds(702, 480, 229, 13);
		contentPane.add(confirmacao);
		
		
		
		//-------CRIANDO OS TEXTFIELDS	
		 tfcaminhofoto = new JTextField();
		 tfcaminhofoto.setEditable(false);
		 tfcaminhofoto.setHorizontalAlignment(SwingConstants.CENTER);
		 tfcaminhofoto.setBounds(702, 422, 214, 19);
		 contentPane.add(tfcaminhofoto);
		 tfcaminhofoto.setColumns(10);
		 
		    
		tfID = new JTextField();
		tfID.setBackground(new Color(0, 0, 0));
		tfID.setForeground(new Color(0, 0, 0));
		tfID.setFont(new Font("Arial", Font.BOLD, 14));
		tfID.setEnabled(false);
		tfID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
				
			}
		});
		tfID.setHorizontalAlignment(SwingConstants.CENTER);
		tfID.setBounds(702, 50, 214, 19);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		
		
		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.CENTER);
		tfNome.setBounds(702, 141, 214, 19);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
	
		tfMarca = new JTextField();
		tfMarca.setHorizontalAlignment(SwingConstants.CENTER);
		tfMarca.setBounds(702, 237, 214, 19);
		contentPane.add(tfMarca);
		tfMarca.setColumns(10);
		
		
		
		tfPreco = new JTextField();
		
		tfPreco.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
		  			char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
					}
					
				
		  		
			}
		});
		tfPreco.setHorizontalAlignment(SwingConstants.CENTER);
		tfPreco.setBounds(702, 328, 214, 19);
		contentPane.add(tfPreco);
		tfPreco.setColumns(10);
		
		
		
		
		
		
		//-------CRIANDO OS BOTÕES
		
		JButton adicionarImagem = new JButton("add imagem");
		adicionarImagem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 
		   JFileChooser arquivo = new JFileChooser();
		   FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas Imagens","png","jpg","jpeg");
           arquivo.setAcceptAllFileFilterUsed(false);
           arquivo.addChoosableFileFilter(filtro);
		   arquivo.setDialogTitle("Selecione uma imagem"); 
		   arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY); 
		   int op = arquivo.showOpenDialog(getComponent(0)); 
		    		
		   if(op == JFileChooser.APPROVE_OPTION) { 
			   labelFotoFilme.setText("");
			   labelFotoFilme.setIcon(null);
		  	
			   file = new File("");
			   file = arquivo.getSelectedFile(); 
			   nomeArquivo = file.getAbsolutePath(); 
			   tfcaminhofoto.setText(nomeArquivo);
			   ImageIcon fotoFilme = new ImageIcon(file.getPath()); 
			   labelFotoFilme.setIcon(new ImageIcon(fotoFilme.getImage().getScaledInstance(labelFotoFilme.getWidth(), 
					   labelFotoFilme.getHeight(), Image.SCALE_DEFAULT)));
		    			
		    	String nomedoarquivo = tfcaminhofoto.getText();
		  	    labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));	
		    }
		   }
		 });
		 adicionarImagem.setBounds(398, 463, 144, 38);
		    contentPane.add(adicionarImagem);
		JButton salvar = new JButton("SALVAR");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = tfID.getText();
				nome = tfNome.getText();
				marca = tfMarca.getText();
				preco = tfPreco.getText();
				caminhoFoto = tfcaminhofoto.getText();
				try{
                    Administrador.funcEditarLanche(nome, preco, marca,  ID, caminhoFoto);
                    
                    confirmacao.setText("Tudo certo!");
                    confirmacao.setForeground(new Color(36, 187, 11));

                } catch(NumberFormatException e2) {
			  		confirmacao.setText("Caractere(s) Inválido(s)");
			  		confirmacao.setForeground(new Color(255,0,0));
						
				}
				catch (RuntimeException e1){
                    confirmacao.setText(e1.getMessage());
                    confirmacao.setForeground(new Color(245, 13, 13, 255));
                } catch (SQLException ex) {
                    confirmacao.setText("Erro de conexao!");
                    confirmacao.setForeground(new Color(255,0,0));
                } catch (ClassNotFoundException e2) {
                	confirmacao.setText("Erro de conexão!");
                	confirmacao.setForeground(new Color(255,0,0));
				}
			}
		});
		salvar.setBounds(702, 524, 85, 32);
		contentPane.add(salvar);
		
		JButton limpar = new JButton("LIMPAR");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelFotoFilme.setIcon(null);
				tfNome.setText("");
				tfMarca.setText("");
				tfPreco.setText("");
				tfcaminhofoto.setText("");
				confirmacao.setText("");
			}
		});
		limpar.setBounds(846, 524, 85, 32);
		contentPane.add(limpar);
		
		JButton voltar = new JButton("VOLTAR");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HubADM hubadm = new HubADM();
				hubadm.setVisible(true);
				dispose();				
			}
		});
		voltar.setBackground(new Color(240, 240, 240));
        voltar.setIcon(new ImageIcon(TelaTodosFilmes.class.getResource("/Midia/retornar.png")));
        voltar.setBorderPainted(false);
        voltar.setFocusPainted(false);
        voltar.setBounds(10, 22, 66, 40);
        voltar.setText("");
        contentPane.add(voltar);
        
		JButton lanche1 = new JButton("LANCHE 1");
		lanche1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					confirmacao.setText("");
					conexao.conectar();
					lanche.pegarLanche(1);
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
				}
				
				tfID.setText("1");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfcaminhofoto.setText(lanche.getCaminhoFoto());

	  	    	String nomedoarquivo = tfcaminhofoto.getText();
	  	    	labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	labelFotoFilme.setText("");
			}
		});
		lanche1.setBounds(55, 159, 227, 21);
		contentPane.add(lanche1);
		
		JButton lanche2 = new JButton("LANCHE 2");
		lanche2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					confirmacao.setText("");
					conexao.conectar();
					lanche.pegarLanche(2);
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
				}
				
				
				tfID.setText("2");
					tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfcaminhofoto.setText(lanche.getCaminhoFoto());
				

	  	    	String nomedoarquivo = tfcaminhofoto.getText();
	  	    	labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	labelFotoFilme.setText("");
			
			}
		});
		lanche2.setBounds(55, 251, 227, 21);
		contentPane.add(lanche2);
		
		JButton lanche3 = new JButton("LANCHE 3");
		lanche3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					confirmacao.setText("");
					conexao.conectar();
					lanche.pegarLanche(3);
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
				}
				
			
				tfID.setText("3");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfcaminhofoto.setText(lanche.getCaminhoFoto());
				

	  	    	String nomedoarquivo = tfcaminhofoto.getText();
	  	    	labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	labelFotoFilme.setText("");
				
			}
		});
		lanche3.setBounds(55, 343, 227, 21);
		contentPane.add(lanche3);
		
		JButton lanche4 = new JButton("LANCHE 4");
		lanche4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					confirmacao.setText("");
					conexao.conectar();
					lanche.pegarLanche(4);
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
				}
				
				
				tfID.setText("4");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfcaminhofoto.setText(lanche.getCaminhoFoto());
				

	  	    	String nomedoarquivo = tfcaminhofoto.getText();
	  	    	labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	labelFotoFilme.setText("");
				
			}
		});
		lanche4.setBounds(55, 436, 227, 21);
		contentPane.add(lanche4);
		
		JButton lanche5 = new JButton("LANCHE 5");
		lanche5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					confirmacao.setText("");
					conexao.conectar();
					lanche.pegarLanche(5);
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
				}
				
			
				tfID.setText("5");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfcaminhofoto.setText(lanche.getCaminhoFoto());
				

	  	    	String nomedoarquivo = tfcaminhofoto.getText();
	  	    	labelFotoFilme.setIcon(new ImageIcon(nomedoarquivo));
	  	    	labelFotoFilme.setText("");
			}
		});
		lanche5.setBounds(55, 530, 227, 21);
		contentPane.add(lanche5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Caminho da Foto:");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(702, 387, 186, 13);
		contentPane.add(lblNewLabel_4_1);
	}
}