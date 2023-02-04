package Gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class HubADM extends JFrame {

	//-------CRIANDO A TELA
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HubADM frame = new HubADM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public HubADM() {
		
		setTitle("Hub de alterações do administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(HubADM.class.getResource("/Midia/ifpe.png")));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//-------CRIANDO LABELS
		JLabel lblNewLabel = new JLabel("ESCOLHA A OPÇÃO QUE DESEJA ALTERAR:");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 40));
		lblNewLabel.setBounds(127, 54, 789, 139);
		contentPane.add(lblNewLabel);
		
		
		//------CRIANDO BOTÕES
		JButton lanches = new JButton();
		lanches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditLanche editarlanche = new EditLanche();
				editarlanche.setVisible(true);
				dispose();
				
			}
		});
		lanches.setIcon(new ImageIcon(TelaInicial.class.getResource("/Midia/Lanche.png")));
		lanches.setBorderPainted(false);
		lanches.setFocusPainted(false);
		lanches.setBackground(new Color(240, 240, 240));
		lanches.setBounds(84, 287, 296, 264);
		contentPane.add(lanches);
		
		JButton filmes = new JButton("");
		filmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditFilme telafilme = new EditFilme();
				telafilme.setVisible(true);
				dispose();
			}
		});
		filmes.setIcon(new ImageIcon(TelaInicial.class.getResource("/Midia/claquete.png")));
		filmes.setBorderPainted(false);
		filmes.setFocusPainted(false);
		filmes.setBackground(new Color(240, 240, 240));
		filmes.setBounds(599, 287, 296, 264);
		contentPane.add(filmes);
		
		JButton sair = new JButton();
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaAdm telaadm = new TelaAdm();
				telaadm.setVisible(true);
				dispose();
			}
		});
		sair.setIcon(new ImageIcon(TelaInicial.class.getResource("/Midia/sair.png")));
		sair.setBorderPainted(false);
		sair.setFocusPainted(false);
		sair.setBackground(new Color(240, 240, 240));
		sair.setBounds(37, 27, 45, 52);
		contentPane.add(sair);
		
		JLabel lblLanche = new JLabel("Lanches");
		lblLanche.setHorizontalAlignment(SwingConstants.CENTER);
		lblLanche.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLanche.setBounds(182, 562, 108, 25);
		contentPane.add(lblLanche);
		
		JLabel lblFilmes = new JLabel("Filmes");
		lblFilmes.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilmes.setBounds(698, 562, 108, 25);
		contentPane.add(lblFilmes);
	}
}