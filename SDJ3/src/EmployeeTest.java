import java.util.Scanner;

public class EmployeeTest
{
  public static void main(String[] args)
  {
    Employee payment1 = new Employee();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter everything for person 1");
    String a = input.nextLine();
    String[] parts = a.split(" ");
    String part1 = parts[0];
    String part2 = parts[1];
    String part3 = parts[2];
    String part4 = parts[3];
    int part22 = Integer.parseInt(part2);
    payment1.setEmployee(part1, part22, part3, part4);

    Employee payment2 = new Employee();
    System.out.println("Enter everything for person 2");
    a = input.nextLine();
    parts = a.split(" ");
    part1 = parts[0];
    part2 = parts[1];
    part3 = parts[2];
    part4 = parts[3];
    part22 = Integer.parseInt(part2);
    payment2.setEmployee(part1, part22, part3, part4);


    Employee payment3 = new Employee();
    System.out.println("Enter everything for person 2");
    a = input.nextLine();
    parts = a.split(" ");
    part1 = parts[0];
    part2 = parts[1];
    part3 = parts[2];
    part4 = parts[3];
    part22 = Integer.parseInt(part2);
    payment3.setEmployee(part1, part22, part3, part4);

    System.out.println("Person 1");
    System.out.println(payment1.toString());
    System.out.println("Person 2");
    System.out.println(payment2.toString());
    System.out.println("Person 3");
    System.out.println(payment3.toString());
  }
}
