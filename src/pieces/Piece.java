package pieces;

import board.Board;

import java.util.Vector;

public abstract class Piece {

    public final byte pieceByte;

    public Piece(byte pieceByte)
    {
        this.pieceByte = pieceByte;
    }

    public boolean Is(byte type)
    {
        return PieceHelper.Is(pieceByte, type);
    }

    public Vector<String> GetLegalMoves(int rank, int file, Board board)
    {
        Vector<String> result = GetLegalNormalMoves();
        result.addAll(GetLegalSpecialMoves());
        return result;
    }

    public abstract Vector<String> GetLegalNormalMoves();

    public abstract Vector<String> GetLegalSpecialMoves();

    /*
        Using individual bytes to represent each piece on an 8x8 board (array).
        This will minimize memory footprint for each board state in AI search trees

        BYTE REPRESENTATION
        0000 0000
        WBKQ RBNP
        e.g. WHITE PAWN     = 1000 0001 in binary or 0x81 in hexadecimal
        e.g. BLACK BISHOP   = 0100 0100 in binary or 0x44 in hexadecimal
     */


    //NOTE: Probably want to move all these static variables/initializers to a separate file for readability
    public static final byte WHITE  = (byte)0x80;
    public static final byte BLACK  = (byte)0x40;
    public static final byte KING   = (byte)0x20;
    public static final byte QUEEN  = (byte)0x10;
    public static final byte ROOK   = (byte)0x08;
    public static final byte BISHOP = (byte)0x04;
    public static final byte KNIGHT = (byte)0x02;
    public static final byte PAWN   = (byte)0x01;
    public static final byte EMPTY  = (byte)0x00;
    public static final byte
            WHITE_PAWN   = WHITE | PAWN,   BLACK_PAWN   = BLACK | PAWN,
            WHITE_ROOK   = WHITE | ROOK,   BLACK_ROOK   = BLACK | ROOK,
            WHITE_BISHOP = WHITE | BISHOP, BLACK_BISHOP = BLACK | BISHOP,
            WHITE_KNIGHT = WHITE | KNIGHT, BLACK_KNIGHT = BLACK | KNIGHT,
            WHITE_QUEEN  = WHITE | QUEEN,  BLACK_QUEEN  = BLACK | QUEEN,
            WHITE_KING   = WHITE | KING,   BLACK_KING   = BLACK | KING;

    public static final byte[] BLACK_STARTING_RANK = {BLACK_ROOK, BLACK_KNIGHT, BLACK_BISHOP, BLACK_QUEEN, BLACK_KING, BLACK_BISHOP, BLACK_KNIGHT, BLACK_ROOK};
    public static final byte[] WHITE_STARTING_RANK = {WHITE_ROOK, WHITE_KNIGHT, WHITE_BISHOP, WHITE_QUEEN, WHITE_KING, WHITE_BISHOP, WHITE_KNIGHT, WHITE_ROOK};


}
