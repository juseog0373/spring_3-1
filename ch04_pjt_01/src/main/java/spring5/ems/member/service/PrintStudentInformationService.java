package spring5.ems.member.service;

public class PrintStudentInformationService {
    StudentSelectService allSelectService;

    public PrintStudentInformationService() {
    }

    public PrintStudentInformationService(StudentSelectService allSelectService) {
        this.allSelectService = allSelectService;
    }
}
