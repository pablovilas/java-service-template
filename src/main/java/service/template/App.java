package service.template;

import service.template.server.AppComponent;
import service.template.server.DaggerAppComponent;
import service.template.server.Server;

public class App {

  public static void main(String[] args) {
    AppComponent component = DaggerAppComponent.builder().build();
    Server server = new Server(component);
    server.start();
  }

}
