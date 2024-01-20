class Persona{
    String firstname;
    String lastname;
    int age;
    Persona(String fName,String lName,int a)
    {
        firstname = fName;
        lastname  = lName;
        age =a;
    }
    String getfullname()
    {
        return firstname + " " +lastname;
    }
}
    public class Person
    {
    public static void main(String args[])
    {
     Persona b1 = new Persona("Alice","bob",30);
     Persona b2 = new Persona("Alice","bob",25);

     String ABC = b1.getfullname();
     String EFG = b2.getfullname();
     double average = ((b1.age + b2.age)/2.0);
     System.out.println("person 1:"+b1.getfullname());
     System.out.println("person 2:"+b2.getfullname());
     System.out.println("Average Age:" +average);
    }
    }

