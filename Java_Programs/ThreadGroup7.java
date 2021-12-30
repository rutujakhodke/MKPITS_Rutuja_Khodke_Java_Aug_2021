class MyThread7 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii " +Thread.currentThread().getName());
    }
}


public class ThreadGroup7 {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("Peoplegrp");//parent thread

        ThreadGroup tg2 = new ThreadGroup(tg1,"Javagrp");//child thread
        //list() method
        tg1.list();

         //isDaemon() method
        tg1.isDaemon();
        System.out.println("Daemon threadgrp "+tg1.isDaemon());
        tg2.isDaemon();
        System.out.println("Daemon threadgrp  "+tg2.isDaemon());
        MyThread7 obj7 = new MyThread7();
        Thread t1 = new Thread(tg1, obj7, "thread1");
        Thread t2 = new Thread(tg1, obj7, "thread2");
        Thread t3 = new Thread(tg1, obj7, "thread3");

        t1.start();
        t2.start();
        t3.start();



    }

}


