class MyThread5 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii " +Thread.currentThread().getName());
    }
}


public class ThreadGroup5 {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("Peoplegrp");
        //getPriority() method
        //System.out.println("Maximum priority of Thread group is: "+tg1.getMaxPriority());

        ThreadGroup tg2 = new ThreadGroup("Peoplegrp");
        //System.out.println("Maximum priority of Thread group is: "+tg2.getMaxPriority());

        //setPriority() method
        tg1.setMaxPriority(5);
        System.out.println("Maximum priority of Thread group is: "+tg1.getMaxPriority());

        tg2.setMaxPriority(1);
        System.out.println("Maximum priority of Thread group is: "+tg2.getMaxPriority());


        MyThread5 obj5 = new MyThread5();
        Thread t1 = new Thread(tg1, obj5, "thread1");
        Thread t2 = new Thread(tg1, obj5, "thread2");
        Thread t3 = new Thread(tg1, obj5, "thread3");

        t1.start();
        t2.start();
        t3.start();



    }

}
