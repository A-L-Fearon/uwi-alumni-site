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

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists account;

drop table if exists person;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists user_seq;

