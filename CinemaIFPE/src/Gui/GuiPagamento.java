package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Core.ControlePoltrona;
import Core.Lanche;
import Database.UpdatePoltronas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class GuiPagamento extends JFrame {

    private JPanel contentPane;
    private JButton btnDebito;
    private JButton btnCredito;
    private JButton btnPix;
    private JButton pagar;
    private JTextField txtEmail;
    
    private JLabel lblEmail;
    private JTextField textField;
    private JLabel lblCpf;
  


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GuiPagamento frame = new GuiPagamento();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GuiPagamento() {

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setSize(1000,720);
        setLocationRelativeTo(null);

        setContentPane(contentPane);
        contentPane.setLayout(null);

        pagar = new JButton("PAGAR");
        pagar.setVisible(false);
        pagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdatePoltronas upPoltrona = new UpdatePoltronas();
            	try {
            		
             			if(SelecaoPoltronas.getA1Set() == "1") {
                			upPoltrona.editarPoltronas("A1", TelaInicial.getIdFilme(), SelecaoPoltronas.getA1Set());
                		}
             			SelecaoPoltronas.setA1Set("0");
                		if(SelecaoPoltronas.getA2Set() == "1") {
                			upPoltrona.editarPoltronas("A2", TelaInicial.getIdFilme(), SelecaoPoltronas.getA2Set());
                		}
                		SelecaoPoltronas.setA2Set("0");
                		if(SelecaoPoltronas.getA3Set() == "1") {
                			upPoltrona.editarPoltronas("A3", TelaInicial.getIdFilme(), SelecaoPoltronas.getA3Set());
                		}
                		SelecaoPoltronas.setA3Set("0");
                		if(SelecaoPoltronas.getA4Set() == "1") {
                			upPoltrona.editarPoltronas("A4", TelaInicial.getIdFilme(), SelecaoPoltronas.getA4Set());
                		}
                		SelecaoPoltronas.setA4Set("0");
                		if(SelecaoPoltronas.getA5Set() == "1") {
                			upPoltrona.editarPoltronas("A5", TelaInicial.getIdFilme(), SelecaoPoltronas.getA5Set());
                		}
                		SelecaoPoltronas.setA5Set("0");
                		if(SelecaoPoltronas.getB1Set() == "1") {
                			upPoltrona.editarPoltronas("B1", TelaInicial.getIdFilme(), SelecaoPoltronas.getB1Set());
                		}
                		SelecaoPoltronas.setB1Set("0");
                		if(SelecaoPoltronas.getB2Set() == "1") {
                			upPoltrona.editarPoltronas("B2", TelaInicial.getIdFilme(), SelecaoPoltronas.getB2Set());
                		}
                		SelecaoPoltronas.setB2Set("0");
                		if(SelecaoPoltronas.getB3Set() == "1") {
                			upPoltrona.editarPoltronas("B3", TelaInicial.getIdFilme(), SelecaoPoltronas.getB3Set());
                		}
                		SelecaoPoltronas.setB3Set("0");
                		if(SelecaoPoltronas.getB4Set() == "1") {
                			upPoltrona.editarPoltronas("B4", TelaInicial.getIdFilme(), SelecaoPoltronas.getB4Set());
                		}
                		SelecaoPoltronas.setB4Set("0");
                		if(SelecaoPoltronas.getB5Set() == "1") {
                			upPoltrona.editarPoltronas("B5", TelaInicial.getIdFilme(), SelecaoPoltronas.getB5Set());
                		}
                		SelecaoPoltronas.setB5Set("0");
                		if(SelecaoPoltronas.getC1Set() == "1") {
                			upPoltrona.editarPoltronas("C1", TelaInicial.getIdFilme(), SelecaoPoltronas.getC1Set());
                		}
                		SelecaoPoltronas.setC1Set("0");
                		if(SelecaoPoltronas.getC2Set() == "1") {
                			upPoltrona.editarPoltronas("C2", TelaInicial.getIdFilme(), SelecaoPoltronas.getC2Set());
                		}
                		SelecaoPoltronas.setC2Set("0");
                		if(SelecaoPoltronas.getC3Set() == "1") {
                			upPoltrona.editarPoltronas("C3", TelaInicial.getIdFilme(), SelecaoPoltronas.getC3Set());
                		}
                		SelecaoPoltronas.setC3Set("0");
                		if(SelecaoPoltronas.getC4Set() == "1") {
                			upPoltrona.editarPoltronas("C4", TelaInicial.getIdFilme(), SelecaoPoltronas.getC4Set());
                		}
                		SelecaoPoltronas.setC4Set("0");
                		if(SelecaoPoltronas.getC5Set() == "1") {
                			upPoltrona.editarPoltronas("C5", TelaInicial.getIdFilme(), SelecaoPoltronas.getC5Set());
                		}
                		SelecaoPoltronas.setC5Set("0");
                		if(SelecaoPoltronas.getD1Set() == "1") {
                			upPoltrona.editarPoltronas("D1", TelaInicial.getIdFilme(), SelecaoPoltronas.getD1Set());
                		}
                		SelecaoPoltronas.setD1Set("0");
                		if(SelecaoPoltronas.getD2Set() == "1") {
                			upPoltrona.editarPoltronas("D2", TelaInicial.getIdFilme(), SelecaoPoltronas.getD2Set());
                		}
                		SelecaoPoltronas.setD2Set("0");
                		if(SelecaoPoltronas.getD3Set() == "1") {
                			upPoltrona.editarPoltronas("D3", TelaInicial.getIdFilme(), SelecaoPoltronas.getD3Set());
                		}
                		SelecaoPoltronas.setD3Set("0");
                		if(SelecaoPoltronas.getD4Set() == "1") {
                			upPoltrona.editarPoltronas("D4", TelaInicial.getIdFilme(), SelecaoPoltronas.getD4Set());
                		}
                		SelecaoPoltronas.setD4Set("0");
                		if(SelecaoPoltronas.getD5Set() == "1") {
                			upPoltrona.editarPoltronas("D5", TelaInicial.getIdFilme(), SelecaoPoltronas.getD5Set());
                		}
                		SelecaoPoltronas.setD5Set("0");
            		
				} catch (ClassNotFoundException e1) {
					
					e1.printStackTrace();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}

            }
        });
        pagar.setBounds(413, 613, 89, 35);
        contentPane.add(pagar);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                TelaLanche lanche = new TelaLanche();
                lanche.setVisible(true);
                dispose();
            }
        });
        btnVoltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
        btnVoltar.setBounds(10, 25, 75, 35);
        contentPane.add(btnVoltar);
        
        JLabel cineifPaulista = new JLabel("CineIF Paulista");
        cineifPaulista.setForeground(new Color(63, 164, 13, 236));
        cineifPaulista.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 62));
        cineifPaulista.setBounds(264, 11, 445, 132);
        contentPane.add(cineifPaulista);
        
        JLabel lblNewLabel = new JLabel("PAGAMENTO");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
        lblNewLabel.setBounds(382, 154, 166, 35);
        contentPane.add(lblNewLabel);
        
        JLabel lblSelecione = new JLabel("SELECIONE A FORMA");
        lblSelecione.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblSelecione.setBounds(21, 236, 172, 44);
        contentPane.add(lblSelecione);
        
        btnDebito = new JButton("Débito");
        btnDebito.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnDebito.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnDebito.setBounds(49, 402, 89, 23);
        contentPane.add(btnDebito);
        
        btnCredito = new JButton("Crédito");
        btnCredito.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCredito.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnCredito.setBounds(49, 458, 89, 23);
        contentPane.add(btnCredito);
        
        btnPix = new JButton("Pix");
        btnPix.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnPix.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnPix.setBounds(49, 555, 89, 23);
        contentPane.add(btnPix);
        
        JLabel lblNewLabel_2 = new JLabel("Cartão:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setBounds(63, 366, 87, 25);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_2_1 = new JLabel("Outra Forma:");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_1.setBounds(45, 518, 112, 25);
        contentPane.add(lblNewLabel_2_1);
        
        JButton btnHelp = new JButton("Help");
        btnHelp.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
        btnHelp.setBounds(870, 29, 75, 35);
        contentPane.add(btnHelp);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_1.setBounds(749, 308, 212, 189);
        contentPane.add(panel_1);
        
        JLabel lblTotal = new JLabel("TOTAL GERAL:          R$0");
        lblTotal.setBounds(10, 153, 199, 25);
        panel_1.add(lblTotal);
        lblTotal.setFont(new Font("Arial", Font.BOLD, 12));
        
        JLabel lblLanche = new JLabel("TOTAL LANCHES:     R$ 0");
        lblLanche.setBounds(10, 84, 199, 25);
        panel_1.add(lblLanche);
        lblLanche.setFont(new Font("Arial", Font.BOLD, 12));
        
        JLabel lblIngresso = new JLabel();
        lblIngresso.setBounds(10, 11, 308, 25);
        panel_1.add(lblIngresso);
        lblIngresso.setText("TOTAL INGRESSO:    R$0");
        lblIngresso.setFont(new Font("Arial", Font.BOLD, 12));
        
        JLabel lblNewLabel_3 = new JLabel("Custos");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_3.setBounds(820, 257, 112, 33);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblDe = new JLabel("DE");
        lblDe.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblDe.setBounds(80, 269, 36, 44);
        contentPane.add(lblDe);
        
        JLabel lblPagamento = new JLabel("PAGAMENTO");
        lblPagamento.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblPagamento.setBounds(45, 305, 112, 44);
        contentPane.add(lblPagamento);
        
        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtEmail.setBounds(392, 305, 156, 20);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);
        
        lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblEmail.setBounds(348, 306, 43, 18);
        contentPane.add(lblEmail);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setColumns(10);
        textField.setBounds(392, 352, 156, 20);
        contentPane.add(textField);
        
        lblCpf = new JLabel("CPF:");
        lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblCpf.setBounds(348, 353, 30, 18);
        contentPane.add(lblCpf);
        
//        ImageIcon logo_ifpe = new ImageIcon((getClass().getResource("/midia/ifpe.png")));
//        JLabel ifpe = new JLabel(logo_ifpe);
//        getContentPane().add(ifpe);
//        ifpe.setBounds(327,236,284,281);
    }
}