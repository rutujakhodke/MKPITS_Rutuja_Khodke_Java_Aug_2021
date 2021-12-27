class Thread5 extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            //The getId() method is used to return the thread identifier.
            System.out.println("thread "+getId());
        }
    }
}
class Thread6 extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println("thread "+getId());
        }
    }
}
public class TestThread3 {
    public static void main(String args[]){
        Thread5 th5=new Thread5();
        Thread6 th6=new Thread6();
        th5.start();
        th6.start();
    }
}
