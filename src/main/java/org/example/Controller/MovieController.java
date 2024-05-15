package org.example.Controller;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

public class MovieController extends Controller {

    public static void getMovie(HttpExchange exchange) throws IOException {
        String response = "here is all movies";
        exchange.sendResponseHeaders(200, response.length());

        try (OutputStream stream = exchange.getResponseBody()) {
            stream.write(response.getBytes());
        }
    }
}
