import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UsuwanieZawodnika 
{
	
	private JTextField pole1, pole2, pole3, pole4;
	private JLabel etyk1, etyk2, etyk3, etyk4;
	private JPanel panel2; 
	private JButton czysc, usun;
	
	public UsuwanieZawodnika()
	{
		
		JFrame frame = new JFrame("Usuwanie");
		JPanel contentPane = (JPanel) frame.getContentPane();
		frame.setSize(400,150);
		frame.setLocation(900,100);
		frame.setResizable(false);
		contentPane.setLayout(new GridLayout(6,2));
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(0));
		
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
		etyk3 = new JLabel("Pozycja");
		etyk3.setMaximumSize(etyk1.getPreferredSize());
		contentPane.add(pole3);
		contentPane.add(etyk3);
		
		pole4 = new JTextField(10);
		pole4.setEditable(true);
		pole4.setMaximumSize(pole4.getPreferredSize());
		etyk4 = new JLabel("Pensja");
		etyk4.setMaximumSize(etyk1.getPreferredSize());
		contentPane.add(pole4);
		contentPane.add(etyk4);
		
		usun = new JButton("Usun");
		czysc = new JButton("Czysc");
		contentPane.add(usun);
		contentPane.add(czysc);

		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
