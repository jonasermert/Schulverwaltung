package com.jonasermert.repository.entities;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("S")
public class Student {

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Class schoolClass;

    @ManyToMany(mappedBy = "students", cascade = CascadeType.PERSIST)
    private List<Group> groups;

    public Class getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(Class schoolClass) {
        this.schoolClass = schoolClass;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group g) {
        if(groups == null) groups = new ArrayList<Group>();
        groups.add(g);

        g.addStudent(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Klasse: " + schoolClass.getDescription();
    }

}
