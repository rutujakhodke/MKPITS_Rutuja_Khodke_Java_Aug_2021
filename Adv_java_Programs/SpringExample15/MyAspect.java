package com.example.springp19;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


//we have to configure the aspect code we want that specific method
@Aspect //we have to add dependency in pom.xml file to enable the aspect annotation
public class MyAspect {
@Before("execution( public String getName())")
    public void beforeAdvice(){
        System.out.println("Before Target Method");
    }
    @After("execution( public String getName())")
    public void afterAdvice(){
        System.out.println("After Target Method");
    }
}
