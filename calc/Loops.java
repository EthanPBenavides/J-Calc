package calc;

import java.util.ArrayList;

public class Loops {
	public ArrayList<String> mem = new ArrayList<String>();
	//setup area
	public void Setup() {
		Gui ui = new Gui();
		ui.setVisible(true);
		//make sure memory is clear
		mem.clear();
	}

	//update, runs every tick
	public void tick() {

	}
	//provide evaluation
	public static float eval(String i) {

		return 0;
	}

	//setup tick system
	public void update() {
		long lastTime = System.nanoTime();
        @SuppressWarnings("unused")
		double amountOfTicks = 60.0;
        double ns = 1000000000;
        double delta = 0;
        while (true) {
        	long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1){
                tick();
                delta--;
            }
        }
    }
	//end class
}
