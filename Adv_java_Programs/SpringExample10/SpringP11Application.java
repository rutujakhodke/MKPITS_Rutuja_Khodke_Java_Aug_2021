package com.example.springp11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;


public class SpringP11Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("templates/bean.xml");
        Report robobj = (Report) appcont.getBean("rob");
        Properties listemp = robobj.getListemp();
        System.out.println(listemp);
    }

}
