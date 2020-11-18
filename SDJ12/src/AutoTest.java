import java.util.Scanner;

public class AutoTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Auto auto2 = new Auto("q", "w", "e", 1, 2);
    System.out.println("Enter a");
    String a = input.nextLine();
    System.out.println("Enter b");
    String s = input.nextLine();
    System.out.println("Enter c");
    String d = input.nextLine();
    System.out.println("Enter d");
    int f = input.nextInt();
    System.out.println("Enter e");
    int g = input.nextInt();
    Auto auto1 = new Auto(a, s, d, f, g);
    System.out.println(auto1.toString());
    System.out.println(auto1.equals(auto2));
  }
}
