package service.template.services;

import dagger.Module;
import dagger.Provides;
import service.template.repositories.UserRepositoryImpl;

import javax.inject.Singleton;

@Module
public class ServiceModule {

  @Provides
  @Singleton
  public UserService provideUserService() {
    return new UserServiceImpl(new UserRepositoryImpl());
  }

}
