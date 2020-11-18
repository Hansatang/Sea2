import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args)
  {
    double z;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter temperature");
    z = input.nextDouble();
    input.nextLine();

    Temperature tempe = new Temperature(z);

    System.out.println(tempe.getFtemp());
    System.out.println(tempe.getCelsius());
    System.out.println(tempe.getKelvin());

  }
}
