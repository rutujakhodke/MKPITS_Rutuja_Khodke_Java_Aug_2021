interface inf1{
    void display();
}
//class impl1 implements inf1{
    //@Override
    //public void display() {
        //System.out.println("Welcome");
    //}
//}
public class Demo {
    public static void main(String[] args){
        inf1 obj=() ->System.out.println("Welcome");//lambda function
        obj.display();
    }
}
