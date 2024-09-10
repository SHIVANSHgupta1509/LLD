// "static void main" must be defined in a public class.

class Movie{
    
    private String name;
    private double rating;
    private String genre;
    private int duration;
   
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
   
//    will not work in case of private 
//    Movie m1 = new Movie();
//    m1.name = "Maharaja";
//    m1.rating = 5.0;
//    m1.genre = "Revenge";
//    m1.duration = 130;
       
//     System.out.println(m1.name + m1.rating + m1.genre + m1.duration);
       
       Movie m2 = new Movie();
       m2.setName("Dracula Sir");
       m2.setRating(5.0);
       m2.setGenre("Suspense");
       m2.setDuration(140);
       System.out.println(m2.getName() + m2.getRating() + m2.getGenre() + m2.getDuration());
       
       Movie m3 = new Movie();
       m3.setName("Parking");
       m3.setRating(5.0);
       m3.setGenre("Thriller");
       m3.setDuration(120);
       System.out.println(m3.getName() + m3.getRating() + m3.getGenre() + m3.getDuration());
       
       Movie m4 = m2.combineGenre(m3);
       m4.setName("Ratsassan");
       m4.setRating(5.0);
       m4.setDuration(150);
       System.out.println(m4.getName() + m4.getRating() + m4.getGenre() + m4.getDuration());
       
   }
}