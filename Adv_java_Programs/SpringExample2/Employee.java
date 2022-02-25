package com.example.springp1;

public class Employee {
    int id; //value is injected through setter method so it is called setter injection
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println("hello " +getId()+" "+getName());
    }
}
