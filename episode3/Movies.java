// "static void main" must be defined in a public class.

class Movie{
    
    private String name;
    private double rating;
    private String genre;
    private int duration;
    StringBuilder copy = new StringBuilder("copy");
   
   // explicit default constructor
   // public Movie(){}

   // non-parametrised constructor
   public Movie(){
     this.name = "UnLabelled";
     this.rating = 0.0;
     this.genre = "UnClassified";
     this.duration = 0;
   }

   // parametrised constructor
   public Movie(String name, double rating, String genre, int duration){
    setName(name);
    setRating(rating);
    setGenre(genre);
    setDuration(duration);
}

  //copy constructor
  public Movie(Movie other){
    setName(other.getName());
    setRating(other.getRating());
    setGenre(other.getGenre());
    setDuration(other.getDuration());
    // shallow copy
    // copy = other.copy;
    // deep copy
    copy = new StringBuilder(other.copy);
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
   
   public Movie combineGenre(Movie m1){
       Movie m = new Movie();
       m.genre = this.genre+","+m1.getGenre();
       return m;
   }
   
}
public class Movies {
   public static void main(String[] args) {
    
       // lengthy not good
       Movie m2 = new Movie();
       m2.setName("Dracula Sir");
       m2.setRating(5.0);
       m2.setGenre("Suspense");
       m2.setDuration(140);
       System.out.println(m2.getName() + m2.getRating() + m2.getGenre() + m2.getDuration());
       
       // better
       Movie m3 = new Movie("Parking",5.0,"Thriller",120);
       System.out.println(m3.getName() + m3.getRating() + m3.getGenre() + m3.getDuration());
       
       // shallow, deep copy
       Movie m4 = new Movie(m3);
       m4.copy.append("shallow");
       System.out.println(m4.copy + "," + m3.copy);  
   }
}