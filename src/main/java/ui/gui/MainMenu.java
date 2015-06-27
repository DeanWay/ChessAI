package ui.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Main Menu View
 */
public class MainMenu extends JPanel
{
    private JLabel welcomeMessage;

    protected JButton newGameButton;

    private GridBagLayout layout;

    private GridBagConstraints gbc;

    public MainMenu(){
        this.welcomeMessage = new JLabel("CHESS AI");
        this.welcomeMessage.setFont(new Font("Arial", Font.BOLD, 42));
        this.newGameButton = new JButton("New Game");

        this.layout = new GridBagLayout();
        this.setLayout(layout);
        this.gbc = new GridBagConstraints();

        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(welcomeMessage, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(newGameButton, gbc);
    }

}
