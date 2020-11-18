import java.util.Scanner;

public class AreaCalculator
{
  double area;

  public double calculate(double r)
  {
    area = Math.PI * r * r;
    return area;
  }

  public double calculate(double l, double w)
  {
    area = w * l;
    return area;
  }

  public double calculate(float r, double h)
  {
    area = Math.PI * r * r * h;
    return area;
  }

  public static void main(String[] args)
  {

    AreaCalculator ace = new AreaCalculator();
    Scanner input = new Scanner(System.in);
    System.out.println(
        "Geometry Calculator\n" + "1. Calculate the Area of a Circle\n"
            + "2. Calculate the Area of a Rectangle\n"
            + "3. Calculate the Area of a Triangle\n" + "4. Quit\n"
            + "Enter your choice (1—4):");
    int p = input.nextInt();

    if (p == 1)
    {
      System.out.println("Enter r");
      double r = input.nextDouble();
      System.out.println(ace.calculate(r));
    }
    else if (p == 2)
    {
      System.out.println("Enter l");
      double l = input.nextDouble();
      System.out.println("Enter w");
      double w = input.nextDouble();
      System.out.println(ace.calculate(l, w));
    }
    else if (p == 3)
    {
      System.out.println("Enter r");
      float r = input.nextFloat();
      System.out.println("Enter h");
      double h = input.nextDouble();
      System.out.println(ace.calculate(r, h));
    }

  }
}

