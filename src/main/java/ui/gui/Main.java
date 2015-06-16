package ui.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Dean on 2015-06-15.
 */
public class Main extends Application
{
    private Scene mainMenu;
    private Scene game;

    private static final double WIDTH = 600;
    private static final double HEIGHT = 650;

    public static void main(String[] args){
        launch(args);
    }

    @Override public void start(Stage primaryStage) throws Exception
    {
        this.initScenes();
        this.initListeners(primaryStage);
        primaryStage.setTitle("Hello World!");
        primaryStage.setResizable(false);
        primaryStage.setScene(mainMenu);
        primaryStage.show();
    }

    private void initListeners(Stage primaryStage)
    {
        MainMenu menu = (MainMenu) this.mainMenu.getRoot();
        menu.newGameButton.setOnMouseClicked(ae -> {
            primaryStage.setScene(this.game);
        });
    }

    private void initScenes()
    {
        this.mainMenu = new Scene(new MainMenu(), WIDTH, HEIGHT);
        this.game = new Scene(new GameScene(), WIDTH, HEIGHT);
    }
}
