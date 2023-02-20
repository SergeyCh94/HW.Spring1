package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context.getBean("customPerson", Person.class);
        person.intoCar();

        Car car1 = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);

        System.out.println(car1 == car2);

        context.close();
    }
}
