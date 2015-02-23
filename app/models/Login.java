package models;

import play.data.validation.Constraints;

/**
 * Created by fearon on 2/23/15.
 */
public class Login {

    @Constraints.Required
    public String email;
    @Constraints.Required
    public String password;

}
