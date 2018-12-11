package models;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course extends Model {

    @Required
    @MaxSize(12)
    public String co_id;
    @MaxSize(20)
    public String cname;

    public String isteacher;
    @MaxSize(15)
    public String ctime;
    @MaxSize(50)
    public String remark;

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


    //@ManyToOne(mappedBy = "myTeacher",cascade = CascadeType.ALL,fetch = FetchType.LAZY)


}
