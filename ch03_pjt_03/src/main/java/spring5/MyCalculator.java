package spring5;

public class MyCalculator {

	public MyCalculator() {}
	
	public void calculate(int fNum, int sNum, ICalculator calculator) {
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result = "+value);
	}
}
