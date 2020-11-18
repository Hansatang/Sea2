public class GarageTest
{
  public static void main(String[] args)
  {
    Auto c1 = new Auto("q","w",null,00000,2000);
    Auto c2 = new Auto("a","s",null,00000,2000);
    Auto c3 = new Auto("q","w",null,00000,2000);
    Auto c4 = new Auto("a","s",null,00000,2000);
    Garage garage1 = new Garage();
    Garage garage2 = new Garage();

    System.out.println(garage1.toString());
    System.out.println(garage2.toString());
    garage1.park(c1,1);
    garage2.park(c3,1);
    System.out.println(garage1.toString());
    System.out.println(garage2.toString());
    garage1.leave(1);
    System.out.println(garage1.toString());
    System.out.println(garage2.toString());
    garage1.park(c1,1);
    garage1.park(c2,2);
    garage2.park(c4,2);
    System.out.println(garage1.toString());
    System.out.println(garage2.toString());
    System.out.println(garage1.equals(garage2));
  }
}
