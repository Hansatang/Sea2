public class Circle
{
  private double radius;
  private Point point;

  public Circle(double x, double y, double radius)
  {
    this.point = new Point(x, y);
    this.radius = radius;
  }

  public Point getCenter()
  {
    return point;
  }

  public double getRadius()
  {
    return radius;
  }

  public void moveCenter(double xd, double yd)
  {
    point.move(xd,yd);
  }

  public double getArea()
  {
    return Math.PI * radius * radius;
  }

  public String toString()
  {
    return point.toString() + " ,radius is " + radius;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Circle))
    {
      return false;
    }
    Circle other = (Circle) obj;
    return point.equals(other.point) && radius == other.getRadius();
  }
}
