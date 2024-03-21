package spring5;

public class CalAdd implements ICalculator {

	public CalAdd() {
		System.out.println("CalAdd.CalAdd");
	}

	@Override
	public int doOperation(int firstNum, int secondNum) {
		int sum = firstNum+secondNum;
		return sum;
	}
	
}
