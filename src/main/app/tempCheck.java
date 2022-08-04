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
		try {
			a();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
     void a() throws IOException, InterruptedException{

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
    				    	window.tempLabel.setText(lineFix);
    				    }
    				}
    	        }

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    	    
    	}  
	
}
