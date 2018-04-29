package pieces;

import board.Board;

import java.util.Vector;

public class Pawn extends Piece {

    public Pawn(byte pieceByte) {
        super(pieceByte);
    }

    @Override
    public Vector<String> GetLegalNormalMoves(int rank, int file, Board board) {
        Vector<String> result =new Vector<String>();
        int nextRank = rank+getRankDirection();
        if(nextRank > 0 && nextRank < 8
            && PieceHelper.Is(board.getPiece(nextRank,file),Piece.EMPTY)){
            result.add(PieceHelper.RankFilesToAlgebraicMove(rank,file,rank+getRankDirection(),file));
        }
        return result;
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
