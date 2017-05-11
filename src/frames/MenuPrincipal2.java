package frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class MenuPrincipal2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal2 frame = new MenuPrincipal2();
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
	public MenuPrincipal2() {
		setResizable(false);
		setTitle("TextYourPath");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 335);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemvindo = new JLabel("Bem-Vindo");
		lblBemvindo.setForeground(new Color(255, 255, 255));
		lblBemvindo.setFont(new Font("Narkisim", Font.PLAIN, 19));
		lblBemvindo.setBounds(203, 113, 99, 46);
		contentPane.add(lblBemvindo);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guerreiro Personagem = new Guerreiro();
				Personagem.setVisible(true);
				setVisible(false);
			}
		});
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 5, 7);
		contentPane.add(tabbedPane);
		btnIniciar.setFont(new Font("Narkisim", Font.BOLD, 15));
		btnIniciar.setBounds(202, 206, 89, 23);
		contentPane.add(btnIniciar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Narkisim", Font.BOLD, 15));
		btnSair.setBounds(202, 240, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JoaoBarbara\\Desktop\\Java\\Java Workspace\\TxtYourPath\\Imagens\\rsz_coollogo_com-590898.png"));
		lblNewLabel.setBounds(117, 0, 354, 69);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Studio\\.eclipse\\Programas\\TextYourPath\\Imagens\\rsz_1rsz_1rsz_1gate-512.png"));
		label.setBounds(139, 63, 286, 223);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Studio\\.eclipse\\Programas\\TextYourPath\\Imagens\\rsz_knight_knight-512.png"));
		label_1.setBounds(30, 132, 99, 154);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Studio\\.eclipse\\Programas\\TextYourPath\\Imagens\\rsz_1rsz_1viking_14-512.png"));
		label_2.setBounds(361, 101, 192, 173);
		contentPane.add(label_2);
	}
}
