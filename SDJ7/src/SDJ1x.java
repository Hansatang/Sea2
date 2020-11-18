public class SDJ1x
{
  private int a,b,c;

  public SDJ1x(int a, int b, int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA()
  {
    return a;
  }

  public int getB()
  {
    return b;
  }

  public int getC()
  {
    return c;
  }
  public int multi()
  {
    return a*b;
  }
  public int sum()
  {
    return a+b;
  }
  public double quotient()
  {
    double g;
    g= (double) b/(double)c;
    return g;
  }
  public int diff()
  {
    return b-c;
  }
}
