interface inter1{
    public void name();
    default void name1(){//whenever we want to write new method in interface inter1 ,then we have to declare it as default.
        //we use this default method in any interface class.
    }
}
class imp1 implements inter1{

    @Override
    public void name() {
        System.out.println("Interface 1 method override");
    }
    //no need to override default method of interface
}

class imp2 implements inter1{

    @Override
    public void name() {
        System.out.println("Interface 1 method override of imp2 class");
    }
    //override default method of interface
    public void name1() {
        System.out.println("Interface 1 default method override");
    }
}
public class LambdaFunc {
    public static void main(String[] args){
        imp1 obj1=new imp1();
        obj1.name();
        imp2 obj2=new imp2();
        obj2.name();
        obj2.name1();
    }
}
