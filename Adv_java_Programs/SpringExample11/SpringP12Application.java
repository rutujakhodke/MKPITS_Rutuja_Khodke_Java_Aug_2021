package com.example.springp12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringP12Application {

    public static void main(String[] args) {
        ApplicationContext appcontext=new ClassPathXmlApplicationContext("/templates/bean.xml");
        Employee empobj = (Employee) appcontext.getBean("emp");
        empobj.display();

        Employee empobj1 = (Employee) appcontext.getBean("emp");
        empobj1.display();

//        Account accobj = (Account) appcontext.getBean("acc");
//        accobj.trans();

        if (empobj==empobj1){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }

}
