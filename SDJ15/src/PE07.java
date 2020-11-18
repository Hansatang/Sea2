public class PE07
{

  public static void main(String[] args)
  {

    int[] numbers = {3, 5, 1, 3, 3, 2, 4, 2, 3};
    int sum = 0;
    int ace = 0;
    for (int i = 0; i < numbers.length; i++)
    {
      sum=sum+numbers[i];
      if (numbers[i] == 1)
      {
        ace = ace+numbers[i];
      }
    }
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (double)sum/ numbers.length);
    System.out.println("Aces: " + ace);
  }
}
