package bintodec;

import java.util.Scanner;

public class BinToDec
{
  public static int binToDecimal(int[] input)
  {
    // We initialise an output as an integer
    int result = 0;
    String res = "";
    int i=0;
    while (i<input.length)
    {
      result = (int) (result +input[i]*Math.pow((double) 2,(double) input.length-i-1));
   //   System.out.println("input "+input[i]);
   //   System.out.println("i "+i);
   //   System.out.println("res "+result);
      i++;
    }

    // TODO implement method

    return result;
  }

  public static void main(String[] args)
  {

    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      String read = in.nextLine();

      int[] input = new int[read.length()];
      for (int i = 0; i < read.length(); i++)
      {
        input[i] = Integer.parseInt("" + read.charAt(i));
        System.out.println(input[i]);
      }
      System.out.println(input);
      System.out.println(binToDecimal(input));
      System.out.println();
    }

  }
}
