class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hii " +Thread.currentThread().getName());
    }
}


public class ThreadGroup1 {
    public static void main(String[] args){
        ThreadGroup tg=new ThreadGroup("Peoplegrp");
        System.out.println("Thread group is: "+tg);

        MyThread1 obj1=new MyThread1();
        Thread t1=new Thread(tg,obj1,"one");
        Thread t2=new Thread(tg,obj1,"two");
        Thread t3=new Thread(tg,obj1,"three");
        Thread t4=new Thread(tg,obj1,"four");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(t1);
        System.out.println(t2);

    }


 }
