package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaLanche extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLanche frame = new TelaLanche();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaLanche() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lanches");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(389, 186, 134, 25);
		contentPane.add(lblNewLabel);
		
		JLabel cineifPaulista = new JLabel("CineIF Paulista");
		cineifPaulista.setForeground(new Color(63, 164, 13, 236));
		cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 62));
		cineifPaulista.setBounds(255, 26, 445, 132);
		contentPane.add(cineifPaulista);
		
		JButton help = new JButton("Help");
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		help.setBounds(893, 26, 66, 29);
		contentPane.add(help);
		
		JButton voltar = new JButton("Voltar");
		voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		voltar.setBounds(10, 26, 75, 35);
		contentPane.add(voltar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(37, 369, 22, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(397, 634, 159, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox_1.setBounds(47, 591, 22, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox_2.setBounds(369, 399, 22, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox_3.setBounds(780, 617, 22, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JLabel labelFotoFilme = new JLabel("SELECIONE UMA FOTO");
		labelFotoFilme.setHorizontalAlignment(SwingConstants.CENTER);
		labelFotoFilme.setBackground(new Color(128, 255, 255));
		labelFotoFilme.setBounds(21, 184, 159, 167);
		contentPane.add(labelFotoFilme);
		
		JLabel labelFotoFilme_1 = new JLabel("SELECIONE UMA FOTO");
		labelFotoFilme_1.setHorizontalAlignment(SwingConstants.CENTER);
		labelFotoFilme_1.setBackground(new Color(128, 255, 255));
		labelFotoFilme_1.setBounds(21, 417, 159, 167);
		contentPane.add(labelFotoFilme_1);
		
		JLabel labelFotoFilme_2 = new JLabel("SELECIONE UMA FOTO");
		labelFotoFilme_2.setHorizontalAlignment(SwingConstants.CENTER);
		labelFotoFilme_2.setBackground(new Color(128, 255, 255));
		labelFotoFilme_2.setBounds(369, 225, 159, 167);
		contentPane.add(labelFotoFilme_2);
		
		JLabel labelFotoFilme_3 = new JLabel("SELECIONE UMA FOTO");
		labelFotoFilme_3.setHorizontalAlignment(SwingConstants.CENTER);
		labelFotoFilme_3.setBackground(new Color(128, 255, 255));
		labelFotoFilme_3.setBounds(770, 225, 159, 167);
		contentPane.add(labelFotoFilme_3);
		
		JLabel labelFotoFilme_4 = new JLabel("SELECIONE UMA FOTO");
		labelFotoFilme_4.setHorizontalAlignment(SwingConstants.CENTER);
		labelFotoFilme_4.setBackground(new Color(128, 255, 255));
		labelFotoFilme_4.setBounds(770, 447, 159, 167);
		contentPane.add(labelFotoFilme_4);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("");
		chckbxNewCheckBox_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox_3_1.setBounds(770, 399, 22, 23);
		contentPane.add(chckbxNewCheckBox_3_1);
	}
}
