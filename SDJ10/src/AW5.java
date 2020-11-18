public class AW5
{
  public static void main(String[] args)
  {
    double k = 0;
    for (double i = 1; i <= 30; i++)
    {
      if (i == 1)
      {
        k = k + (i / (30));
        System.out.println(k);
        System.out.println(i);
        System.out.println(30);
      }
      else
      {
        k = k + (i / (31.0 - i));
        System.out.println(k);
        System.out.println(i);
        System.out.println(31 - i);
      }
    }
  }
}
