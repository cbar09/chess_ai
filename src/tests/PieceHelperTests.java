package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pieces.Piece;
import pieces.PieceHelper;

public class PieceHelperTests {
    @Test
    public void PieceHelper_Is_Pawn_Match_ReturnsTrue()
    {
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.PAWN));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_PAWN));

        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.PAWN));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_PAWN));
    }
    @Test
    public void PieceHelper_Is_Knight_Match_ReturnsTrue()
    {
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.KNIGHT));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_KNIGHT));

        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.KNIGHT));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_KNIGHT));
    }
    @Test
    public void PieceHelper_Is_Bishop_Match_ReturnsTrue()
    {
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BISHOP));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_BISHOP));

        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BISHOP));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_BISHOP));
    }
    @Test
    public void PieceHelper_Is_Rook_Match_ReturnsTrue()
    {
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.ROOK));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_ROOK));

        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.ROOK));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_ROOK));
    }
    @Test
    public void PieceHelper_Is_Queen_Match_ReturnsTrue()
    {
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.QUEEN));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_QUEEN));

        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.QUEEN));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_QUEEN));
    }
    @Test
    public void PieceHelper_Is_King_Match_ReturnsTrue()
    {
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.KING));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK));
        Assertions.assertTrue(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_KING));

        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.KING));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE));
        Assertions.assertTrue(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_KING));
    }
    @Test
    public void PieceHelper_Is_Empty_Match_ReturnsTrue()
    {
        Assertions.assertTrue(PieceHelper.Is(Piece.EMPTY, Piece.EMPTY));
    }
    @Test
    public void PieceHelper_Is_Empty_NoMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE));

        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.WHITE_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.EMPTY, Piece.BLACK_KING));
    }
    @Test
    public void PieceHelper_Is_Pawn_NoMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.BLACK_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.WHITE_KING));
    }
    @Test
    public void PieceHelper_Is_Knight_NoMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.BLACK_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.WHITE_KING));
    }
    @Test
    public void PieceHelper_Is_Bishop_NoMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.BLACK_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.WHITE_KING));
    }
    @Test
    public void PieceHelper_Is_Rook_NoMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.BLACK_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.WHITE_KING));
    }
    @Test
    public void PieceHelper_Is_Queen_NoMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.BLACK_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.WHITE_KING));
    }
    @Test
    public void PieceHelper_Is_King_NoMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.QUEEN));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.QUEEN));

        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.BLACK_QUEEN));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.WHITE_QUEEN));
    }
    @Test
    public void PieceHelper_Is_Pawn_PartialMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_PAWN, Piece.WHITE_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_PAWN, Piece.BLACK_KING));
    }
    @Test
    public void PieceHelper_Is_Knight_PartialMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KNIGHT, Piece.WHITE_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KNIGHT, Piece.BLACK_KING));
    }
    @Test
    public void PieceHelper_Is_Bishop_PartialMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_BISHOP, Piece.WHITE_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_BISHOP, Piece.BLACK_KING));
    }
    @Test
    public void PieceHelper_Is_Rook_PartialMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_ROOK, Piece.WHITE_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_QUEEN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_ROOK, Piece.BLACK_KING));
    }
    @Test
    public void PieceHelper_Is_Queen_PartialMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_QUEEN, Piece.WHITE_KING));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_QUEEN, Piece.BLACK_KING));
    }
    @Test
    public void PieceHelper_Is_King_PartialMatch_ReturnsFalse()
    {
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.WHITE_KING, Piece.WHITE_QUEEN));

        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_PAWN));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_KNIGHT));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_BISHOP));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_ROOK));
        Assertions.assertFalse(PieceHelper.Is(Piece.BLACK_KING, Piece.BLACK_QUEEN));
    }
}
