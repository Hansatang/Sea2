package dectobin;

import java.util.Scanner;

public class DecToBin
{
  public static String decToBinary(int read)

  {
    // We initialise an output as a string
    String binaryNum = "";

    // We throw an exception if there is an illegal input
    if (read < 0)
      throw new IllegalArgumentException();
    int z = 0;
    String finalWord = "";
    while (read != 0)
    {
      z = read % 2;
      if (z == 0)
      {
        binaryNum = binaryNum + "0";
      }
      else
      {
        binaryNum = binaryNum + "1";
      }
      if (read == 1)
      {
        break;
      }
      else if (read == 0)
      {
        break;
      }
      read = read / 2;
    }
    for (int i = binaryNum.length() - 1; i >= 0; i--)
    {
      char ch = binaryNum.charAt(i);
      finalWord = finalWord + ch;
    }
    return finalWord;
  }

  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      int read = in.nextInt();
      System.out.println(decToBinary(read));
      System.out.println();
    }
  }
}

