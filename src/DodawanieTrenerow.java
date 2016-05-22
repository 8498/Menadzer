import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DodawanieTrenerow 
{
	
	private JTextField pole1, pole2, pole3;
	private JLabel etyk1, etyk2, etyk3;
	private JPanel panel3; 
	private JButton czysc, dodaj;
	
	public DodawanieTrenerow()
	{
		
		JFrame frame = new JFrame("Dodawanie");
		JPanel contentPane = (JPanel) frame.getContentPane();
		frame.setSize(400,150);
		frame.setLocation(50,500);
		frame.setResizable(false);
		contentPane.setLayout(new GridLayout(6,2));
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(0));
		
		pole1 = new JTextField(10);
		pole1.setEditable(true);
		pole1.setMaximumSize(pole1.getPreferredSize());
		etyk2 = new JLabel("Imie");
		etyk2.setMaximumSize(etyk2.getPreferredSize());
		contentPane.add(pole1);
		contentPane.add(etyk2);
		
		pole2 = new JTextField(10);
		pole2.setEditable(true);
		pole2.setMaximumSize(pole2.getPreferredSize());
		etyk1 = new JLabel("Nazwisko");
		etyk1.setMaximumSize(etyk1.getPreferredSize());
		contentPane.add(pole2);
		contentPane.add(etyk1);
		
		pole3 = new JTextField(10);
		pole3.setEditable(true);
		pole3.setMaximumSize(pole3.getPreferredSize());
		etyk3 = new JLabel("Pensja");
		etyk3.setMaximumSize(etyk1.getPreferredSize());
		contentPane.add(pole3);
		contentPane.add(etyk3);
		
		
		dodaj = new JButton("Dodaj");
		czysc = new JButton("Czysc");
		contentPane.add(dodaj);
		contentPane.add(czysc);

		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
