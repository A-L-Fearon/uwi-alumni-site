package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fearon on 2/23/15.
 */

@Entity
public class User extends Person{
    public Integer id;
    @Id
    @Constraints.Required
    public String username;
    public Integer userid;
    @Constraints.Required
    public String email;
    @Constraints.Required
    public String password;
    public Integer attempts, timeout;
    public int sessionId;
    public byte[] picture;


    public static Finder<String,User> find = new Finder<>(String.class, User.class);

}
