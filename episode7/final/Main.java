final class FinalDemo{
    final int val; 
    StringBuilder sb = new StringBuilder("My address will be same,");
    FinalDemo(){
        this.val = 20;
        this.sb.append("and its possible to append values to me");
    } 
}
// not possible
// class Child extends FinalDemo{
 
// }
class Child{
   final int val = 20;
   Child(){
    // not possible
    // this.val = 30;
   }
   public final void demoFun(){
    System.out.println("Overriding me isn't possible!");
   }

}
class SubChild extends Child{
    // not possible to override.
    //  public void demoFun(){
    //     System.out.println("I am your child but will override final method");
    //  }
}
public class Main{
    public static void main(String []args){
       FinalDemo fd = new FinalDemo();
       System.out.println(fd.sb);
       Child cd = new Child();
       cd.demoFun(); 
    }
}