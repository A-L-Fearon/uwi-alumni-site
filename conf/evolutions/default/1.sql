# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table account (
  transaction_id            bigint,
  trans_no                  bigint,
  sender_id                 bigint,
  receiver_id               bigint,
  amount                    double)
;

create table administrator (
  username                  varchar(255) not null,
  id                        bigint,
  trn                       bigint,
  first_name                varchar(255),
  last_name                 varchar(255),
  dob                       timestamp,
  userid                    integer,
  email                     varchar(255),
  password                  varchar(255),
  attempts                  integer,
  timeout                   integer,
  session_id                integer,
  picture                   varbinary(255),
  authority_level           varchar(255),
  constraint pk_administrator primary key (username))
;

create table blog_post (
  post_id                   bigint not null,
  user_id                   varchar(255),
  title                     varchar(255),
  content                   varchar(255),
  username                  varchar(255),
  picture                   varbinary(255),
  deleted                   boolean,
  constraint pk_blog_post primary key (post_id))
;

create table comment (
  body                      varchar(255),
  reciever_id               bigint)
;

create table image (
  image_id                  bigint,
  image                     varbinary(255))
;

create table message (
  body                      varchar(255),
  reciever_id               bigint)
;

create table person (
  id                        bigint,
  trn                       bigint,
  first_name                varchar(255),
  last_name                 varchar(255),
  dob                       timestamp)
;

create table user (
  username                  varchar(255) not null,
  id                        bigint,
  trn                       bigint,
  first_name                varchar(255),
  last_name                 varchar(255),
  dob                       timestamp,
  userid                    integer,
  email                     varchar(255),
  password                  varchar(255),
  attempts                  integer,
  timeout                   integer,
  session_id                integer,
  picture                   varbinary(255),
  constraint pk_user primary key (username))
;

create sequence administrator_seq;

create sequence blog_post_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists account;

drop table if exists administrator;

drop table if exists blog_post;

drop table if exists comment;

drop table if exists image;

drop table if exists message;

drop table if exists person;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists administrator_seq;

drop sequence if exists blog_post_seq;

drop sequence if exists user_seq;

