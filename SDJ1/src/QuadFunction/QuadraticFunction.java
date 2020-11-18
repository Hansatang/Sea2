package QuadFunction;

public class QuadraticFunction
{
  private double a, b, c;

  public QuadraticFunction(double a, double b, double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA()
  {
    return a;
  }

  public double getB()
  {
    return b;
  }

  public double getC()
  {
    return c;
  }

  public double getValue(double x)
  {
    return a * x * x + b * x + c;
  }

  public String getRoots()
  {
    double d = b * b - 4 * a * c;
    System.out.println(d);

    if (a != 0)
    {
      System.out.println("a nierowne 0");
      if (d > 0 && a != 0)
      {
        System.out.println("d wieksze 0");
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        if (x1 > x2)
        {
          System.out.println("x1 wieksze x2");
          return "Two roots:" + x1 + " and " + x2;
        }
        else
        {
          System.out.println("x2 wieksze x1");
          return "Two roots:" + x2 + " and " + x1;
        }
      }
      else if (d == 0 && a != 0)
      {
        System.out.println("d rowne 0");
        double x3 = -b / (2 * a);
        return "One root:" + x3;
      }

      else
      {
        return "No roots";
      }
    }
    else
    {
      System.out.println("a rowne 0");
      if (b == 0 && c == 0)
      {
        return "Infinite number of solutions";
      }

      else if (b == 0 && c != 0)
      {
        return "No roots";
      }

      else
      {
        double x3 = -c / b;
        return "One root:" + x3;
      }

    }
  }

}
