package pieces;

public class PieceFactory {
    public static Piece BuildPiece(byte pieceByte)
    {
        Piece result = null;

        if(PieceHelper.Is(pieceByte,Piece.EMPTY)) result = new Empty(pieceByte);
        else if(PieceHelper.Is(pieceByte,Piece.PAWN)) result = new Pawn(pieceByte);
        else if(PieceHelper.Is(pieceByte,Piece.KNIGHT)) result = new Knight(pieceByte);
        else if(PieceHelper.Is(pieceByte,Piece.BISHOP)) result = new Bishop(pieceByte);
        else if(PieceHelper.Is(pieceByte,Piece.ROOK)) result = new Rook(pieceByte);
        else if(PieceHelper.Is(pieceByte,Piece.QUEEN)) result = new Queen(pieceByte);
        else if(PieceHelper.Is(pieceByte,Piece.KING)) result = new King(pieceByte);

        return result;
    }
}
