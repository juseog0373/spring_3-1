package spring5.ems.member.service;

import spring5.ems.member.Student;
import spring5.ems.member.dao.StudentDao;

public class StudentDeleteService {
    private StudentDao studentDao;

    public StudentDeleteService() {
    }

    public StudentDeleteService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void delete(String sNum) {
        if (verify(sNum)) {
            studentDao.delete(sNum);
        } else {
            System.out.println("검색된 학생이 없음.");
        }
    }

    public boolean verify(String sNum) {
        Student student = studentDao.select(sNum); // 해당 학번을 조회해서 Student 객체로 반환
        return student != null ? true : false;
    }
}
