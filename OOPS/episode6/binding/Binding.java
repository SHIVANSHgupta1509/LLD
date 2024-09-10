class Parent{
    public static void staticBind(){
        System.out.println("Parent's static bind");
    }
    public void demoBind(){
        System.out.println("Parent's demo bind");
    }
}

class Child extends Parent{
    public static void staticBind(){
        System.out.println("Child's static bind");
    }
    public void demoBind(){
        System.out.println("Child's demo bind");
    }
}

public class Binding{
    public static void main(String []args){
       Parent p = new Child();
       p.demoBind();
       p.staticBind();// will not be overridden.
    }
}