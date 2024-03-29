package org.example.constuctorIngestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorIngConfig.xml");

        person p = (person) context.getBean("person");

        Addition add = (Addition) context.getBean("add");
        add.doSum();

        System.out.println(p);

    }
}
