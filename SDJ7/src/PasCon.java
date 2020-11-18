import java.util.Scanner;

public class PasCon
{
  public static void main(String[] args)
  {
    String d, m, y;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter name");
    d = input.nextLine();
    System.out.println("What password");
    m = input.nextLine();
    System.out.println("Pass password again");
    y = input.nextLine();

    while (m.compareTo(y) != 0)
    {
      System.out.println("Wrong password, please try again :");
      y = input.nextLine();
    }

    System.out.println("Password correct");
    System.out.println("Name " + d);
    System.out.println("Password " + m);

  }
}
