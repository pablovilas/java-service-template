package service.template.services;

import service.template.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

  public List<User> list() {
    return new ArrayList<>();
  }

  public User create(User user) {
    return user;
  }

  public User get(Long id) {
    return new User();
  }

  public User update(User user) {
    return new User();
  }

  public User delete(User user) {
    return user;
  }

}
