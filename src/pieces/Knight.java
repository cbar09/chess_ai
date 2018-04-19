package pieces;

import board.Board;

import java.util.Vector;

public class Knight extends Piece {
    public Knight(byte pieceByte) {
        super(pieceByte);
    }

    @Override
    public Vector<String> GetLegalNormalMoves(int rank, int file, Board board) {
        return new Vector<String>();
    }

    @Override
    public Vector<String> GetLegalSpecialMoves(int rank, int file, Board board) {
        return new Vector<String>();
    }
}
