class Parent{
   private int x;

   public void setX(int x){
    this.x=x;
   }

   public int getX(){
    return x;
   }
}

class Child extends Parent{
   private int y;

   public void setY(int y){
    this.y=y;
   }

   public int getY(){
    return y;
   }
}

class GrandChild extends Child{
    private int z;
 
    public void setZ(int z){
     this.z=z;
    }
 
    public int getZ(){
     return z;
    }
 }

public class Inheritence{
    public static void main(String []args){

        Parent p1 = new Parent();
        p1.setX(10);
        System.out.println(p1.getX());
        
        Child c1 = new Child();
        c1.setX(20);
        System.out.println(c1.getX());
        c1.setY(30);
        System.out.println(c1.getY());
        
        GrandChild g1 = new GrandChild();
        g1.setX(40);
        System.out.println(g1.getX());
        g1.setY(50);
        System.out.println(g1.getY());
        g1.setZ(60);
        System.out.println(g1.getZ());

    }
}