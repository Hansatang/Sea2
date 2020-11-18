import java.util.Scanner;

public class Ex2003
{

  public static void main(String[] args)
  {
    int sum = 0;
    int count = 0;
    Scanner input = new Scanner(System.in);
/*
    while (sum<20 & count<10)
    {
      System.out.println("Enter number "+count);
      int number = input.nextInt();
      sum+=number;
      count++;
    }
    if(sum<20)
    {
      System.out.println(sum);
    }
    System.out.println(count);
  }


 */

    System.out.println("Enter number");
    int number = input.nextInt();
    sum += number;

    for (count = 1; count < 10;)
    {

      System.out.println("Enter number " + count);
      number = input.nextInt();
      sum += number;
      count++;
      if (sum > 20)
      {
        break;
      }
    }
    if (sum < 20)
    {
      System.out.println(sum);
    }
    System.out.println(count);
  }

}
