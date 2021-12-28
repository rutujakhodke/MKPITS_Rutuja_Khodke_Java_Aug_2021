class Thread17 extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("A-thread ");
        }
    }
}
public class TestThread10 {
    public static void main(String args[]){
        Thread17 a1=new Thread17();
        Thread17 a2=new Thread17();
        Thread17 a3=new Thread17();
        Thread17 a4=new Thread17();
        Thread17 a5=new Thread17();
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
