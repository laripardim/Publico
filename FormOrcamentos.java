package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;

public class FormOrcamentos extends JFrame {

	private JPanel Painel;
	private JLabel nome;
	private JButton salvar;
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormOrcamentos frame = new FormOrcamentos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormOrcamentos() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Painel = new JPanel();
		Painel.setBackground(new Color(255, 222, 173));
		Painel.setForeground(Color.BLACK);
		setSize(800,800);
		setContentPane(Painel);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		nome = new JLabel("Larissa Ferreira Pardim");
		nome.setBounds(669, 10, 107, 30);
		Painel.add(nome);
		
		salvar = new JButton("Salvar");
		salvar.setBounds(576, 637, 200, 30);
		salvar.setFocusable(false);
		Painel.add(salvar);
		
		
		textField = new JTextField();
		textField.setBounds(25, 37, 252, 24);
		Painel.add(textField);
		textField.setColumns(10);
	}
}
