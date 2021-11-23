package com.jonasermert.repository.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String description;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Teacher teacher;

    @OneToMany(mappedBy = "schoolClass", cascade = CascadeType.PERSIST)
    private List<Student> students;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }




}
