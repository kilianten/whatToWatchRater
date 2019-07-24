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

    private String name;
    @Constraints.Required

    private MovieRating globalRating;
    @Constraints.Required

    private Date releaseDate;

    private List<String> pageColours;
    

}