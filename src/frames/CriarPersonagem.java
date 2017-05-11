package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriarPersonagem extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static int saude = 100, resistencia = 0, forca, agilidade, magia, stamina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarPersonagem frame = new CriarPersonagem();
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
	public CriarPersonagem() {
		setResizable(false);
		setTitle("Text Your Path");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 334);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setForeground(Color.BLACK);
		label.setIcon(new ImageIcon("C:\\Users\\Studio\\.eclipse\\Programas\\TextYourPath\\Imagens\\Classes\\Guerreiro.png"));
		label.setBounds(50, 57, 94, 107);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Studio\\.eclipse\\Programas\\TextYourPath\\Imagens\\Classes\\Arqueiro.png"));
		lblNewLabel.setBounds(167, 57, 108, 95);
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Studio\\.eclipse\\Programas\\TextYourPath\\Imagens\\Classes\\Mago.png"));
		label_2.setBounds(277, 46, 108, 118);
		contentPane.add(label_2);
		
		JRadioButton radioGuerreiro = new JRadioButton("Guerreiro");
		buttonGroup.add(radioGuerreiro);
		radioGuerreiro.setFont(new Font("Narkisim", Font.PLAIN, 16));
		radioGuerreiro.setBackground(Color.GRAY);
		radioGuerreiro.setBounds(60, 171, 109, 23);
		contentPane.add(radioGuerreiro);
		
		JRadioButton radioArqueiro = new JRadioButton("Arqueiro");
		buttonGroup.add(radioArqueiro);
		radioArqueiro.setBackground(Color.GRAY);
		radioArqueiro.setFont(new Font("Narkisim", Font.PLAIN, 16));
		radioArqueiro.setBounds(166, 171, 109, 23);
		contentPane.add(radioArqueiro);
		
		JRadioButton radioMago = new JRadioButton("Mago");
		buttonGroup.add(radioMago);
		radioMago.setBackground(Color.GRAY);
		radioMago.setFont(new Font("Narkisim", Font.PLAIN, 16));
		radioMago.setBounds(287, 171, 109, 23);
		contentPane.add(radioMago);
		
		JLabel lblEscolhaASua = new JLabel("Escolha a sua classe");
		lblEscolhaASua.setFont(new Font("Narkisim", Font.PLAIN, 18));
		lblEscolhaASua.setBounds(22, 32, 169, 14);
		contentPane.add(lblEscolhaASua);
		
		JLabel lblFora = new JLabel("<html> \r\nForca: 5 <br>\r\nAgilidade: 2 <br>\r\nMagia: 1 <br>\r\n</html>");
		lblFora.setFont(new Font("Narkisim", Font.PLAIN, 15));
		lblFora.setBounds(70, 186, 99, 65);
		contentPane.add(lblFora);
		
		JLabel lblForcaAgilidade = new JLabel("<html> \r\nForca: 3 <br>\r\nAgilidade: 5 <br>\r\nMagia: 1 <br>\r\n</html>");
		lblForcaAgilidade.setFont(new Font("Narkisim", Font.PLAIN, 15));
		lblForcaAgilidade.setBounds(176, 186, 99, 65);
		contentPane.add(lblForcaAgilidade);
		
		JLabel lblForcaAgilidade_1 = new JLabel("<html> \r\nForca: 1 <br>\r\nAgilidade: 3 <br>\r\nMagia: 5 <br>\r\n</html>");
		lblForcaAgilidade_1.setFont(new Font("Narkisim", Font.PLAIN, 15));
		lblForcaAgilidade_1.setBounds(294, 186, 99, 65);
		contentPane.add(lblForcaAgilidade_1);
		
		JButton btnSeguinte = new JButton("Seguinte");
		btnSeguinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioGuerreiro.isSelected())
				{
					forca = 5;
					agilidade = 2;
					magia = 1;
					//Guerreiro Guerreiro = new Guerreiro();
					//Guerreiro.setVisible(true);
					setVisible(false);
					
				}
				else if(radioArqueiro.isSelected())
				{
					forca = 3;
					agilidade = 5;
					magia = 1;
					
				}
				else if(radioMago.isSelected())
				{
					forca = 1;
					agilidade = 3;
					magia = 5;
					
				}
			}
		});
		btnSeguinte.setFont(new Font("Narkisim", Font.PLAIN, 13));
		btnSeguinte.setBounds(102, 262, 89, 23);
		contentPane.add(btnSeguinte);
		
		JButton btnNewButton = new JButton("Informacoes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Informacoes Info = new Informacoes();
				//Info.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Narkisim", Font.PLAIN, 13));
		btnNewButton.setBounds(241, 262, 99, 23);
		contentPane.add(btnNewButton);
	}
}
