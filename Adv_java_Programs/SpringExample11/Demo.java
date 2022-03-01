package com.example.springp12;

public class Demo {
    public static void main(String[] args) {
        Singledemo obj1=Singledemo.getObj();//In singleton class we make only one instance of class
        Singledemo obj2=Singledemo.getObj();

        if(obj1==obj2){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
class Singledemo{
     static Singledemo obj=new Singledemo();
     private Singledemo(){

     }
     static Singledemo getObj(){
         return obj;
     }
}