package pattern.design.lowLevel.ticTacToe;

public class Board {
    private int size;
    private PlayingPieces[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPieces[size][size];
    }

    public void placePiece(int x, int y, PlayingPieces pieces){
        if(x < 0 || x >= size || y < 0 || y >= size){
            throw new IllegalArgumentException("Invalid position");
        }
        if(board[x][y] != null){
            throw new IllegalArgumentException("Position already occupied");
        }
        board[x][y] = pieces;
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null){
                    System.out.print("- ");
                } else {
                    System.out.print(board[i][j].pieces + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean checkWinner(PlayingPieces pieces) {
        int count = 0;

        for(int j=0; j<size; j++){
            count = 0;
            for(int i=0; i<size; i++){
                if(board[i][j] != pieces)break;
                else count++;
            }
            if(count == size) return true;
        }

        for(int j=0; j<size; j++){
            count = 0;
            for(int i=0; i<size; i++){
                if(board[j][i] != pieces)break;
                else count++;
            }
            if(count == size) return true;
        }

        count = 0;
        for(int i=0; i<size; i++){
            if(board[i][i] != pieces)break;
            else count++;
        }
        if(count == size) return true;

        count = 0;
        for(int i=0; i<size; i++){
            if(board[i][size-i-1] != pieces)break;
            else count++;
        }
        if(count == size) return true;

        return false;
    }
}
