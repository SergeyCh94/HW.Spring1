package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Person person = context.getBean("person", Person.class);
        person.intoCar();
    }
}
