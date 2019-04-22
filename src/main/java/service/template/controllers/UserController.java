package service.template.controllers;

import com.google.inject.Inject;
import service.template.services.UserService;
import spark.Request;
import spark.Response;

public class UserController {

  @Inject
  static UserService userService;

  public static Response list(Request request, Response response) {
    System.out.println("list");
    return response;
  }

  public static Response create(Request request, Response response) {
    return response;
  }

  public static Response get(Request request, Response response) {
    Long id = Long.parseLong(request.params("id"));
    userService.get(id);
    return response;
  }

  public static Response update(Request request, Response response) {
    return response;
  }

  public static Response delete(Request request, Response response) {
    return response;
  }
}
