package spring5.ems.member;

public class Student {
    private String sNum;
    private String sId;
    private String sPw;
    private String sName;
    private int sAge;
    private char sGender;
    private String sMajor;

    public void setsNum() {

    }

    public Student() {

    }

    public Student(String sNum, String sId, String sPw, String sName, int sAge, char sGender, String sMajor) {
        this.sNum = sNum;
        this.sId = sId;
        this.sPw = sPw;
        this.sName = sName;
        this.sAge = sAge;
        this.sGender = sGender;
        this.sMajor = sMajor;
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsPw() {
        return sPw;
    }

    public void setsPw(String sPw) {
        this.sPw = sPw;
    }
}

