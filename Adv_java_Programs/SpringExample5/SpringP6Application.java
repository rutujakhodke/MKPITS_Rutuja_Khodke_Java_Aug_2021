package com.example.springp6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringP6Application {

    public static void main(String[] args) {
        ApplicationContext appcontext=new ClassPathXmlApplicationContext("/templates/bean.xml");
        Employee empobj = (Employee) appcontext.getBean("eobj");
        empobj.display();

        Account accobj = (Account) appcontext.getBean("acc");
        accobj.trans();
    }

}
