package service.template.services;

import service.template.models.User;
import service.template.repositories.UserRepository;

import javax.inject.Inject;
import java.util.List;

public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Inject
  public UserServiceImpl(UserRepository userRepository) {
    super();
    this.userRepository = userRepository;
  }

  public List<User> list() {
    return userRepository.list();
  }

  public User create(User user) {
    return userRepository.create(user);
  }

  public User get(Long id) {
    return userRepository.get(id);
  }

  public User update(User user) {
    return userRepository.update(user);
  }

  public User delete(User user) {
    return userRepository.delete(user);
  }

  public User delete(Long id) {
    return userRepository.delete(id);
  }

}
