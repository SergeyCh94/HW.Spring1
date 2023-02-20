package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Moto moto = context.getBean("moto", Moto.class);

        moto.go();

        context.close();
    }
}
