class Movie{
    
    private String name;
    private double rating;
    private String genre;
    private int duration;
    private static String region = "Regional Cinema";
    static String lang = "Hindi";

    static{
        String language = "Hindi";
        System.out.println(region);
        System.out.println(language);
        // non-static not refernced from static context
        // System.out.println(getName());
    }

    public Movie(String name, double rating, String genre, int duration){
        setName(name);
        setRating(rating);
        setGenre(genre);
        setDuration(duration);
    }
   
   public void setName(String name){
       // write validation logic here 
       this.name = name; 
   }
   
   public void setRating(double rating){
       // write validation logic here 
       this.rating = rating;
   }
   
   public void setGenre(String genre){
       // write validation logic here 
       this.genre = genre;
   }
   
   public void setDuration(int duration){
       // write validation logic here 
       this.duration = duration;
   }

   public static void setRegion(String updatedRegion){
    // below is wrong as you can only access static from static
    //  this.region = region;
    // write validation logic here 
     region = updatedRegion;
   }
   
    public String getName(){
       // write validation logic here 
       return name; 
   }
   
   public double getRating(){
       // write validation logic here 
       return rating;
   }
   
   public String getGenre(){
       // write validation logic here 
       return genre;
   }
   
   public int getDuration(){
       // write validation logic here 
       return duration;
   }

   public static String getRegion(){
    // write validation logic here 
    return region;
   }
   
}

public class Movies {
    public static void main(String[] args) {

        Movie m1 = new Movie("Parking",5.0,"Thriller",120);
        
        // not possible if private static data member
        // Movie.region = "Indian Regional Cinema";
        // System.out.println(m1.region);
        // System.out.println(Movie.region);
        
        m1.setRegion("Indian Regional Cinema");
        System.out.println(m1.getRegion());
        System.out.println(Movie.lang);
        // below line gives error as language ka scope static block ke andr hi.
        // System.out.println(Movie.language);
    }
}