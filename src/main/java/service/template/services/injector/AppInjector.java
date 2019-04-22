package service.template.services.injector;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import service.template.controllers.UserController;
import service.template.services.UserService;
import service.template.services.UserServiceImpl;

public class AppInjector extends AbstractModule {

  public static void init() {
    Guice.createInjector(new AppInjector());
  }

  @Override
  protected void configure() {
    bind(UserService.class).to(UserServiceImpl.class).asEagerSingleton();
    requestStaticInjection(UserController.class);
  }

}
