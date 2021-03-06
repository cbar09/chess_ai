package pieces;

import java.util.Vector;

public class Knight extends Piece {
    public Knight(byte pieceByte) {
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
