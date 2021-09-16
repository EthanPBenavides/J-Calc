package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Gui extends JFrame {

private static final long serialVersionUID = -1484385940874378393L;

private JPanel contentPane;
private static ArrayList<String> in = new ArrayList<String>();
public static JTextArea input = new JTextArea();
/**
 * Gui constructor: defines the Gui features and action listeners.
 */
public Gui() {
        //title, bounds, and on close
        setTitle("JCalc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        //create sub-objects
            //menu-bar
            JMenuBar menuBar = new JMenuBar();
            setJMenuBar(menuBar);
            //menu-bar file button
            JMenu mnExitMenu = new JMenu("File");
            menuBar.add(mnExitMenu);
            //Menu Exit Button
            JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
            mntmNewMenuItem.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		System.exit(0);
            	}
            });
            mnExitMenu.add(mntmNewMenuItem);
            //main j-panel
            contentPane = new JPanel();
        //set bounds, type, and layout
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         setContentPane(contentPane);
         contentPane.setLayout(new MigLayout(
                     "", "[90px][90px][90px,grow][90px][90px]",
                     "[28px][28px,grow][28px][28px][28px][28px][28px][]"
                     ));
        //buttons and other sub-objects
         //button 7
          JButton btnNb_7 = new JButton("7");
          btnNb_7.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
                 in.add("7");
                 }
          });
          contentPane.add(btnNb_7, "cell 1 4,grow");
         //text box
          contentPane.add(input, "cell 0 1 5 1,growx,aligny center");
         //clear button
          JButton btnClear = new JButton("Clear");
          btnClear.addActionListener(new ActionListener() {
         //clear button action listener
          public void actionPerformed(final ActionEvent e) {
          input.setText(null);
          in.clear();
             }
          });
          contentPane.add(btnClear, "flowy,cell 4 3,grow");
         //button 8
          JButton btnNb_8 = new JButton("8");
         //button 8 action listener
          btnNb_8.addActionListener(new ActionListener() {
          public void actionPerformed(final ActionEvent e) {
                 in.add("8");
             }
          });
          contentPane.add(btnNb_8, "cell 2 4,grow");
         //button 9
           JButton btnNb_9 = new JButton("9");
         //button 9 action listener
           btnNb_9.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
                  in.add("9");
             }
          });
           contentPane.add(btnNb_9, "cell 3 4,growx");
         //button x
           JButton btnMulti = new JButton("x");
         //button x action listener
           btnMulti.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
             }
          });
           contentPane.add(btnMulti, "cell 4 4,growx");
         //button 4
           JButton btnNb_4 = new JButton("4");
         //button 4 action listener
           btnNb_4.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
             }
          });
           contentPane.add(btnNb_4, "cell 1 5,grow");
           //button 5
           JButton btnNb_5 = new JButton("5");
         //button 5 action listener
           btnNb_5.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
             }
          });
           contentPane.add(btnNb_5, "cell 2 5,grow");
         //button 6
           JButton btnNb_6 = new JButton("6");
         //button 6 action listener
           btnNb_6.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
                  in.add("6");
             }
          });
           contentPane.add(btnNb_6, "cell 3 5,grow");
         //button "/"
           JButton btnDevide = new JButton("\u00F7");
         //button "/" action listener
           btnDevide.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
                  in.add("/");
             }
          });
           contentPane.add(btnDevide, "cell 4 5,grow");
         //button 1
           JButton btnNb_1 = new JButton("1");
         //button 1 action listener
           btnNb_1.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
                  in.add("1");
             }
          });
           contentPane.add(btnNb_1, "cell 1 6,grow");
         //button 2
           JButton btnNb_2 = new JButton("2");
         //button 2 action listener
           btnNb_2.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
                  in.add("2");
             }
          });
           contentPane.add(btnNb_2, "cell 2 6,growx");
         //button 3
           JButton btnNb_3 = new JButton("3");
         //button 3 action listener
           btnNb_3.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
                  in.add("3");
             }
          });
           contentPane.add(btnNb_3, "cell 3 6,grow");
         //button "+"
           JButton btnAdd = new JButton("+");
         //button "+" action listener
           btnAdd.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
        	      in.add("+");
             }
          });
           contentPane.add(btnAdd, "cell 4 6,growx");
         //button 0
           JButton btnNb_0 = new JButton("0");
         //button 0 action listener
           btnNb_0.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
        	   in.add("0");
             }
          });
           contentPane.add(btnNb_0, "cell 2 7,growx");
         //button "="
           JButton btnEql = new JButton("=");
         //button "=" action listener
           btnEql.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
           for (int i = 0; i <= in.size(); i++) {
           
              }
             }
          });
           contentPane.add(btnEql, "cell 3 7,grow");
         //button "-"
           JButton btnNewButton = new JButton("-");
         //button "-" action listener
           btnNewButton.addActionListener(new ActionListener() {
           public void actionPerformed(final ActionEvent e) {
        	   in.add("-");
             }
          });
           contentPane.add(btnNewButton, "cell 4 7,grow");
         //clear text box
           input.setText("");
           in.add(0, "");
  }
}
