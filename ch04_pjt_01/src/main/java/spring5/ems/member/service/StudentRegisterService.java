package spring5.ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring5.ems.member.Student;
import spring5.ems.member.dao.StudentDao;

public class StudentRegisterService {
    private StudentDao studentDao;

    public StudentRegisterService() {
    }

    public StudentRegisterService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void register(Student student) {
        if (verify(student.getsNum())) {
            studentDao.insert(student);
        }
    }

    public boolean verify(String sNum) {
        Student student = studentDao.select(sNum);
        return student == null ? true : false;
    }

}
