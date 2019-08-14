package models.movie;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;


import play.data.format.*;
import play.data.validation.*;

import models.movie.*;

@Entity
public class PersonalRating extends Model {

    @Id
    private Long id;
    @Constraints.Required

    private int rating;

    @ManyToOne
    private User user;


    @OneToOne
    private Movie movie;

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

}