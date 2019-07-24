package models.movie;

import java.util.*;
import javax.persistence.*;

import models.*;

import io.ebean.*;

import play.data.format.*;
import play.data.validation.*;

@Entity
public class Movie extends Model {

    @Id
    private Long id;
    @Constraints.Required

    private String title;
    @Constraints.Required

    @OneToMany(mappedBy="movie_rating", cascade = CascadeType.ALL)
    private MovieRating globalRating;

    private Date releaseDate;

    private List<String> pageColours;

    private List<Director> dirctor;

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public MovieRating getMovieRating(){
        return globalRating;
    }

    public void setMovieRating(MovieRating globalRating){
        this.globalRating = globalRating;
    }

    public Date getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(Date date){
        this.releaseDate = date;
    }

    public List<String> getPageColours(){
        return pageColours;
    }

    public void setPageColours(List<String> pageColours){
        this.pageColours = pageColours;
    }

    public List<Director> getDirector(){
        return dirctor;
    }

    public void setDirector(List<Director> director){
        this.dirctor = director;
    }

}