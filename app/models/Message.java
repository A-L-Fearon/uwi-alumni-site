package models;

import play.db.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by fearon on 2/25/15.
 */
@Entity
public class Message extends Model {
    public String body;
    public Image image;
    public long recieverID;
}
