class Box{
    synchronized void display(String s){
        System.out.print(" [ "+s);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print(" ] ");
    }
}
class Thread24 implements Runnable{
    Thread t;
    String sob;
    Box b;
    Thread24(Box bo,String str){
        b=bo;
        sob=str;
        t=new Thread(this);
        t.start();


    }
    @Override
    public void run() {
        b.display(sob);

    }
}

public class TestThread17 {
    public static void main(String args[]){
        Box bx=new Box();
        Thread24 obj=new Thread24(bx,"Ram");
        Thread24 obj1=new Thread24(bx,"Shyam");
        Thread24 obj2=new Thread24(bx,"Sam");
    }
}
