package model.board;

import model.locations.Square;

/**
 * Created by Dean on 2015-06-07.
 */
public class Board
{
    private Square[][] board;

    public Board()
    {
        this.board = new Square[8][8];
    }
}
