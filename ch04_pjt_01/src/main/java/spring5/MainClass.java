package spring5;

import org.springframework.context.support.GenericXmlApplicationContext;
import spring5.ems.member.Student;
import spring5.ems.member.service.StudentRegisterService;
import spring5.ems.member.util.InitSampleData;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        InitSampleData initSampleData = ac.getBean("initSampleData", InitSampleData.class);

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
    }
}