package service.template.services;

import service.template.models.User;
import java.util.List;

public interface UserService {
   List<User> list();
   User create(User user);
   User get(Long id);
   User update(User user);
   User delete(User user);
   User delete(Long id);
}
