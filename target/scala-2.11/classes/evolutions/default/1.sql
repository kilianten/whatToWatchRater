
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
  movie_poster                  varchar(255),
  background_colour              varchar(255),
  constraint pk_movie primary key (id)
);

create table movie_rating (
  id                            bigint auto_increment not null,
  num_of_ratings                bigint,
  total                         bigint,
  rating                        double not null,
  constraint pk_movie_rating primary key (id)
);

INSERT INTO movie_rating VALUES(1,1,10,10);
INSERT INTO movie_rating VALUES(2,1,9,9);
INSERT INTO movie_rating VALUES(3,1,9,9);
INSERT INTO movie_rating VALUES(4,1,10,10);
INSERT INTO movie_rating VALUES(5,1,9,9);
INSERT INTO movie_rating VALUES(6,1,9,9);

INSERT INTO movie VALUES(1, 'Inception', '2010-07-16', 'images/movies/moviePosters/1.jpg', 'white');
INSERT INTO movie VALUES(2, 'Little Miss Sunshine', '2006-09-08', 'images/movies/moviePosters/2.jpg', 'white');
INSERT INTO movie VALUES(3, 'Climax', '2018-09-21', 'images/movies/moviePosters/3.jpg', 'white');

# --- !Downs

drop table if exists director;

drop table if exists movie;

drop table if exists movie_rating;

