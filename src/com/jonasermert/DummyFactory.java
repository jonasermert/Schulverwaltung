package com.jonasermert;

public class DummyFactory {

    public static Teacher createTeacher() {
        var teacher = new Teacher();
        teacher.setFirstName(getRandom(FIRST_NAMES));
        teacher.setLastName(getRandom(LAST_NAMES));
        teacher.setBirthday(createDate());
        teacher.setEntryDate(createDate());
        return teacher;
    }

    public static Class createClass() {
        var schoolClass = new Class();
        schoolClass.setDescription(getRandom(CLASSES));
        return schoolClass;
    }

    public static Student createStudent() {
        var student = new Student();
        student.setFirstName(getRandom(FIRST_NAMES));
        student.setLastName(getRandom(LAST_NAMES));
        student.setBirthday(createDate());
        student.setEntryDate(createDate());
        return student;
    }

    public static Group createGroup() {
        var group = new Group();
        group.setDescription(getRandom(GROUPS));
        return group;
    }

    private static Date createDate() {
        long millisecs = (long) (Math.random() * 1000000000000l);
        return new Date(millisecs);
    }

    private static String getRandom(String[] strings) {
        return strings[(int) (Math.random() * strings.length)];
    }

    private static final String[] FIRST_NAMES = { "Kirk", "James", "Lars", "Robert", "Elvis", "Lemmy", "Bruce", "Tony" };
    private static final String[] LAST_NAMES = { "Hammett", "Hetfield", "Ulrich", "Trujillo", "Presley", "Kilmister", "Dickinson", "Iommy" };
    private static final String[] GROUPS = { "Gitarre", "Gesang", "Schlagzeug", "Bass", "Keyboard", "Triangel" };
    private static final String[] CLASSES = { "11a", "12b", "10c", "9d", "9e", "9a", "9z", "11b" };



}
