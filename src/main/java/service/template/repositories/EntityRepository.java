package service.template.repositories;

import java.io.Serializable;
import java.util.List;

public interface EntityRepository<T, ID extends Serializable> {
  List<T> findAll();
  T save(T entity);
  T find(ID id);
  void delete(T entity);
  void delete(ID id);
}
