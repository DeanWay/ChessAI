package ui.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * View Controller for the GUI application
 */
public class Controller
{
    private JFrame window;

    private CardLayout layout;

    private MainMenu mainMenu;

    private GameScreen gameScreen;

    private final String mainMenuName = "MAIN_MENU";

    private final String gameScreenName = "GAME_SCREEN";

    private final int WIDTH = 400;

    private final int HEIGHT = 500;

    public Controller(){
        //set up window
        window = new JFrame("ChessAI");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(WIDTH, HEIGHT);
        window.setMinimumSize(new Dimension(WIDTH-100, HEIGHT-130));
        window.setLocationRelativeTo(null);

        //set up layout manager
        JPanel cards = new JPanel(new CardLayout());
        mainMenu = new MainMenu();
        cards.add(mainMenuName, mainMenu);
        gameScreen = new GameScreen();
        cards.add(gameScreenName, gameScreen);

        layout = (CardLayout)cards.getLayout();
        window.add(cards);

        this.initListeners();
        this.lookAndFeelSetUp();
    }

    public void createAndShowGUI(){
        window.setVisible(true);
    }

    private void initListeners(){
        this.mainMenu.newGameButton.addActionListener(e -> {
            System.out.println("HELLO NEW GAME");
            //this.layout.show(gameScreen, gameScreenName);
        });
    }

    private void lookAndFeelSetUp() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | IllegalAccessException
            | InstantiationException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Chess");
        System.setProperty("apple.laf.useScreenMenuBar", "true");
    }

}
