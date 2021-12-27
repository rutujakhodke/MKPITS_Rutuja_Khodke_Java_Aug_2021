class Thread11 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            //The getThreadGroup() method of thread class is used to return the thread's thread group to which this thread belongs.
            System.out.println("thread "+getThreadGroup());
        }
    }
}
class Thread12 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){

            System.out.println("thread "+getThreadGroup());
        }
    }
}
public class TestThread6 {
    public static void main(String args[]){
        Thread11 th11=new Thread11();
        Thread12 th12=new Thread12();
        th11.start();
        th12.start();
    }
}
