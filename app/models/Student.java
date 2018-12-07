package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Student extends Model {

    public String stu_id;
    public String name;
    public String phone_number;
    public String grade;
    public String password;
    public boolean isAdmin;
    public String email;

    public Student(String stu_id, String name,
                   String phone_number, String grade,
                   String password, String email) {

        this.stu_id = stu_id;
        this.name = name;
        this.phone_number = phone_number;
        this.email=email;
        this.grade= grade;
        this.password=password;
        this.email=email;
    }
}
