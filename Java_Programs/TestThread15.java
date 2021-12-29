class Thread23 implements Runnable{
   Thread t;
   public Thread23(){
       t=new Thread(this);
       t.start();
   }
    @Override
    public void run() {
       System.out.println("Hiii");
   }
}
public class TestThread15 {
    public static void main(String[] args){
        Thread23 th23=new Thread23();
        Thread23 th2=new Thread23();

    }

}
