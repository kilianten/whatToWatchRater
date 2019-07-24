# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

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
  constraint pk_movie primary key (id)
);

create table movie_rating (
  id                            bigint auto_increment not null,
  num_of_ratings                bigint,
  total                         bigint,
  rating                        double not null,
  constraint pk_movie_rating primary key (id)
);


# --- !Downs

drop table if exists director;

drop table if exists movie;

drop table if exists movie_rating;

