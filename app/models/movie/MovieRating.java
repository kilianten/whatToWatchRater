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

}