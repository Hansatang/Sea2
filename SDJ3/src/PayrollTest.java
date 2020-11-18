import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args)
  {
    int m, y;
    String d;
    Payroll payment = new Payroll();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter name");
    d = input.nextLine();
    System.out.println("What hourly rate");
    m = input.nextInt();
    System.out.println("What hours worked");
    y = input.nextInt();

    payment.setName(d);
    payment.setHourlyPay(m);
    payment.setHoursWorked(y);

    System.out.println(payment.grossPay());
    System.out.println(payment.toString());
  }
}
