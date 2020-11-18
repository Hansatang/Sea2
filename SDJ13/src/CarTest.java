import java.util.Scanner;

public class CarTest
{
  public static void main(String[] args)
  {
    String z, x;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter year model");
    z = input.nextLine();
    System.out.println("What make");
    x = input.nextLine();

    Car car = new Car(z, x);

    for (int i = 0; i < 5; i++)
    {
      car.accelerate();
      System.out.println(car.toString());
    }
    int j = 0;
    while (j < 5)
    {
      j++;
      car.brake();
      System.out.println(car.toString());
    }
  }
}
