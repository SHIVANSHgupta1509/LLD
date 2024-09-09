class Multithreading1 implements Runnable{

    Multithreading1() {
        System.out.println(Thread.currentThread().getName() + " from constructor");// main thread aaega hmesha
    }
    
    @Override
    public void run(){
         System.out.println("I am overriding func from Runnable class");
         System.out.println(Thread.currentThread().getName());

         for(int i =0; i<10; i++)System.out.print(i+ " ");
         System.out.println();
        //  System.out.println(10/0);exception in thread
        help(); // now exception in thread Thread0
    }

    public void help() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("I am help func from MultiThreading");
        // System.out.println(10/0);//exception in thread main
    }

}
class MultiThreading2 extends Thread{

    //wrong aisa nhi possible
    // MultiThreading2() {
    //     Thread.currentThread().setDaemon(true);
    // }
    
    @Override
    public  void run(){
        Thread.yield();// volunitary offer krega ruk jaega itne high ya same prio chlenge, depends on jvm manega ya nhi 
        System.out.println("hey i am thread -> " + Thread.currentThread().getName() );
        for(int i =0; i<10; i++)System.out.print(i+ " ");
        System.out.println(10/0);
    }
}
public class Main{
    public static void main(String []args){
        System.out.println("Multithreading started");
        // System.out.println(10/0);// you can see main thread me exception
        Multithreading1 mt1 = new Multithreading1();
        MultiThreading2 mt2 = new MultiThreading2();
        Thread th1 = new Thread(mt1);
        th1.start();
        try {
            th1.join();
            mt2.start();// th1 ke bad hi chlega ab yeh, for synchronous
        } catch (Exception e) {
        }
        
        try {
            th1.interrupt();//yeh kah rha hai current thread ruk ja mai chlunga
        } catch (Exception e) {
        }
        mt1.help();
        mt1.run(); // main thread
        
        // threads //ly chlte so kuch bhi pehle ho skta.
        th1.setPriority(1);//lowest priority
        th1.run();// main thread
        th1.start();//Thread-0
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        mt1.run(); //main thread
        mt1.help();
        
        mt2.setPriority(10);//highest priority
        mt2.run(); // main thread
        mt2.setDaemon(true);// start ke upr hi.
        mt2.start(); // run ko call nhi ise call krna hoga, Thread-2
        System.out.println(mt2.isDaemon() +"daemon");
       // mt2.start(); not possible, need to make new obj

       Thread.currentThread().setName("Renamed Main Thread");
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().isAlive());
       System.out.println(Thread.currentThread().getPriority());// 5 by default
    }
}