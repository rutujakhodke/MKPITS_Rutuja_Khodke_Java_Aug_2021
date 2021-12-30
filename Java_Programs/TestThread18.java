class Thread25 extends Thread{

    public void run(){
    for(int i=0;i<=5;i++) {
        //System.out.println("Hii " +getName() + isDaemon());
        if(isDaemon()==true){
            System.out.println(getName() + " is a Daemon Thread");
        } else{
            System.out.println(getName() + " is not Daemon Thread");
        }
    }
    }
}


public  class TestThread18 {
        public static void main(String[] args){
            Thread25 obj1=new Thread25();
            Thread25 obj2=new Thread25();
            Thread25 obj3=new Thread25();
            obj1.start();
            obj2.setDaemon(true);
            obj2.start();
            obj3.start();
}
}

