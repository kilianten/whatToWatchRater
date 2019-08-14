package models.movie;

import java.util.*;
import javax.persistence.*;

import models.*;

import io.ebean.*;

import play.data.format.*;
import play.data.validation.*;

@Entity
public class MovieRating extends Model {

    @Id
    private Long id;
    @Constraints.Required

    private Long numOfRatings;

    private Long total;

    private double rating;

    @OneToOne
    private Movie movie;

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public Long getNumOfRatigs(){
        return numOfRatings;
    }

    public void setNumOfRatings(Long numOfRatings){
        this.numOfRatings = numOfRatings;
    }

    public Long getTotal(){
        return total;
    }

    public void setTotal(Long Total){
        this.total = total;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating(){
        if (numOfRatings > 0){
            return total/numOfRatings;
        }
        return 0;
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public void changeRating(int oldRating, int newRating){
        total =  total -oldRating + newRating;
    }

    public void addRating(int rating){
        total+=rating;
        numOfRatings++;
    }

    public static Finder<Long, MovieRating> find = new Finder<Long, MovieRating>(MovieRating.class);

    public static MovieRating findMovieRating(Long id){
        return find.query().where().eq("id", id).findOne();
    }

}