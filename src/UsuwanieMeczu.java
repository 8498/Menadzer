import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UsuwanieMeczu 
{
	
	private JTextField pole1, pole2, pole3, pole4;
	private JLabel etyk1, etyk2, etyk3, etyk4;
	private JPanel panel1; 
	private JButton czysc, usun;
	
	public UsuwanieMeczu()
	{
		
		JFrame frame = new JFrame("Usuwanie");
		JPanel contentPane = (JPanel) frame.getContentPane();
		frame.setSize(400,150);
		frame.setLocation(900,300);
		frame.setResizable(false);
		contentPane.setLayout(new GridLayout(3,2));
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(0));
		
		pole1 = new JTextField(10);
		pole1.setEditable(true);
		pole1.setMaximumSize(pole1.getPreferredSize());
		etyk2 = new JLabel("Przeciwnik");
		etyk2.setMaximumSize(etyk2.getPreferredSize());
		contentPane.add(pole1);
		contentPane.add(etyk2);
		
		pole2 = new JTextField(10);
		pole2.setEditable(true);
		pole2.setMaximumSize(pole2.getPreferredSize());
		etyk1 = new JLabel("Wynik");
		etyk1.setMaximumSize(etyk1.getPreferredSize());
		contentPane.add(pole2);
		contentPane.add(etyk1);
		
		usun = new JButton("Usun");
		czysc = new JButton("Czysc");
		contentPane.add(usun);
		contentPane.add(czysc);

		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
