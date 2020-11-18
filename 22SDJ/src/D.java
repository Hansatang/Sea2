public class D extends B
{
  private double q, r;

  public D(int m, int n,int q, int r)
  {
    super(m, n);
    this.q=q;
    this.r=r;
  }

  public double getQ()
  {
    return q;
  }

  public void setQ(double q)
  {
    this.q = q;
  }

  public double getR()
  {
    return r;
  }

  public void setR(double r)
  {
    this.r = r;
  }

  @Override public double calc()
  {
    return q*getR();
  }
}
