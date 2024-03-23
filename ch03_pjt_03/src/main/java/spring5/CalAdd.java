package spring5;

public class CalAdd implements ICalculator {

	public CalAdd() { // 기본 생성자 호출(applicationContext에서 등록된 자바 빈 객체가 기본 생성자로 접근하여 호출하기 때문이다)
		System.out.println("CalAdd.CalAdd");
	}

	@Override
	public int doOperation(int firstNum, int secondNum) {
		int sum = firstNum+secondNum;
		return sum;
	}
	
}
