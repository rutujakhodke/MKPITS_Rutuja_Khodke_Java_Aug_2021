package com.example.springp14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringP14Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("templates/bean.xml");
        Employee baseobj = (Employee) appcont.getBean("base");
        System.out.println(baseobj);

        Employee eobj1 = (Employee) appcont.getBean("eob");
        System.out.println(eobj1);
    }

}
