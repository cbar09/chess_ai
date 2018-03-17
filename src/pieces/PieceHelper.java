package pieces;

public class PieceHelper {

    public static boolean Is(byte piece, byte type)
    {
        if(piece == Piece.EMPTY && type == Piece.EMPTY)
        {
            return true;
        }
        if(piece == Piece.EMPTY || type == Piece.EMPTY)
        {
            return false;
        }
        return (piece & type) == type;
    }

}
