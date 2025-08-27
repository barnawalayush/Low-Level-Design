package pattern.design.lowLevel.ticTacToe;

import lombok.Getter;


@Getter
public class Player {

    private String name;
    private PlayingPieces pieces;

    public Player(String name, PlayingPieces pieces){
        this.name = name;
        this.pieces = pieces;
    }
}
