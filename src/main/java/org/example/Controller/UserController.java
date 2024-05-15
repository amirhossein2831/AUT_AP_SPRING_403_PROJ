package org.example.Controller;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

public class UserController extends Controller{
    // get all
    // get one specific entity
    // create
    // update
    // delete
    public static void getUser(HttpExchange exchange) throws IOException {
        String response = "here is all Users";
        exchange.sendResponseHeaders(200, response.length());

        try (OutputStream stream = exchange.getResponseBody()) {
            stream.write(response.getBytes());
        }
    }

    public static void creatUser(HttpExchange exchange) throws IOException {
        // create user in db
        String response = "User Created Successfully";
        exchange.sendResponseHeaders(200, response.length());

        try (OutputStream stream = exchange.getResponseBody()) {
            stream.write(response.getBytes());
        }
    }

}
