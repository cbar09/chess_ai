import static spark.Spark.*;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;

import java.util.Vector;

public class Officiator {

    private Gson gson;

    public Officiator()
    {
        gson = new Gson();
    }

    public static void main(String[] args){

        Officiator officiator = new Officiator();

        port(5678);
        get("/getLegalMoves", officiator::GetLegalMoves);
    }

    public String GetLegalMoves(Request request, Response response)
    {
        Vector<String> moves = new Vector<String>();

        String[] output = new String[2];
        output[0] = "a2a3";
        output[1] = "b2b3";
        return gson.toJson(output);
    }
}
