package spring5.ems.member.service;

public class PrintStudentInfomationService {
    StudentSelectService allSelectService;

    public PrintStudentInfomationService() {
    }

    public PrintStudentInfomationService(StudentSelectService allSelectService) {
        this.allSelectService = allSelectService;
    }
}
