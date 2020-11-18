import java.util.Random;
import java.util.Scanner;
public class Guessor
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int n = rand.nextInt(999);
    int k = n+1;
    Scanner input = new Scanner(System.in);
    System.out.println(k);
    System.out.println("Enter k");
    int i=0;
    int z = input.nextInt();
      while (z!=k)
      {
        if (z>k)
        {
          System.out.println("Less");
          i++;
        }
        else
        {
          System.out.println("More");
          i++;
        }
        System.out.println("Enter k");
        z = input.nextInt();
      }
    System.out.println("That's right!");
    System.out.println(i);
  }
}
