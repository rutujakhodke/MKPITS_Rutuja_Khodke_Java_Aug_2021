package com.company;

public class Decide {
    void checkobj(Account obj){
       //obj.withdraw();//run time  polymorphism

        //((Current) obj).odFacility();

        if (obj instanceof Current){
            Current obj1= (Current) obj;
            obj1.withdraw();
            obj1.odFacility();
        }
        if (obj instanceof Saving){
            Saving sobj= (Saving) obj;
            sobj.withdraw();
        }
    }
}
