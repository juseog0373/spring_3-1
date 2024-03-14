package spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
//        TransportationWalk tw = new TransportationWalk();
//        tw.move();
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        TransportationWalk tw = ctx.getBean("tw", TransportationWalk.class);
        tw.move();

        ctx.close();
    }
}