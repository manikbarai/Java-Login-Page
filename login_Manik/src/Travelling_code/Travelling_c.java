package Travelling_code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Travelling_c extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling_c frame = new Travelling_c();
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
	public Travelling_c() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSuccessfully = new JLabel("Successfully");
		lblSuccessfully.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblSuccessfully.setBounds(210, 11, 168, 25);
		contentPane.add(lblSuccessfully);
		
		JLabel lblWelcome_to = new JLabel("Welcome_to");
		lblWelcome_to.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 33));
		lblWelcome_to.setBounds(169, 39, 230, 48);
		contentPane.add(lblWelcome_to);
		
		JLabel lblCSE = new JLabel("CSE");
		lblCSE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 99));
		lblCSE.setBounds(159, 96, 276, 153);
		contentPane.add(lblCSE);
		
		JLabel lblManik_Barai = new JLabel("Manik_Barai");
		lblManik_Barai.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblManik_Barai.setBounds(446, 325, 128, 25);
		contentPane.add(lblManik_Barai);
		
		JLabel lblCreated_by = new JLabel("Created_by");
		lblCreated_by.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblCreated_by.setBounds(426, 300, 94, 14);
		contentPane.add(lblCreated_by);
	}
}
