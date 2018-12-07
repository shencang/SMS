package models;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student extends Model {

    @Required
    @MaxSize(11)
    public String stu_id;

    @Required
    @MaxSize(8)
    public String name;

    @Required
    @MaxSize(11)
    public String phone_number;
    @MaxSize(8)
    public String grade;
    @Required
    @Password
    public String password;
    @Email
    public String email;

    public boolean isAdmin;
    @Required
    @ManyToOne
    public Teacher myTeacher;

    @Override
    public String toString() {
        return name;
    }

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
