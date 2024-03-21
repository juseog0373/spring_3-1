package spring5;

public class CalAssembler {
	MyCalculator calculator;
    CalAdd calAdd;
    CalSub calSub;
    CalMul calMul;
    CalDiv calDiv;


    // 5개의 인자를 가진 생성자(AllArgsConstructor) 생성 후 this 접근자로 MyCalculator에 대입시킴
    public CalAssembler(MyCalculator calculator, CalAdd calAdd, CalSub calSub, CalMul calMul, CalDiv calDiv) {
        this.calculator = calculator;
        this.calAdd = calAdd;
        this.calSub = calSub;
        this.calMul = calMul;
        this.calDiv = calDiv;
    }

    public void assemble() {
        calculator.calculate(10, 5, calAdd);
        calculator.calculate(10, 5, calSub);
        calculator.calculate(10, 5, calMul);
        calculator.calculate(10, 5, calDiv);
    }
}
