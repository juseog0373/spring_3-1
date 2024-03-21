package spring5.ems.member.service;

import spring5.ems.member.dao.StudentDao;

public class StudentModifyService {
    private StudentDao studentDao;

    public StudentModifyService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentModifyService() {
    }
}
