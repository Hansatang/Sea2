public class GCD
{
  public int findGCD(int a, int p)
  {

    int z = 0;
    int k ;
    if (a>p)
    {
      k=a;
    }
    else
    {
      k=p;
    }
    for (int i = 1; i < k; i++)
    {
      if (a % i == 0 && p % i == 0)
      {
        z = i;
      }
    }
    return z;
  }
}
