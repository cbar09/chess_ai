package pieces;

import board.Board;

import java.util.Vector;

public class Knight extends Piece {
    public Knight(byte pieceByte) {
        super(pieceByte);
    }

    @Override
    public Vector<String> GetLegalNormalMoves(int rank, int file, Board board) {
        return GetLegalMovesFromRelativePosition(rank,file,board, new int[][]{
                {1,2},
                {-1,2},
                {1,-2},
                {-1,-2},
                {2,1},
                {-2,1},
                {2,-1},
                {-2,-1}
        });
    }

    @Override
    public Vector<String> GetLegalSpecialMoves(int rank, int file, Board board) {
        return new Vector<String>();
    }
}
