package service.template.repositories;

import service.template.models.Address;
import service.template.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

  @Override
  public List<User> findAll() {
    List<User> list = new ArrayList<>();
    list.add(createUser());
    return list;
  }

  @Override
  public User save(User entity) {
    return createUser();
  }

  @Override
  public User find(Long id) {
    if (id == 10L) {
      throw new IllegalArgumentException("User not found");
    }
    return createUser();
  }

  @Override
  public void delete(User entity) {
  }

  @Override
  public void delete(Long id) {
  }

  private User createUser() {
    User user = new User();
    user.setId(1L);
    user.setName("John");

    Address address = new Address();
    address.setId(1L);
    address.setStreet("Av. Brasil");
    address.setNumber("2528");
    address.setCity("Montevideo");

    user.setAddress(address);

    return user;
  }

}
