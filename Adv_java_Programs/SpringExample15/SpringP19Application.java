package com.example.springp19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringP19Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("bean.xml");
        Student sobj = appcont.getBean("stud", Student.class);
        System.out.println(sobj.getId()+" "+sobj.getName()+" "+sobj.getCourse());
    }

}
