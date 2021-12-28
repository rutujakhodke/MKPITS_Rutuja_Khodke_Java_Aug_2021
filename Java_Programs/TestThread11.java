class Thread19 extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("A-thread "+getName());
        }
    }
}
public class TestThread11 {
    public static void main(String args[]){
        Thread18 a1=new Thread18();
        Thread18 a2=new Thread18();
        Thread18 a3=new Thread18();
        Thread18 a4=new Thread18();
        Thread18 a5=new Thread18();

        a1.setName("Rutuja");
        a2.setName("Shruti");
        a3.setName("Sam");
        a4.setName("James");
        a5.setName("Scott");


        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
