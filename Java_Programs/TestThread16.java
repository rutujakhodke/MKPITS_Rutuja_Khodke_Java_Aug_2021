class EvenThread implements Runnable{
  Thread t;
  EvenThread(){
      t=new Thread(this);
      t.start();
  }
    @Override
    public void run() {
     for(int i=0;i<=4;i++){
         if(i%2==0){
             System.out.println("Number is Even: "+t.getName());
         }
         //else{
           //  System.out.println("Number is Odd: "+t.getName());
         //}
     }
    }
}
class OddThread implements Runnable{
    Thread t;
    OddThread(){
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        for(int i=0;i<=3;i++){
            if(i%2==1){
                System.out.println("Number is Odd "+t.getName());
            }
        }
    }
}
public class TestThread16 {
    public static void main(String args[]){
        EvenThread et=new EvenThread();
        OddThread ot=new OddThread();


    }
}
