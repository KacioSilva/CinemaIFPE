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

public class FilmeIndividualAdm extends JFrame {
	
	private JPanel contentPane;
	private JTextField tfAlterImg;
	private String alterarimagem;
	private String posicao;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//-------CRIANDO OS LABELS	
		JLabel nomeFilme = new JLabel("NOME DO FILME");
		nomeFilme.setFont(new Font("Arial", Font.BOLD, 16));
		nomeFilme.setBounds(59, 121, 139, 29);
		contentPane.add(nomeFilme);
		
		JLabel alterarImagem = new JLabel("ALTERAR IMAGEM:");
		alterarImagem.setFont(new Font("Arial", Font.BOLD, 15));
		alterarImagem.setBounds(592, 55, 146, 39);
	    contentPane.add(alterarImagem);
	    
	    
		
		
		//-------CRIANDO OS BOTÕES	
	    JButton voltar = new JButton("VOLTAR");
	    voltar.setFont(new Font("Arial", Font.BOLD, 12));
	    voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	    voltar.setBounds(39, 26, 85, 29);
		contentPane.add(voltar);
		
		
		
		JButton salvar = new JButton("SALVAR");
		salvar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	   	
	    	}
	    });
		salvar.setBounds(606, 588, 103, 29);
	    contentPane.add(salvar);
	    
	    
	    JButton botaoImagem = new JButton(new ImageIcon(FilmeIndividualAdm.class.getResource(alterarimagem)));
	    botaoImagem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    botaoImagem.setBounds(39, 176, 187, 251);
	    contentPane.add(botaoImagem);
		
	
	    
	    //-----CRIANDO AS IMAGENS
	    tfAlterImg = new JTextField();
	    tfAlterImg.setFont(new Font("Arial", Font.PLAIN, 12));
	    tfAlterImg.setHorizontalAlignment(SwingConstants.CENTER);
	    tfAlterImg.setText("/midia/caminho.png");
	    tfAlterImg.setBounds(592, 104, 245, 29);
	    contentPane.add(tfAlterImg);
	    tfAlterImg.setColumns(10);
	    alterarimagem = "/Midia/teste4.png";   
	}
}