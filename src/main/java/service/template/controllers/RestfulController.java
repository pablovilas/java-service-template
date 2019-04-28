package service.template.controllers;

import spark.Request;

import java.util.List;

public abstract class RestfulController<T> {

  public abstract List<T> index(Request request);
  public abstract T show(Request request);
  public abstract T save(Request request);
  public abstract T update(Request request);
  public abstract T delete(Request request);

  public static ErrorResponse notFound(String message) {
    return new ErrorResponse(404, message);
  }

  public static ErrorResponse internalServerError(Exception exception) {
    return new ErrorResponse(500, exception.getMessage());
  }

  public static ErrorResponse internalServerError(String message) {
    return new ErrorResponse(500, message);
  }

  private static class ErrorResponse {

    private int state;
    private String message;

    public ErrorResponse(int state, String message) {
      this.state = state;
      this.message = message;
    }

    public int getState() {
      return state;
    }

    public void setState(int state) {
      this.state = state;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }

  }

}
