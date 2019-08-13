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

create table personal_rating (
  id                            bigint auto_increment not null,
  rating                        double not null,
  user_id                       bigint,
  movie_id                      bigint,
  constraint uq_personal_rating_movie_id unique (movie_id),
  constraint pk_personal_rating primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  constraint pk_user primary key (id)
);

alter table movie_rating add constraint fk_movie_rating_movie_id foreign key (movie_id) references movie (id) on delete restrict on update restrict;

create index ix_personal_rating_user_id on personal_rating (user_id);
alter table personal_rating add constraint fk_personal_rating_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;

alter table personal_rating add constraint fk_personal_rating_movie_id foreign key (movie_id) references movie (id) on delete restrict on update restrict;


# --- !Downs

alter table movie_rating drop constraint if exists fk_movie_rating_movie_id;

alter table personal_rating drop constraint if exists fk_personal_rating_user_id;
drop index if exists ix_personal_rating_user_id;

alter table personal_rating drop constraint if exists fk_personal_rating_movie_id;

drop table if exists director;

drop table if exists movie;

drop table if exists movie_rating;

drop table if exists personal_rating;

drop table if exists user;

