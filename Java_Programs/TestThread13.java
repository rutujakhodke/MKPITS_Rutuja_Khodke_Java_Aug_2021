import java.util.Objects;

class Thread21 extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("A-thread "+getName()+"  =:"+i);
        }
    }
}
public class TestThread13 {
    public static void main(String args[]) {
        Thread21 a1=new Thread21();
        Thread21 a2=new Thread21();
        Thread21 a3=new Thread21();
        Thread21 a4=new Thread21();
        Thread21 a5=new Thread21();

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();

        try {
            System.out.println("Thread is Suspended");
            a1.suspend();
            Thread.sleep(1000);
            System.out.println("Thread in sleep mode");
            System.out.println("Thread is Resuming");
            a1.resume();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

