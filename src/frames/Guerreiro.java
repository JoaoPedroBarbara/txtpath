package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guerreiro extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	public static String nome;
	public static int saude = 100, resistencia = 0, forca, agilidade, magia, stamina;
	
	
	
	/**e
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guerreiro frame = new Guerreiro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Guerreiro() {
		forca = 5;
		agilidade = 2;
		magia = 1;
		setBackground(Color.GRAY);
		setResizable(false);
		setTitle("Text Your Path");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGuerreiro = new JLabel("Guerreiro");
		lblGuerreiro.setFont(new Font("Narkisim", Font.PLAIN, 18));
		lblGuerreiro.setBounds(24, 33, 169, 14);
		contentPane.add(lblGuerreiro);
		
		JLabel lblIntroduzaONome = new JLabel("Introduza o seu nome:");
		lblIntroduzaONome.setFont(new Font("Narkisim", Font.PLAIN, 18));
		lblIntroduzaONome.setBounds(71, 91, 169, 14);
		contentPane.add(lblIntroduzaONome);
		
		tfNome = new JTextField();
		tfNome.setBounds(50, 125, 208, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JoaoBarbara\\Desktop\\Java\\Java Workspace\\TxtYourPath\\Mobs Principais\\Character Principal\\Arena1.png"));
		lblNewLabel.setBounds(304, 67, 100, 120);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Comece a Aventura!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nome = tfNome.getText();
				GuerreiroParte1 G1 = new GuerreiroParte1();
				G1.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Narkisim", Font.PLAIN, 14));
		btnNewButton.setBounds(144, 222, 152, 23);
		contentPane.add(btnNewButton);
	}
}
