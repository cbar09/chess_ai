package tests;

import org.junit.jupiter.api.Test;
import pieces.Piece;
import pieces.PieceHelper;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceHelperTests {
    @Test
    public void PieceHelper_Is_Pawn_Match_ReturnsTrue() {
        assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.PAWN));
        assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_PAWN));

        assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.PAWN));
        assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_PAWN));
    }

    @Test
    public void PieceHelper_Is_Knight_Match_ReturnsTrue() {
        assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.KNIGHT));
        assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_KNIGHT));

        assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.KNIGHT));
        assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_KNIGHT));
    }

    @Test
    public void PieceHelper_Is_Bishop_Match_ReturnsTrue() {
        assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BISHOP));
        assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_BISHOP));

        assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BISHOP));
        assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_BISHOP));
    }

    @Test
    public void PieceHelper_Is_Rook_Match_ReturnsTrue() {
        assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.ROOK));
        assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_ROOK));

        assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.ROOK));
        assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_ROOK));
    }

    @Test
    public void PieceHelper_Is_Queen_Match_ReturnsTrue() {
        assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.QUEEN));
        assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_QUEEN));

        assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.QUEEN));
        assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_QUEEN));
    }

    @Test
    public void PieceHelper_Is_King_Match_ReturnsTrue() {
        assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.KING));
        assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_KING));

        assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.KING));
        assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_KING));
    }

    @Test
    public void PieceHelper_Is_Empty_Match_ReturnsTrue() {
        assertTrue(PieceHelper.Is(Piece.EMPTY, Piece.EMPTY));
    }

    @Test
    public void PieceHelper_Is_Empty_NoMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE));

        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_KING));

        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_KING));
    }

    @Test
    public void PieceHelper_Is_Pawn_NoMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE));

        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_KING));
    }

    @Test
    public void PieceHelper_Is_Knight_NoMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE));

        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_KING));
    }

    @Test
    public void PieceHelper_Is_Bishop_NoMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE));

        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_KING));
    }

    @Test
    public void PieceHelper_Is_Rook_NoMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE));

        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_KING));
    }

    @Test
    public void PieceHelper_Is_Queen_NoMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE));

        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.KING));

        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_KING));
    }

    @Test
    public void PieceHelper_Is_King_NoMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE));

        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.QUEEN));

        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.QUEEN));

        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_QUEEN));

        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_QUEEN));
    }

    @Test
    public void PieceHelper_Is_Pawn_PartialMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_KING));
    }

    @Test
    public void PieceHelper_Is_Knight_PartialMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_KING));
    }

    @Test
    public void PieceHelper_Is_Bishop_PartialMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_KING));
    }

    @Test
    public void PieceHelper_Is_Rook_PartialMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_QUEEN));
        assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_QUEEN));
        assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_KING));
    }

    @Test
    public void PieceHelper_Is_Queen_PartialMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_KING));

        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_KING));
    }

    @Test
    public void PieceHelper_Is_King_PartialMatch_ReturnsFalse() {
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_PAWN));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_BISHOP));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_ROOK));
        assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_QUEEN));

        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_PAWN));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_KNIGHT));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_BISHOP));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_ROOK));
        assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_QUEEN));
    }

    @Test
    public void PieceHelper_ExtractPieceType_NonEmptyPiece_ReturnsExpectedType() {
        assertEquals(PieceHelper.ExtractPieceType(Piece.BLACK_PAWN), Piece.PAWN);
        assertEquals(PieceHelper.ExtractPieceType(Piece.WHITE_PAWN), Piece.PAWN);

        assertEquals(PieceHelper.ExtractPieceType(Piece.BLACK_KNIGHT), Piece.KNIGHT);
        assertEquals(PieceHelper.ExtractPieceType(Piece.WHITE_KNIGHT), Piece.KNIGHT);

        assertEquals(PieceHelper.ExtractPieceType(Piece.BLACK_BISHOP), Piece.BISHOP);
        assertEquals(PieceHelper.ExtractPieceType(Piece.WHITE_BISHOP), Piece.BISHOP);

        assertEquals(PieceHelper.ExtractPieceType(Piece.BLACK_ROOK), Piece.ROOK);
        assertEquals(PieceHelper.ExtractPieceType(Piece.WHITE_ROOK), Piece.ROOK);

        assertEquals(PieceHelper.ExtractPieceType(Piece.BLACK_QUEEN), Piece.QUEEN);
        assertEquals(PieceHelper.ExtractPieceType(Piece.WHITE_QUEEN), Piece.QUEEN);

        assertEquals(PieceHelper.ExtractPieceType(Piece.BLACK_KING), Piece.KING);
        assertEquals(PieceHelper.ExtractPieceType(Piece.WHITE_KING), Piece.KING);
    }

    @Test
    public void PieceHelper_ExtractPieceColor_NonEmptyPiece_ReturnsExpectedColor() {
        assertEquals(PieceHelper.ExtractPieceColor(Piece.BLACK_PAWN), Piece.BLACK);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.BLACK_KNIGHT), Piece.BLACK);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.BLACK_BISHOP), Piece.BLACK);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.BLACK_ROOK), Piece.BLACK);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.BLACK_QUEEN), Piece.BLACK);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.BLACK_KING), Piece.BLACK);

        assertEquals(PieceHelper.ExtractPieceColor(Piece.WHITE_PAWN), Piece.WHITE);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.WHITE_KNIGHT), Piece.WHITE);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.WHITE_BISHOP), Piece.WHITE);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.WHITE_ROOK), Piece.WHITE);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.WHITE_QUEEN), Piece.WHITE);
        assertEquals(PieceHelper.ExtractPieceColor(Piece.WHITE_KING), Piece.WHITE);
    }

    @Test
    public void PieceHelper_ExtractPieceType_Empty_ReturnsEmpty() {
        assertEquals(PieceHelper.ExtractPieceType(Piece.EMPTY), Piece.EMPTY);
    }

    @Test
    public void PieceHelper_RankFileToAlgebraic_AllCases() {
        assertEquals("a1",PieceHelper.RankFileToAlgebraic(0,0));
        assertEquals("b1",PieceHelper.RankFileToAlgebraic(0,1));
        assertEquals("c1",PieceHelper.RankFileToAlgebraic(0,2));
        assertEquals("d1",PieceHelper.RankFileToAlgebraic(0,3));
        assertEquals("e1",PieceHelper.RankFileToAlgebraic(0,4));
        assertEquals("f1",PieceHelper.RankFileToAlgebraic(0,5));
        assertEquals("g1",PieceHelper.RankFileToAlgebraic(0,6));
        assertEquals("h1",PieceHelper.RankFileToAlgebraic(0,7));
        assertEquals("a2",PieceHelper.RankFileToAlgebraic(1,0));
        assertEquals("b2",PieceHelper.RankFileToAlgebraic(1,1));
        assertEquals("c2",PieceHelper.RankFileToAlgebraic(1,2));
        assertEquals("d2",PieceHelper.RankFileToAlgebraic(1,3));
        assertEquals("e2",PieceHelper.RankFileToAlgebraic(1,4));
        assertEquals("f2",PieceHelper.RankFileToAlgebraic(1,5));
        assertEquals("g2",PieceHelper.RankFileToAlgebraic(1,6));
        assertEquals("h2",PieceHelper.RankFileToAlgebraic(1,7));
        assertEquals("a3",PieceHelper.RankFileToAlgebraic(2,0));
        assertEquals("b3",PieceHelper.RankFileToAlgebraic(2,1));
        assertEquals("c3",PieceHelper.RankFileToAlgebraic(2,2));
        assertEquals("d3",PieceHelper.RankFileToAlgebraic(2,3));
        assertEquals("e3",PieceHelper.RankFileToAlgebraic(2,4));
        assertEquals("f3",PieceHelper.RankFileToAlgebraic(2,5));
        assertEquals("g3",PieceHelper.RankFileToAlgebraic(2,6));
        assertEquals("h3",PieceHelper.RankFileToAlgebraic(2,7));
        assertEquals("a4",PieceHelper.RankFileToAlgebraic(3,0));
        assertEquals("b4",PieceHelper.RankFileToAlgebraic(3,1));
        assertEquals("c4",PieceHelper.RankFileToAlgebraic(3,2));
        assertEquals("d4",PieceHelper.RankFileToAlgebraic(3,3));
        assertEquals("e4",PieceHelper.RankFileToAlgebraic(3,4));
        assertEquals("f4",PieceHelper.RankFileToAlgebraic(3,5));
        assertEquals("g4",PieceHelper.RankFileToAlgebraic(3,6));
        assertEquals("h4",PieceHelper.RankFileToAlgebraic(3,7));
        assertEquals("a5",PieceHelper.RankFileToAlgebraic(4,0));
        assertEquals("b5",PieceHelper.RankFileToAlgebraic(4,1));
        assertEquals("c5",PieceHelper.RankFileToAlgebraic(4,2));
        assertEquals("d5",PieceHelper.RankFileToAlgebraic(4,3));
        assertEquals("e5",PieceHelper.RankFileToAlgebraic(4,4));
        assertEquals("f5",PieceHelper.RankFileToAlgebraic(4,5));
        assertEquals("g5",PieceHelper.RankFileToAlgebraic(4,6));
        assertEquals("h5",PieceHelper.RankFileToAlgebraic(4,7));
        assertEquals("a6",PieceHelper.RankFileToAlgebraic(5,0));
        assertEquals("b6",PieceHelper.RankFileToAlgebraic(5,1));
        assertEquals("c6",PieceHelper.RankFileToAlgebraic(5,2));
        assertEquals("d6",PieceHelper.RankFileToAlgebraic(5,3));
        assertEquals("e6",PieceHelper.RankFileToAlgebraic(5,4));
        assertEquals("f6",PieceHelper.RankFileToAlgebraic(5,5));
        assertEquals("g6",PieceHelper.RankFileToAlgebraic(5,6));
        assertEquals("h6",PieceHelper.RankFileToAlgebraic(5,7));
        assertEquals("a7",PieceHelper.RankFileToAlgebraic(6,0));
        assertEquals("b7",PieceHelper.RankFileToAlgebraic(6,1));
        assertEquals("c7",PieceHelper.RankFileToAlgebraic(6,2));
        assertEquals("d7",PieceHelper.RankFileToAlgebraic(6,3));
        assertEquals("e7",PieceHelper.RankFileToAlgebraic(6,4));
        assertEquals("f7",PieceHelper.RankFileToAlgebraic(6,5));
        assertEquals("g7",PieceHelper.RankFileToAlgebraic(6,6));
        assertEquals("h7",PieceHelper.RankFileToAlgebraic(6,7));
        assertEquals("a8",PieceHelper.RankFileToAlgebraic(7,0));
        assertEquals("b8",PieceHelper.RankFileToAlgebraic(7,1));
        assertEquals("c8",PieceHelper.RankFileToAlgebraic(7,2));
        assertEquals("d8",PieceHelper.RankFileToAlgebraic(7,3));
        assertEquals("e8",PieceHelper.RankFileToAlgebraic(7,4));
        assertEquals("f8",PieceHelper.RankFileToAlgebraic(7,5));
        assertEquals("g8",PieceHelper.RankFileToAlgebraic(7,6));
        assertEquals("h8",PieceHelper.RankFileToAlgebraic(7,7));



    }
}