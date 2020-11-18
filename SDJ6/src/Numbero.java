import java.util.Scanner;

public class Numbero
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int z = input.nextInt();
    System.out.println("Enter number");
    int x = input.nextInt();
    System.out.println("Enter number");
    int c = input.nextInt();
    System.out.println("Enter number");
    int v = input.nextInt();

    int[] Num = {z, x, c, v};
    int temp;
    for (int i = 1; i < Num.length; i++)
    {
      for (int j = i; j > 0; j--)
      {
        if (Num[j-1] < Num[j])
        {
          temp = Num[j];
          Num[j] = Num[j - 1];
          Num[j - 1] = temp;
        }
      }
    }
    for (int i = 0; i < Num.length; i++)
    {
      System.out.println(Num[i]);
    }
  }
}

