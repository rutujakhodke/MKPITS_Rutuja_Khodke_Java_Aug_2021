class MyThread3 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii " +Thread.currentThread().getName());
    }
}


public class ThreadGroup3 {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("Peoplegrp");
        ThreadGroup tg2 = new ThreadGroup(tg1,"Javagrp");
        ThreadGroup tg3 = new ThreadGroup(tg1,"Employeegrp");

        //System.out.println("Thread group is: " + tg1);

        MyThread3 obj3 = new MyThread3();
        Thread t1 = new Thread(tg1, obj3, "thread1");
        Thread t2 = new Thread(tg2, obj3, "thread2");
        Thread t3 = new Thread(tg3, obj3, "thread3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Number of Active count of Thread group are: " + tg1.activeGroupCount());


    }

}