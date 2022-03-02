package com.example.springp17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Account {
    Employee eobj;

    public Employee getEobj() {
        return eobj;
    }
@Autowired //it will search byType first .byType is default then it will search for byName
//when more than one bean is present in bean.xml file then byName is used

@Qualifier("MyBean") //when there is no byName or byType is found
    public void setEobj(Employee eobj) {
        this.eobj = eobj;
    }
    void display(){
        System.out.println(eobj.getId()+" "+eobj.getName());
    }
}
