package spring5.ems.member.service;

import spring5.ems.member.dao.StudentDao;

public class StudentDeleteService {
    private StudentDao studentDao;

    public StudentDeleteService() {
    }

    public StudentDeleteService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
