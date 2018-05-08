package pieces;

import board.Board;

import java.util.Vector;

public class Rook extends Piece {
    public Rook(byte pieceByte) {
        super(pieceByte);
    }

    @Override
    public Vector<String> GetLegalNormalMoves(int rank, int file, Board board) {
        Vector<String> result = new Vector<String>();

        result.addAll(GetLegalMovesInPath(rank,file,board,1,0));
        result.addAll(GetLegalMovesInPath(rank,file,board,-1,0));
        result.addAll(GetLegalMovesInPath(rank,file,board,0,1));
        result.addAll(GetLegalMovesInPath(rank,file,board,0,-1));

        return result;
    }

    @Override
    public Vector<String> GetLegalSpecialMoves(int rank, int file, Board board) {
        return new Vector<String>();
    }
}
