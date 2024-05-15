package org.example.Router;

import org.example.Controller.MovieController;
import org.example.Controller.UserController;
import org.example.Http.Server;

public class Router {
    public static void route(Server server) {

        server.get("/users", UserController::getUser);
        server.get("/home", UserController::creatUser);
        server.get("/movies", MovieController::getMovie);

    }
}
