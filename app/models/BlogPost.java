package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fearon on 2/25/15.
 */
@Entity
public class BlogPost extends Model {
    @Id
    public Long postId;
    public String userId;
    @Constraints.Required
    public String Title, content;
    public Formats.DateTime timestamp;
    public String username;
    public byte[] picture;
    public boolean deleted;

    public static Finder<String,BlogPost> find = new Finder<>(String.class, BlogPost.class);
}
