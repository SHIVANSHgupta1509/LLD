package superPackage;
import java.util.*;

public class Child extends Parent{
   
    private String name;
    private int val;
    
    Child(){
       // super() implicitly called.
       this("Anonymous(Child ka name)", 10);
       System.out.println("I am empty child constructor");
    }
    
    Child(String name,int val){
        // super() implicitly called, but empty vala, khud koi bhi call kr skte.
        super();
        System.out.println("I am parametrised child consyructor");
        this.name = name;
        this.val = val;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVal(){
        return this.val;
    }

    public String getName(){
        return name;
    }

    public int getChildId(){
        return getId();
    }

    public ArrayList getShows(){
        System.out.println(shows.hashCode());//object class se lia.
        return super.getShows();
    }
}