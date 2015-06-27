package ui.gui;

import static javax.swing.SwingUtilities.invokeLater;

/**
 *  Entry point for the GUI application
 */
public class Main
{

    public static void main(String[] args){
        Controller controller = new Controller();
        invokeLater(new Runnable()
        {
            @Override public void run()
            {
                controller.createAndShowGUI();
            }
        });

    }
}
