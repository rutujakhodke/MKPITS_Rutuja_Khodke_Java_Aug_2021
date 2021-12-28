class Thread18 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            if(getName().equals("Thread-5")){
                System.out.println("Hii");
            }
            System.out.println("A-thread "+getName());
        }
    }
}
public class TestThread9 {
    public static void main(String args[]){
        Thread18 a1=new Thread18();
        Thread18 a2=new Thread18();
        Thread18 a3=new Thread18();
        Thread18 a4=new Thread18();
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        Thread18 a5=new Thread18();
        a5.start();
        Thread18 a6=new Thread18();
        a6.start();
    }
}
