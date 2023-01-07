package com.StudentManagementSystem.SMS;

import java.util.HashMap;

public class StudentRepository {

    HashMap<String, Student> studentDb = new HashMap<>();

    public void addStudentToDb(Student student) {
        studentDb.put(student.getName(), student);
    }
    public Student getStudentFromDb(String name) {
        return studentDb.get(name);
    }
}