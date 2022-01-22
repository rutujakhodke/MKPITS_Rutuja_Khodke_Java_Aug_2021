interface inf3{
    void display();
}
class Test3{
    public Test3(){
        System.out.println("My Constructor");
    }
}

public class MethodRefEx3 {
    public static void main(String[] args){
//        inf1 obj=() -> System.out.println("Interface 1");//lambda function
//        obj.display();
        Test3 obj1=new Test3();
        inf1 obj=Test3::new;//method reference (constructor reference method)
        obj.display();


    }
}


