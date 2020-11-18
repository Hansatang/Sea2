import java.util.Arrays;
import java.util.Scanner;

public class PE01
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Numbers: ");
    int[] numbers = {input.nextInt(), input.nextInt(), input.nextInt(),
        input.nextInt(), input.nextInt()};
    System.out.println("Miracle: ");
    int[] miracle = {input.nextInt(), input.nextInt(), input.nextInt(),
        input.nextInt(), input.nextInt()};
    System.out.println("secondMiracle: ");
    int[] secondMiracle = {input.nextInt(), input.nextInt(), input.nextInt(),
        input.nextInt(), input.nextInt()};
    int[] sumArray = new int[numbers.length];
    int[] destiny = new int[numbers.length];
    int[] destination = new int[numbers.length * 2];
    int sum = 0;
    for (int i = 0; i < numbers.length; i++)
    {
      numbers[i] = numbers[i] * 2;
      destiny[i] = numbers[i];
      destination[i] = numbers[i];
      sum = sum + numbers[i];
sumArray[i]=numbers[i]+miracle[i];
      System.out.println("Numbers: " + numbers[i] + " destiny: " + destiny[i]);
      System.out.println("Numbers: " + numbers[i] + " Miracle: " + miracle[i]);
    }
    boolean arraysEqual = true;
    if (secondMiracle.length != miracle.length)
      arraysEqual = false;
    else
    {
      for (int i = 0; i < secondMiracle.length; i++)
      {
        System.out.println("I. "+i);
        if (secondMiracle[i] != miracle[i])
        {
          arraysEqual = false;
          break;
        }
      }
    }
    if (arraysEqual)
      System.out.println("The arrays are equal.");
    else
   System.out.println("The arrays are not equal.");


    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (double) sum / numbers.length);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(destiny));
    System.out.println(Arrays.toString(destination));
    System.out.println(Arrays.toString(sumArray));

  }

}
