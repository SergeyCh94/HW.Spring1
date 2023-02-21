package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Transport transport;

    @Autowired
    public Person(@Qualifier("car") Transport transport) {
        this.transport = transport;
    }


    void intoCar(){
        System.out.println("Владелец сел в автомобиль");
        transport.go();
    }

    void intoMoto(){
        System.out.println("Владелец сел на мотоцикл");
        transport.go();
    }
}
