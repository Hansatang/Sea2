import java.util.Scanner;

public class Student
{
  private String name;
  private char gender;
  private int id;

  public Student(String name, char gender, int id)
  {
    this.name = name;
    this.gender = gender;
    this.id = id;
  }

  public Student(String name, char gender)
  {
    this.name = name;
    this.gender = gender;
    this.id = 0;
  }

  public Student()
  {
    this.name = name;
    this.gender = gender;
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public char getGender()
  {
    return gender;
  }

  public int getId()
  {
    return id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  public String toString()
  {
    return ("Name: "+getName() + "\nGender:  " + getGender() + "\nId: " + getId());
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter name");
    String name = input.nextLine();

    System.out.println("What gender");
    String line = input.nextLine();
    char gender = line.charAt(0);

    System.out.println("What id");
    int id = input.nextInt();
    input.nextLine();

    Student st1 = new Student(name, gender, id);
    System.out.println(st1.toString());


    System.out.println("Enter name");
    name = input.nextLine();

    System.out.println("What gender");
    line = input.nextLine();
    gender = line.charAt(0);

    Student st2 = new Student(name, gender);
    System.out.println(st2.toString());

    System.out.println("Enter name");
    name = input.nextLine();

    System.out.println("What gender");
    line = input.nextLine();
    gender = line.charAt(0);

    System.out.println("What id");
    id = input.nextInt();
    input.nextLine();

    Student st3 = new Student();
    st3.setName(name);
    st3.setGender(gender);
    st3.setId(id);

    System.out.println(st3.toString());
  }
}
