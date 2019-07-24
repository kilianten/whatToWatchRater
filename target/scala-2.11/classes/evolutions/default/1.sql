# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table movie (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  release_date                  timestamp,
  constraint pk_movie primary key (id)
);

create table movie_rating (
  id                            bigint auto_increment not null,
  num_of_ratings                bigint,
  total                         bigint,
  ratings                       double not null,
  constraint pk_movie_rating primary key (id)
);


# --- !Downs

drop table if exists movie;

drop table if exists movie_rating;

