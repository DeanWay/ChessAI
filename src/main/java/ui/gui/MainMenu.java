package ui.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Created by Dean on 2015-06-15.
 */
public class MainMenu extends GridPane
{
    protected Button newGameButton;
    protected Label introTitle;

    public MainMenu(){
        this.setHgap(10);
        this.setVgap(10);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(0, 10, 0, 10));
        this.initComponents();
    }

    private void initComponents()
    {
        introTitle = new Label("Chess");
        introTitle.setAlignment(Pos.CENTER);
        introTitle.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        this.add(introTitle, 0, 0);
        newGameButton = new Button();
        newGameButton.setText("New Game");
        this.add(newGameButton, 0, 1);
    }
}
