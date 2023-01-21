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
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

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
				try {
					voltar = new TelaInicial();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
	        	TelaAdm adm = new TelaAdm();
	        	adm.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto1 = new Filme().buscarCartaz(1);
	      Filme1.setBounds(10, 123, 214, 255);
	      String nomedoarquivo1 = buscarfoto1;
	      Filme1.setIcon(new ImageIcon(nomedoarquivo1));
	      Filme1.setText(buscarfoto1);
	      contentPane.add(Filme1);
		
		JLabel Filme2 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme2.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaAdm adm = new TelaAdm();
	        	adm.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto2 = new Filme().buscarCartaz(2);
		Filme2.setBounds(382, 123, 214, 255);
	    String nomedoarquivo2 = buscarfoto2;
	    Filme2.setIcon(new ImageIcon(nomedoarquivo2));
	    Filme2.setText(buscarfoto2);
	    contentPane.add(Filme2);
		
		
		
		JLabel Filme3 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme3.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaAdm adm = new TelaAdm();
	        	adm.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto3 = new Filme().buscarCartaz(3);
		Filme3.setBounds(760, 123, 214, 255);
	    String nomedoarquivo3 = buscarfoto3;
	    Filme3.setIcon(new ImageIcon(nomedoarquivo3));
	    Filme3.setText(buscarfoto3);
	    contentPane.add(Filme3);
	
		
		
		JLabel Filme6 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme6.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaAdm adm = new TelaAdm();
	        	adm.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto6 = new Filme().buscarCartaz(6);
		Filme6.setBounds(760, 415, 214, 255);
	    String nomedoarquivo6 = buscarfoto6;
	    Filme6.setIcon(new ImageIcon(nomedoarquivo6));
	    Filme6.setText(buscarfoto6);
	    contentPane.add(Filme6);
		
	
	
		
		JLabel Filme5 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme5.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaAdm adm = new TelaAdm();
	        	adm.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto5 = new Filme().buscarCartaz(5);
		Filme5.setBounds(382, 426, 214, 255);
	    String nomedoarquivo5 = buscarfoto5;
	    Filme5.setIcon(new ImageIcon(nomedoarquivo5));
	    Filme5.setText(buscarfoto5);
	    contentPane.add(Filme5);
		
		
		
		JLabel Filme4 = new JLabel("C:\\Users\\kacio\\Desktop\\ifpe.png");
		Filme4.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        	TelaAdm adm = new TelaAdm();
	        	adm.setVisible(true);
	        	dispose();
	        }
	       });
		String buscarfoto4 = new Filme().buscarCartaz(4);
		Filme4.setBounds(10, 415, 214, 255);
	    String nomedoarquivo4 = buscarfoto4;
	    Filme4.setIcon(new ImageIcon(nomedoarquivo4));
	    Filme4.setText(buscarfoto4);
	    contentPane.add(Filme4);
	}
}