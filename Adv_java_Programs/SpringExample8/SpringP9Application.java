package com.example.springp9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;


public class SpringP9Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("templates/bean.xml");
        Report robobj = (Report) appcont.getBean("rob");
        Set<Employee> setemp = robobj.getSetemp();
        System.out.println(setemp);

    }

}
