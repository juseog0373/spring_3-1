package spring5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class); // applicationContext에 정의되어있는 빈 객체 calAssembler 가져오기
		calAssembler.assemble();

		ctx.close();
	}
}
