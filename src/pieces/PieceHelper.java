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

    public static boolean IsEmpty(byte piece)
    {
        return Is(piece,Piece.EMPTY);
    }

    public static char toPieceChar(byte piece){
        switch(piece){
            case Piece.WHITE_KING:      return (char)0x2654; //♔
            case Piece.WHITE_QUEEN:     return (char)0x2655; //♕
            case Piece.WHITE_ROOK:      return (char)0x2656; //♖
            case Piece.WHITE_BISHOP:    return (char)0x2657; //♗
            case Piece.WHITE_KNIGHT:    return (char)0x2658; //♘
            case Piece.WHITE_PAWN:      return (char)0x2659; //♙
            case Piece.BLACK_KING:      return (char)0x265A; //♚
            case Piece.BLACK_QUEEN:     return (char)0x265B; //♛
            case Piece.BLACK_ROOK:      return (char)0x265C; //♜
            case Piece.BLACK_BISHOP:    return (char)0x265D; //♝
            case Piece.BLACK_KNIGHT:    return (char)0x265E; //♞
            case Piece.BLACK_PAWN:      return (char)0x265F; //♟
            case Piece.EMPTY:           return '_';
        }
        return '_';
    }

    public static byte ExtractPieceColor(byte piece)
    {
        byte response = Piece.EMPTY;
        if(PieceHelper.Is(piece,Piece.BLACK))
        {
            response = Piece.BLACK;
        }
        else if(PieceHelper.Is(piece,Piece.WHITE))
        {
            response = Piece.WHITE;
        }
        return response;
    }

    public static byte ExtractPieceType(byte piece)
    {
        byte response = Piece.EMPTY;
        if(PieceHelper.Is(piece,Piece.PAWN))
        {
            response = Piece.PAWN;
        }
        else if(PieceHelper.Is(piece,Piece.KNIGHT))
        {
            response = Piece.KNIGHT;
        }
        else if(PieceHelper.Is(piece,Piece.BISHOP))
        {
            response = Piece.BISHOP;
        }
        else if(PieceHelper.Is(piece,Piece.ROOK))
        {
            response = Piece.ROOK;
        }
        else if(PieceHelper.Is(piece,Piece.QUEEN))
        {
            response = Piece.QUEEN;
        }
        else if(PieceHelper.Is(piece,Piece.KING))
        {
            response = Piece.KING;
        }
        return response;
    }

    public static String RankFileToAlgebraic(int rank, int file)
    {
        return ""+((char)(file+97))+""+(rank+1);
    }

    // TODO: needs tests
    public static String RankFilesToAlgebraicMove(int startRank, int startFile, int endRank, int endFile)
    {
        return RankFileToAlgebraic(startRank,startFile)+RankFileToAlgebraic(endRank,endFile);
    }

    // TODO: needs tests
    public static boolean AreSameColor(byte piece1, byte piece2)
    {
        return (Is(piece1,Piece.BLACK) && Is(piece2,Piece.BLACK)) ||
                (Is(piece1,Piece.WHITE) && Is(piece2,Piece.WHITE));
    }

    // TODO: needs tests
    public static boolean AreDifferentColor(byte piece1, byte piece2)
    {
        return (Is(piece1,Piece.WHITE) && Is(piece2,Piece.BLACK)) ||
                (Is(piece1,Piece.BLACK) && Is(piece2,Piece.WHITE));
    }

    // TODO: needs tests
    public static boolean IsValidDestination(byte piece, byte destination)
    {
        return IsEmpty(destination) || AreDifferentColor(piece, destination);
    }

    // TODO: needs tests
    public static boolean IsOutOfRange(int rank, int file)
    {
        return rank < 0 || rank > 7 || file < 0 || file > 7;
    }
}
