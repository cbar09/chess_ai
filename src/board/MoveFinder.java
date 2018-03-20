package board;

import pieces.PieceFactory;

import java.util.Vector;

public class MoveFinder {
    public static String[] FindMoves(Board board)
    {
        Vector<String> moves = new Vector<String>();
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<8; j++)
            {
                moves.addAll(PieceFactory.BuildPiece(board.getPiece(i,j)).GetLegalMoves(i,j,board));
            }
        }
        return moves.toArray(new String[0]);
    }
}
