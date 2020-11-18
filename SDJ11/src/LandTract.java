import java.util.Scanner;

public class LandTract
{

  public int lenght, width;

  public LandTract(int lenght, int width)
  {
    this.lenght = lenght;
    this.width = width;
  }

  public int area()
  {
    return width * lenght;
  }

  public boolean equals(LandTract obj)
  {
    return area() == obj.area();
  }
  public String toString()
  {
    return "LandTract: " + "lenght=" + lenght + ", width=" + width;
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter lenght and width of tract");
    int d = input.nextInt();
    int e = input.nextInt();
    LandTract l1 = new LandTract(d, e);

    System.out.println("Enter lenght and width of tract");
    d = input.nextInt();
    e = input.nextInt();
    LandTract l2 = new LandTract(d, e);

    System.out.println(l1.toString());
    System.out.println(l2.toString());

    System.out.println(l1.equals(l2));

  }
}
