package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import arena.Arena1;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuerreiroParte1 extends JFrame {

	private JPanel contentPane;
	private static int cliques = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuerreiroParte1 frame = new GuerreiroParte1();
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
	public GuerreiroParte1() {
		setBackground(Color.WHITE);
		setResizable(false);
		setTitle("Text Your Path");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel conversa = new JPanel();
		conversa.setBackground(Color.WHITE);
		conversa.setBounds(105, 76, 209, 58);
		contentPane.add(conversa);
		conversa.setLayout(null);
		
		JLabel lblConversa = new JLabel("");
		lblConversa.setBackground(Color.BLACK);
		lblConversa.setForeground(Color.BLACK);
		lblConversa.setFont(new Font("Narkisim", Font.PLAIN, 15));
		lblConversa.setVerticalAlignment(SwingConstants.TOP);
		lblConversa.setBounds(10, 7, 189, 45);
		lblConversa.setVisible(false);
		conversa.add(lblConversa);
		
		Panel panel = new Panel();
		panel.setBounds(27, 11, 163, 19);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel labelNome = new JLabel("");
		labelNome.setBounds(65, 2, 60, 14);
		panel.add(labelNome);
		labelNome.setFont(new Font("Narkisim", Font.PLAIN, 18));
		labelNome.setText(frames.Guerreiro.nome);
		
		JLabel lblParte = new JLabel("Parte 1 -");
		lblParte.setBackground(Color.BLACK);
		lblParte.setForeground(Color.BLACK);
		lblParte.setBounds(0, 0, 57, 19);
		panel.add(lblParte);
		lblParte.setFont(new Font("Narkisim", Font.PLAIN, 18));
		
		JPanel stats = new JPanel();
		stats.setBackground(Color.GRAY);
		stats.setBounds(372, 40, 64, 123);
		contentPane.add(stats);
		stats.setVisible(true);
		
		
		JLabel lblFor = new JLabel("For:");
		stats.add(lblFor);
		lblFor.setForeground(Color.BLACK);
		lblFor.setBackground(Color.BLACK);
		lblFor.setFont(new Font("Narkisim", Font.BOLD, 15));
		
		JLabel lblForca = new JLabel("");
		stats.add(lblForca);
		lblForca.setForeground(Color.BLACK);
		lblForca.setBackground(Color.BLACK);
		lblForca.setFont(new Font("Dialog", Font.BOLD, 12));
		lblForca.setText(Integer.toString(frames.Guerreiro.forca));
		
		JLabel lblAgi = new JLabel("Agi:");
		stats.add(lblAgi);
		lblAgi.setForeground(Color.BLACK);
		lblAgi.setBackground(Color.BLACK);
		lblAgi.setFont(new Font("Narkisim", Font.BOLD, 15));
		
		JLabel lblAgili = new JLabel("0");
		stats.add(lblAgili);
		lblAgili.setForeground(Color.BLACK);
		lblAgili.setBackground(Color.BLACK);
		lblAgili.setFont(new Font("Narkisim", Font.PLAIN, 14));
		lblAgili.setText(Integer.toString(frames.Guerreiro.agilidade));
		
		JLabel lblMag = new JLabel("Mag:");
		stats.add(lblMag);
		lblMag.setForeground(Color.BLACK);
		lblMag.setBackground(Color.BLACK);
		lblMag.setFont(new Font("Narkisim", Font.BOLD, 15));
		
		JLabel lblMagia = new JLabel("0");
		stats.add(lblMagia);
		lblMagia.setForeground(Color.BLACK);
		lblMagia.setBackground(Color.BLACK);
		lblMagia.setFont(new Font("Narkisim", Font.PLAIN, 14));
		lblMagia.setText(Integer.toString(frames.Guerreiro.magia));
		
		JLabel lblR = new JLabel("Res:");
		stats.add(lblR);
		lblR.setForeground(Color.BLACK);
		lblR.setBackground(Color.BLACK);
		lblR.setFont(new Font("Narkisim", Font.BOLD, 15));
		
		JLabel lblRes = new JLabel("0");
		stats.add(lblRes);
		lblRes.setForeground(Color.BLACK);
		lblRes.setBackground(Color.BLACK);
		lblRes.setFont(new Font("Narkisim", Font.PLAIN, 14));
		lblRes.setText(Integer.toString(frames.Guerreiro.resistencia));
		
		JLabel lblVi = new JLabel("Saude:");
		stats.add(lblVi);
		lblVi.setForeground(Color.BLACK);
		lblVi.setBackground(Color.BLACK);
		lblVi.setFont(new Font("Narkisim", Font.BOLD, 15));
		
		JLabel lblVida = new JLabel("0");
		stats.add(lblVida);
		lblVida.setForeground(Color.BLACK);
		lblVida.setBackground(Color.BLACK);
		lblVida.setFont(new Font("Narkisim", Font.PLAIN, 14));
		lblVida.setText(Integer.toString(frames.Guerreiro.saude));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(362, 33, 53, 136);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(362, 33, 82, 31);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(362, 167, 82, 66);
		contentPane.add(separator_2);
		
		
		JButton btSeguinte = new JButton("Seguinte");
		btSeguinte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cliques++;
				switch(cliques)
				{
				case 1:
				{
					lblConversa.setVisible(true);
					lblConversa.setText("???: Finalmente acordas-te!!");
					
					break;
					
				}
				case 2:
				{
					lblConversa.setText("Eu: Onde estou?");
					
					break;
				}
				case 3:
				{
					lblConversa.setText("???: Hmph...");
					break;
				}
				case 4:
				{
					lblConversa.setText("<html> ???: Bem-vindo a arena. <br> O lugar onde a insanidade governa. </html>");
					break;
				}
				case 5:
				{
					
					
					lblConversa.setText("<html>Eu: Mas como vim aqui parar? <br> Nao me lembro de nada! </html>");
					break;
				}
				case 6:
				{
					lblConversa.setText("<html> ???: Nao te posso responder a isso pra ja... <br> E melhor preparares-te...");
					break;
				}
				case 7:
				{
					
					lblConversa.setText("<html> ...pois a nova batalha esta para comecar <br> E tu es o proximo!  </html>");
					break;
				}
				case 8:
				{
					lblConversa.setText("<html> Eu: Mas... existe alguma maneira de sair daqui?");
					break;
				}
				case 9:
				{
					lblConversa.setText("<html>???: Sim existe. Ganha esta batalha, depois falamos. Agora vai! </html>");
					btSeguinte.setText("Arena!");
					
					break;
					
				}
				case 10:
				{
					//Arena1 arena = new Arena1();
					//arena.setVisible(true);
					//setVisible(false);
					
				}
				
					
				
				}
			}
		});
		
		btSeguinte.setFont(new Font("Narkisim", Font.PLAIN, 15));
		btSeguinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btSeguinte.setBounds(347, 258, 89, 23);
		contentPane.add(btSeguinte);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JoaoBarbara\\Desktop\\Java\\Java Workspace\\TxtYourPath\\Mobs Principais\\AjudanteArena1.png"));
		lblNewLabel_1.setBounds(243, 167, 113, 114);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JoaoBarbara\\Desktop\\Java\\Java Workspace\\TxtYourPath\\Mobs Principais\\Character Principal\\Arena1.png"));
		lblNewLabel_2.setBounds(78, 183, 85, 98);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JoaoBarbara\\Desktop\\Java\\Java Workspace\\TxtYourPath\\Backgrounds\\cela.jpg"));
		lblNewLabel.setBounds(0, 0, 444, 292);
		contentPane.add(lblNewLabel);
	}
}
