class Thread9 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            //The getState() method of thread class returns the thread's state.
            System.out.println("thread "+getState());
        }
    }
}
class Thread10 extends Thread{
    public void run(){
        for(int i=0;i<=6;i++){
            System.out.println("thread "+getState());
        }
    }
}
public class TestThread5 {
    public static void main(String args[]){
        Thread5 th9=new Thread5();
        Thread6 th10=new Thread6();
        th9.start();
        th10.start();
    }
}

