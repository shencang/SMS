package controllers;

import models.Student;
import models.Teacher;
import play.mvc.With;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@With(Secure.class)
public class Teachers  extends  CRUD{

    public static void modifybatchRegistration(){

        render("@batchRegistration");
    }

    public static void doModifybatchRegistration(int number,int classnum){
        if (0 != number&&0 != classnum) {

            List<Student> stu =new ArrayList<>();

            String[] stuList = batchRegistration(number,classnum);
            for (int i =1;i<stuList.length;i++){
                System.out.println(stuList[i]);
            }
            Student[] st = new Student[number+1];
            for (int i =1;i<stuList.length;i++){
                stu.add(new Student(stuList[i],"","","","123456","").save());
            }
            render("@batchRegistrationDone",stu );
        }


    }

    public static String[] batchRegistration(int stuNumber,int numClass){
        String[] stu_ids =new String[stuNumber+1];
        for (int i = 1;i<=stuNumber;i++){
            if (i<=9){
                stu_ids[i]= Integer.toString(numClass)+'0'+i;
            }
            else {
                stu_ids[i]=Integer.toString(numClass)+i;
            }
        }
        return stu_ids;
    }
}
