package models;

import javax.persistence.Entity;
import java.util.ArrayList;

/**
 * Created by fearon on 2/25/15.
 */
@Entity
public class Comment extends Message {
    public ArrayList<Message> replies;
}
