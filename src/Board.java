import java.util.Arrays;
import java.util.Scanner;

public class Board {
    private byte[][] board;

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
    private static final byte WHITE  = (byte)0x80;
    private static final byte BLACK  = (byte)0x40;
    private static final byte KING   = (byte)0x20;
    private static final byte QUEEN  = (byte)0x10;
    private static final byte ROOK   = (byte)0x08;
    private static final byte BISHOP = (byte)0x04;
    private static final byte KNIGHT = (byte)0x02;
    private static final byte PAWN   = (byte)0x01;
    private static final byte EMPTY  = (byte)0x00;
    private static final byte
        WHITE_PAWN   = WHITE | PAWN,   BLACK_PAWN   = BLACK | PAWN,
        WHITE_ROOK   = WHITE | ROOK,   BLACK_ROOK   = BLACK | ROOK,
        WHITE_BISHOP = WHITE | BISHOP, BLACK_BISHOP = BLACK | BISHOP,
        WHITE_KNIGHT = WHITE | KNIGHT, BLACK_KNIGHT = BLACK | KNIGHT,
        WHITE_QUEEN  = WHITE | QUEEN,  BLACK_QUEEN  = BLACK | QUEEN,
        WHITE_KING   = WHITE | KING,   BLACK_KING   = BLACK | KING;

    private static final byte[] BLACK_STARTING_RANK = {BLACK_ROOK, BLACK_KNIGHT, BLACK_BISHOP, BLACK_QUEEN, BLACK_KING, BLACK_BISHOP, BLACK_KNIGHT, BLACK_ROOK};
    private static final byte[] WHITE_STARTING_RANK = {WHITE_ROOK, WHITE_KNIGHT, WHITE_BISHOP, WHITE_QUEEN, WHITE_KING, WHITE_BISHOP, WHITE_KNIGHT, WHITE_ROOK};

    //Inner Class for simplicity and denoting moves in algebraic notation (i.e. a2 - a4) - NB: Also move to separate file
    private static class Square {
        int rank, file;
        public static final String FILES = "abcdefgh";

        public Square(int rank, int file){
            this.rank = rank;
            this.file = file;
        }
        public Square(String square){
            this(Character.getNumericValue(square.charAt(1)) - 1, FILES.indexOf(square.charAt(0)));
            if(square.length() != 2 || this.rank < 0 || this.rank > 7 || this.file == -1) {
                throw new IllegalArgumentException("Illegal Square: " + square + ", must be exactly 2 characters a1-h8");
            }
        }
        public String toString(){
            return Character.toString(FILES.charAt(file)) + (rank+1);
        }
    }

    /*
        ----- BOARD CLASS STARTS HERE -----
     */
    public Board() {
        //Set up initial board
        board = new byte[8][8];
        board[0] = WHITE_STARTING_RANK.clone();
        Arrays.fill(board[1], WHITE_PAWN);
        for(int i = 2; i < 6; i++) Arrays.fill(board[i], EMPTY);
        Arrays.fill(board[6], BLACK_PAWN);
        board[7] = BLACK_STARTING_RANK.clone();
    }

    public Board(String[] moves) {
        this();
        for(String s: moves) {
            makeMove(new Square(s.substring(0,2)), new Square(s.substring(2,4)));
        }
    }

    public byte getPiece(int row, int col){
        return board[row][col];
    }

    public String toString() {
        String boardString = "    A B C D E F G H\n   ----------------\n";
        for(int row = 0; row < board.length; row++){
            boardString += (8 - row) + " | ";
            for(int col = 0; col < board[row].length; col++){
               boardString += Board.toPiece(this.getPiece(7-row, col)) + " ";
            }
            boardString += "\n";
        }
        return boardString;
    }

    public boolean makeMove(Square from, Square to){
        if(validMove(from, to)) {
            byte piece = board[from.rank][from.file];
            board[from.rank][from.file] = EMPTY;
            board[to.rank][to.file] = piece;
            return true;
        }
        return false;
    }

    /*
     Stub for future move checker method
     */
    private boolean validMove(Square from, Square to){
        return true;
    }

    //method to convert byte piece to unicode char representation
    public static char toPiece(byte piece){
        switch(piece){
            case WHITE_KING:      return (char)0x2654; //♔
            case WHITE_QUEEN:     return (char)0x2655; //♕
            case WHITE_ROOK:      return (char)0x2656; //♖
            case WHITE_BISHOP:    return (char)0x2657; //♗
            case WHITE_KNIGHT:    return (char)0x2658; //♘
            case WHITE_PAWN:      return (char)0x2659; //♙
            case BLACK_KING:      return (char)0x265A; //♚
            case BLACK_QUEEN:     return (char)0x265B; //♛
            case BLACK_ROOK:      return (char)0x265C; //♜
            case BLACK_BISHOP:    return (char)0x265D; //♝
            case BLACK_KNIGHT:    return (char)0x265E; //♞
            case BLACK_PAWN:      return (char)0x265F; //♟
            case EMPTY:           return '_';
        }
        return '_';
    }

    public static void main(String[] args){
        Board b = new Board();
        System.out.println(b);
        Scanner s = new Scanner(System.in);
        String move = null;

        while (!"q".equals(move)) {
            System.out.println("Enter next move in the form [fromSquare toSquare] (e.g. e2 e4) or type q to exit:");
            move = s.nextLine();
            if(move.equals("q")){
                break;
            }
            else{
                String[] moveSplit = move.split("\\s+");
                b.makeMove(new Square(moveSplit[0]), new Square(moveSplit[1]));
                System.out.println(b);
            }
        }
        s.close();
    }
}
