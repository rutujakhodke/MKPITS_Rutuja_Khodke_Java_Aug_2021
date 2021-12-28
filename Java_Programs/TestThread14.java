class Thread22 extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("A-thread "+getName());
        }
    }
}
public class TestThread14 {
    public static void main(String args[]){
        Thread22 a1=new Thread22();
        Thread22 a2=new Thread22();

        a1.start();
        a2.start();

        System.out.println(a2.getName()+"="+a2.isAlive());
        try{
            a2.join();
            System.out.println(a2.getName()+"="+a2.isAlive());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

