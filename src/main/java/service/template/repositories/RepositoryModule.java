package service.template.repositories;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class RepositoryModule {

  @Provides
  @Singleton
  public UserRepository provideUserRepository() {
    return new UserRepositoryImpl();
  }

}
