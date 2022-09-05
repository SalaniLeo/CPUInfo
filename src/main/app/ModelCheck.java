package main.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import main.window.window;

public class ModelCheck {

	public static String values;
	static String searchWord = "model name";
	static String model;
	
	public static void check(){
	
	try (BufferedReader in = new BufferedReader(new FileReader("/proc/cpuinfo"));) {
		
	    while ((values = in.readLine()) != null) {

	      String firstColumn =  values.split(",")[0];
	      
	      if (firstColumn.contains(searchWord)) {
	    	  model = firstColumn.replace("model name	: ", "");
	    	  window.modelLabel.setText(model);
	    	  
	      }
	    }
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
