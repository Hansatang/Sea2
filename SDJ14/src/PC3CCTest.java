public class PC3CCTest
{
  public static void main(String[] args)
  {
    PC3CC room = new PC3CC(10,15);
    PC3CC2 carpet =new PC3CC2(room, 8);
    System.out.println(carpet.toString());
  }
}
