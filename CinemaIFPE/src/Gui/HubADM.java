package Gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//-------CRIANDO LABELS
		JLabel lblNewLabel = new JLabel("ESCOLHA A OPÇÃO QUE DESEJA ALTERAR");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 28));
		lblNewLabel.setBounds(97, 66, 772, 120);
		contentPane.add(lblNewLabel);
		
		
		//------CRIANDO BOTÕES
		JButton lanches = new JButton("LANCHES");
		lanches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditLanche editarlanche = new EditLanche();
				editarlanche.setVisible(true);
				dispose();
				
			}
		});
		lanches.setBounds(169, 300, 187, 251);
		contentPane.add(lanches);
		
		JButton filmes = new JButton("FILMES");
		filmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FilmeIndividualAdm telafilme = new FilmeIndividualAdm();
				telafilme.setVisible(true);
				dispose();
			}
		});
		filmes.setBounds(634, 300, 187, 251);
		contentPane.add(filmes);
		
		JButton sair = new JButton("Log out");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaAdm telaadm = new TelaAdm();
				telaadm.setVisible(true);
				dispose();
				
			}
		});
		sair.setHorizontalAlignment(SwingConstants.LEFT);
		sair.setBounds(32, 27, 85, 29);
		contentPane.add(sair);
	}
}