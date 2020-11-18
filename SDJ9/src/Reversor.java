import java.util.Scanner;

public class Reversor
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n");
    String word = input.nextLine();
    String word1 = "";
    String y;
    while (true)
    {
      for (int i = word.length() - 1; i >= 0; i--)
      {
        System.out.print(word.charAt(i));
        char ch = word.charAt(i);
        word1 = word1 + ch;
      }
      System.out.println();
      for (int j = word1.length() - 1; j >= 0; j--)
      {
        System.out.print(word1.charAt(j));
      }
      System.out.println();
      word1 = "";
      System.out.println("Continue :");
      y = input.nextLine();
      if(y.equals("quit"))
      {
        break;
      }

      System.out.println("Enter n");
      word = input.nextLine();
    }
  }

}
