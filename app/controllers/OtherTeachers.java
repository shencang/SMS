package controllers;

import models.OtherTeacher;
import models.Student;
import models.Teacher;
import play.mvc.With;

import java.util.ArrayList;
import java.util.List;

@With(Secure.class)

public class OtherTeachers extends  CRUD{
    public static void upteacher(String id){
        OtherTeacher object = OtherTeacher.find("byTea_id", id).first();

        render("@upteacher", object);
    }

    public static void doupteacher(OtherTeacher object){
        OtherTeacher ot = OtherTeacher.find("byTea_id", object.tea_id).first();
//        ot.tea_id,ot.name,ot.phone_number,"",ot.password,ot.email
        if (null != object.name) {
            // id,username,userPhone,"",userPassword,userEmail
            Teacher teacher= new Teacher(ot.tea_id,ot.name,ot.phone_number,"",ot.password,ot.email).save();
            ot.delete();
            render("@upteacherdone", object);
        }
    }

}
