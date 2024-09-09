class Theater{

    int availableSeats;

    Theater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // public synchronized void bookTicket(User user, int tickets){
    public void bookTicket(User user, int tickets){
        
        System.out.println("I am User " + user.name + "and inside bookTicket method");
        synchronized (this) {   
            if(availableSeats >= tickets){
                System.out.println("Tickets booked by "+ user.name + " are -> " + tickets);
                availableSeats -= tickets;
            }else{
                System.out.println("Not available enough tickets");
            }
            System.out.println("End of syncronized block => " + user.name);
            this.notify(); // lock open ka notification jvm dega kisi bhi thread ko
        }
    }
}

class User extends Thread{

    String name;
    static Theater th = new Theater(20);
    public User(String name) {
        this.name = name;
    }

    public void run(){
       th.bookTicket(this, 10);
    }
    
}

public class Main{
    public static void main(String[] args) throws Exception {
        
        User u1 = new User("A");
        User u2 = new User("B");
        User u3 = new User("C");
        User u4 = new User("D");

        // u1.start();
        // u2.start();
        // u3.start();
        // u4.start();
        // yeh chalaoge and wait kroge to fayda nhi as yeh chl chuke honge
        // and ab kya wait krenge 

        u1.start();
        synchronized (u1) {
            u1.wait(); // wait krega notification ka ki lock open hua ya nhi
            System.out.println("Remaining seats are" + User.th.availableSeats);
        }
        u2.start();
        synchronized (u2) {
            u2.wait(); // wait krega notification ka ki lock open hua ya nhi
            System.out.println("Remaining seats are" + User.th.availableSeats);
        }
        u3.start();
        synchronized (u3) {
            u3.wait(); // wait krega notification ka ki lock open hua ya nhi
            System.out.println("Remaining seats are" + User.th.availableSeats);
        }
        u4.start();
        synchronized (u4) {
            u4.wait(); // wait krega notification ka ki lock open hua ya nhi
            System.out.println("Remaining seats are" + User.th.availableSeats);
        }
    }
}