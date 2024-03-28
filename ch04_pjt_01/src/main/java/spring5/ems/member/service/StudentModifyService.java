package spring5.ems.member.service;

import spring5.ems.member.Student;
import spring5.ems.member.dao.StudentDao;

public class StudentModifyService {
    private StudentDao studentDao;

    public StudentModifyService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentModifyService() {
    }

    public void modify(Student student) {
        if (verify(student.getsNum())) {
            studentDao.update(student);
        } else {
            System.out.println("검색된 학생이 없음.");
        }
    }

    public boolean verify(String sNum) {
        Student student = studentDao.select(sNum); // 해당 학번을 조회해서 Student 객체로 반환
        return student != null ? true : false;
    }
}
