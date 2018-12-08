package controllers;

import models.Student;
import play.mvc.With;

@With(Secure.class)
@Check("studentNameModify")

public class Students extends CRUD {

    public static void modifyName(String id){
        //大改，由二级索引降为一级索引。以学号为准
        Student object = Student.find("byStu_id", id).first();

        render("@changename", object);
    }

    public static void doModifyName(Student object){
        Student st = Student.find("byStu_id", object.stu_id).first();
        //大改，由二级索引降为一级索引。以学号为准
        if (null != object.name) {
            // 保存新名字
            st.name = object.name;
            st.save();
            render("@modifynamedone", object);
        }
    }


}
