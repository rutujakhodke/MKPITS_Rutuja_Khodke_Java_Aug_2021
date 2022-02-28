package com.example.springp7;

public class Employee {
    int id;
    String name;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }


    void display(){
        System.out.println("Hello " +getId()+" " +getName());
    }
}
