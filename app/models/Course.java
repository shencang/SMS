package models;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course extends Model {

    @Required
    @MaxSize(value = 12,message = "value_max_12")
    public String co_id;
    @MaxSize(value = 20,message = "value_max_20")
    public String cname;

    public String isteacher;
    @MaxSize(value = 15,message = "value_max_15")
    public String ctime;
    @MaxSize(value = 50,message = "value_max_50")
    public String remark;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "courseList",fetch = FetchType.LAZY)
    public List<Student>studentList;

    @Override
    public String toString() {
        return cname;
    }

    public Course(
            String co_id,
            String name,
            String isteacher,
            String time,
            String remark){
        this.co_id=co_id;
        this.cname=name;
        this.isteacher=isteacher;
        this.ctime= time;
        this.remark=remark;

    }

    public  List<Student> getStudentList() {
        return studentList;
    }

    //@ManyToOne(mappedBy = "myTeacher",cascade = CascadeType.ALL,fetch = FetchType.LAZY)


}
