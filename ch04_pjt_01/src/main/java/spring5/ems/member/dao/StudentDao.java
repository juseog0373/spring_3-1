package spring5.ems.member.dao;

import spring5.ems.member.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    private Map<String, Student> studentDB = new HashMap<String, Student>();

    // db에 insert 역할(삽입)
    public void insert(Student student) {
        studentDB.put(student.getsNum(), student);
    }

    public Student select(String sNum) {
        return studentDB.get(sNum);
    }

    public void update(Student student) {
        studentDB.put(student.getsNum(), student);
    }

    public void delete(String sNum) {
        studentDB.remove(sNum);
    }

    public Map<String, Student> getStudentDB() {
        return studentDB;
    }

}
