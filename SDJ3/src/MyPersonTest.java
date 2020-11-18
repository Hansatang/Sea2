import java.util.Scanner;

public class MyPersonTest
{
  public static void main(String[] args)
  {
    int d, m, y;
    MyDate date = new MyDate(0, 0, 0);
    MyDate date1 = new MyDate(1, 4, 1997);
    MyPerson person2 = new MyPerson("q","w",date1);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter name");
    String n = input.nextLine();
    System.out.println("What adress");
    String a = input.nextLine();

    MyPerson person1 = new MyPerson(n,a,date);
    System.out.println("Enter day");
    d = input.nextInt();
    System.out.println("What month");
    m = input.nextInt();
    System.out.println("What year");
    y = input.nextInt();
    input.nextLine();

    date.setDay(d);
    date.setMonth(m);
    date.setYear(y);

    person1.setBirthday(date);

    System.out.println(person1.getAge());
    System.out.println(person1.toString());
    System.out.println(person1.equals(person2));
  }
}
