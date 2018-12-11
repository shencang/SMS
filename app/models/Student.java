package models;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student extends Model {

    @Required
    @MaxSize(11)
    public String stu_id;

    @MaxSize(8)
    public String name;

    @MaxSize(11)
    public String phone_number;
    @MaxSize(8)
    public String grade;

    @Required
    @Password
    public String password;
    @Email
    public String email;

    @MaxSize(4)
    public int  stu_score;

    @MaxSize(10)
    public int stu_mom;

    @ManyToOne
    public Teacher myTeacher;





    @Override
    public String toString() {
        return name;
    }

    public Student(String stu_id, String name,
                   String phone_number, String grade,
                   String password, String email,int stu_score,int stu_mom) {


        this.stu_id = stu_id;
        this.name = name;
        this.phone_number = phone_number;
        this.email=email;
        this.grade= grade;
        this.password=password;
        this.email=email;
        this.stu_score=stu_score;
        this.stu_mom=stu_mom;
    }


}
