package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
public class Application extends Controller {


    public static void index() {
        Teacher admin =new Teacher("10086","管理员","10000",
                "管理员","1","jin@shencangblue.com").save();
        Student s1 =new Student("11","11","10000",
                "1","1","11@shencangblue.com").save();
        Student s2 =new Student("22","22","10000",
                "1","1","22@shencangblue.com").save();
        admin.isAdmin =true;

        String user =Security.connected();

        render(user);
    }


}