package Gui;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Core.Administrador;
import Core.Lanche;
import Database.Conexao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
	private JTextField tfQuantidade;
	private String ID;
	private String nome;
	private String marca;
	private String preco;
	private String quantidade;

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
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(510, 71, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(510, 162, 67, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MARCA:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(510, 254, 67, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PREÇO:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(510, 346, 85, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantidade no Estoque:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4.setBounds(510, 439, 186, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel confirmacao = new JLabel("");
		confirmacao.setHorizontalAlignment(SwingConstants.CENTER);
		confirmacao.setBounds(510, 530, 229, 13);
		contentPane.add(confirmacao);
		
		
		
		//-------CRIANDO OS TEXTFIELDS	
		tfID = new JTextField();
		tfID.setBackground(new Color(255, 0, 0));
		tfID.setForeground(new Color(0, 0, 0));
		tfID.setFont(new Font("Tahoma", Font.BOLD, 10));
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
		tfID.setBounds(510, 94, 214, 19);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		
		
		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.CENTER);
		tfNome.setBounds(510, 185, 214, 19);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		
		tfMarca = new JTextField();
		tfMarca.setHorizontalAlignment(SwingConstants.CENTER);
		tfMarca.setBounds(510, 281, 214, 19);
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
		tfPreco.setBounds(510, 372, 214, 19);
		contentPane.add(tfPreco);
		tfPreco.setColumns(10);
		
		
		
		tfQuantidade = new JTextField();
		tfQuantidade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		tfQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		tfQuantidade.setBounds(510, 462, 214, 19);
		contentPane.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		
		
		
		
		
		//-------CRIANDO OS BOTÕES
		JButton salvar = new JButton("SALVAR");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = tfID.getText();
				nome = tfNome.getText();
				marca = tfMarca.getText();
				preco = tfPreco.getText();
				quantidade = tfQuantidade.getText();
				try{
                    Administrador.funcEditarLanche(nome, preco,marca, quantidade, ID);
                    
                    confirmacao.setText("Tudo certo!");
                    confirmacao.setForeground(new Color(36, 187, 11));

                }catch (RuntimeException e1){

                    confirmacao.setText(e1.getMessage());
                    confirmacao.setForeground(new Color(245, 13, 13, 255));

                } catch (SQLException ex) {
                    confirmacao.setText("Erro de conexao!");
                    confirmacao.setForeground(new Color(245, 13, 13, 255));
                    //throw new RuntimeException(ex);
                } catch (ClassNotFoundException e2) {
                	confirmacao.setText(e2.getMessage());
				}
			}
		});
		salvar.setBounds(510, 582, 85, 32);
		contentPane.add(salvar);
		
		JButton limpar = new JButton("LIMPAR");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfID.setText("");
				tfNome.setText("");
				tfMarca.setText("");
				tfPreco.setText("");
				tfQuantidade.setText("");
				confirmacao.setText("");
			}
		});
		limpar.setBounds(639, 582, 85, 32);
		contentPane.add(limpar);
		
		JButton voltar = new JButton("VOLTAR");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HubADM hubadm = new HubADM();
				hubadm.setVisible(true);
				dispose();				
			}
		});
		voltar.setFont(new Font("Arial", Font.BOLD, 13));
		voltar.setBounds(55, 27, 94, 25);
		contentPane.add(voltar);
		
		JButton lanche1 = new JButton("LANCHE 1");
		lanche1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					conexao.conectar();
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
					//e1.printStackTrace();
				}
				lanche.pegarLanche(1);
				
				tfID.setText("1");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfQuantidade.setText(lanche.getQuantidade());
				System.out.println(lanche.getNomeLanche());
			}
		});
		lanche1.setBounds(55, 159, 227, 21);
		contentPane.add(lanche1);
		
		JButton lanche2 = new JButton("LANCHE 2");
		lanche2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					conexao.conectar();
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
					//e1.printStackTrace();
				}
				lanche.pegarLanche(2);
				
				tfID.setText("2");
					tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfQuantidade.setText(lanche.getQuantidade());
			
			}
		});
		lanche2.setBounds(55, 251, 227, 21);
		contentPane.add(lanche2);
		
		JButton lanche3 = new JButton("LANCHE 3");
		lanche3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					conexao.conectar();
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
					//e1.printStackTrace();
				}
				lanche.pegarLanche(3);
			
				tfID.setText("3");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfQuantidade.setText(lanche.getQuantidade());
				
			}
		});
		lanche3.setBounds(55, 343, 227, 21);
		contentPane.add(lanche3);
		
		JButton lanche4 = new JButton("LANCHE 4");
		lanche4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					conexao.conectar();
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
					//e1.printStackTrace();
				}
				lanche.pegarLanche(4);
				
				tfID.setText("4");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfQuantidade.setText(lanche.getQuantidade());
				
			}
		});
		lanche4.setBounds(55, 436, 227, 21);
		contentPane.add(lanche4);
		
		JButton lanche5 = new JButton("LANCHE 5");
		lanche5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					conexao.conectar();
				} catch (Exception e1) {
					confirmacao.setText(e1.getMessage());
					//e1.printStackTrace();
				}
				lanche.pegarLanche(5);
				
			
				tfID.setText("5");
				tfNome.setText(lanche.getNomeLanche());
				tfMarca.setText(lanche.getMarca());
				tfPreco.setText(lanche.getPreco());
				tfQuantidade.setText(lanche.getQuantidade());
			}
		});
		lanche5.setBounds(55, 530, 227, 21);
		contentPane.add(lanche5);
	}
}