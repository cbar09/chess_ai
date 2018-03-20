package pieces;

import java.util.Vector;

public class Bishop extends Piece {
    public Bishop(byte pieceByte) {
        super(pieceByte);
    }

    @Override
    public Vector<String> GetLegalNormalMoves() {
        return new Vector<String>();
    }

    @Override
    public Vector<String> GetLegalSpecialMoves() {
        return new Vector<String>();
    }
}
