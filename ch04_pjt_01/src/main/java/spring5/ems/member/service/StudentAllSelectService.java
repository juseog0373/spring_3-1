package spring5.ems.member.service;

import spring5.ems.member.Student;
import spring5.ems.member.dao.StudentDao;

import java.util.Map;

public class StudentAllSelectService {

    private StudentDao studentDao;

    public StudentAllSelectService() {
    }

    public StudentAllSelectService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Map<String, Student> allSelect(){
        return studentDao.getStudentDB();
    }
}
