import java.util.Scanner;

public class WeekiTest
{
  public static void main(String[] args)
  {
    int day, year;
    String month;
    Scanner input = new Scanner(System.in);
    System.out.println("Type an integer:");
    day = input.nextInt();
    input.nextLine();
    System.out.println("Type a second integer");
    month = input.nextLine();
    System.out.println("Type a third integer");
    year = input.nextInt();

    Weeki num = new Weeki(day, month, year);
    System.out.println(num.getDay());
  }
}
