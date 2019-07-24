package controllers;

import play.mvc.*;


public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result moviePage() {
        return ok(views.html.moviePage.render());
    }


}
