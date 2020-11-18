import java.util.Scanner;

public class SDJ3Test
{
  /*
  public static void main(String[] args)
  {
    String na, bd;
    SDJ3 Person = new SDJ3();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter name");
    na = input.nextLine();
    System.out.println("What birthday");
    bd = input.nextLine();

    Person.setName(na);
    Person.setBirthday(bd);

    System.out.println(Person.getName() +" " + Person.getBirthday());
  }
   */
  public static void main(String[] args)
  {
    int d, m, y;
    SDJ3 Date = new SDJ3();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter day");
    d = input.nextInt();
    System.out.println("What month");
    m = input.nextInt();
    System.out.println("What year");
    y = input.nextInt();

    Date.setDay(d);
    Date.setMonth(m);
    Date.setYear(y);

  }
}
