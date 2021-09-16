package calc;

import java.util.ArrayList;
import java.util.Iterator;

import calc.Remain;


public class Defloops {
	
ArrayList<String> mem = new ArrayList<String>();
 /**
  * Update() sets up the tick system.
  * its currently set to send a tick
  * 60 times every second(?)
  */
	public static void update() 
		{
		long lastTime = System.nanoTime();
        @SuppressWarnings("unused")
        double amountOfTicks = 60.0;
        double ns = 1000000000;
        double delta = 0;
        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) 
            	{
                tick();
                delta--;
            	}
        	}
    	}
	//dynamic code updates go here
	public static void tick() {
		
	}
	
	public static String parse(String in) {
		
		String out = "";
		return out;
	}
	
	public static double add(double a, double  b) {
		double x = a+b;
		return x;
	}
	
	public static double subtract(double a, double  b) {
		double x = a - b;
		return x;
	}

	public static double multiply(double a, double  b) {
		double x = a*b;
		return x;
	}

	public static double devide(double a, double  b) {
		double x = a/b;
		return x;
	}

	public static double eval(String in) {
		
		return 0;
	}
}

