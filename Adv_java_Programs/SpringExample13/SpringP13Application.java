package com.example.springp13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringP13Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("templates/bean.xml");
        Employee baseobj = (Employee) appcont.getBean("base");
        //System.out.println(baseobj);//it will print Employee object

        System.out.println(baseobj.getName());//it will print Employee field by using getter


        Employee eobj = (Employee) appcont.getBean("eob");
        //System.out.println(eobj);
        System.out.println(eobj.getId()+" "+ eobj.getCity());



    }

}
