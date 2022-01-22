interface inf1{
    void display();
}
class Test{
    public static void name(){
        System.out.println("Static method body");
    }
}
class Test1{
    public static void name1(){
        System.out.println("Static method body 1");//we can print multiple statements using method reference
        System.out.println("Static method body 2");
        System.out.println("Static method body 3");
        System.out.println("Static method body 4");
    }
}
public class MethodRefEx1 {
    public static void main(String[] args){
//        inf1 obj=() -> System.out.println("Interface 1");//lambda function
//        obj.display();

        inf1 obj=Test::name;//method reference (static method)
        obj.display();

        inf1 obj1=Test1::name1;
        obj1.display();
    }
}

