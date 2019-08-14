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

    public Result rateMovie(int rating, long movieid){

        Movie movie = Movie.findMovie(movieid);

        User user = User.findUser("k10");

        PersonalRating oldRating = user.checkRating(movieid);

        if(oldRating == null){ //hasnt rated it before
            PersonalRating prating = new PersonalRating();
            prating.setMovie(movie);
            prating.setRating(rating);
            user.addRating(prating);
            movie.addRating(rating);
            movie.update();
            user.update();
            
        } else if (oldRating.getRating() != rating){
            MovieRating globalRating = movie.getMovieRating();
            globalRating.changeRating(oldRating.getRating(), rating);
            globalRating.update();
            oldRating.setRating(rating);
            oldRating.update();
            user.update();
        }

        return redirect(routes.HomeController.moviePage(movieid));
    }


}
