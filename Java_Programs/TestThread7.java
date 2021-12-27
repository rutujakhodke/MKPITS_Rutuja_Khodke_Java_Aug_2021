class Thread13 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("thread "+isAlive());
        }
    }
}
class Thread14 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("thread "+isAlive());
        }
    }
}
public class TestThread7 {
    public static void main(String args[]){
        Thread13 th13=new Thread13();
        Thread14 th14=new Thread14();
        th13.start();
        th14.start();
    }
}
