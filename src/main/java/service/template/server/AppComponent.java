package service.template.server;

import dagger.Component;
import service.template.controllers.UserController;
import service.template.repositories.RepositoryModule;
import service.template.services.ServiceModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = { ServiceModule.class, RepositoryModule.class })
public interface AppComponent {
  UserController getUserController();
}
