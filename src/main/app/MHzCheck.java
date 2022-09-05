package main.app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

import main.window.window;


public class MHzCheck {
	
	int MHz;
	public String values;
	public static String CoreMhz;
	public static String Cores;
	public static JLabel[] labels;
	String searchWord = "cpu MHz";
	String coreClock;
	int i = 0;
	int p = 0;

public void createLabels() {    
	System.out.println("3");
	
	labels = new JLabel[12];  
	
for (p = 0; p < 12; p++) {    
	
	labels[p] = new JLabel();   
	labels[p].setForeground(Color.white);
	labels[p].setFont(new Font(null,Font.PLAIN, 12));
	labels[p].setBackground(Color.DARK_GRAY);
	labels[p].setOpaque(true);
	labels[p].setVisible(true);
	labels[p].setBorder(new EtchedBorder());
	labels[p].setPreferredSize(new Dimension(150,30));
	window.MhzPanel.add(labels[p]);

    }    
}
public void checkMhz(){
	System.out.println(2);

try (BufferedReader in = new BufferedReader(new FileReader("/proc/cpuinfo"));) {
	
    while ((values = in.readLine()) != null) {

      String firstColumn =  values.split(",")[0];
      
      if (firstColumn.contains(searchWord)) {
    	  i++;
    	  coreClock = "[" +  i + "]" + values;
  	      labels[i-1].setText(coreClock);
      }
    }
} catch (IOException e) {
	e.printStackTrace();
}

}

}
