package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Core.Filme;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Database.Conexao;


public class TelaInicial extends JFrame {
	
	

	//-------CRIANDO A TELA
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public TelaInicial() throws Exception {
		
		
		
		
		
		
		setTitle("CineIF Paulista");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInicial.class.getResource("/Midia/ifpe.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 720);
		setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//-------CRIANDO OS LABELS
		JLabel cineifPaulista = new JLabel("CineIF Paulista");
		cineifPaulista.setForeground(new Color(63, 164, 13, 236));
		cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 62));
		cineifPaulista.setBounds(304, 11, 445, 132);
		contentPane.add(cineifPaulista);
		
		JLabel emDestaque = new JLabel("Em Destaque:");
		emDestaque.setFont(new Font("Tahoma", Font.BOLD, 22));
		emDestaque.setBounds(416, 196, 171, 43);
	    contentPane.add(emDestaque);
	      
	      
	    //-------CRIANDO OS BOTÕES
	    
//	    Filme filme = new Filme();
//	    
//	    
//	    ImageIcon teste = filme.trocarImagem(1);
	    
//		JButton filme1 = new JButton(new ImageIcon(getClass().getResource("/midia/teste4.png")));
//		filme1.setBounds(58, 292, 187, 251);
//		contentPane.add(filme1);
//		filme1.setVisible(false);
//		
//		JButton filme2 = new JButton(new ImageIcon(getClass().getResource("/midia/interstellarpng.png")));
//		filme2.setBounds(400, 292, 187, 251);
//		contentPane.add(filme2);
//		
//		JButton filme3 = new JButton(new ImageIcon(getClass().getResource("/midia/powerrangerspng.png")));
//		filme3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		filme3.setBounds(754, 292, 187, 251);
//		contentPane.add(filme3);
		
		JButton help = new JButton("Help");
		help.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		 JOptionPane.showMessageDialog(null, "Nessa tela, o cliente pode optar por acessar algum filme " +
	                     "diretamente (os destaques) ou então ele pode acessar uma aba com todos os filmes.\n O administrador pode acessar a " +
	                     "sua tela para ter acesso as suas funcionalidades.", "Help", JOptionPane.QUESTION_MESSAGE);
	      
	      	}
	      });
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		help.setBounds(897, 25, 66, 29);
		contentPane.add(help);
		
		JButton administrador = new JButton("Administrador");
		administrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdm telalogin = new TelaAdm();
		        telalogin.setVisible(true);
		        dispose();
			}
		});

		administrador.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		administrador.setBounds(827, 624, 136, 23);
		contentPane.add(administrador);
		
		JButton verTodosFilmes = new JButton("Ver Todos os Filmes");
		verTodosFilmes.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		TelaDeFilmes telalogin = new TelaDeFilmes();
		        telalogin.setVisible(true);
		        dispose();
	      	}
	      });
		verTodosFilmes.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		verTodosFilmes.setBounds(737, 203, 171, 29);
	      contentPane.add(verTodosFilmes);
	      
	      
	  //-------CRIANDO A IMAGEM IFPE	
      ImageIcon logo_ifpe = new ImageIcon((getClass().getResource("/midia/ifpe.png")));
      JLabel ifpe = new JLabel(logo_ifpe);
      getContentPane().add(ifpe);
      ifpe.setBounds(0,0,284,281);
      
      JLabel labelFoto1 = new JLabel("New label");
      labelFoto1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		TelaAdm adm = new TelaAdm();
      		adm.setVisible(true);
      		dispose();
      		
      	}
      });
      
      String buscarfoto = new Filme().buscarCartaz();
      
      
      labelFoto1.setBounds(70, 331, 214, 255);
      labelFoto1.setText(buscarfoto);
      contentPane.add(labelFoto1);
      
      JLabel labelFoto2 = new JLabel("New label");
      labelFoto2.setBounds(373, 331, 214, 255);
      contentPane.add(labelFoto2);
      
      JLabel labelFoto3 = new JLabel("New label");
      labelFoto3.setBounds(694, 331, 214, 255);
      contentPane.add(labelFoto3);
      
      }
}
//