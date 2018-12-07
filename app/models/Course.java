package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Course extends Model {

    String name;
}
