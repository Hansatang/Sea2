import Person.src.Person;

import java.util.Scanner;

public class PersonTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter name");
      String name = input.nextLine();
      
      System.out.println("What age");
      int age = input.nextInt();
      input.nextLine();
      
      System.out.println("What gender");
      String line = input.nextLine();
      char gender = line.charAt(0);
      
      
      
      if  (age == 0 && name.equals("")) {
         Person person = new Person(gender);
         System.out.println("A");
         System.out.println(person.getName());
         System.out.println(person.getAge());
         System.out.println(person.getGender());
         System.out.println(person.toString());
         System.out.println(person.getAgeStatus());
         System.out.println(person.getStatus());
         }
      else if (age == 0 && name != "") {
         Person person = new Person(name, gender);
         System.out.println("B");
         System.out.println(person.getName());
         System.out.println(person.getAge());
         System.out.println(person.getGender());
         System.out.println(person.toString());
         System.out.println(person.getAgeStatus());
         System.out.println(person.getStatus());
      }
      else {
         Person person = new Person(name, age, gender);
         System.out.println("C");
         System.out.println(person.getName());
         System.out.println(person.getAge());
         System.out.println(person.getGender());
         System.out.println(person.toString());
         System.out.println(person.getAgeStatus());
         System.out.println(person.getStatus());
      }
      }
   }
  

