package com.jonasermert.repository.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("L")
public class Teacher {

    public static final String LEHRER_BY_NACHNAME = "LEHRER_BY_NACHNAME";

    @OneToOne(mappedBy = "teacher")
    private Class schoolClass;


}
