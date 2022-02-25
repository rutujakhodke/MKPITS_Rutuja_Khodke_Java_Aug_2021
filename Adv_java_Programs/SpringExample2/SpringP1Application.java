package com.example.springp1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringP1Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        Employee empobj = (Employee) appcont.getBean("emp");

        System.out.println(empobj.getId());
        System.out.println(empobj.getName());



        empobj.display();

    }

}
