package spring5.ems.member.service;

import spring5.ems.member.dao.StudentDao;

public class StudentSelectService {
    private StudentDao studentDao;

    public StudentSelectService() {
    }

    public StudentSelectService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}