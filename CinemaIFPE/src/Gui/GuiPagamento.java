package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Core.Lanche;

import javax.swing.JButton;
import java.awt.event.ActionListener;
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