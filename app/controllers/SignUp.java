package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Created by fearon on 2/24/15.
 */
public class SignUp extends Controller {

    private static Form<User> signForm = Form.form(User.class);

    public static Result signup(){
        return ok(signup.render(signForm));
    }

    public static Result save(){
        Form<User> boundForm = signForm.bindFromRequest();
        if(boundForm.hasErrors()) {
            flash("error", String.format("Please fill out all fields in the form."));
            return badRequest(signup.render(boundForm));
        }
        User sss = boundForm.get();
        sss.save();
        flash("success", String.format("Successfully added signed up %s", sss));
        return redirect(controllers.routes.Application.landing());
    }

}
