import java.util.Scanner;

public class DanishGrades
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter grade");
    String name = input.nextLine();
    switch (name)
    {
      case "12":
        System.out.println(name + " is equal to A");
        break;
      case "10":
        System.out.println(name + " is equal to B");
        break;
      case "7":
        System.out.println(name + " is equal to C");
        break;
      case "4":
        System.out.println(name + " is equal to D");
        break;
      case "2":
        System.out.println(name + " is equal to E");
        break;
      case "0":
        System.out.println(name + " is equal to Fx");
        break;
      case "-3":
        System.out.println(name + " is equal to F");
        break;
      case "A":
        System.out.println(name + " is equal to 12");
        break;
      case "B":
        System.out.println(name + " is equal to 10");
        break;
      case "C":
        System.out.println(name + " is equal to 7");
        break;
      case "D":
        System.out.println(name + " is equal to 4");
        break;
      case "E":
        System.out.println(name + " is equal to 2");
        break;
      case "Fx":
        System.out.println(name + " is equal to 0");
        break;
      case "F":
        System.out.println(name + " is equal to -3");
        break;
      default:
        System.out.println("What is " + name + "?");
        break;
    }
  }
}
