package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Course extends Model {

    String co_id;
    String name;
    String isteacher;
    String time;


}
