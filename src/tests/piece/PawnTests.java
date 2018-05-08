package tests.piece;

import board.Board;
import org.junit.jupiter.api.Test;
import pieces.Piece;
import pieces.PieceFactory;
import pieces.PieceHelper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTests {
    @Test
    public void Pawn_GetLegalNormalMoves_White_StartingBoard_ReturnsNextPawnSpace() {
        Board board = new Board();
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 0, 2, 0), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 0, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 1, 2, 1), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 1, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 2, 2, 2), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 2, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 3, 2, 3), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 3, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 4, 2, 4), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 4, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 5, 2, 5), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 5, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 6, 2, 6), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 6, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(1, 7, 2, 7), PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 7, board).toArray(new String[0])[0]);
    }

    @Test
    public void Pawn_GetLegalNormalMoves_White_StartingBoard_ReturnsOneMove() {
        Board board = new Board();
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 0, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 1, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 2, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 3, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 4, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 5, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 6, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(1, 7, board).size());
    }

    @Test
    public void Pawn_GetLegalNormalMoves_Black_StartingBoard_ReturnsNextPawnSpace() {
        Board board = new Board();
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 0, 5, 0), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 0, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 1, 5, 1), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 1, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 2, 5, 2), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 2, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 3, 5, 3), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 3, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 4, 5, 4), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 4, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 5, 5, 5), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 5, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 6, 5, 6), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 6, board).toArray(new String[0])[0]);
        assertEquals(PieceHelper.RankFilesToAlgebraicMove(6, 7, 5, 7), PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(6, 7, board).toArray(new String[0])[0]);
    }

    @Test
    public void Pawn_GetLegalNormalMoves_Black_StartingBoard_ReturnsOneMove() {
        Board board = new Board();
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 0, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 1, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 2, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 3, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 4, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 5, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 6, board).size());
        assertEquals(1, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(5, 7, board).size());
    }
    @Test
    public void Pawn_GetLegalNormalMoves_White_PawnAtEdgeOfBoard_ReturnsZeroMoves() {
        Board board = new Board();
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 0, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 1, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 2, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 3, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 4, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 5, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 6, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.WHITE_PAWN).GetLegalNormalMoves(7, 7, board).size());
    }
    @Test
    public void Pawn_GetLegalNormalMoves_Black_PawnAtEdgeOfBoard_ReturnsZeroMoves() {
        Board board = new Board();
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 0, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 1, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 2, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 3, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 4, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 5, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 6, board).size());
        assertEquals(0, PieceFactory.BuildPiece(Piece.BLACK_PAWN).GetLegalNormalMoves(0, 7, board).size());
    }
}
