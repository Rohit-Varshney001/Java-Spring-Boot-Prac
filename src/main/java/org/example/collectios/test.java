package org.example.collectios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("Inside test");
        ApplicationContext context = new ClassPathXmlApplicationContext("cconfig.xml");

        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
    }
}
