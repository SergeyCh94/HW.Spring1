package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("customPerson", Person.class);
        person.intoCar();

        context.close();
    }
}
