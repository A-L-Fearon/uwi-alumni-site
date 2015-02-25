package models;

import javax.persistence.Entity;

/**
 * Created by fearon on 2/25/15.
 */
@Entity
public class Administrator extends User {
    public String authorityLevel;
}
