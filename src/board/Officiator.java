package board;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;

import static spark.Spark.*;

public class Officiator {

    private static final Gson GSON = new Gson();

    public static String GetLegalMoves(Request request, Response response)
    {
        String[] output = new String[2];
        output[0] = "a2a3";
        output[1] = "b2b3";
        return GSON.toJson(output);
    }

    /**
     * Handles a POST request that passes a JSON list of moves (simple array of strings like ["e2e4", "e7e5"]
     * and creates a board.Board Object.  Makes the moves passed in on the board, and returns the board representation
     * (as a string) of the final position after all moves are made.
     *
     * @param request - request object that contains POST request sent to this class
     * @param response - response that will be used to hold
     * @return JSON representation of board state after making the moves (in order) from the query param
     */
    public static String GetLegalMovesFromPOST(Request request, Response response) {
        String[] moves = GSON.fromJson(request.body(), String[].class);
        return GSON.toJson(new Board(moves).toString());
    }

    /**
     * Handles a GET request that passes a list of moves via query params - simple list of strings like ["e2e4", "e7e5"]
     * that is split on commas into array of moves - and creates a board.Board Object with those moves made on the board.
     * Returns the state of the chess board after those moves are made as a String representation.
     *
     * @param request - request object that contains POST request sent to this class
     * @param response - response that will be used to hold
     * @return JSON representation of board state after making the moves (in order) from the query param
     */
    public static String GetLegalMovesFromGET(Request request, Response response) {
        String[] moves = request.queryParams("moves").split(",");
        return GSON.toJson(new Board(moves).toString());
    }

    public static void main(String[] args) {
        port(5678);
        post("/post_legal_moves", Officiator::GetLegalMoves);
        get("get_legal_moves", Officiator::GetLegalMovesFromGET);
    }
}
