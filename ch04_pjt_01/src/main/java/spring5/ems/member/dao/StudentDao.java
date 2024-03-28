package spring5.ems.member.dao;

import spring5.ems.member.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {

    // 다형성을 활용한 Map(부모) HashMap(자식) 생성
    // HashMap으로 저장 시 원하는 순서대로 저장되지 않고 HashFunction을 통해 저장이 돼서 원하는 인덱스가 나오지않는다.
    private Map<String, Student> studentDB = new HashMap<>();

    public StudentDao() {
        //  기본생성자
        System.out.println("StudentDao.StudentDao");
    }

    public void insert(Student student) { //등록
        studentDB.put(student.getsNum(), student);
    }

    public Student select(String sNum) { //검색
        return studentDB.get(sNum);
    }

    public void update(Student student) { //수정
        studentDB.put(student.getsNum(), student);
    }

    public void delete(String sNum) { // 삭제
        studentDB.remove(sNum);
    }

    public Map<String, Student> getStudentDB() { //학생들의 모든 정보(객체) 리턴
        return studentDB;
    }
}
