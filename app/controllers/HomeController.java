package controllers;

import java.util.*;

import play.mvc.*;
import models.movie.*;


public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result moviePage(Long id) {

        Movie movie = Movie.findMovie(id);
        
        return ok(views.html.moviePage.render(movie));
    }

    public Result changeMovieColour(Long id, String colour){

        Movie movie = Movie.findMovie(id);

        movie.setBackgroundColour(colour);

        movie.update();

        return redirect(routes.HomeController.moviePage(id));
    }

    public Result movieList(){

        List<Movie> movies = new ArrayList<>();

        movies = Movie.findAll();

        return ok(views.html.movieList.render(movies));

    }


}
