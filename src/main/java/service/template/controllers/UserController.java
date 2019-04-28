package service.template.controllers;

import service.template.models.User;
import service.template.services.UserService;
import spark.Request;

import javax.inject.Inject;
import java.util.List;

public class UserController extends RestfulController<User> {

  private UserService userService;

  @Inject
  public UserController(UserService userService) {
    super();
    this.userService = userService;
  }

  public List<User> index(Request request) {
    return userService.list();
  }

  public User save(Request request) {
    return userService.create(new User());
  }

  public User show(Request request) {
    Long id = Long.parseLong(request.params("id"));
    return userService.get(id);
  }

  public User update(Request request) {
    return userService.update(new User());
  }

  public User delete(Request request) {
    return userService.delete(new User());
  }
}
