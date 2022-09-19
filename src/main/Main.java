package main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.swing.UnsupportedLookAndFeelException;

import main.app.MHzCheck;
import main.app.ModelCheck;
import main.app.tempCheck;
import main.window.window;


public class Main {

	static window window = new window();
	static MHzCheck MHzCheck = new MHzCheck();
	
	public static void main(String[] args) {
		
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		    if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) {   
		       try {
				javax.swing.UIManager.setLookAndFeel(info.getClassName());
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       break;
		     } 
		}
		
		Runnable run = new Runnable() {
		    public void run() {
				new tempCheck().check();
		    	new MHzCheck().checkMhz();
		    }
		};
	ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	executor.scheduleAtFixedRate(run, 0, 1, values.timeUnit);	
	window.loadWindow();
	ModelCheck.check();
	MHzCheck.createLabels();	
	}
	
}
