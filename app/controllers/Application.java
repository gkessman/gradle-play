package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import java.util.List;

import static play.libs.Json.*;

public class Application extends Controller {

    public Result index() {

        System.out.println("Hello World");
        return ok(index.render());
    }

}
