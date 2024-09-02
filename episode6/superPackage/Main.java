package superPackage;
import superPackage.Child;
import superPackage.Parent;

public class Main{
    public static void main(String[]args){
        Child c = new Child();
        System.out.println(c.getChildId());
        System.out.println(c.getName());
        System.out.println(c.getShows());
        
        Parent p = new Child();
        // child vale ke ans a rhe, shows overriding.
        System.out.println(p.getName());
        System.out.println(p.getShows());  
    }
}