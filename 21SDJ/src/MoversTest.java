public class MoversTest
{

  public static void main(String[] args)
  {
    SportsCar sc1 = new SportsCar("robot", 20, "0021", 41);
    SportsCar sc2 = new SportsCar("robot", 20, "0021", 41);
    System.out.println(sc1.toString());
    System.out.println(sc1.equals(sc2));
  }
}
