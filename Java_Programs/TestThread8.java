class Thread15 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("thread "+i);
        }
    }
}
class Thread16 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("thread "+i);
        }
    }
}
public class TestThread8 {
    public static void main(String args[]){
        Thread15 th15=new Thread15();
        Thread16 th16=new Thread16();
        th15.start();
        th16.start();
        System.out.println(th15);
        Thread ob=Thread.currentThread();
        System.out.println(ob);
    }
}
