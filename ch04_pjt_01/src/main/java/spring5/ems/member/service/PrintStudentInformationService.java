package spring5.ems.member.service;

import spring5.ems.member.Student;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintStudentInformationService {

    StudentAllSelectService allSelectService;

    public PrintStudentInformationService(StudentAllSelectService allSelectService) {
        this.allSelectService = allSelectService;
    }

    public void printStudentInfo() {
        Map<String, Student> allStudent = allSelectService.allSelect();
        Set<String> keys = allStudent.keySet(); // key 값 저장(HBS001~005...)
        // iterator 함수 호출(반복자) -> 컬렉션 타입의 객체들을 반복하여 첫번째 원소부터 마지막 원소를 뽑아낼때 사용
        Iterator<String> iterator = keys.iterator();
        System.out.println("STUDENT LIST START -------------");
        while (iterator.hasNext()) { // hasNext() 다음 원소가 있는지? 조건으로 계속 반복
            String key = iterator.next();
            Student student = allStudent.get(key);
            System.out.print("sNum:" + student.getsNum() + "\t");
            System.out.print("|sId:" + student.getsId() + "\t");
            System.out.print("|sPw:" + student.getsPw() + "\t");
            System.out.print("|sName:" + student.getsName() + "\t");
            System.out.print("|sAge:" + student.getsAge() + "\t");
            System.out.print("|sGender:" + student.getsGender() + "\t");
            System.out.println("|sMajor:" + student.getsMajor() + "\t");

        }
        System.out.println("END ----------------------------");
    }
}
