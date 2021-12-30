class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii " +Thread.currentThread().getName());
    }
}


public class ThreadGroup2 {
    public static void main(String[] args){
        ThreadGroup tg1=new ThreadGroup("Peoplegrp");

        System.out.println("Thread group is: "+tg1);

        MyThread2 obj2=new MyThread2();
        Thread t1=new Thread(tg1,obj2,"thread1");
        Thread t2=new Thread(tg1,obj2,"thread2");
        Thread t3=new Thread(tg1,obj2,"thread3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Active count of Thread are: "+tg1.activeCount());


    }


}



