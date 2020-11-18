import java.util.Scanner;

class FibTest
{
  public static int fib(int n)
  {
    if (n == 0)
    {
      return 0;
    }
    else if (n == 1 || n == 2)
    {
      return 1;
    }
    else
    {
      return (fib(n - 1) + fib(n - 2));
    }
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter day");
    int n = input.nextInt();

    for (int i = 0; i < n; i++)
    {
      System.out.println("Fibonacci ("+i+ ") = "+fib(i));

    }
  }
}
