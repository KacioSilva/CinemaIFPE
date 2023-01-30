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
		JLabel lbljEscolhaOpcao = new JLabel("ESCOLHA A OPÇÃO QUE DESEJA ALTERAR");
		lbljEscolhaOpcao.setForeground(new Color(0, 128, 0));
		lbljEscolhaOpcao.setHorizontalAlignment(SwingConstants.CENTER);
		lbljEscolhaOpcao.setFont(new Font("Sitka Heading", Font.BOLD, 28));
		lbljEscolhaOpcao.setBounds(97, 66, 772, 120);
		contentPane.add(lbljEscolhaOpcao);
		
		
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
				
				EditFilme telafilme = new EditFilme();
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