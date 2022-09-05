package main.window;

import java.awt.BorderLayout;
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
	public static JLabel maxTempLabel = new JLabel();
	public static JLabel modelLabel = new JLabel();
	public static JLabel minTempLabel = new JLabel();
	public int a = 0;
	public static JPanel p = new JPanel();
	public JPanel p1;
	JLabel p2;
	settings settings = new settings();
	public static JPanel MhzPanel;
	
	public void loadWindow(){
		System.out.println("4");
		
		p1 = new JPanel();
		MhzPanel = new JPanel();
		p2 = new JLabel();
		
		f.setSize(700,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(new BorderLayout());
		
		f.add(p1, BorderLayout.WEST);
		f.add(p, BorderLayout.CENTER);
		
		p.setLayout(null);
		p.add(tempLabel);
		p.add(MhzPanel);
		p.add(maxTempLabel);
		p.add(p2);
		p.add(minTempLabel);
		p.add(modelLabel);
		
		MhzPanel.setVisible(true);
		MhzPanel.setBackground(Color.DARK_GRAY);
		MhzPanel.setBounds(0,100,320,320);
		
		p2.setVisible(true);
		p2.setText("CPU:");
		p2.setFont(new Font(null, Font.BOLD, 20));
		p2.setBounds(10,5,60,40);
		p2.setForeground(Color.white);
		
		
		JPanel p3 = new JPanel();
		
		p1.setVisible(true);
		p1.setBackground(new Color(40,40,40));
		p1.setPreferredSize(new Dimension(70,70));
		p1.setLayout(new BorderLayout());
		p1.add(p3,BorderLayout.SOUTH);
		
		p3.setVisible(true);
		p3.setBackground(new Color(40,40,40));
		p3.setPreferredSize(new Dimension(60,60));
		p3.setLayout(null);
		p3.add(settings.sButton);

		maxTempLabel.setBounds(160,50,100,20);
		maxTempLabel.setVisible(true);
		maxTempLabel.setOpaque(true);
		maxTempLabel.setBackground(Color.DARK_GRAY);
		maxTempLabel.setFont(new Font(null,Font.PLAIN, 12));;
		maxTempLabel.setForeground(Color.white);
		maxTempLabel.setText("");
		
		minTempLabel.setBounds(270,50,100,20);
		minTempLabel.setVisible(true);
		minTempLabel.setOpaque(true);
		minTempLabel.setBackground(Color.DARK_GRAY);
		minTempLabel.setFont(new Font(null,Font.PLAIN, 12));;
		minTempLabel.setForeground(Color.white);
		minTempLabel.setText("");
		
		tempLabel.setVisible(true);
		tempLabel.setBackground(Color.darkGray);
		tempLabel.setOpaque(true);
		tempLabel.setBounds(10,50,150,20);
		tempLabel.setFont(new Font(null,Font.PLAIN, 12));
		tempLabel.setForeground(Color.white);
		
		modelLabel.setVisible(true);
		modelLabel.setFont(new Font(null, Font.PLAIN, 14));
		modelLabel.setBounds(70,7,f.getWidth(),40);
		modelLabel.setForeground(Color.white);

		p.setBackground(Color.DARK_GRAY);
//        MhzPanel.setLayout(new BoxLayout(MhzPanel, BoxLayout.Y_AXIS));        
    	p.setVisible(true);  
   
     }
}
	
