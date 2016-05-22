import javax.sound.midi.MidiDevice.Info;
import javax.swing.*;

import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
@SuppressWarnings("serial")
public class Menadzer extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6;
	private static Menadzer mn;
	
	public Menadzer()
	{
		JFrame frame = new JFrame("Menadzer");
		JPanel contentPane = (JPanel) frame.getContentPane();
		contentPane.setLayout(new GridLayout(4,1));
		JPanel inPane = new JPanel();
		inPane.setLayout(new GridLayout(1,2));
		b1 = new JButton("Zawodnicy");
		b1.setActionCommand("b1");
		b1.addActionListener(this);
		b2 = new JButton("Mecze");
		b2.setActionCommand("b2");
		b2.addActionListener(this);
		b3 = new JButton("Trenerzy");
		b3.setActionCommand("b3");
		b3.addActionListener(this);
		b4 = new JButton("Dodaj");
		b4.setActionCommand("b4");
		b4.addActionListener(this);
		b5 = new JButton("Usun");
		b5.setActionCommand("b5");
		b5.addActionListener(this);
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		inPane.add(b4);
		inPane.add(b5);
		contentPane.add(inPane);
		frame.setSize(new Dimension(700, 700));
		frame.setLocation(340,0);
			frame.addWindowListener( new WindowAdapter()
			{
			public void windowClosing(WindowEvent e) 
			{System.exit(EXIT_ON_CLOSE);}
			});
			frame.setVisible(true);		
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "b1")
		{
			Zawodnicy();
		}
		if(e.getActionCommand() == "b2")
		{
			Mecze();
		}
		if(e.getActionCommand() == "b3")
		{
			Trenerzy();
		}
		if(e.getActionCommand() == "b4")
		{
			Dodawanie();
 
		}
		if(e.getActionCommand() == "b5")
		{
			Usuwanie();
 
		}
		
		
	}
	private void Trenerzy() {
		new Trenerzytabela();	
	}
	private void Mecze() {
		new Meczetabela();
	}
	private void Zawodnicy() {
		new Zawodnicytabela();	
	}
	private void Dodawanie() {
		new Dodawanie();	
	}
	private void Usuwanie() {
		new Usuwanie();	
	}
	
	public static void main(String[] args)
	{
		mn = new Menadzer();
		
	}
	
	
     
     
	
}


		

	
	

