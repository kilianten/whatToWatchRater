package models.movie;

import java.util.*;
import javax.persistence.*;

import models.*;

import io.ebean.*;

import play.data.format.*;
import play.data.validation.*;

@Entity
public class Director extends Model {

    @Id
    private Long id;
    @Constraints.Required

    private String fname;

    private String lname;
    

}