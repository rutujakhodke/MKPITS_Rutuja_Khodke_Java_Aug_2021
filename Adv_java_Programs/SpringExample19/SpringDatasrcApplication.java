package com.example.springdatasrc;

import com.example.springdatasrc.dao.Student1Daoimpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;


public class SpringDatasrcApplication {

    public static void main(String[] args) {

        ApplicationContext appcont=new ClassPathXmlApplicationContext("bean.xml");
        Student1Daoimpl template = appcont.getBean("stud1dao", Student1Daoimpl.class);
        Student1 sob=new Student1();
        sob.setId(14);
        sob.setName("Neha");
        sob.setCourse("C++");
        //template.insert(sob);

        //template.displaybyId(13);

        template.displayallrec();

        template.updaterecbyId(12);

        template.deleterecbyId(14);



        //this is for JdbcTemplate
//        String query="INSERT INTO Student (id,NAME,course) VALUES (?,?,?)";
//        int res = template.update(query, 13, "Gargi", "HTML");
//        System.out.println(res+ " record inserted");

    }

}
