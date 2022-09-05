package main.app;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.Line;

import main.window.window;

public class tempCheck {

    public String line = ""; 

	public void check(){
		System.out.println("1");
    		executeCommand("sensors");
}
     
     @SuppressWarnings("resource")
	public void executeCommand(String command) {

    	    Process p;
    	    try {
    	        p = Runtime.getRuntime().exec(command);
    	        p.waitFor();
    	        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
          
    	        while ((line = reader.readLine())!= null) {
    	            Scanner in = null;
    	            in = new Scanner(line);
    				while(in.hasNext())
    				{
    				    line=in.nextLine();
    				    if(line.contains("Tctl")) {
    				    	String lineFix = line.replace(" ", "").replace("Tctl:", "CPU Temp: ");
    				    	if(window.maxTempLabel.getText()=="") {
    				    		window.maxTempLabel.setText(lineFix);
    				    	}
    				    	if(window.maxTempLabel.getText()!="") { 				    	
    				    	if(Integer.parseInt(lineFix.replaceAll("[\\D]", "")) >= Integer.parseInt(window.maxTempLabel.getText().replaceAll("[\\D]", ""))) {
    				    		window.maxTempLabel.setText(lineFix);
				    			window.maxTempLabel.setText(lineFix.replace("CPU Temp", "max"));
    				    		if(Integer.parseInt(lineFix.replaceAll("[\\D]", ""))>=650) {
    				    			window.tempLabel.setForeground(Color.red);
    				    			window.maxTempLabel.setForeground(Color.red);
    				    		} else {
    				    			if(Integer.parseInt(lineFix.replaceAll("[\\D]", ""))>=650) {
    				    			window.tempLabel.setForeground(Color.white);
    				    			}
    				    		}
    				    	} else {
    				    		if(window.minTempLabel.getText()=="") {
    				    			window.minTempLabel.setText(lineFix);
    				    		}
    				    		if(Integer.parseInt(lineFix.replaceAll("[\\D]", "")) <= Integer.parseInt(window.maxTempLabel.getText().replaceAll("[\\D]", ""))) {
    				    			window.minTempLabel.setText(lineFix.replace("CPU Temp", "min"));
    				    		}
    				    	}
    				    }
    				    	window.tempLabel.setText(lineFix);
    				    }
    				}
    	        }

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    	    
    	}  
	
}
