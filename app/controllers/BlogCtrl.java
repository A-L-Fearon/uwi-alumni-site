package controllers;

import com.sun.xml.internal.bind.v2.TODO;
import models.BlogPost;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by fearon on 2/25/15.
 */
public class BlogCtrl extends Controller {

    private static Form<User> useForm = Form.form(User.class);

    private static Form<BlogPost> postForm = Form.form(BlogPost.class);

    public static Result newPost() {
        User user = User.find.byId(session("username"));
        Form<User> userForm = useForm.fill(user);
        return ok(blogviewhere.render(postForm,userForm));
    }

    public static Result blogs(){
        List<BlogPost> postList = BlogPost.find.findList();
        return ok(blogviewhere.render(postList));
    }

    //todo create views for blog

    public static Result save(){
        User user = User.find.byId(session("username"));
        Form<User> userForm = useForm.fill(user);
        Form<BlogPost> boundForm = postForm.bindFromRequest();
        if(boundForm.hasErrors()) {
            flash("error", String.format("Please correct the form below."));
            return badRequest(blogviewhere.render(postForm,userForm));
        }
        BlogPost post = boundForm.get();
        post.username = session("username");
        post.userId = session("userid");
        post.save();
        flash("success","Post made");
        return ok(blogviewhere.render(postForm,userForm));
    }

}
