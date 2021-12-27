class Thread3 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("thread "+getName());
            //The getName() method of thread class is used to return the name of thread.
        }
    }
}
class Thread4 extends Thread{
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("thread "+getName());
        }
    }
}
public class TestThread2{
    public static void main(String args[]){
        Thread1 th1=new Thread1();
        Thread2 th2=new Thread2();
        th1.start();
        th2.start();
    }
}



