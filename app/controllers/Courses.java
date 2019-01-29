package controllers;

import models.Course;
import play.mvc.Controller;
import play.mvc.With;


@With(Secure.class)
@Check("Modify")
public class Courses extends CRUD {

    public static void  coursescenter(){
        render();
    }

    public static void findcourse(String id){
        //大改，由二级索引降为一级索引。以课号为准
        Course object = Course.find("byCo_id", id).first();

        render("@coursefind", object);
    }

    public static void selectcoursestudent(Course course){
        //Course course = new Course();
        Course co = Course.find("byCo_id", course.co_id).first();
        //大改，由二级索引降为一级索引。以学号为准
            render("@selectcoursestudent",course.studentList);


    }



}
