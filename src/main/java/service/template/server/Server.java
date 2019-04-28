package service.template.server;

import service.template.controllers.RestfulController;
import service.template.controllers.UserController;

import static spark.Spark.*;
import static spark.Spark.delete;

public class Server {

  private static JsonTransformer jsonTransformer = new JsonTransformer();
  private AppComponent appComponent;

  public Server(AppComponent appComponent) {
    this.appComponent = appComponent;
  }

  public void start() {
    setServerConfig();
    setDefaultRoutes();
    setApplicationRoutes();
  }

  private void setServerConfig() {
    port(8080);
    defaultResponseTransformer(jsonTransformer);
  }

  private void setDefaultRoutes() {
    before((request, response) -> {
      request.session(false);
      response.type("application/json");
      response.header("Content-Encoding", "gzip");
    });
    notFound((request, response) -> {
      response.status(404);
      return jsonTransformer.render(RestfulController.notFound("Resource not found"));
    });
    internalServerError((request, response) -> {
      response.status(500);
      return jsonTransformer.render(RestfulController.internalServerError("Internal server error"));
    });
    exception(Exception.class, (exception, request, response) -> {
      response.status(500);
      response.body(jsonTransformer.render(RestfulController.internalServerError(exception)));
    });
  }

  private void setApplicationRoutes() {

    final UserController userController = this.appComponent.getUserController();

    path("/users", () -> {
      get("",       (req, res) -> userController.index(req));
      post("",      (req, res) -> userController.save(req));
      get("/:id",    (req, res) -> userController.show(req));
      put("/:id",    (req, res) -> userController.update(req));
      delete("/:id", (req, res) -> userController.delete(req));
    });

  }

}
