import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Usuwanie extends JFrame implements ActionListener
{

	private JPanel panel1; 
	private JButton b1, b2,b3;
	
	public Usuwanie()
	{
		
		JFrame frame = new JFrame("Usuwanie");
		JPanel contentPane = (JPanel) frame.getContentPane();
		frame.setSize(400,150);
		frame.setLocation(450,300);
		frame.setResizable(false);
		contentPane.setLayout(new GridLayout(3,1));
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(0));
		
		b1 = new JButton("Usun Zawodnika");
		b1.setActionCommand("b1");
		b1.addActionListener(this);
		b2 = new JButton("Usun Mecz");
		b2.setActionCommand("b2");
		b2.addActionListener(this);
		b3 = new JButton("Usun Trenera");
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
			UsuwanieZawodnika();
		}
		if(e.getActionCommand() == "b2")
		{
			UsuwanieMeczy();
		}
		if(e.getActionCommand() == "b3")
		{
			UsuwanieTrenerow();
		}
		
		
	}
	private void UsuwanieTrenerow() {
		new UsuwanieTrenerow();	
	}
	private void UsuwanieMeczy() {
		new UsuwanieMeczu();
	}
	private void UsuwanieZawodnika() {
		new UsuwanieZawodnika();	
	}
	
	
		
}
	