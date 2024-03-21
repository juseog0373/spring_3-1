package spring5;

public class MyCalculator {

	// 기본생성자(생략 가능, 자바 컴파일러가 실행되면서 자동으로 생성해줌), 자바 빈 객체가 기본생성자로 접근 함
	public MyCalculator() {}
	
	public void calculate(int fNum, int sNum, ICalculator calculator) {
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result = "+value);
	}
}
