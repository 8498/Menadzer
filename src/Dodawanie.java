import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Dodawanie extends JFrame implements ActionListener
{

	private JPanel panel1; 
	private JButton b1, b2,b3;
	
	public Dodawanie()
	{
		
		JFrame frame = new JFrame("Dodawanie");
		JPanel contentPane = (JPanel) frame.getContentPane();
		frame.setSize(400,150);
		frame.setLocation(450,300);
		frame.setResizable(false);
		contentPane.setLayout(new GridLayout(3,1));
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(0));
		
		b1 = new JButton("Dodaj Zawodnika");
		b1.setActionCommand("b1");
		b1.addActionListener(this);
		b2 = new JButton("Dodaj Mecz");
		b2.setActionCommand("b2");
		b2.addActionListener(this);
		b3 = new JButton("Dodaj Trenera");
		b3.setActionCommand("b3");
		b3.addActionListener(this);
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);

		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "b1")
		{
			DodawanieZawodnika();
		}
		if(e.getActionCommand() == "b2")
		{
			DodawanieMeczy();
		}
		if(e.getActionCommand() == "b3")
		{
			DodawanieTrenerow();
		}
		
		
	}
	private void DodawanieTrenerow() {
		new DodawanieTrenerow();	
	}
	private void DodawanieMeczy() {
		new DodawanieMeczy();
	}
	private void DodawanieZawodnika() {
		new DodawanieZawodnika();	
	}
	
	
		
}
	

