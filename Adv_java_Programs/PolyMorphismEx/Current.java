package com.company;

public class Current implements Account{
    @Override
    public void withdraw() {
        System.out.println("current");
    }
    void odFacility(){
        System.out.println("od for current");
    }
}
