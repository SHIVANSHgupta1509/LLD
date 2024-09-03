import java.util.*;

class Student{
   String name = "Bacha";
   int rollNo = 1;
   int marks;

   Student(int marks){
    this.marks = marks;
   }

   @Override
   public boolean equals(Object other){
    return this.hashCode() == other.hashCode();
   }

   @Override
   public int hashCode(){
     return Integer.hashCode(marks);
   }
}
class Vehicle{
    String name;
    double avg;

    Vehicle(String name, double avg){
        this.name = name;
        this.avg = avg;
    }
}
public class Main{
    public static void main(String []args){

      HashMap<String, Vehicle> hmap1 = new HashMap<>();
      Vehicle v1 = new Vehicle("XYZ", 10.5);
      Vehicle v2 = new Vehicle("PQR", 15.7);
      hmap1.put("v1",v1);
      hmap1.put("v2",v2);

      for(String key: hmap1.keySet()){
        System.out.println(key + "->" + hmap1.get(key));
      }

      Student a = new Student(33);
      Student b = new Student(88);
      Student c = new Student(33);
      Student d = b;
      Student e = new Student(99);

      HashMap<Student, String> hmap2 = new HashMap<>();
      hmap2.put(a,"a");
      hmap2.put(b, "b");
      hmap2.put(c,"c");
      hmap2.put(d, "d");
      hmap2.put(e, "e");

      for(Student key: hmap2.keySet()){
        System.out.println(key + "->" + hmap2.get(key)); // c,e,d yhi 3, custom hashing
      }

      ArrayList<Integer> al1 = new ArrayList<>();
      al1.add(10);
      al1.add(20);

      ArrayList<Integer> al2 = new ArrayList<>();
      al2.add(10);
      al2.add(20);

      ArrayList al3 = al1;
      
      HashMap<ArrayList, String> hmap3 = new HashMap<>();
      hmap3.put(al1,"al1");
      hmap3.put(al2, "al2");
      hmap3.put(al3,"al3");

      for(ArrayList key: hmap3.keySet()){
        System.out.println(key + "->" + hmap3.get(key)); // al3 only, comprae on data
      }
    }
}