package ch02_pjt_01;

public class MyCalculator {

	public void calAdd(int fNum, int sNum) {
		ICalculator cal = new CalAdd();
		int value = cal.doOperation(fNum, sNum);
		System.out.println("result = "+value);
	}
	
	public void calDiv(int fNum, int sNum) {
		ICalculator cal = new CalDiv();
		int value = cal.doOperation(fNum, sNum);
		System.out.println("result = "+value);
	}
	
	public void calSub(int fNum, int sNum) {
		ICalculator cal = new CalSub();
		int value = cal.doOperation(fNum, sNum);
		System.out.println("result = "+value);
	}
	
	public void calMul(int fNum, int sNum) {
		ICalculator cal = new CalMul();
		int value = cal.doOperation(fNum, sNum);
		System.out.println("result = "+value);
	}
}
