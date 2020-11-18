import java.util.Scanner;

public class AW1
{
  public static void main(String[] args)
  {
    int i = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    double product = input.nextDouble();
    while (product < 100)
    {
      product = product * 10;
      if (product > 100)
      {
        break;
      }
      i++;
      System.out.println("Iteration :" + i + ", Number :" + product);
    }
  }
}
