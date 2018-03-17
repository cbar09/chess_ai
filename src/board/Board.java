package board;

import pieces.Piece;
import pieces.PieceHelper;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    private byte[][] board;

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
        board[0] = Piece.WHITE_STARTING_RANK.clone();
        Arrays.fill(board[1], Piece.WHITE_PAWN);
        for(int i = 2; i < 6; i++) Arrays.fill(board[i], Piece.EMPTY);
        Arrays.fill(board[6], Piece.BLACK_PAWN);
        board[7] = Piece.BLACK_STARTING_RANK.clone();
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
               boardString += PieceHelper.toPieceChar(this.getPiece(7-row, col)) + " ";
            }
            boardString += "\n";
        }
        return boardString;
    }

    public boolean makeMove(Square from, Square to){
        if(validMove(from, to)) {
            byte piece = board[from.rank][from.file];
            board[from.rank][from.file] = Piece.EMPTY;
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
