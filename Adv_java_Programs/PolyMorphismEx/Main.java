package com.company;

public class Main {

    public static void main(String[] args) {

//        Account obj=new Saving();//compile time polymorphism
//        obj.withdraw();
//
//        Account obj1= new Current();
//        obj1.withdraw();

        Decide obj1=new Decide();
        //obj1.checkobj(new Current());
        obj1.checkobj(new Saving());
    }
}
