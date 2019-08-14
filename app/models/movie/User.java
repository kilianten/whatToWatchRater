package models.movie;

import java.util.*;
import javax.persistence.*;

import models.*;

import io.ebean.*;

import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {

    @Id
    private Long id;
    @Constraints.Required

    private String username;
    @Constraints.Required

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<PersonalRating> ratings;

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public List<PersonalRating> getRatings(){
        return ratings;
    }

    public PersonalRating checkRating(Long movieId){
        for(PersonalRating rating:ratings){
            if(rating.getMovie().getId() == movieId){
               return rating;
            }
        }
        return null;//null if not rated
    }

    public static Finder<Long, User> find = new Finder<Long, User>(User.class);

    public static User findUser(String username){
        return find.query().where().eq("username", username).findOne();
    }

    public void addRating(PersonalRating prating){
        ratings.add(prating);
    }

}