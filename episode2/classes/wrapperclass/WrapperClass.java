public class WrapperClass {
    public static void main(String[] args) {
    
           Integer a1 = 20; // autoboxing, niche vala nhi krna pada
           // Integer a1 = new Integer(20); 
           System.out.println(a1); // unboxing hashcode print nhi hua value aai
        
           Character c1 = 'c'; // autoboxing, niche vala nhi krna pada
           // Character c1 = new Character('c'); 
           System.out.println(c1); // unboxing hashcode print nhi hua value aai
        
           Integer a3 = a1; // it is just ppointing to same add.
           System.out.println(a3); 
    }
}