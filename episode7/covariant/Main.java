class Parent{
   public void getHelp(){
    System.out.println("I need some help!, I am old parent");
   }
   public Parent sayHi(){
    System.out.println("Hi from the parent");
    return this;
   }
}
class Child extends Parent{
    // not possible to override method with diff return type.
    // public int getHelp(){
    //     System.out.println("I need some help!, I am little child");
    //     return 1;
    // }
    public int getHelp(String hey){
        System.out.println("I need some help!, I am little child");
        return 1;
    }
    public Child sayHi(){
        System.out.println("Hi from the parent and the child");
        return this;
    }
}
public class Main{
    public static void main(String []args){
      Parent p = new Child();
      p.sayHi();
    }
}