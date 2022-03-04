package com.example.springp21;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect2 {
    //the getId() method is called of all classes that is present in same package
    //@Before("execution(public int getId())") //it will print getId() method of Employee class as well as Student class

    //to call the specific method of a specific class then we have give package name with class name
    //@Before("execution(public int com.example.springp21.Student.getId())")

    //@Before("execution(public * get*())") //* is a wild card character
    //it will match signature of method

    //we can use setter method also with * wild character
    @Before("execution(public void set*(..))")

    public void beforeAdvice(){
        System.out.println("Before Target Method");
    }

//    @After("execution(public int getId())") //it is called Cut point expression
//
//    public void afterAdvice(){
//        System.out.println("After Target Method");
//    }
}
