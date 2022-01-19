interface inter2{
    public static void name1(){
        System.out.println("Static method in Interface");
    }
}
class imp3 implements inter2{

}
public class StaticFunc {
    public static void main(String[] args){
        imp3 obj1=new imp3();
        inter2.name1();//because name1() is static method and static method is not override ,so the name1() method is called by  interface name
        //inter2
    }
}
