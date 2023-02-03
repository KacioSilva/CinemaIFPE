package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Core.ControlePoltrona;
import Core.Lanche;
import Database.UpdatePoltronas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GuiPagamento extends JFrame {

    private JPanel contentPane;


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

        JButton pagar = new JButton("PAGAR");
        pagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdatePoltronas upPoltrona = new UpdatePoltronas();
            	try {
            		
            		if(SelecaoPoltronas.getA1Set() == "1") {
            			upPoltrona.editarPoltronas("A1", TelaInicial.getIdFilme(), SelecaoPoltronas.getA1Set());
            		}
            		if(SelecaoPoltronas.getA2Set() == "1") {
            			upPoltrona.editarPoltronas("A2", TelaInicial.getIdFilme(), SelecaoPoltronas.getA2Set());
            		}
            		if(SelecaoPoltronas.getA3Set() == "1") {
            			upPoltrona.editarPoltronas("A3", TelaInicial.getIdFilme(), SelecaoPoltronas.getA3Set());
            		}
            		if(SelecaoPoltronas.getA4Set() == "1") {
            			upPoltrona.editarPoltronas("A4", TelaInicial.getIdFilme(), SelecaoPoltronas.getA4Set());
            		}
            		if(SelecaoPoltronas.getA5Set() == "1") {
            			upPoltrona.editarPoltronas("A5", TelaInicial.getIdFilme(), SelecaoPoltronas.getA5Set());
            		}
            		
            		if(SelecaoPoltronas.getB1Set() == "1") {
            			upPoltrona.editarPoltronas("B1", TelaInicial.getIdFilme(), SelecaoPoltronas.getB1Set());
            		}
            		if(SelecaoPoltronas.getB2Set() == "1") {
            			upPoltrona.editarPoltronas("B2", TelaInicial.getIdFilme(), SelecaoPoltronas.getB2Set());
            		}
            		if(SelecaoPoltronas.getB3Set() == "1") {
            			upPoltrona.editarPoltronas("B3", TelaInicial.getIdFilme(), SelecaoPoltronas.getB3Set());
            		}
            		if(SelecaoPoltronas.getB4Set() == "1") {
            			upPoltrona.editarPoltronas("B4", TelaInicial.getIdFilme(), SelecaoPoltronas.getB4Set());
            		}
            		if(SelecaoPoltronas.getB5Set() == "1") {
            			upPoltrona.editarPoltronas("B5", TelaInicial.getIdFilme(), SelecaoPoltronas.getB5Set());
            		}
            		
            		if(SelecaoPoltronas.getC1Set() == "1") {
            			upPoltrona.editarPoltronas("C1", TelaInicial.getIdFilme(), SelecaoPoltronas.getC1Set());
            		}
            		if(SelecaoPoltronas.getC2Set() == "1") {
            			upPoltrona.editarPoltronas("C2", TelaInicial.getIdFilme(), SelecaoPoltronas.getC2Set());
            		}
            		if(SelecaoPoltronas.getC3Set() == "1") {
            			upPoltrona.editarPoltronas("C3", TelaInicial.getIdFilme(), SelecaoPoltronas.getC3Set());
            		}
            		if(SelecaoPoltronas.getC4Set() == "1") {
            			upPoltrona.editarPoltronas("C4", TelaInicial.getIdFilme(), SelecaoPoltronas.getC4Set());
            		}
            		if(SelecaoPoltronas.getC5Set() == "1") {
            			upPoltrona.editarPoltronas("C5", TelaInicial.getIdFilme(), SelecaoPoltronas.getC5Set());
            		}
            		
            		if(SelecaoPoltronas.getD1Set() == "1") {
            			upPoltrona.editarPoltronas("D1", TelaInicial.getIdFilme(), SelecaoPoltronas.getD1Set());
            		}
            		if(SelecaoPoltronas.getD2Set() == "1") {
            			upPoltrona.editarPoltronas("D2", TelaInicial.getIdFilme(), SelecaoPoltronas.getD2Set());
            		}
            		if(SelecaoPoltronas.getD3Set() == "1") {
            			upPoltrona.editarPoltronas("D3", TelaInicial.getIdFilme(), SelecaoPoltronas.getD3Set());
            		}
            		if(SelecaoPoltronas.getD4Set() == "1") {
            			upPoltrona.editarPoltronas("D4", TelaInicial.getIdFilme(), SelecaoPoltronas.getD4Set());
            		}
            		if(SelecaoPoltronas.getD5Set() == "1") {
            			upPoltrona.editarPoltronas("D5", TelaInicial.getIdFilme(), SelecaoPoltronas.getD5Set());
            		}
            		
        
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

            }
        });
        pagar.setBounds(423, 294, 129, 57);
        contentPane.add(pagar);

        JButton voltar = new JButton("Voltar");
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                TelaLanche lanche = new TelaLanche();
                lanche.setVisible(true);
                dispose();
            }
        });
        voltar.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
        voltar.setBounds(10, 25, 75, 35);
        contentPane.add(voltar);
    }
}