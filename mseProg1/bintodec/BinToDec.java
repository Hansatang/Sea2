package mseProg1.bintodec;

import java.util.Scanner;

public class BinToDec
{
  public static int binToDecimal(int[] input)
  {
    // We initialise an output as an integer
    int result = 0;

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
          input[i] = Integer.parseInt(""+ read.charAt(i));
        }

        System.out.println(binToDecimal(input));
        System.out.println();
      }

  }
}
