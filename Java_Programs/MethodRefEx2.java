interface inf2{
    void display();
}
class Test2{
    public void name(){
        System.out.println("non-static method body");
    }
}

public class MethodRefEx2 {
    public static void main(String[] args){
//        inf1 obj=() -> System.out.println("Interface 1");//lambda function
//        obj.display();
        Test2 obj1=new Test2();
        inf1 obj=obj1::name;//method reference (no-static method)
        obj.display();


    }
}

