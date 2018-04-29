package pieces;

import board.Board;

import java.util.Vector;

public class Pawn extends Piece {

    public Pawn(byte pieceByte) {
        super(pieceByte);
    }

    @Override
    public Vector<String> GetLegalNormalMoves(int rank, int file, Board board) {
        return GetLegalMovesFromRelativePosition(rank,file,board, new int[][]{
                {getRankDirection(),0}
        });
    }

    @Override
    public Vector<String> GetLegalSpecialMoves(int rank, int file, Board board) {
        return new Vector<String>();
    }

    public int getRankDirection(){
        if(Is(Piece.WHITE))
        {
            return 1;
        }
        else if(Is(Piece.BLACK))
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
