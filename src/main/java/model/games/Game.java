package model.games;

import model.board.Board;
import model.players.Player;

/**
 * Created by Dean on 2015-06-21.
 */
public interface Game
{
    public Board getBoard();

    public Player getWhitePlayer();

    public Player getBlackPlayer();
}
