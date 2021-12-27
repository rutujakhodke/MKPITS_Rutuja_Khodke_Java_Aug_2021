class Thread7 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            //The getPriority() method of thread class is used to check the priority of the thread.
            System.out.println("thread "+getPriority());
        }
    }
}
class Thread8 extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("thread " + getPriority());
        }
    }
}
public class TestThread4 {
    public static void main(String args[]){
        Thread5 th7=new Thread5();
        Thread6 th8=new Thread6();
        th7.start();
        th8.start();
    }
}

