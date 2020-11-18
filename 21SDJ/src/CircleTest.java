public class CircleTest
{
  public static void main(String[] args)
  {
    CircleList cl= new CircleList(3);
    Circle c1 = new Circle(2,2,10);
    Circle c2 = new Circle(2,2,15);
    Circle c3 = new Circle(2,2,20);
    Circle c4 = new Circle(c1.getCenter().getX(),c1.getCenter().getY(), 30);
    cl.addCircle(c1);
    cl.addCircle(c2);
    cl.addCircle(c4);
    System.out.println(cl.getAmount());
    System.out.println(cl.getAverage());
    System.out.println(cl.totalArea());
    System.out.println(cl.getCircle(0).toString());
    cl.getCircle(0).moveCenter(10, 10);
    cl.getCircle(1).getCenter().move(100, 100);
    System.out.println(cl.getCircle(0).toString());
    System.out.println(cl.getCircle(1).toString());
    System.out.println(cl.getCircle(2).toString());
  }
}
