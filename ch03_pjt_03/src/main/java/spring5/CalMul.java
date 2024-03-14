package spring5;

public class CalMul implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {
		int res = firstNum * secondNum;
		return res;
	}

}
