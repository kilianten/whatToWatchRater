package controllers;

import java.util.*;

import play.mvc.*;
import models.movie.*;


public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result moviePage() {
        List<Movie> movies = Movie.findAll();
        
        return ok(views.html.moviePage.render(movies));
    }

    public Result changeMovieColour(Long id, String colour){

        Movie movie = Movie.findMovie(id);

        movie.setBackgroundColour(colour);

        movie.update();

        return redirect(routes.HomeController.moviePage());
    }


}
