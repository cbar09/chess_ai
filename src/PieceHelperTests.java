import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PieceHelperTests {
    @Test
    public void PieceHelper_Is_Pawn_Match_ReturnsTrue()
    {
        assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.PAWN));
        assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_PAWN));

        assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.PAWN));
        assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_PAWN));
    }
    @Test
    public void PieceHelper_Is_Knight_Match_ReturnsTrue()
    {
        assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.KNIGHT));
        assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_KNIGHT));

        assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.KNIGHT));
        assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_KNIGHT));
    }
    @Test
    public void PieceHelper_Is_Bishop_Match_ReturnsTrue()
    {
        assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BISHOP));
        assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_BISHOP));

        assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BISHOP));
        assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_BISHOP));
    }
    @Test
    public void PieceHelper_Is_Rook_Match_ReturnsTrue()
    {
        assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.ROOK));
        assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_ROOK));

        assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.ROOK));
        assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_ROOK));
    }
    @Test
    public void PieceHelper_Is_Queen_Match_ReturnsTrue()
    {
        assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.QUEEN));
        assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_QUEEN));

        assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.QUEEN));
        assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_QUEEN));
    }
    @Test
    public void PieceHelper_Is_King_Match_ReturnsTrue()
    {
        assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.KING));
        assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK));
        assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_KING));

        assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.KING));
        assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE));
        assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_KING));
    }
    @Test
    public void PieceHelper_Is_Empty_Match_ReturnsTrue()
    {
        assertTrue(PieceHelper.Is(Piece.EMPTY, Piece.EMPTY));
    }
    @Test
    public void PieceHelper_Is_Empty_NoMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Pawn_NoMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Knight_NoMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Bishop_NoMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Rook_NoMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Queen_NoMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_King_NoMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Pawn_PartialMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Knight_PartialMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Bishop_PartialMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Rook_PartialMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_Queen_PartialMatch_ReturnsFalse()
    {
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
    public void PieceHelper_Is_King_PartialMatch_ReturnsFalse()
    {
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
}
