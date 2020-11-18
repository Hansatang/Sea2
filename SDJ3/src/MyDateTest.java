import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    int d, m, y;
    MyDate obj1 = new MyDate(11, 11, 2011);
    MyDate date = new MyDate(0, 0, 0);
    MyDate dzis = new MyDate();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter day");
    d = input.nextInt();
    System.out.println("What month");
    m = input.nextInt();
    System.out.println("What year");
    y = input.nextInt();

    date.setDay(d);
    date.setMonth(m);
    date.setYear(y);

    System.out.println("A");
    System.out.println(dzis.displayDate());
    System.out.println(date.displayDate());
    System.out.println(date.isBefore(dzis));
    // date.nextDays(10);
  //  System.out.println(date.today().displayDate());
  //  System.out.println(date.displayDate());
    /*
    System.out.println(obj1.displayDate());
    System.out.println(date.equals(obj1));

    System.out.println("B");
    System.out.println(date.isLeapYear(date.getYear()));
    System.out.println("C");
    System.out.println(date.getDayName());
    System.out.println("D");
    System.out.println(date.getDayInMonth(date.getMonth()));
    System.out.println("E");
    System.out.println(date.zodiac());
    System.out.println("F");
    System.out.println(date.dayInYear());
    System.out.println("G");
    System.out.println(date.getMonthName(date.getMonth()));

    System.out.println("H");
    System.out.println(date.dayTill());
    System.out.println(date.defGregorian(1584, date.getYear()));
    System.out.println("What year it started?");
    int startY = input.nextInt();
    System.out.println("What year it ended");
    int endY = input.nextInt();
    System.out.println(date.defGregorian(startY, endY));


     */
  }
}
