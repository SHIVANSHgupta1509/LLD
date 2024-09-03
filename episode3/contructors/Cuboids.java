class Cuboid{
    
    int length;
    int breadth;
    int height;
    
    Cuboid(){
        // this.length = 1;
        // this.breadth = 1;
        // this.height = 1;
        this(1);
    }

    Cuboid(int side){
        // this.length = side;
        // this.breadth = side;
        // this.height = side;
        this(side, side, side);
    }

    Cuboid(int length, int breadth){
        // this.length = length;
        // this.breadth = breadth;
        // this.height = 1;
        this(length, breadth, 1);
    }

    Cuboid(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

}

public class Cuboids{
   public static void main(String[] args){

     Cuboid c1 = new Cuboid();
     Cuboid c2 = new Cuboid(2);
     Cuboid c3 = new Cuboid(2,3);
     Cuboid c4 = new Cuboid(2,3,4);

     System.out.println(c1.length + "," + c1.breadth + "," + c1.height);
     System.out.println(c2.length + "," + c2.breadth + "," + c2.height);
     System.out.println(c3.length + "," + c3.breadth + "," + c3.height);
     System.out.println(c4.length + "," + c4.breadth + "," + c4.height);

   }
}