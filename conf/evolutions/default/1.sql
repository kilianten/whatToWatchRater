
# --- !Ups

create table director (
  id                            bigint auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  constraint pk_director primary key (id)
);

create table movie (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  release_date                  timestamp,
  background_colour             varchar(255),
  movie_poster                  varchar(255),
  constraint pk_movie primary key (id)
);

create table movie_rating (
  id                            bigint auto_increment not null,
  num_of_ratings                bigint,
  total                         bigint,
  rating                        double not null,
  movie_id                      bigint,
  constraint uq_movie_rating_movie_id unique (movie_id),
  constraint pk_movie_rating primary key (id)
);

alter table movie_rating add constraint fk_movie_rating_movie_id foreign key (movie_id) references movie (id) on delete restrict on update restrict;

INSERT INTO movie VALUES(1, 'Inception', '2010-07-16', 'white', 'images/movies/moviePosters/1.jpg');
INSERT INTO movie VALUES(2, 'Little Miss Sunshine', '2006-09-08', 'white', 'images/movies/moviePosters/2.jpg');
INSERT INTO movie VALUES(3, 'Climax', '2018-09-21', 'white','images/movies/moviePosters/3.jpg');

INSERT INTO movie_rating VALUES(1,0,0,0,1);
INSERT INTO movie_rating VALUES(2,0,0,0,2);
INSERT INTO movie_rating VALUES(3,0,0,0,3);

# --- !Downs

alter table movie_rating drop constraint if exists fk_movie_rating_movie_id;

drop table if exists director;

drop table if exists movie;

drop table if exists movie_rating;

