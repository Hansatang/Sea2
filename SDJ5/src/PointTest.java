import java.util.Scanner;

public class PointTest
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    System.out.println("Point 1 ?");
    String a = input.nextLine();
    String[] parts = a.split(" ");
    String part1 = parts[0];
    String part2 = parts[1];
    float x1 = Float.parseFloat(part1);
    float y1 = Float.parseFloat(part2);

    Point p1 = new Point(x1, y1);

    System.out.println("Point 2 ?");
    String b = input.nextLine();
    String[] parts2 = b.split(" ");
    String part3 = parts2[0];
    String part4 = parts2[1];
    float x2 = Float.parseFloat(part3);
    float y2 = Float.parseFloat(part4);

    Point p2 = new Point(x2, y2);

    float x1x2 = p1.getX() - p2.getX();
    float y1y2 = p1.getY() - p2.getY();

    System.out.println(
        "Distance between point " + p1.toString() +
        " and " + p2.toString()+
        " is : " + Math.pow((x1x2 * x1x2 + y1y2 * y1y2), 0.5));
  }
}
