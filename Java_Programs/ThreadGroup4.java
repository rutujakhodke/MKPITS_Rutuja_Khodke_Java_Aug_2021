class MyThread4 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii " +Thread.currentThread().getName());
    }
}


public class ThreadGroup4 {
    public static void main(String[] args) throws Exception{
        ThreadGroup tg1 = new ThreadGroup("Peoplegrp");
        ThreadGroup tg2 = new ThreadGroup("Javagrp");


        //System.out.println("Thread group is: " + tg1);

        MyThread4 obj4 = new MyThread4();
        Thread t1 = new Thread(tg1, obj4, "thread1");
        Thread t2 = new Thread(tg1, obj4, "thread2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

         tg1.destroy();
        System.out.println(tg1.getName() + " Thread group destroyed");

        tg2.destroy();
        System.out.println(tg2.getName() + " Thread group destroyed");


    }

}


