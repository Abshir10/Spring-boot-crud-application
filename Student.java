package com.studentcrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long  id;
    private String name;
    private String course;
    private long fees;
public Student() {
 
}
public Student(long  id, String name, String course, long fees) {
this.id = id;
this.name = name;
this.course = course;
this.fees = fees;
}
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getStudentname() {
return name;
}
public void setStudentname(String name) {
this.name = name;
}
public String getCourse() {
return course;
}
public void setCourse(String course) {
this.course = course;
}
public long getFee() {
return fees;
}
public void setFee(long fees) {
this.fees = fees;
}

}
