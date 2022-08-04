package main;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import main.app.MHzCheck;
import main.app.tempCheck;
import main.window.window;


public class Main {

	static window window = new window();
	static MHzCheck MHzCheck = new MHzCheck();
	
	public static void main(String[] args) {
		Runnable run = new Runnable() {
		    public void run() {
		    	new MHzCheck().checkMhz();
				new tempCheck().check();
		    }
		};
	ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	executor.scheduleAtFixedRate(run, 100, 100, TimeUnit.MILLISECONDS);	
	window.loadWindow();
	MHzCheck.createLabels();
	}
	
}
