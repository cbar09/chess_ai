package pieces;

public class PieceFactory {
    public static Piece BuildPiece(byte pieceByte)
    {
        Piece result = null;

        if(PieceHelper.Is(pieceByte,Piece.PAWN)) result = new Pawn(pieceByte);

        return result;
    }
}
