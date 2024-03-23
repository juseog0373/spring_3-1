package spring5;

public interface ICalculator {

	public int doOperation(int firstNum, int secondNum); // 추상메서드정의(인터페이스엔 구현체를 구현하지않는다. 구현체는 메서드를 오버라이딩하여 재정의한다. 인터페이스는 메서드 정의만 한다)
}
