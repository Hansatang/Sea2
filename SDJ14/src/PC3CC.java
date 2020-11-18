public class PC3CC
{
  public double w, l;

  public PC3CC(double w, double l)
  {
    this.w = w;
    this.l = l;
  }

  public double area()
  {
    return w * l;
  }

  public String toString()
  {
    return "Wide " + w + ", long " + l;
  }
}
