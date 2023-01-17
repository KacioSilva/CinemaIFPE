package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.event.ActionListener;
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
		emExibicao.setBounds(50, 104, 114, 23);
		contentPane.add(emExibicao);
		
		JLabel emBreve = new JLabel("Em Breve:");
		emBreve.setFont(new Font("Tahoma", Font.BOLD, 17));
		emBreve.setBounds(50, 393, 114, 23);
		contentPane.add(emBreve);
		
		
		//-------CRIANDO OS BOTÕES
		JButton filme1 = new JButton((Icon) null);
		filme1.setText("Filme 1");
		filme1.setBounds(50, 130, 137, 208);
		contentPane.add(filme1);
		
		
		JButton filme2 = new JButton((Icon) null);
		filme2.setText("Filme 2");
		filme2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		filme2.setBounds(405, 130, 137, 208);
		contentPane.add(filme2);
		
		
		JButton filme3 = new JButton((Icon) null);
		filme3.setText("Filme 3");
		filme3.setBounds(775, 130, 137, 208);
		contentPane.add(filme3);
		
		
		JButton filme4 = new JButton((Icon) null);
		filme4.setText("Filme 4");
		filme4.setBounds(50, 422, 137, 208);
		contentPane.add(filme4);
		
		JButton filme5 = new JButton((Icon) null);
		filme5.setText("Filme 5");
		filme5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		filme5.setBounds(405, 422, 137, 208);
		contentPane.add(filme5);
		
		
		JButton filme6 = new JButton((Icon) null);
		filme6.setText("Filme 6");
		filme6.setBounds(775, 422, 137, 208);
		contentPane.add(filme6);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial voltar = new TelaInicial();
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
	}
}

//
