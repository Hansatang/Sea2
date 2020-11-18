import java.util.Scanner;

public class MyPersonTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Size: ");
    int size = input.nextInt();
    input.nextLine();
    String h;
    MyDate date = new MyDate(1, 4, 1997);
    System.out.println(date.displayDate());

    MyPerson person1 = new MyPerson("Jar", date,size);
    Address address = new Address("Q","W","E","R","T");
    person1.setBirthday(date);
    person1.setAddress(address);
    for (int i =0; i< size;i++)
    {
      System.out.println("What to remember: ");
      h = input.nextLine();
      person1.rememberThis(h);
    }
    System.out.println(person1.brain.getIQ());
    System.out.println(person1.whatAreYouThinking());
    System.out.println(person1.doYouRemember("malpy"));
    System.out.println(person1.toString());

  }
}
