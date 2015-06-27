package model.games;

import model.board.Board;
import model.players.Human;
import model.players.Player;

/**
 * Created by Dean on 2015-06-21.
 */
public class HumanGame implements Game
{
    Player whitePlayer;
    Player blackPlayer;

    public HumanGame(){
        whitePlayer = new Human();
        blackPlayer = new Human();
    }


    @Override
    public Board getBoard()
    {
        return null;
    }

    @Override
    public Player getWhitePlayer()
    {
        return null;
    }

    @Override
    public Player getBlackPlayer()
    {
        return null;
    }
}
