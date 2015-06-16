package ui.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import model.locations.LocationTranslator;

/**
 * Created by Dean on 2015-06-16.
 */
public class GameScene extends GridPane
{
    public GameScene(){
        this.setAlignment(Pos.CENTER);
        this.setGridLinesVisible(true);
        this.setScaleX(4);
        this.setScaleY(4);
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                this.add(new Label(LocationTranslator.translate(i, j)), i, j);
            }
        }

    }
}
