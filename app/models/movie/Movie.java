package models.movie;

import java.util.*;
import javax.persistence.*;

import models.*;

import io.ebean.*;

import java.awt.Color;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

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

    private String backgroundColour = "white";

    private List<String> pageColours;

    private List<Director> dirctor;

    private String moviePoster;

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

    public String getMoviePoster(){
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster){
        this.moviePoster = moviePoster;
    }

    public List<Director> getDirector(){
        return dirctor;
    }

    public void setDirector(List<Director> director){
        this.dirctor = director;
    }

    public void setBackgroundColour(String backgroundColour){
        this.backgroundColour = backgroundColour;
    }

    public String getBackgroundColour(){
        return backgroundColour;
    }

    public static Finder<Long, Movie> find = new Finder<Long, Movie>(Movie.class);

    public static List<Movie> findAll(){
        return Movie.find.query().where().orderBy("title asc").findList();
    }

    public static Movie findMovie(Long id){
        return find.query().where().eq("id", id).findOne();
    }

    //get random colours from movie poster
    public List<String> generateColours(int numOfColours){

        File file = new File("public/" + moviePoster);
        BufferedImage image;
        Random random = new Random();
        List<String> temp = new ArrayList<>();

        try{
            image = ImageIO.read(file);
            for(int i =0; i < numOfColours; i++){

            int c = image.getRGB(random.nextInt(image.getWidth()), random.nextInt(image.getHeight())); //get Random colour on image
            Color colour = new Color(c);

            String colourString = "rgb(" + colour.getRed() + "," + colour.getGreen() + "," + colour.getBlue() + ")";
            temp.add(colourString);

            }
        } catch(IOException ex){
            System.out.println(ex.toString());
        }

        return temp;
    }


}