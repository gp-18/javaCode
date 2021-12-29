public class oops {
  public static void main(String[] args)
  {
      person p1=new person();
      p1.age =18;
      p1.name="parth gupta";
      System.out.println(p1.age+" "+p1.name);

      person p2=new person(45,"known to be unkown");
     
      System.out.println(p2.age+ " " +p2.name); 

      p1.eat();
      p2.walk(5);
      p2.walk();

  }  
}
class person
{
    String name;
    int age;

    public person()
    {
      System.out.println("Hello i am the new constructor ");
    }

    public person(int newage,String newname)
    {
      
      age=newage;
      name=newname;
    }
    void walk(int steps)
    {
      System.out.println(name +" is walking" + " "  +steps);
    }

    void walk()
    {
      System.out.println(name +" is walking" );
    }

    void eat()
    {
      System.out.println(name +" is eating");
    }

}