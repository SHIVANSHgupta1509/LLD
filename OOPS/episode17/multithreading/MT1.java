class  Thread1 implements Runnable{

    @Override
    public  void run(){

        System.out.println("Hey");
        System.out.println(10/0);

    }
}
class Thread2 extends Thread{

    @Override
    public void run(){
        System.out.println(10/0);
    }
}
class MT1{

    public static void main(String[] args) {
        
        // System.out.println(10/0);
        // Thread1 t=new Thread1();
        // Thread t1=new Thread(t);
        // t1.start();

        Thread2 t2=new Thread2();
        t2.run();//main thread pe chlega
        t2.start();//MAIN KE ALAVA kisi thread pe chlega
    }
}