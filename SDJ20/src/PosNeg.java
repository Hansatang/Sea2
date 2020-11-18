import java.util.Scanner;

public class PosNeg
{

  public static void main(String[] args)
  {
   int positiveSum = 0;
   int negativeSum = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter number");
    int number = input.nextInt();
    while (number != 0)
    {
      if (number >0)
      {
        positiveSum+=number;
        System.out.println("Current positive sum: "+positiveSum);
      }
      else
      {
        negativeSum+=number;
        System.out.println("Current negative sum: "+negativeSum);
      }
      System.out.println("Enter number");
      number = input.nextInt();
    }
    System.out.println(positiveSum);
    System.out.println(negativeSum);
  }
}
