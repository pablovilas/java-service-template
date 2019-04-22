package service.template;

import service.template.controllers.UserController;
import service.template.services.injector.AppInjector;

import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    initServer();
  }

  private static void initServer() {
    AppInjector.init();
    port(8080);
    path("/users", () -> {
      get("/",       UserController::list);
      post("/",      UserController::create);
      get("/:id",    UserController::get);
      put("/:id",    UserController::update);
      delete("/:id", UserController::delete);
    });
  }
}
