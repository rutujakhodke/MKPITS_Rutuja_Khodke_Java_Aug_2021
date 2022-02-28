package com.example.springp7;

public class Account {
    Employee eobj;

    public Employee getEobj() {
        return eobj;
    }

    public Account(Employee eobj) {
        this.eobj = eobj;
    }
    void trans(){
        System.out.println(eobj.getName()+" Transaction processed by Id:"+eobj.getId()+" successfully");
    }
}
