package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Teacher extends Model {

    public String tea_id;
    public String name;
    public String phone_number;
    public String position;
    public String password;
    public boolean isAdmin;
    public String email;


    public Teacher(String tea_id, String name,
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
}
