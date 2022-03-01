package com.example.springp10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;


public class SpringP10Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("templates/bean.xml");
        Report robobj = (Report) appcont.getBean("rob");
        Map<Integer, Employee> mapemp = robobj.getMapemp();
        System.out.println(mapemp);

    }

}
