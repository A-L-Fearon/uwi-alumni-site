package models;

import play.db.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by fearon on 2/25/15.
 */
@Entity
public class Image extends Model {
    public long imageID;
    public byte[] image;
}
