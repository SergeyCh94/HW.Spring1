package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Person person = context.getBean("person", Person.class);
        person.intoCar();

        Car car1 = context.getBean("car", Car.class);
        Car car2 = context.getBean("car", Car.class);

        System.out.println(car1 == car2);

        context.close();
    }
}
