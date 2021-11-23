package com.jonasermert.repository.access;

import com.jonasermert.repository.access.interfaces.*;

public class AccessFactory {

    public static IClassDataAccess getClassDataAccess() {
        return new ClassDataAccess();
    }

    public static IGroupDataAccess getGroupDataAccess() {
        return new GroupDataAccess();
    }

    public static IPersonDataAccess getPersonDataAccess() {
        return new PersonDataAccess();
    }

    public static IStudentDataAccess getStudentDataAccess() {
        return new StudentDataAccess();
    }

    public static ITeacherDataAccess getTeacherDataAccess() {
        return new TeacherDataAccess();
    }
}
