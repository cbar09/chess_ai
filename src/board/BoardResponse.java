package board;

public class BoardResponse {
    public String boardState;
    public String[] legalMoves;
    public String[] moves;
    public byte[][] board;

    public BoardResponse(Board board)
    {
        this.boardState = board.toString();
        this.legalMoves = MoveFinder.FindMoves(board);
        this.moves = board.moves;
        this.board = board.board;
    }
}
