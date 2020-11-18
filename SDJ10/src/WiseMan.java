import java.util.Scanner;

public class WiseMan
{
  public static void main(String[] args)
  {
    double d;
    double m = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size");
    d = input.nextInt();

    for (double i = 1; i < d*d; i++)
    {
      m = 2*m ;
      System.out.println("i "+i);
      System.out.println("m "+m);
    }
    double z =m+1;
    System.out.print("grain" );
    System.out.printf(": %.0f\n", z);
  }
}
