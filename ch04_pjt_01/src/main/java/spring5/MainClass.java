package spring5;

import org.springframework.context.support.GenericXmlApplicationContext;
import spring5.ems.member.Student;
import spring5.ems.member.service.*;
import spring5.ems.member.util.InitSampleData;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("classpath:applicationContext.xml"); // 빈 객체가 정의되어있는 xml 파일 연결
        InitSampleData initSampleData = ac.getBean("initSampleData", InitSampleData.class); // 빈에 등록된 initSampleData 객체를 가져옴

        String[] sNums = initSampleData.getsNums();
        String[] sIds = initSampleData.getsIds();
        String[] sPws = initSampleData.getsPws();
        String[] sNames = initSampleData.getsNames();
        int[] sAges = initSampleData.getsAges();
        char[] sGenders = initSampleData.getsGenders();
        String[] sMajors = initSampleData.getsMajors();

        // 데이터베이스에 샘플 데이터 등록
        StudentRegisterService registerService = ac.getBean("studentRegisterService", StudentRegisterService.class);

        // 데이터의 길이(sNum.length)만큼 반복을 하여 student 객체를 생성해서 registerService.register(map put)작업을 하게 됨
        for (int i = 0; i < sNums.length; i++) {
            registerService.register(new Student(sNums[i], sIds[i], sPws[i], sNames[i], sAges[i], sGenders[i], sMajors[i]));
        }

        PrintStudentInformationService printStudentInformationService = ac.getBean("printStudentInformationService", PrintStudentInformationService.class);
        printStudentInformationService.printStudentInfo(); // 학생 리스트 전부 출력

        // 학생 등록
        registerService.register(new Student("hbs006", "dear", "p0006", "melissa", 25, 'W', "Music"));
        printStudentInformationService.printStudentInfo(); // 학생 리스트 전부 출력

        StudentSelectService studentSelectService = ac.getBean("studentSelectService", StudentSelectService.class);
        Student selectedStudent = studentSelectService.select("hbs001");

        System.out.println("STUDENT START ------------------");
        System.out.print("sNum:" + selectedStudent.getsNum() + "\t");
        System.out.print("|sId:" + selectedStudent.getsId() + "\t");
        System.out.print("|sPw:" + selectedStudent.getsPw() + "\t");
        System.out.print("|sName:" + selectedStudent.getsName() + "\t");
        System.out.print("|sAge:" + selectedStudent.getsAge() + "\t");
        System.out.print("|sGender:" + selectedStudent.getsGender() + "\t");
        System.out.println("|sMajor:" + selectedStudent.getsMajor());
        System.out.println("END ----------------------------");

        // 특정 학번 정보 수정
        StudentModifyService studentModifyService = ac.getBean("studentModifyService", StudentModifyService.class);
        studentModifyService.modify(new Student("hbs006", "dear", "p0006", "melissa", 25, 'M', "Computer"));
        printStudentInformationService.printStudentInfo();

        // 학생 삭제
        StudentDeleteService studentDeleteService = ac.getBean("studentDeleteService", StudentDeleteService.class);
        studentDeleteService.delete("hbs006");
        printStudentInformationService.printStudentInfo();
    }
}