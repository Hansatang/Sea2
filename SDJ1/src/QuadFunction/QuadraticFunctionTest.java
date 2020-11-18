package QuadFunction;

import java.util.Scanner;

public class QuadraticFunctionTest
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    System.out.println("Input ?");
    String x = input.nextLine();
    String[] parts = x.split(" ");
    String part1 = parts[0];
    String part2 = parts[1];
    String part3 = parts[2];
    double a = Double.parseDouble(part1);
    double b = Double.parseDouble(part2);
    double c = Double.parseDouble(part3);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    QuadraticFunction kwad = new QuadraticFunction(a, b, c);

    System.out.println(kwad.getRoots());

  }
}
