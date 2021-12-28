class Thread20 extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("A-thread ");
        }
    }
}
public class TestThread12 {
    public static void main(String args[]){
        Thread20 a1=new Thread20();
        Thread20 a2=new Thread20();
        Thread20 a3=new Thread20();
        Thread20 a4=new Thread20();
        Thread20 a5=new Thread20();

        a1.setPriority(10);
        System.out.println(a1);

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
