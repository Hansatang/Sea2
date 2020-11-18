public class AW1
{
  private double radius;

  public AW1()
  {
    this.radius = 0;
  }

  public AW1(double radius)
  {
    this.radius = radius;
  }

  private double getArea()
  {
    return Math.PI * radius * radius;
  }

  private double getRadius()
  {
    return radius;
  }

  public boolean equals(AW1 obj)
  {
    return this.getRadius() == obj.getRadius();
  }

  public boolean greaterThan(AW1 obj)
  {
    return this.getRadius() > obj.getRadius();
  }

  public String toString()
  {
    return "Radius is "+radius +" and area is "+ this.getArea();
  }

  public static void main(String[] args)
  {
    AW1 circle= new AW1((15));
    AW1 circle1= new AW1((17));
    System.out.println(circle.toString());
    System.out.println(circle.equals(circle1));
    System.out.println(circle.greaterThan(circle1));
  }
}
