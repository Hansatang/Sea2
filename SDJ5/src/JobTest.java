import java.util.Scanner;

public class JobTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Name");
    String z = input.nextLine();

    System.out.println("What Position");
    String x = input.nextLine();

    System.out.println("What monthly pay?");
    int c = input.nextInt();
    input.nextLine();

    Employee emp1 = new Employee(z, x);
    System.out.println(emp1.toString());

    Job job1 = new Job(emp1, c);
    System.out.println(job1.toString());
    job1.givePercentageRaise(20);
    System.out.println(job1.toString());

    System.out.println("What Position");
    x = input.nextLine();

    System.out.println("What monthly pay?");
    c = input.nextInt();
    input.nextLine();

    Employee emp2 = new Employee(x);
    System.out.println(emp1.toString());

    Job job2 = new Job(emp2, c);
    System.out.println(job2.toString());
    job2.givePercentageRaise(50);
    System.out.println(job2.toString());

  }
}
