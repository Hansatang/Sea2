import java.util.Arrays;
import java.util.Scanner;

public class RainFall
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double[] month = new double[12];
    double sum = 0;
    double average = 0;
    for (int i = 0; i < month.length; i++)
    {
      month[i] = input.nextDouble();
      sum = sum + month[i];
      average = average + month[i] / month.length;
    }
    int z = 0;
    for (int i = 1; i < month.length; i++)
    {
      if (month[z] < month[i])
      {
        z = i;
      }
    }
    int y = 0;
    for (int i = 1; i < month.length; i++)
    {
      if (month[y] > month[i])
      {
        y = i;
      }
    }
    System.out.println(Arrays.toString(month));
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Most rain: " + month[z]);
    System.out.println("Less rain: " + month[y]);
  }
}


