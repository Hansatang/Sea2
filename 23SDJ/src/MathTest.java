import java.util.Scanner;

public class MathTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x = scanner.nextInt();
    System.out.println("Enter y: ");
    int y = scanner.nextInt();
    try
    {
      System.out.println("x + y = " + (x + y));
      System.out.println("x - y = " + (x - y));
      System.out.println("x / y = " + (x / y));
      System.out.println("x * y = " + (x * y));

      if (y == 0)
      {
        throw new ArithmeticException();
      }
    }
    catch (ArithmeticException e)
    {
      System.out.println("Jeblo");
      e.printStackTrace();
    }
    System.out.println("roboty");

  }
}