class MyThread6 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii " +Thread.currentThread().getName());
    }
}


public class ThreadGroup6 {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("Peoplegrp");//parent thread

        ThreadGroup tg2 = new ThreadGroup(tg1,"Javagrp");//child thread

         //getParent() method
        System.out.println("parent thread is: "+tg1.getParent());
        System.out.println("parent thread is: "+tg2.getParent());
        MyThread6 obj6 = new MyThread6();
        Thread t1 = new Thread(tg1, obj6, "thread1");
        Thread t2 = new Thread(tg1, obj6, "thread2");
        Thread t3 = new Thread(tg1, obj6, "thread3");

        t1.start();
        t2.start();
        t3.start();



    }

}

