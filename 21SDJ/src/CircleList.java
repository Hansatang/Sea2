import java.util.ArrayList;

public class CircleList
{
  private int capacity;
  private ArrayList<Circle> circles;

  public CircleList(int capacity)
  {
    this.circles = new ArrayList<>(capacity);
  }

  public int getAmount()
  {
    return circles.size();
  }

  public void addCircle(Circle circle)
  {
    circles.add(circle);
  }

  public Circle getCircle(int index)
  {
    return circles.get(index);
  }

  public double totalArea()
  {
    double sum = 0;
    for (Circle circle : circles)
    {
      sum += circle.getArea();
    }
    return sum;
  }
  public  double getAverage()
  {
    return totalArea()/getAmount();
  }
}
