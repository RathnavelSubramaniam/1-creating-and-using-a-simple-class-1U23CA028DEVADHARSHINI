
    public class Person
    {
    public static void main(String args[])
    {
     Persona b1 = new Persona("Jhon","Doe",30);
     Persona b2 = new Persona("Alice","Smith",25);

     String ABC = b1.getfullname();
     String EFG = b2.getfullname();
     double average = ((b1.age + b2.age)/2.0);
     System.out.println("Person 1:"+b1.getfullname());
     System.out.println("Person 2:"+b2.getfullname());
     System.out.println("Average Age:" +average);
    }
    }

