package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Created by fearon on 2/24/15.
 */
public class LoginCtrl extends Controller {

    private static Form<models.Login> loginForm = Form.form(models.Login.class);

    public static Result login(){
        return ok(login.render(loginForm));
    }

    public static Result authenticate() {
        Form<models.Login> boundform = loginForm.bindFromRequest();
        models.Login log = boundform.get();
        User found = User.find.where().eq("email", log.email).findUnique();
        if(found == null){
            flash("error", String.format("Invalid user or password"));
            return badRequest(login.render(boundform));
        }
        if(found.password.equals(log.password)){
            session().clear();
            session("email" , log.email);//boundform.get().email);
            session("username" , found.username);
            session("userid", found.userid.toString());
            return redirect(controllers.routes.Application.home());
        } else {
            flash("error", String.format("Invalid user or password"));
            return badRequest(login.render(boundform));
        }
    }

    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(controllers.routes.Application.landing());
    }

}
