package calc;

import java.util.ArrayList;

/**
 * a system of functions used for evaluation, and program setup
 * that and it makes the code look nicer.
 * @author Ethan P Benavides
 */
public class Loops {
 /** creates area in memory to store the equation.*/
public ArrayList<String> mem = new ArrayList<String>();

 /**setup function: runs at the beginning of the program,
  * responsible for anything that needs to run at the start of the program.
  */
 public void setup() {
  Gui ui = new Gui();
  ui.setVisible(true);
  //make sure memory is clear
  mem.clear();
  mem.add("");
 }

/**update loop; runs every tick.
*responsible for anything that needs to run in a continuous loop
*/
 public void tick() {
        System.out.println("tick");
        Gui.render(); 
 }
/**
 * Provides evaluation structure.
 * @param i
 * @return answer
*/
 public static float eval(final String i) {

  return 0;
 }

 /**
  * Update() sets up the tick system.
  * its currently set to send a tick
  * 60 times every second(?)
  */
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
            while (delta >= 1) {
                tick();
                delta--;
            }
        }
    }
 //end class
}
