package superPackage;
import java.util.*;

public class Parent{
   
    private String name;
    private int id;
    public ArrayList<String> shows;

    Parent(){
     this("Unknown", 1, new ArrayList<>(Arrays.asList("Parking", "Maharaja")));
     System.out.println("I am empty parent constructor");
    }
    
    Parent(String name, int id, ArrayList shows){
     super();
     System.out.println("I am parametrised parent constructor");
     this.name = name;
     this.id = id;
     this.shows = shows;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String name){
        this.id = id;
    }

    public void setShows(){
        shows = new ArrayList<>();
        shows.add("Parking");
        shows.add("Maharaja");
        return ;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList getShows(){
        return this.shows;
    }
    
}