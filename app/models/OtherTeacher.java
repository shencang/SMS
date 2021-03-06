package models;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class OtherTeacher extends Model {

    @Required
    @MaxSize(value = 12,message = "value_max_12")
    public String tea_id;
    @Required
    @MaxSize(value = 8,message = "value_max_8")
    public String name;
    @Required
    @MaxSize(value = 11,message = "value_max_11")
    public String phone_number;
    @Required
    public String position;

    @Required
    @Password
    public String password;

    @Email
    public String email;

    public boolean isAdmin;

    @Override
    public String toString() {
        return name;
    }

    public OtherTeacher(String tea_id, String name,
                        String phone_number, String position,
                        String password, String email) {

        this.tea_id = tea_id;
        this.name = name;
        this.phone_number = phone_number;
        this.email=email;
        this.position= position;
        this.password=password;
        this.email=email;
    }
    public static OtherTeacher connect(String tea_id, String passawd) {
        return find("byTea_idAndPassword",tea_id , passawd).first();
    }

    @OneToMany(mappedBy = "myTeacher",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    public List<Student>students;
}
