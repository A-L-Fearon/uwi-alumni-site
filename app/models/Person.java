package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by fearon on 2/23/15.
 */
@Entity
public class Person extends Model {
    public long id;
    public Long trn;
    //@Constraints.Required
    public String firstName, lastName;
    public Date dob;
    public User user;
    public Account account;

}
