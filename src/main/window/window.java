package main.window;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.values;
import main.app.tempCheck;


public class window {

	public static JFrame f = new JFrame();
	public String values;
	public static String CoreMhz;
	public static String Cores;
	public static JLabel tempLabel = new JLabel();
	public int a = 0;
	public JPanel p = new JPanel();
	public static JLabel labels[];
	
	public void loadWindow(){
		
		f.setContentPane(p);
		f.setSize(500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.add(tempLabel);
		
		
		tempLabel.setVisible(true);
		tempLabel.setBackground(Color.darkGray);
		tempLabel.setOpaque(true);
		tempLabel.setFont(new Font(null,Font.PLAIN, 12));
		tempLabel.setForeground(Color.white);

		p.setBackground(Color.DARK_GRAY);
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));        
    	p.setVisible(true);  
   
     }
}
	
