package org.example.Controller;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

public class ErrorController extends Controller {
    public static void methodNotSupported(HttpExchange exchange) throws IOException {
        String response = "the method is not supported";
        exchange.sendResponseHeaders(400, response.length());

        try (OutputStream stream = exchange.getResponseBody()) {
            stream.write(response.getBytes());
        }
    }
}
