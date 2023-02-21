package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("customPerson", Person.class);
        person.intoCar();

        Car car1 = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);

        System.out.println(car1 == car2);

        context.close();
    }
}
