package com.example.springp22;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect3 {

    //we can add 2 advice method for getter method of all class
//    @Before("execution(public * get*())")
//
//    public void beforeAdvice(){
//        System.out.println("Before Target Method");
//    }
//
//    @Before("execution(public * get*())")
//
//    public void beforeAdvice2(){
//        System.out.println("Before Target Method2");
//    }

//    @Before("allgetter()")
//
//    public void beforeAdvice(){
//        System.out.println("Before Target Method");
//    }
//
//    @Before( "allgetter()")
//
//    public void beforeAdvice2(){
//        System.out.println("Before Target Method2");
//    }
//
//    //when we use 2 beforeadvice() method on getter method of class ,instead of that we use annotation @Pointcut ,in that we pass package name and
//    //declare one dummy method ,we pass that dummy method to the @before annotation.we don't need to declare more than one beforeadvice method.
//    @Pointcut("within(com.example.springp22.*)")
//      public void allgetter(){}


    //for which target method beforeadvice() method is run , this information is given by JoinPoint .
    @Before("execution(public * get*())")
     public void beforeAdvice(JoinPoint point){
     System.out.println("Before Target Method" +point.toString());
        Employee target = (Employee) point.getTarget();
        target.getName();

//        if(point instanceof Employee){
//            Employee target = (Employee) point.getTarget();
//        target.getName();
//        }
//        if (point instanceof Student){
//            Student target = (Student) point.getTarget();
//            target.getName();
//        }
    }


    @AfterThrowing("execution(public void printThrowException())")
    public void exceptionadvice(JoinPoint point){
        System.out.println("exception raised");
    }


//    @After("execution(public int getId())") //it is called Cut point expression
//
//    public void afterAdvice(){
//        System.out.println("After Target Method");
//    }
}

