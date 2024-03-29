package org.example.referenceExaple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
        A temp = (A) context.getBean("aRef");
        System.out.println(temp.getX());
        System.out.println(temp.getOb());
        System.out.println(temp.getOb().getY());
    }
}
java sring boot practive