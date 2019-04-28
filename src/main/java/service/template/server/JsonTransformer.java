package service.template.server;

import com.jsoniter.output.JsonStream;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

  @Override
  public String render(Object model) {
    return JsonStream.serialize(model);
  }

}
