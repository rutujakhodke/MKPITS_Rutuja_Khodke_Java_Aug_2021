package com.example.springp23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;


public class SpringP23Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("bean.xml");
        try{
            DriverManagerDataSource source = appcont.getBean("datasource", DriverManagerDataSource.class);
            Connection connection = source.getConnection();

//      Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver class loaded");
//        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/springdb","root","root");
//            System.out.println("Connection established");
    }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }

}
